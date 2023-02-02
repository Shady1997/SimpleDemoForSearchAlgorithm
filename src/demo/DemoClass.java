package demo;

public class DemoClass {

	public static void main(String[] args) {

		// define start execution time
		System.out.println("Welcome Shady");
		long startTime = System.currentTimeMillis();
		int x = 999978997;
		int n = 1000000000;
		int count = 0;
		boolean isEven = n % 2 == 0;

//		for (int i = 0; i <= n; i++) {
//			if (i == x)
//				System.out.println("We Found Number At : " + i);
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("Total spend time = " + (endTime - startTime) + " MS");

//------------------------------------------------------------------------------------------------------
		if (x > 0) {
			if (isEven) {
				for (int i = 0; i < n; i += 2) {
					count++;
					if (i == x) {
						System.out.println("We Fount The Value at " + count + " try");
						break;
					}
				}
			} else {
				for (int i = 1; i < n; i = i + 2) {
					count++;
					if (i == x) {
						System.out.println("We Fount The Value at " + count + " try");
						break;
					}
				}
			}
		} else {
			System.out.println("We Expect Correct Value");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total spend time = " + (endTime - startTime) + " MS");
	}

}
