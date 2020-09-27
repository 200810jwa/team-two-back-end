package com.agora.logger;

import org.apache.log4j.Logger;

public class Log4J {
	
	private static Logger log = Logger.getLogger(Log4J.class);
	
	public void loginS() {
		log.info("Login success");
	}
	
	public void loginF() {
		log.error("Login fail");
	}
	
	public void registerS() {
		log.info("Register success");
	}
	
	public void registerF() {
		log.error("Register fail");
	}
	
	public void articleUploadS() {
		log.info("Article upload success");
	}
	
	public void articleUploadF() {
		log.error("Article upload fail");
	}
	
	public void getArticlesS() {
		log.info("Get articles success");
	}
	
	public void getArticlesF() {
		log.error("Get articles fail");
	}
	
	public void getUsersS() {
		log.info("Get users success");
	}
	
	public void getUsersF() {
		log.error("Get users fail");
	}
	
	public void getUserS() {
		log.info("Get user success");
	}
	
	public void getUserF() {
		log.error("Get user fail");
	}
	
	public void getArticleS() {
		log.info("Get article success");
	}
	
	public void getArticleF() {
		log.error("Get article fail");
	}
	
	public void passHashS() {
		log.info("Password hash success");
	}
	
	public void passHashF() {
		log.error("Password hash fail");
	}
	
	public void logoutS() {
		log.info("Logout success");
	}
	
	public void logoutF() {
		log.error("Logout fail");
	}

}