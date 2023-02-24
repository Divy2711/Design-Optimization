package com.upgrad.EmployeeService.cacheData;

import java.util.concurrent.TimeUnit;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import lombok.Data;

@Data
public class CacheStore<T> {

	private Cache<Integer, T> cache;
	
	// To build cache store
	public CacheStore(int expirytime, TimeUnit timeUnit) {
		cache= CacheBuilder.newBuilder().expireAfterWrite(expirytime,timeUnit)
				.concurrencyLevel(Runtime.getRuntime().availableProcessors())
				.build();
	}
	
	// To fetch data from cache
	public T get(int key) {
		return cache.getIfPresent(key);
	}
	
	// To add new record to cache
	public void add(int key,T value) {
		if(key>=0 && value!=null) {
			cache.put(key, value);
			System.out.println("Value "+value.getClass().getSimpleName()+" stored in cache with key "+key+".");
		}
	}
}
