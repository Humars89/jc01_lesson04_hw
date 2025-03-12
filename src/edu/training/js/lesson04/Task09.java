package edu.training.js.lesson04;

public class Task09 {

	public static void main(String[] args) {
		double side = 6; // длина стороны квадрата

		// Площадь квадрата
		double area = Math.pow(side, 2);

		// Диагональ квадрата
		double diagonal = side * Math.sqrt(2);

		// Радиус вписанной окружности
		double inscribedRadius = side / 2;

		// Радиус описанной окружности
		double circumscribedRadius = diagonal / 2;

		System.out.println("Площадь квадрата: " + area);
		System.out.println("Диагональ квадрата: " + diagonal);
		System.out.println("Радиус вписанной окружности: " + inscribedRadius);
		System.out.println("Радиус описанной окружности: " + circumscribedRadius);
	}

}
