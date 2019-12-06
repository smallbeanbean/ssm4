package com.test;

import org.apache.log4j.Logger;

public class TestLog {
	public static void main(String[] args) {
		try {
			int m=1/0;
		} catch (Exception e) {
			// TODO: handle exception
			Logger.getLogger("ssm4Log").info(e);
		}
	}

}
