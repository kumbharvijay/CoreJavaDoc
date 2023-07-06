/**
 * 
 */
package com.org.test;

/**
 * 
 */
public class StringPerformance {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new java.lang.StringBuffer()
		
		for (int i = 0; i < 10000; i++) {
			sb.append("EE");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Java");
		for (int i = 0; i < 10000; i++) {
			sb2.append("Standard");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}
