package srijan;

import java.util.Scanner;

public class First_Class {

//	public static void main(String[] args) {	
//		System.out.println("hello world");
//
//	}
	
	public static void main(String[] args)
	{	
		Scanner s1=new Scanner(System.in);
		int x;
		x=s1.nextInt();
		System.out.println(x);
		
		E e1=new E();
		e1.show();
	}
	
	
	
}

class E
{
	public void show()
	{
		Scanner s2=new Scanner(System.in);
		int y;
		y=s2.nextInt();
		int s=0;
		for(int i=0; i<=y; i++) {
			s=s+i;
		}
		System.out.println(s);
	}
}
