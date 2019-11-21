package com.dhcc.zpc.util;

/**
 * 字典类
 * @author 赵朋超
 * @date 2019/08/01 20:59
 * @since v1.1
 */
public enum  CmsBusinessStatus {

    /**
     * MQ消息延时级别
     * "1s 5s 10s 30s 1m 2m 3m 4m 5m 6m 7m 8m 9m 10m 20m 30m 1h 2h"
     */
    MQ_DELAY_LEVEL_TWO("2","MQ消息延时级别：2"),
    MQ_DELAY_LEVEL_THREE("3","MQ消息延时级别：3"),
    MQ_DELAY_LEVEL_FOUR("4","MQ消息延时级别：4"),
    ;
    public String businessCode() {
        return this.businessCode;
    }

    public String businessMessage() {
        return this.responseMsg;
    }
    private String businessCode;
    private String responseMsg;

    private CmsBusinessStatus(String businessCode, String responseMsg) {
        this.businessCode = businessCode;
        this.responseMsg = responseMsg;
    }
}
