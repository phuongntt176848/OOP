package week1;

import javax.swing.JOptionPane;

public class HienThiHaiSo {

	public static void main(String[] args) {
       String strSo1,strSo2;
       String strHienThi = "Bạn vừa nhập ";
       
       strSo1 = JOptionPane.showInputDialog(null, "Hãy nhập số thứ 1:", "Nhập số thứ nhất", JOptionPane.INFORMATION_MESSAGE);
       strHienThi += strSo1 + " va ";
       
       strSo2 = JOptionPane.showInputDialog(null, "Hãy nhập số thứ 2: ","Nhập số thứ hai",  JOptionPane.INFORMATION_MESSAGE);
       strHienThi += strSo2;
    		       
       JOptionPane.showMessageDialog(null,strHienThi, "Hiển thị hai s", JOptionPane.INFORMATION_MESSAGE);
       System.exit(0);

       
       
	}

}
