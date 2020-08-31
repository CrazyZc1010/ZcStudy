package springBoot.zc.entity;


import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;


public class JsonBean implements Serializable {

	private static final long serialVersionUID = -2305190961826394607L;
	private String code = "1";

	private String msg = "success";

	private Object data = "";

	public JsonBean(){

	}
	public  static JsonBean error(String msg){
		JsonBean jsonBean = new JsonBean();
		jsonBean.setCode("0");
		jsonBean.setMsg(msg);
		return jsonBean;
	}
	public  static JsonBean success(Object data){
		JsonBean jsonBean = new JsonBean();
		jsonBean.setData(data);
		return jsonBean;
	}
	public  static JsonBean success(Object data,String msg){
		JsonBean jsonBean = new JsonBean();
		jsonBean.setCode("1");
		jsonBean.setData(data);
		jsonBean.setMsg(msg);
		return jsonBean;
	}

	public JsonBean(Object o){
		data = o;
	}


	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "JsonBean [code=" + code + ", msg=" + msg + ", data=" + JSONObject.toJSONString( data ) + "]";
	}


}
