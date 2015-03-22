package methods;

public class TestMethods {
	public static void main(String[] args) {
		
		MyMethods test1 = new MyMethods();
		
		
		int aVal = test1.total();
		test1.print_text("Resultatet uden parametrer: ", aVal);
			
		int aVal2 = test1.total(30);
		test1.print_text2("Resultatet med parametren 30: ", aVal2);
		


	}
}
