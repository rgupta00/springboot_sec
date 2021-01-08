package com.storeapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"data3","data2"})
public class DemoBean {
	private String data1;
	private String data2;
	//@JsonIgnore
	private String data3;
	
	
	public String getData1() {
		return data1;
	}
	public void setData1(String data1) {
		this.data1 = data1;
	}
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
	public String getData3() {
		return data3;
	}
	public void setData3(String data3) {
		this.data3 = data3;
	}
	public DemoBean(String data1, String data2, String data3) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}
	public DemoBean() {}
	
}