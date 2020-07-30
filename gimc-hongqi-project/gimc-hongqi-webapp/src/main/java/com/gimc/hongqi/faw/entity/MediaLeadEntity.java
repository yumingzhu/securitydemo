package com.gimc.hongqi.faw.entity;

import java.io.Serializable;
import java.util.List;

import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * @Description
 * @Author yumigzhu
 * @Date 2020/7/30 16:35
 */
public class MediaLeadEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Builder
    @Data
    public static class Request {
        /**
         * 合作伙伴id
         */
        private String partnerId;

        /**
         * 联系方式的配置id
         */
        private List<Lead> leads;

    }

    @EqualsAndHashCode(callSuper = false)
    @Data
    public static class Response implements Serializable {

        private static final long serialVersionUID = 1L;
        /**
         * 状态：SUCCEED，成功；FAILED失败
         */
        private String returnStatus;

        /**
         * 错误码（030xxx）
         */
        private String errorCode;
        /**
         * 错误原因
         */
        private String errorMessage;

        private Object data;

    }

    @Data
    @Builder
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Lead {
        /**
         * 线索 ID
         */
        String id;
        /***
         * 客户姓名
         */
        String name;
        /**
         * 客户手机号码
         */
        String phone;
        /**
         * 客户所在省份 ID
         */
        String provinceId;
        /**
         * 客户所在省份名称
         */
        String provinceName;
        /**
         * 客户所在城市 ID
         */
        String cityId;
        /**
         * 客户所在区县ID
         */
        String cityName;
        /**
         * 客户所在区县ID
         */
        String countyId;
        /**
         * 客户所在区县名称
         */
        String countyName;
        /**
         * 经销商编码
         */
        String dealerId;
        /**
         * 经销商名称
         */
        String dealerName;
        /**
         * 性别(男,女,空)
         */
        String sex;
        /**
         * 线索来源一级编码(每渠道固定值)
         */
        String vfrom1;
        /**
         * 线索来源二级编码(每渠道固定值)
         */
        String vfrom2;
        /**
         * 线索来源三级编码(每渠道固定值)
         */
        String vfrom3;
        /**
         * 线索来源四级编码(每渠道固定值)
         */
        String vfrom4;
        /**
         * 创建时时间格式：yyyy-MM-ddTHH:mm:ss
         */
        String createTime;
        // 以下为可选项
        /**
         * 车系ID
         */
        String serialGroupId;
        /**
         * 车系名称
         *
         */
        String serialGroupName;
        /**
         * 车型 ID (车型有值，车系也要有值。请按厂商提供的车系车型传值)
         */
        String modelId;
        /**
         * 车型名称
         */
        String modelName;
        /**
         * 备注
         */
        String remark;
        /**
         * 线索来源类型（1.话单 2.订单 3.网络广告，4，展厅自然进店）
         */
        String sourceType;
        /**
         * 线索类型（1. 询价订单 2. 试驾 3.询价 4. 活动 5.置换。6. 自然进店）
         */
        String type;
        /**
         * 活动ID
         */
        String campaignId;
        /**
         * 销售经理编码 (一汽业务要求传输)
         */
        String salesCode;
        /**
         * 销售顾问
         */
        String salesName;
        /**
         * 销售顾问电话
         */
        String salesPhone;

    }
}
