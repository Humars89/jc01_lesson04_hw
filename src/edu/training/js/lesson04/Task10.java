package edu.training.js.lesson04;

public class Task10 {

	public static void main(String[] args) {
		double radius = 5; // радиус шара

		// Вычисление объёма шара
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

		// Вычисление площади поверхности шара
		double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

		System.out.println("Объём шара: " + volume);
		System.out.println("Площадь поверхности шара: " + surfaceArea);

	}

}
