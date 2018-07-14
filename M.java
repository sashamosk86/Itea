package less08;

public class M {

	public static void main(String[] args) {

		int a = 5;
		Integer i = a;
		a = i;
		
		int f = Integer.parseInt("543");
//		System.out.println(Integer.parseInt("543"));
		if(args.length>1) {
		System.out.println("[0]: " + args[0]);
		System.out.println("[1]: " + args[1]);
		}else {
			System.out.println("Enter elements");
		}

	}

}
