package edu.training.js.lesson04;

public class Task07 {

	public static void main(String[] args) {
		double num1 = -4; // первое число
		double num2 = 9; // второе число

		// Среднее арифметическое квадратов
		double arithmeticMean = (Math.pow(num1, 2) + Math.pow(num2, 2)) / 2;

		// Среднее геометрическое модулей
		double geometricMean = Math.sqrt(Math.abs(num1) * Math.abs(num2));

		System.out.println("Среднее арифметическое квадратов: " + arithmeticMean);
		System.out.println("Среднее геометрическое модулей: " + geometricMean);

	}

}
