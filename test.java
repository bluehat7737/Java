class SuperClass{
	int num = 100;
	void display(){
		System.out.println("Super class Method");
	}
}

class SubClass extends SuperClass{
	int num = 110;
	void display(){
		System.out.println("SubClass Method");
		System.out.println("Num = "+num);
	}

	void printMsg(){
		display();
		super.display();
		System.out.println("Super Num = "+super.num);
	}

	public static void main(String[] args) {
		SubClass ac = new SubClass();
		ac.printMsg();
	}
}
