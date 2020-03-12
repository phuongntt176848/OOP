package week1;
import java.util.Scanner;

public class TamGiac {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao chieu cao cua tam giac:");
        int h= sc.nextInt();
        System.out.println("tam giac vuong chieu cao " +h );
        for(int i=0;i<h;i++){
            for(int j=0;j<=i;j++)
            {
            System.out.printf("* ");
            }
            System.out.println(" ");
        }
        System.out.println();
        System.out.println("tam giác cân chiều cao " +h );
        for(int i=0;i<h;i++){
            for(int j=h;j>i;j--){
                System.out.print(" ");
            }
            System.out.printf("*");
            for(int k=0;k<2*i;k++){
                System.out.printf("*");
            }
            System.out.println();
        }
	}

}
