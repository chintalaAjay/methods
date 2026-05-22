class solution1{

	public static void method1(){
		method2();
	
		System.out.println("Method1");

	}
	public static void method2(){
		solution1 sol=new solution1();
		sol.nonStaticMethod2();
		System.out.println("method2");


	}
	public  void nonStaticMethod1(){
		nonStaticMethod2();
		System.out.println(" non static Method1");


	}
	public  void nonStaticMethod2(){
		System.out.println("non static Method1");

	}



	public static void main(String args[]){
		method1();
		method2();
		


	}

	



}