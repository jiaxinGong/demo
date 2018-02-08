package demo.jiaxin.common;

import java.io.Serializable;

public class ResultBean<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	// 成功状态吗
	public static final int SUCCESS = 0;
	// 失败状态码
	public static final int FAIL = 1;
	// 无权限状态码
	public static final int NO_PERMISSION = 2;
	
	// 返回提示
	private String msg = "success";
	// 返回码
	private int code = SUCCESS;
	// 返回数据
	private T data;

	public ResultBean() {
		super();
	}

	public ResultBean(T data) {
		super();
		this.data = data;
	}

	public ResultBean(Throwable e) {
		super();
		this.msg = e.toString();
		this.code = FAIL;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
