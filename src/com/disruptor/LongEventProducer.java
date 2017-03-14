package com.disruptor;

import java.nio.ByteBuffer;

import com.lmax.disruptor.RingBuffer;

/**
 * 生成event信息
 * @author Administrator
 *
 */

public class LongEventProducer {

    @SuppressWarnings("unused")
	private final RingBuffer<LongEvent> ringBuffer;  
	
	public LongEventProducer(RingBuffer<LongEvent> ringBuffer){
		this.ringBuffer = ringBuffer; 
	}
	
	public void product(ByteBuffer  bb){
		long sequence = ringBuffer.next();  // Grab the next sequence  
		try{
			LongEvent event = ringBuffer.get(sequence);
			event.set(bb.getLong(0));
		}finally{
			ringBuffer.publish(sequence); 
		}
	}
}
