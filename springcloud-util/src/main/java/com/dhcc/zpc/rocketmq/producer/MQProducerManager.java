package com.dhcc.zpc.rocketmq.producer;

import javax.annotation.Resource;

import com.dhcc.zpc.rocketmq.domain.MQParmsDomain;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;


/**
 * MQ生产者
 * @author 赵朋超
 * @Configuration//类启动时加载该类
 */
@Service
public class MQProducerManager {

	@Resource
    private RocketMQTemplate rocketMQTemplate;
	
	/**  
	* @Fields topicName
	*/  
	@Value("${rocketmq.topic}")
	private String topicName;
	
	/**  
	* @Fields 发送MQ消息超时时间
	*/  
	@Value("${rocketmq.sendTimeout}")
	private long timeout;
	
	
	/**  
	* @Description 将消息发送到MQ队列中
	* @param message 消息对象
	*/  
	public void send(MQParmsDomain message) {
		 rocketMQTemplate.syncSend(topicName, MessageBuilder.withPayload(message).build(), timeout, message.getDelayLevel());
	}
}
