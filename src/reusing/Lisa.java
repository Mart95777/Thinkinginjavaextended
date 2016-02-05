package reusing;

//{CompileTimeError} (Won't compile)

class Lisa extends Homer {
	// uncomment to see
//@Override 
void doh(Milhouse m) {
 System.out.println("doh(Milhouse)");
}
}
