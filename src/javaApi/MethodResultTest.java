package javaApi;


public class MethodResultTest {

	public static void main(String[] args) {
		int r = MethodResultTest.foo(3);
		System.out.println(r);
	}

	private static int foo(int i) {
		int a=i;
		try{
			a=1;
		}catch(Exception e){
			
		}finally{
			i=2;
		}
		return i;
	}

}
