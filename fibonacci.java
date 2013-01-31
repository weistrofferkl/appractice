/**************************************************************
 * 
 * 	fibonacci
 * 
 * 		Computes the first n fibonacci numbers
 * 
 **************************************************************/

public class fibonacci {
	
	/**
	 * main
	 * 
	 * 
	 * @param args - args[0] is the number of fibonacci numbers to find
	 */
	public static void main(String[] args) {
		
		if (args.length < 1) {
			System.out.println("Please type a number after fibonacci the next time you run this program.");
			System.exit(0);
		}

		int n = 0;
		try {
			n = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.out.println(args[0] + " is not a number.");
			System.exit(0);
		}
		if (n < 1) {
			System.out.println("The number must be greater than 0.");
			System.exit(0);
		}

		System.out.println("The first " + args[0] + " fibonacci numbers is:" + recursiveFibonacci(n));
		
		iterativeFibonacci(Integer.parseInt(args[0]));
		
		// recursiveFibonacci(args[1]);
	}


	/**
	 * iterativeFibonacci
	 * 		iteratively computes the first n fibonacci numbers
	 * 
	 * @param n - the number of fibonacci numbers to find. must be non-negative.
	 */
	public static int iterativeFibonacci(int n) {
		if(n == 1){
			return 1;
		}
		if(n== 2){
			return 2;
		}
		if(n== 3){
			return 3;
		}
			int f1 = 1, f2 =2;
			int a =2;
			for(int i = 3; i<=n; i++){
				f1 = f2;
				f2=a;
				a = f1+f2;
			}
			return a;
		}
		
	

	/**
	 * recursiveFibonacci
	 * 		recursively computes the first n fibonacci numbers
	 * 
	 * @param n - the number of fibonacci numbers to find. must be non-negative.
	 */
	public static int recursiveFibonacci(int n) {
		if(n == 1|| n==2){
			return 1;
		}
		return recursiveFibonacci(n-2)+recursiveFibonacci(n-1);

	}
}

