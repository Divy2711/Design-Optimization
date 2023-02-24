# Spring base caching. Annotations used:
1.	@CacheConfig provides a mechanism for sharing common cache-related settings at the class level.
2.	@EnableCaching enables Spring's annotation-driven cache management capability.
3.	@Cacheable
4.	@CacheEvict annotation to remove values so that fresh values can be loaded into the cache again.
5.	@CachePut annotation can update the content of the cache without interfering with the method execution.
6.	@Caching is used in the case we want to use multiple annotations of the same type on the same method.
