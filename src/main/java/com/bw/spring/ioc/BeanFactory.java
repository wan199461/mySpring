package com.bw.spring.ioc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * bean Factory
 * @author bw
 *
 */
public class BeanFactory {
	
	/*
	 * ConcurrentHashMap是一个经常被使用的数据结构，相比于Hashtable以及Collections.synchronizedMap()，
	 * ConcurrentHashMap在线程安全的基础上提供了更好的写并发能力，但同时降低了对读一致性的要求
	 */
	// 存储实例化的单例
	private static Map<String, Object> singletonObject = new ConcurrentHashMap<String, Object>();
	
	
	

}
