package com.example.account.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;

@Configuration
public class LocalRedisConfig {

    @Value("${spring.redis.port}")
    private int redisPort;

    @PostConstruct
    public void startRedis() throws IOException {
        System.out.println("[INFO] Embedded Redis는 비활성화되었습니다. 외부 Redis를 사용 중입니다.");
        // embedded-redis 제거됨 → 외부 Redis 사용
        // 예: brew install redis && brew services start redis
    }

    @PreDestroy
    public void stopRedis() {
        System.out.println("[INFO] Embedded Redis 종료 생략됨. 외부 Redis 사용 중입니다.");
    }
}