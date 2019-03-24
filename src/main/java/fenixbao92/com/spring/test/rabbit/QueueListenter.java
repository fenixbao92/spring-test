package fenixbao92.com.spring.test.rabbit;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * Create by fenixbao92 on 2019/3/22.
 */
public class QueueListenter implements MessageListener {



    public void onMessage(Message msg) {
        try{
            System.out.println("receive!"+System.currentTimeMillis());
            System.out.println(new String(msg.getBody(),"UTF-8"));
            String str=new String(msg.getBody(),"UTF-8");
            JSONObject json=JSONObject.parseObject(str);

            System.out.println(json.get("batchNo").toString());
            JSONArray jSONArray=JSONArray.parseArray(json.getString("item"));
            System.out.println(jSONArray.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
