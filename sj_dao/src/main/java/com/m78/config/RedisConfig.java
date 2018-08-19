//package com.m78.config;
//
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.redis.cache.RedisCacheManager;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
//@SpringBootConfiguration
//public class RedisConfig {
//
//    /**
//     * RedisTemplate默认的系列化类是JdkSerializationRedisSerializer，用JdkSerializationRedisSerializer序列化的话，
//     * 被序列化的对象必须实现Serializable接口。在存储内容时，除了属性的内容外还存了其它内容在里面，总长度长，且不容易阅读。
//     * 我们要求是存储的数据可以方便查看，也方便反系列化，方便读取数据。
//     * JacksonJsonRedisSerializer和GenericJackson2JsonRedisSerializer，两者都能系列化成json，但是后者会在json中加入@class属性，类的全路径包名，方便反系列化。
//     * 前者如果存放了List则在反系列化的时候如果没指定TypeReference则会报错java.util.LinkedHashMap cannot be cast to 。
//     *
//     * RedisTemplate能够让我们持久化各种类型的key和value，并不仅限于字节数组
//     * StringRedisTemplate扩展了RedisTemplate，只能使用String类型
//     * StringRedisTemplate有一个接受RedisConnectionFactory的构造器，因此没有必要在构建后在调用setConnectionFactory()
//     */
//
//
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
//        RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
//        template.setConnectionFactory(factory);
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
//        template.setHashKeySerializer(new GenericJackson2JsonRedisSerializer());
//        template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
//        template.afterPropertiesSet();
//        return template;
//    }
//
//
//    @Bean
//    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory factory) {
//        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate(factory);
//        stringRedisTemplate.afterPropertiesSet();
//        return stringRedisTemplate;
//    }
//
//	/*
//	@Bean
//	public RedisTemplate<String, String> stringRedisTemplate(RedisConnectionFactory factory) {
//		StringRedisTemplate stringRedisTemplate = new StringRedisTemplate(factory);
//		stringRedisTemplate.afterPropertiesSet();
//		return stringRedisTemplate;
//	}
//	*/
//
//
//    @Bean
//    public CacheManager cacheManager(RedisTemplate<String, String> redisTemplate) {
//        RedisCacheManager rcm = new RedisCacheManager(redisTemplate);
//        // 多个缓存的名称,目前只定义了一个
//        //rcm.setCacheNames(Arrays.asList("thisredis"));
//        //设置缓存过期时间(秒)
//        //rcm.setDefaultExpiration(600);
//        return rcm;
//    }
//
//}