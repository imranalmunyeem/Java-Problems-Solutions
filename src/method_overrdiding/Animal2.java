//Access Specifiers in Method Overriding
package method_overrdiding;

class Animal2 {
	   protected void displayInfo() {
	      System.out.println("I am an animal.");
	   }
	}

	class Cat extends Animal2 {
	   public void displayInfo() {
	      System.out.println("I am a dog.");
	   }
	}

	class MainAnimal {
	   public static void main(String[] args) {
	      Cat d1 = new Cat();
	      d1.displayInfo();
	   }
	}
