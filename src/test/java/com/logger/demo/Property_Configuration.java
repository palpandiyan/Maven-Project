package com.logger.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Configuration {
	
	static Logger log = Logger.getLogger(Property_Configuration.class);
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.debug("debug");
		log.info("info");
		log.warn("warnning");
		log.error("error");
		log.fatal("fetal");
		
		
		
		
	}

}
