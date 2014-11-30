public class osarray extends sarraystr {
    private String[] odata;

    public void add(String s) {
	for (int i=0;i<last;i++) {
	    if (s.compareTo(odata[i]) > 0) {
		makeArray();
		for (int k=last;k>=index;k=k-1) {
		    data[k+1] = data[k];
		}
		data[i] = s;
		last = last +=1;
	    }
	}
    }
    
    
    public static void main(String[] args) {
	osarray s = new osarray();
	s.add("hello");
	System.out.println(s);
    }
}
