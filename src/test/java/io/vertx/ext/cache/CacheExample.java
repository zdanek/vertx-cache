package io.vertx.ext.cache;

import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.spi.CachingProvider;

import io.vertx.core.Vertx;

/**
 * Created by bartek on 29.06.15.
 */
public class CacheExample {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();

        final CachingProvider cachingProvider = Caching.getCachingProvider();
        final CacheManager cacheManager = cachingProvider.getCacheManager();

        MutableConfiguration<Object, Object> config = new MutableConfiguration<>();
        Cache<Object, Object> cache = cacheManager.createCache("test", config);

        cache.put("key", "value");

        assert "value".equals(cache.get("key"));


        DistributedCachingProvider provider = DistributedCachingProvider.getCachingProvider(vertx);

    }
}
