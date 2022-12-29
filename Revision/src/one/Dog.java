package one;

public class Dog extends Animal {
	public static void main(String[] args) {
		Animal animal = new Dog();
		@SuppressWarnings("unused")
		Dog dog = (Dog) animal;
	}
}
