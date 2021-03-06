import java.io.*;
import java.util.*;

public class Mode2 {

    private int[] a;
    private Random r;
    
    public Mode2() {
	this(20,100);
    }
    
    public Mode2(int n) {
	this(n,100);
    }

    public Mode2(int n, int m) {
	r = new Random();
	a = new int[n];
	for (int i=0;i<n;i=i+1) {
	    a[i] = r.nextInt(m);
	}
    }

    public String toString() {
	String s = "";
	for (int i=0;i<a.length;i=i+1)
	    s = s  + a[i]+", ";
	return s;
    }

     public int maxVal() {
	int max = a[0];
	for (int i=0;i<a.length;i=i+1) {
	    if (a[i]>max) {
		max = a[i];
	    } else {}
	}
	return max;
    }

    public int maxIndex() {
	int max = a[0];
	int index = 0;
	for (int i=0;i<a.length;i=i+1) {
	    if (a[i]>max) {
		index = i;
	    } else {}
	}
	return index;
    }

    /*
    public int[] fastmode() {
        int[] modes;
        modes = new int[maxVal(a)];
	for (int i=0;i<a.length;i=i+1) {
	    modes[i]=modes[i]+1;
	}
	return modes;
    }
    */

    public int fastmode() {
	int max = maxVal();
	int[] tallies = new int[max+1];
	for (int i=0;i<a.length;i++) {
	    tallies[ a[i] ] += 1;
	}
	for (int i=0;i<tallies.length;i++) {
	    System.out.println(i+":"+tallies[i]);
	}
	int m = maxIndex();
	return m;
    }

    public static void main(String[] args) {
	Mode2 m = new Mode2(10,5);
	System.out.println(m);
	System.out.println(m.fastmode());
    }

}
	

