package com.lagou.edu.resultModel;

public class GetSingleObjVO<T> extends LTBase {

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "GetSingleObjVO [data=" + data + "]";
	}

}
