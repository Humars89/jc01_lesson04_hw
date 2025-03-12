package edu.training.js.lesson04;

public class Task06 {

	public static void main(String[] args) {
		int number = 1235; // любое четырёхзначное число
		int sum = (number / 1000) + (number / 100 % 10) + (number / 10 % 10) + (number % 10);

		System.out.println("Сумма цифр: " + sum);
	}

}
