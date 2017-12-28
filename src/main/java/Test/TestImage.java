package Test;

import common.java.httpServer.booter;
import common.java.nlogger.nlogger;

public class TestImage {
	public static void main(String[] args) {
		booter booter = new booter();
		try {
			System.out.println("GrapeCutImage");
			System.setProperty("AppName", "GrapeCutImage");
			booter.start(1008);
		} catch (Exception e) {
			nlogger.logout(e);
		}
	}
}
