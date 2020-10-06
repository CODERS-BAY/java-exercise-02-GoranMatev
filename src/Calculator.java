import java.util.Scanner;

public class Calculator {

	// global variables
	private static final Scanner scanner = new Scanner(System.in);

	public static int x, y;
	public static float a, b;
	public static boolean terminate = false;

	public static int calcIntAdd(int x, int y) {
		return x + y;
	}

	public static int calcIntSub(int x, int y) {
		return x - y;
	}

	public static int calcIntDiv(int x, int y) {
		return x / y;
	}

	public static int calcIntMod(int x, int y) {
		return x % y;
	}

	public static int calcIntPyt(int x, int y) {
		return (int) Math.sqrt(x * x + y * y);
	}

	public static float calcFloatAdd(float a, float b) {
		return a + b;
	}

	public static float calcFloatSub(float a, float b) {
		return a - b;
	}

	public static float calcFloatDivi(float a, float b) {
		return a / b;
	}

	public static float calcFloatMod(float a, float b) {
		return a % b;
	}

	public static float calcFloatPyt(float a, float b) {
		return (float) Math.sqrt(a * a + b * b);
	}

	public static void main(String[] args) {
		do {
			System.out.println("""
					Would you like to make floating point calculations?

					type y for yes and anything else for integer calculations""");

			String input = scanner.nextLine();

			if (input.equals("y")) {
				System.out.println("Type in the first number: ");
				String inputa = scanner.nextLine();
				a = Float.parseFloat(inputa);

				System.out.println("Type in the second number: ");
				String inputb = scanner.nextLine();
				b = Float.parseFloat(inputb);

				System.out.println("""
						You can make the following calculations:
						1.   addition
						2.   subtraction
						3.   divide
						4.   modulo
						5.   pythagoras you can calculate the hypotenuse c

						To select a calculation please press the corresponding number.
						""");
				String inputCalc = scanner.nextLine();
				int z = Integer.parseInt(inputCalc);

				switch (z) {
				case 1:
					System.out.println(calcFloatAdd(a, b));
					break;
				case 2:
					System.out.println(calcFloatSub(a, b));
					break;
				case 3:
					System.out.println(calcFloatDivi(a, b));
					break;
				case 4:
					System.out.println(calcFloatMod(a, b));
					break;
				case 5:
					System.out.println(calcFloatPyt(a, b));
				}
				System.out.println("""
						Would you like to calculate again?
						Press y for yes or any other key for abort.
						""");
				String inputNext = scanner.nextLine();

				if (inputNext.equals("y")) {
					terminate = false;
				} else {
					terminate = true;
				}

			} else {
				System.out.println("Type in the first number: ");
				String inputx = scanner.nextLine();
				x = Integer.parseInt(inputx);

				System.out.println("Type in the second number: ");
				String inputy = scanner.nextLine();
				y = Integer.parseInt(inputy);

				System.out.println("""
						You can make the following calculations:
						1.   addition
						2.   subtraction
						3.   divide
						4.   modulo
						5.   pythagoras you can calculate the hypotenuse c

						To select a calculation please press the corresponding number.
						""");
				String inputCalc = scanner.nextLine();
				int z = Integer.parseInt(inputCalc);

				switch (z) {
				case 1:
					System.out.println(calcIntAdd(x, y));
					break;
				case 2:
					System.out.println(calcIntSub(x, y));
					break;
				case 3:
					System.out.println(calcIntDiv(x, y));
					break;
				case 4:
					System.out.println(calcIntMod(x, y));
					break;
				case 5:
					System.out.println(calcIntPyt(x, y));
				}
				System.out.println("""
						Would you like to calculate again?
						Press y for yes or any other key for abort.
						""");
				String inputNext = scanner.nextLine();

				if (inputNext.equals("y")) {
					terminate = false;
				} else {
					terminate = true;
				}
			}

		} while (!terminate);

		System.out.println("Thank you for using the calculator. See you soon!");
	}
}
