package portfolio.exam_1;


class Factorial {
	int fact(int n) {
		int result;
		if (n == 1) return 1;
		result = fact(n - 1) * n;
		return result;
	}
}

class Newrecursion {
	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println("factorial 1 is: " + f.fact(1));
		System.out.println("factorial 2 is: " + f.fact(2));
		System.out.println("factorial 3 is: " + f.fact(3));
		System.out.println("factorial 4 is: " + f.fact(4));
		System.out.println("factorial 5 is: " + f.fact(5));
		System.out.println("factorial 6 is: " + f.fact(6));
	}
}

