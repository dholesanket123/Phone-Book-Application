package com.BikkedIT.PhoneBookApp.Excepation;

import java.time.LocalDate;

public class ExcepationMassage {
	
	private String errorCode;
	private String msg;
	private LocalDate localDate;
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	@Override
	public String toString() {
		return "ExcepationMassage [errorCode=" + errorCode + ", msg=" + msg + ", localDate=" + localDate + "]";
	}
	
	

}
