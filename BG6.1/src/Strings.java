import java.util.*;
public class Strings {
	String s1;
	String s2;
	public Strings() {
		s1= "Hello ";
		s2= "Hope you are fine";
	}
	void change() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value for s1");
		s1= sc.nextLine();
		System.out.println("Enter the value for s2");
		s2= sc.nextLine(); 
		System.out.println(s1+" "+s2);
	}
	void merge() {
		String s3= s1+s2;
		System.out.println(s1+s2);
	}

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		Strings str1= new Strings();
		System.out.println(str1.s1);
		System.out.println(str1.s2);
		System.out.println("Do you want to change the strings? (1/0)");
		int res= obj.nextInt();
		if(res==1) {
			str1.change();
		}
		System.out.println("Do you want to add the strings? (1/0)");
		int res2= obj.nextInt();
		if(res2==1) {
			str1.merge();
		}
	}

}
