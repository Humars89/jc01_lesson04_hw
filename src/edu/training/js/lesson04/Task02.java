package edu.training.js.lesson04;

public class Task02 {

	public static void main(String[] args) {
		double x1 = 3; // координата x1
		double y1 = 4; // координата y1
		double x2 = 7; // координата x2
		double y2 = 1; // координата y2

		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println("Расстояние между центрами окружностей: " + distance);
	}

}
