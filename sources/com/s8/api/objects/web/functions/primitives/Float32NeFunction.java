package com.s8.api.objects.web.functions.primitives;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.objects.web.functions.NeFunction;


@FunctionalInterface
public interface Float32NeFunction extends NeFunction {
	
	

	/**
	 * 
	 * @param flow
	 * @param arg
	 */
	public abstract void run(S8AsyncFlow flow, float arg);
	
}
