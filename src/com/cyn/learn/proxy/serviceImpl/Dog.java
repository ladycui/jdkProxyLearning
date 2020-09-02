package com.cyn.learn.proxy.serviceImpl;

import com.cyn.learn.proxy.service.BaseService;

public class Dog implements BaseService {

	@Override
	public void eat() {
	   System.out.println("啃骨头");
	}

	@Override
	public void wc() {
		 System.out.println("三腿立");

	}

}
