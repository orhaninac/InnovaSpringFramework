package com.Innova.a0.iocsiz.dcsiz;

public class JavaVersion {
	
	public void javaVersion(String version) {
		if (version.equals("17")) {
			System.out.println("Java 17");
		} else if (version.equals("18")) {
			System.out.println("Java 18");
		} else if (version.equals("19")) {
			System.out.println("Java 19");
		} else {
			System.out.println("Farklı bir sürüm girdiniz");
		}
		
	}
	
}
