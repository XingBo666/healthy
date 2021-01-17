package com.healthy.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResult {

    private Integer code;

    private String msg;

    private Object data;

    private Integer pageNo;

    private Integer pageSize;

    private Long totalNum;

    private Long totalPage;


    public BaseResult setCode(Integer code) {
        this.code = code;
        return this;
    }

    public BaseResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public BaseResult setResult(Object result) {
        this.data = result;
        return this;
    }

    /*封装一些常用的方法*/
    public static BaseResult success() {
        return new BaseResult().builder().code(200).msg("请求成功").build();
    }

    /*带有返回数据的相应成功方法*/

    /*带消息的请求成功*/
    public static BaseResult successMsg(String msg) {
        return new BaseResult().builder().code(200).msg(msg).build();
    }

    /*带对象的请求成功*/
    public static BaseResult success(Object o) {
        return new BaseResult().builder().code(200).data(o).build();
    }

    /*失败，必须写失败原因*/
    public static BaseResult failure(String msg) {
        return new BaseResult().builder().code(199).msg(msg).build();
    }

    public static BaseResult failureAuth() {
        return new BaseResult().builder().code(400).msg("请重新登录").build();
    }

    public static BaseResult failureAuth(String msg) {
        return new BaseResult().builder().code(400).msg(msg).build();
    }

    public static BaseResult failureUnknown() {
        return new BaseResult().builder().code(500).msg("未知异常").build();
    }

    public static BaseResult successPage(Integer pageNo, Integer pageSize, Long totalNum, Object data) {
        return new BaseResult().builder().code(200).pageNo(pageNo).pageSize(pageSize).totalPage((long) Math.ceil(totalNum / pageSize)).totalNum(totalNum).data(data).build();
    }

    public static BaseResult successEmpPage(Integer pageNo, Integer pageSize) {
        return new BaseResult().builder().code(200).pageNo(pageNo).pageSize(pageSize).totalNum(0L).totalPage(0L).msg("查询成功，但是没有数据").build();
    }
}
