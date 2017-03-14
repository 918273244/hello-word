package com.disruptor;

import com.lmax.disruptor.EventHandler;

public class LongEventHandler implements EventHandler<LongEvent> {

	@Override
	public void onEvent(LongEvent event, long sequence, boolean endOfBatch)
			throws Exception {
		 System.out.println("consumer:"+Thread.currentThread().getName()+" Event: value=" + event.get()+",sequence="+sequence+",endOfBatch="+endOfBatch); 
	}

}
