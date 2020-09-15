
public class UsingRoots {
	public static void main(String[] args)
	  {
	     double a=2, b=-10, c=2; // two roots
	     //double a=3, b=6, c=3; // one root
		//double a=3, b=-2, c=3; // no rootsa

	     Roots.calculate_roots(a,b,c);
	     System.out.println(Roots.num_roots());
		 System.out.println(Roots.first_root());
		 System.out.println(Roots.second_root());


	 }
}
