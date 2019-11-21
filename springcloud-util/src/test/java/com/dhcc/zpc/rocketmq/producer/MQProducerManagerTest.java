package com.dhcc.zpc.rocketmq.producer;

import com.dhcc.zpc.rocketmq.domain.MQParmsDomain;
import com.dhcc.zpc.util.CmsBusinessStatus;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class MQProducerManagerTest {

    /**
     * 引入MQ生产者管理类
     */
    @Autowired
    private MQProducerManager mQProducerManager;

    /**
     * 测试生产者
     */
    @Test
    public void produceTest(){
        MQParmsDomain message = new MQParmsDomain();
        // 设置消息内容
        message.setTaskData("123456789");
        // 设置消息类型
        message.setTaskType("01");
        // 设置消息延时级别
        message.setDelayLevel(Integer.parseInt(CmsBusinessStatus.MQ_DELAY_LEVEL_TWO.businessCode()));
        log.debug("消息生产成功");
        // 生产者生产消息
        mQProducerManager.send(message);
    }
}