package com.s8.api.objects.web.functions.objects;

import java.util.List;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.objects.web.S8WebFrontObject;
import com.s8.api.objects.web.functions.NeFunction;


@FunctionalInterface
public interface ObjectsListNeFunction<T extends S8WebFrontObject> extends NeFunction {
	
	
	public abstract void run(S8AsyncFlow flow, List<T> arg);
	
}
