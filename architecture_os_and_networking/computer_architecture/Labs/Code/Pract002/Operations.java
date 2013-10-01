
public class Operations {
	
	public static void main(String[] args){

		System.out.println("Or - Operations");
		System.out.println(or(false, false));
		System.out.println(or(false, true));
		System.out.println(or(true, false));
		System.out.println(or(true, true));
		System.out.println("\n\n");
		
		System.out.println("And - Operations");
		System.out.println(and(false, false));
		System.out.println(and(false, true));
		System.out.println(and(true, false));
		System.out.println(and(true, true));
		System.out.println("\n\n");
		
		System.out.println("Not - Operations");
		System.out.println(not(true));
		System.out.println(not(false));
		System.out.println("\n\n");
		
		System.out.println("NOr - Operations");
		System.out.println(nor(false, false));
		System.out.println(nor(false, true));
		System.out.println(nor(true, false));
		System.out.println(nor(true, true));
		System.out.println("\n\n");
		
		System.out.println("NAnd - Operations");
		System.out.println(nand(false, false));
		System.out.println(nand(false, true));
		System.out.println(nand(true, false));
		System.out.println(nand(true, true));
		System.out.println("\n\n");
		
		System.out.println("XOr - Operations");
		System.out.println(xor(false, false));
		System.out.println(xor(false, true));
		System.out.println(xor(true, false));
		System.out.println(xor(true, true));
		System.out.println("\n\n");
		
		System.out.println("XNOr - Operations");
		System.out.println(xnor(false, false));
		System.out.println(xnor(false, true));
		System.out.println(xnor(true, false));
		System.out.println(xnor(true, true));
	}
	
	private static boolean or(boolean x, boolean y)
	{
		return x||y;
	}
	
	private static boolean and(boolean x, boolean y)
	{
		return x&&y;
	}
	
	private static boolean not(boolean x)
	{
		return !x;
	}
	
	private static boolean nor(boolean x, boolean y)
	{
		return !(x||y);
	}
	
	private static boolean nand(boolean x, boolean y)
	{
		return !(x&&y);
	}
	
	private static boolean xor(boolean x, boolean y)
	{
		return x^y;
	}
	
	private static boolean xnor(boolean x, boolean y)
	{
		return !(x^y);
	}
}
