package week1;

import java.util.Scanner;

public class GiaiPtBac2 {
	public static void PTBac2(double a,double b,double c)
    {
    	if(a==0)
    	{
    		System.out.println("PT trở thành PT bậc 1");
    		if(b==0 && c==0)
    		{
    			System.out.println("PT có vô số nghiệm!");
    		}
    		else if(b==0 && c!=0)
    		{
    			System.out.println("PT vô nghiệm!");
    		}
    		else 
    		{
    			System.out.println("PT có nghệm x="+(-c/b));
    		}
    		
    	}
    	else
    	{
    		double delta= b*b-4*a*c;
    		if(delta<0)
    		{
    			System.out.println("PT vô nghiệm!");
    		}
    		else if(delta==0)
    		{
    			System.out.println("PT có nghiệm kép: x1=x2="+(-b/(2*a)));
    		}
    		else
    		{
    			double x1=(-b-Math.sqrt(delta))/(2*a);
    			double x2=(-b+Math.sqrt(delta))/(2*a);
    			System.out.println("PT có 2 nghiệm phân biệt x1="+x1+";x2="+x2);
    		}
    	}
    	
    }
	
	public static void main(String[] args) {
		System.out.println("----Giải phương trình bậc hai----");
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Nhập vào hệ số a:");
		int a = sc.nextInt();
		
		System.out.println("Nhập vào hệ số b:");
		int b = sc.nextInt();
		
		System.out.println("Nhập vào hệ số c:");
		int c = sc.nextInt();
		PTBac2(a,b,c);
		System.out.println("Bạn có muốn tiếp tục không?(y/n)");
		String line = new Scanner(System.in).nextLine();
		if(line.equalsIgnoreCase("n")) 
			break;
		
		}while(true);
		
		System.out.println("Tạm Biệt!!!");
		
	}

}
