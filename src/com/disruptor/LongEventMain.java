package com.disruptor;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;

public class LongEventMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// 执行器，用于构造消费者线程
		Executor executor = Executors.newCachedThreadPool();
		// 指定事件工厂
		LongEventFactory factory = new LongEventFactory();
		// 指定 ring buffer字节大小, must be power of 2.
		final int bufferSize = 1024;
		// 单线程模式，获取额外的性能
		Disruptor<LongEvent> disruptor = new Disruptor<LongEvent>(
				factory,
				bufferSize,
				executor,
				ProducerType.SINGLE,
				new BlockingWaitStrategy());
		//启动disruptor线程  
		 disruptor.start();  
		// 获取 ring buffer环，用于接取生产者生产的事件  
		 RingBuffer<LongEvent> ringBuffer = disruptor.getRingBuffer();
		 //为 ring buffer指定事件生产者  
		//LongEventProducer producer = new LongEventProducer(ringBuffer)
		 LongEventProducerWithTranslator producter = new LongEventProducerWithTranslator(ringBuffer);
         ByteBuffer bb = ByteBuffer.allocate(8);//预置8字节长整型字节缓存  
         for (long l = 0; true; l++)  
         {  
             bb.putLong(0, l);  
             producter.product(bb);//生产者生产数据  
             Thread.sleep(1000);  
         }  
         
		 }

}
