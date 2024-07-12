import java.util.Scanner;
class Test {
		
	public static void main(String[] args) {
     	String s = "-5 / 7";
		System.out.println("s= "+s);
		s = s.replaceAll("/\\s+", "/");

		s = s.replaceAll("\\s+/", "/");
		System.out.println("s= "+s);
		System.out.println("");
		s = "-75";
		System.out.println("s= "+s);
		s = s.replaceAll("/\\s+", "/");

		s = s.replaceAll("\\s+/", "/");
		System.out.println("s= "+s);
		System.out.println("");
		s = "1 1 /  3";
		System.out.println("s= "+s);
		s = s.replaceAll("/\\s+", "/");

		s = s.replaceAll("\\s+/", "/");
		System.out.println("s= "+s);
		System.out.println("");
		
		//User Imput --> 
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a complex number (or 'q' to quit):");
            System.out.print("Real part: ");
            String realInput = scanner.nextLine().trim();

            if (realInput.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("Imaginary part (press Enter if none): ");
            String imagInput = scanner.nextLine().trim();

            try {
                Rational real = new Rational(realInput);
                Complex complex;

                if (imagInput.isEmpty()) {
                    complex = new Complex(real);
                } else {
                    Rational imag = new Rational(imagInput);
                    complex = new Complex(real, imag);
                }

                System.out.println("Complex number: " + complex);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
        System.out.println("Goodbye!");
	}
}
	
// run this
