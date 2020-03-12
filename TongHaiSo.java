package week1;

import javax.swing.JOptionPane;

public class TongHaiSo {

	public static void main(String[] args) {
		
		   String strSo1,strSo2;
		   int so1,so2;
		   
	       String strHienThi = "Tổng hai số ";
	       
	       strSo1 = JOptionPane.showInputDialog(null, "Hãy nhập số thứ 1:", "Nhập số thứ nhất", JOptionPane.INFORMATION_MESSAGE);
	       strHienThi += strSo1 + " va ";
	       so1= Integer.parseInt(strSo1);
	    
	       strSo2 = JOptionPane.showInputDialog(null, "Hãy nhập số thứ 2: ","Nhập số thứ hai",  JOptionPane.INFORMATION_MESSAGE);	      
	       so2=Integer.parseInt(strSo2);   
	       
	       strHienThi += strSo2 +" la: "+ (so1+so2);
	       JOptionPane.showMessageDialog(null,strHienThi, "Hiển thị hai số", JOptionPane.INFORMATION_MESSAGE);
	       System.exit(0);
	       
	}

}
