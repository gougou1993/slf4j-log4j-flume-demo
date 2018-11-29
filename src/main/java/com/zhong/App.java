package com.zhong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	protected static final Logger log = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			log.info("name:{},age:{}","name",11);
		}

	}

}
