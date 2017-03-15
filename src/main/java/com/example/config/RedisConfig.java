package com.example.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * <p>Title:RedisSessionConfig<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2017/3/15
 */
@Configuration
@EnableRedisHttpSession
@EnableCaching
public class RedisConfig {
}
