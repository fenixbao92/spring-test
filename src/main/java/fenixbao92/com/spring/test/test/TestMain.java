package fenixbao92.com.spring.test.test;

import fenixbao92.com.spring.test.HelloWorld;
import fenixbao92.com.spring.test.rabbit.TestMQ;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Create by fenixbao92 on 2019/3/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:*.xml"})
public class TestMain {

    @Resource
    TestMQ testMQ;

    @Resource
    HelloWorld helloWorld;

    @Resource
    HashMap<String,Object> mymap;
    @Test
    public void test1(){
        helloWorld.printHello();
       System.out.println(mymap.toString());
    }

    @Test
    public void test2(){
        try {
            testMQ.send();
            System.out.println("have Send:"+System.currentTimeMillis());
            Thread.sleep(100000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
