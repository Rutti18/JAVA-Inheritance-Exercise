
// Ecercise - 1		ABC (2 Parts)
public class ABC {

	public static void main(String[] args) {
		// part 1
		A a = new A(); // instance of class A
		B b = new B(); // instance of class B
		C c = new C(); // instance of class C

		a.a();
		b.b();
		c.c();

		// part 2
		C c1 = new C();

		c1.a();
		c1.b();
		c1.c();

	}

}

// create class A
class A {
	public void a() {
		System.out.println("A");
	}
}

// create class B
class B extends A {
	public void b() {
		System.out.println("B");
	}
}

// create class C
class C extends B {
	public void c() {
		System.out.println("C");
	}
}