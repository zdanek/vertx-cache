package io.vertx.ext.cache;

import javax.cache.CacheManager;
import javax.cache.Caching;
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

    }
}
