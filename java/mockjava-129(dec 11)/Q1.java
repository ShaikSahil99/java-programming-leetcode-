interface I1{

	void m1();
	void m2();

	default void m3(){
		System.out.println("Defined method of I1");
	}
	default void m4(){
		System.out.println("Defined method of I1");
	}
}

interface I2{

	void m5();
	void m6();
	default void m7(){
		System.out.println("Defined method of I2");
	}
	default void m8(){
		System.out.println("Defined method of I2");
	}
}

class Z{

	static I1 obj1 = new I1(){

		public void m1(){
			System.out.println("Overridden method of I1 in Z");
		}
		public void m2(){
			System.out.println("Overridden method of I1 in Z");
		}
	};

	static I2 obj2 = new I2(){

		public void m5(){
			System.out.println("Overridden method of I1 in Z");
		}
		public void m6(){
			System.out.println("Overridden method of I1 in Z");
		}
	};
		
	void display(){
		Z.obj1.m1();
		Z.obj1.m2();
		Z.obj1.m3();
		Z.obj1.m4();

		Z.obj2.m5();
		Z.obj2.m6();
		Z.obj2.m7();
		Z.obj2.m8();
		
	}
}

class Test{
	
	public static void main(String [] args){
	
		Z obj = new Z();
		obj.display();
	}

}