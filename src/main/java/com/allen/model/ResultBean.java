package com.allen.model;

/**
 * 
* @ClassName: ResultBean
* @Description: 接口返回通用类
* @author chenliqiao
* @date 2018年4月3日 下午5:22:02
* 
* @param <T>
 */
public class ResultBean<T> {
	
	private Integer code;
	
	private String message;
	
	private T data;
	
	public ResultBean(){
		this.code=1;
		this.message="成功!";
	}
	
	public ResultBean(T data){
		this.code=1;
		this.message="成功!";
		this.data=data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResultBean [code=" + code + ", message=" + message + ", data=" + data + "]";
	}
	

}
