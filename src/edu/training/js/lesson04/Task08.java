package edu.training.js.lesson04;

public class Task08 {

	public static void main(String[] args) {
		double side = 4; // длина стороны правильного шестигранника
		double height = 8; // высота призмы

		// Периметр шестигранника
		double perimeter = 6 * side;

		// Площадь шестигранника
		double area = (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;

		// Объём призмы
		double volume = area * height;

		System.out.println("Периметр правильного шестигранника: " + perimeter);
		System.out.println("Площадь правильного шестигранника: " + area);
		System.out.println("Объём призмы: " + volume);
	}
}
