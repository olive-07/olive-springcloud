package com.service.redisDemo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * redis锁测试
 */
public class RedisTest
{
    @Autowired
    ReidsLockMessage reidsLockMessage;

    public void test()
    {
        RedisLock redisLock = new RedisLock("lockk", "lockk");
        if(reidsLockMessage.getLock(redisLock))
        {
            System.out.println("获取redis锁成功");
            reidsLockMessage.removeLock(redisLock);
        }
    }
}
