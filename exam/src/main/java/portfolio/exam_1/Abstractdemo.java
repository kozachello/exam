package portfolio.exam_1;


abstract class A {

  abstract void callme();

  final void callmetoo() {
	  System.out.println("konkret metode");
	}
}

class B extends A {

    void callme() {
    	System.out.println("realiserer metoden i klasse B");
	  }

	}

final class Abstractdemo { // kan ikke have subklasser, samt alle metoder er også final

	public static void main(String args[]) {
	  // A r=new A(); // umuligt at skabe eksemplar
	  B b=new B();
	  b.callme();
	  b.callmetoo();
	  }
}
		
 	
  