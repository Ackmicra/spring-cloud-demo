package com.dhcc.zpc.rocketmq.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * @Description: MQ任务参数类
 * @author zhaopengchao@dhcc.com.cn
 * @Date 2019年8月27日上午10:57:31
 */
@Data
public class MQParmsDomain implements Serializable{
	
	/**  
	* @Fields field:field:{todo}
	*/  
	private static final long serialVersionUID = 1L;
	
	
	/**  
	* @Fields 任务类型
	*/
	private String taskType;
	
	/**  
	* @Fields 消息延时级别、
	 * "1s 5s 10s 30s 1m 2m 3m 4m 5m 6m 7m 8m 9m 10m 20m 30m 1h 2h"
	*/  
	private int delayLevel;
	
	/**  
	* @Fields 消息数据实体
	*/  
	private Object taskData;
}
