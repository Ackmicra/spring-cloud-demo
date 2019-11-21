package com.dhcc.zpc.rocketmq.consumer;

import com.dhcc.zpc.rocketmq.domain.MQParmsDomain;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description: MQ消费者管理类
 * @author zhaopengchao@dhcc.com.cn
 * @Date 2019年8月23日下午2:26:00
 */
@Slf4j
@Service
@RocketMQMessageListener(topic = "${rocketmq.topic}",  consumerGroup = "${rocketmq.group}")
public class MQConsumerManager implements RocketMQListener<MQParmsDomain>{
	
	/**
	 * 消费者消费消息
	 * @param t 消息对象
	 */
	@Override
	public void onMessage(MQParmsDomain t) {

		log.info("MQ任务执行开始: {}");
		//校验MQ获取数据是否为空
		Assert.notNull(t,"MQParmsDomain is null");
		Assert.notNull(t.getTaskType(),"MQParmsDomain TaskType is null");
		Assert.notNull(t.getTaskData(),"MQParmsDomain TaskDate is null");
		/**
		 * 此处需要记录消费日志
		 */

		log.info("贷款申请审核回调京东开始: [{}]，任务类型：" + t.getTaskType());
		log.info("贷款申请审核回调京东开始: [{}]，任务数据：" + t.getTaskData());

		System.out.println("消息延时级别为" + t.getDelayLevel());
		System.out.println("消息内容为" + t.getTaskData().toString());

		log.info("MQ任务执行结束: {}" );
    }
	
}
