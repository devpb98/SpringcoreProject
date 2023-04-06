package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Chutney {
	private String taste;

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public Chutney() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Chutney [taste=" + taste + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("InitStartAnnotation");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("DestroyEndAnnotation");
	}
}
