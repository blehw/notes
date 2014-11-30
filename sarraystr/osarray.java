public class osarray extends sarraystr {
    private String[] odata;
    private int last;

    public osarray() {
	odata = new String[10];
    }
    
    public void add(String s) {
	int i = 0;
	if (super.size() == 0) {
	    if (last<data.length) {
		data[last +1] = s;
		last +=1;
	    }
	    if (last==data.length) {
		makeArray();
		data[last +1] = s;
		last +=1;
	    }
	    System.out.println("empty");
	} else {
	    System.out.println("not empty");
	    while (i<super.size()) {
		System.out.println("test");
		System.out.println(i);
		System.out.println(odata[0]);
		if (s.compareTo(odata[i]) > 0) {
		    System.out.println("in here");
		    super.add(i,s);
		}
		System.out.println("out");
		i = i + 1;
	    }
	}
	System.out.println(odata.length);
    }

    public static void main(String[] args) {
	osarray s = new osarray();
	s.add("hello");
	System.out.println(s);
	s.add("abc");
	System.out.println(s);
	System.out.println(s.size());
	System.out.println("hello".compareTo("abc"));
    }
}
