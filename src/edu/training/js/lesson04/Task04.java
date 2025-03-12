package edu.training.js.lesson04;

public class Task04 {

	public static void main(String[] args) {
		double radius = 5; // радиус окружности
		double angle = 60; // центральный угол в градусах

		// Вычисление длины дуги
		double arcLength = 2 * Math.PI * radius * (angle / 360);

		// Вычисление площади сектора
		double sectorArea = Math.PI * radius * radius * (angle / 360);

		System.out.println("Длина дуги: " + arcLength);
		System.out.println("Площадь сектора: " + sectorArea);
	}

}
