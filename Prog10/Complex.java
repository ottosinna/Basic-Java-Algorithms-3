public class Complex {
	
	//box 1: Attributes (obj components)
	Rational real;
	Rational imag;

	//box 2: Constructors: allocate and initialize the object
	Complex( Rational a) {
		real = a;
	}
	Complex( Rational a, Rational b) {
		real = a;
		imag = b;
	}
	
	public String toString() {
		String s;
		if (imag == null) {
			s = real.toString() + " + 0i ";
		} else {
			s = real.toString() + " + " + imag.toString() + "i";
		}
		return s;
	}
}