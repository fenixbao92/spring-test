package fenixbao92.com.spring.test.rabbit;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by fenixbao92 on 2019/3/22.
 */

@Service
public class TestMQ {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send() throws Exception{

        List<String> submobileList=new ArrayList<String>();
        submobileList.add("1");
        submobileList.add("2");
        submobileList.add("3");
        Map<String, Object> bodyMap = new HashMap<String, Object>();
        bodyMap.put("batchNo", "递四方速递");
        bodyMap.put("item", submobileList);
        String jsonStr= JSON.toJSONString(bodyMap);
        amqpTemplate.convertAndSend("sendmq_key", jsonStr);
    }
}


