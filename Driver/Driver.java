public class Driver {
    public static void main(String[]args){
	Greeter g1 = new Greeter();
	Greeter g2 = new Greeter();

	System.out.println(g1.greet());
	g1.greet();
	g2.greet();;

	// new String("Sup!") makes a new block of memory, puts Sup! in it
	// and then returns its address.
        g1.setGreeting("Howdy!");

	g1.greet();
	g2.greet();

	// here, we're using the string literal Howdy! and Java just
	// returns it's address without grabbing a new block of memory.
	// if we use howdy a bunch of times, they'll all point to the same 
	// "Howdy" whereas if we use new String a bunch of times, each will 
	// point to a different one
	g2.setGreeting("Howdy!");

	g1.greet();
	g2.greet();

	String s = g1.getGreeting();
	System.out.println("g1's greeting is: " + s);
    }
}
