
class Animal {
	public void speak() {
		System.out.println("  a  ");
	}
}

class cat extends Animal {
	@Override
	public void speak() {
		System.out.println("Meow");
	}
}

class dog extends Animal {
	public void speak() {
		System.out.println("Meow");
	}
}

class horse extends Animal {
	public void speak() {
		System.out.println("Meow");
	}
}