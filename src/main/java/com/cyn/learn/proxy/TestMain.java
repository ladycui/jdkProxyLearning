package com.cyn.learn.proxy;

import com.cyn.learn.proxy.service.BaseService;
import com.cyn.learn.proxy.serviceImpl.Dog;
import com.cyn.learn.proxy.serviceImpl.Person;
import com.cyn.learn.proxy.util.ProxyFactory;

public class TestMain {

	public static void main(String[] args) throws Exception {
	   
		//mike.eat();
		//Person mike = new Person();
        BaseService dogProxy= ProxyFactory.builder(Dog.class);
        dogProxy.eat();//专门负责监控mike的代理对象
        
        BaseService mike= ProxyFactory.builder(Person.class);
        mike.eat();
       
	}

}
