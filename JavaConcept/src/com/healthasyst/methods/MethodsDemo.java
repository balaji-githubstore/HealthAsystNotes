package com.healthasyst.methods;

public class MethodsDemo {

	public static void main(String[] args) {

		int radius = 10;

		double result = Area.areaOfCircle(radius);
		System.out.println(result);

		result = Area.areaOfCircle(20);
		System.out.println(result);

		double power = Math.pow(2, 3);
		System.out.println(power);

		double random = Math.random();
		System.out.println(random);

		String authorName = Area.getAuthorName();
		System.out.println(authorName);

		
		Area obj = new Area(); // allocate memory for all non-static fields

		double res = obj.areaOfTriangle(25, 1);
		System.out.println(res);
		
		obj.printTypeDescription();
	}
}
