/**
 * @项目名：crm-project
 * @创建人： Administrator
 * @创建时间： 2020-06-20
 * @公司： www.bjpowernode.com
 * @描述：
 */
package com.bjpowernode.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.Set;

/**
 * <p>NAME: JedisTest</p>
 * @author Administrator
 * @date 2020-06-20 19:26:16
 */
public class JedisTest {
    public static void main(String[] args) {
        //1.连接redis
        Jedis jedis=new Jedis("192.168.11.128",6379);
        /*String ret=jedis.ping();
        System.out.println(ret);*/

        /*Set<String> stringSet= jedis.keys("*");
        for(String s:stringSet){
            System.out.println(s);
        }*/

        /*String ret=jedis.set("k6","v6");
        System.out.println(ret);*/

        Transaction transaction=jedis.multi();
        transaction.set("k7","v7");
        transaction.set("k8","v8");
        transaction.exec();
    }
}
