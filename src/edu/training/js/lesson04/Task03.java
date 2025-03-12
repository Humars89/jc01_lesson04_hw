package edu.training.js.lesson04;

public class Task03 {

	public static void main(String[] args) {
		double x1 = 0, y1 = 0; // Координаты первой вершины
		double x2 = 3, y2 = 0; // Координаты второй вершины
		double x3 = 0, y3 = 4; // Координаты третьей вершины

		double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // Катет 1
		double side2 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)); // Катет 2
		double hypotenuse = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)); // Гипотенуза

		System.out.println("Катет 1: " + side1);
		System.out.println("Катет 2: " + side2);
		System.out.println("Гипотенуза: " + hypotenuse);
	}

}
