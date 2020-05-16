package com.lagou.edu.resultModel;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ResumeController
 * @Description TODO
 * @date 2020-05-14 22:13
 */
public class LTBase {

	private String result;
	private String message;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "LTBase [result=" + result + ", message=" + message + "]";
	}

}
