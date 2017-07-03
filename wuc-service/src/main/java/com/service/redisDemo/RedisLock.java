package com.service.redisDemo;

/**
 * reids锁实体类
 */
public class RedisLock
{
    private String name;
    private String value;

    public RedisLock(String name, String value)
    {
        this.name = name;
        this.value = value;
    }

    public String getName()
    {
        return name;
    }

    public String getValue()
    {
        return value;
    }
}
