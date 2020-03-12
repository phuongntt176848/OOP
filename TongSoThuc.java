package week1;

import javax.swing.JOptionPane;

public class TongSoThuc {
    
		public static void main(String[] args) {
			int iLuaChon;
		    Double b= (double) 0;
		    String a;
	
		    String x = "Ket qua la ";
		  	a = JOptionPane.showInputDialog(null,
		            "Nhap so thuc ");
		    b+=Double.parseDouble(a);
		    do{
		  	     iLuaChon = JOptionPane.showConfirmDialog(null,
		                "Co nhap tiep khong?", "Xac nhan nhap tiep",
		                JOptionPane.YES_NO_OPTION);
		  	
		  	if (iLuaChon == JOptionPane.YES_OPTION){
		          a = JOptionPane.showInputDialog(null,
		                "Nhap so thuc ");
		         b+=Double.parseDouble(a);
		      }
		          
		  	else
		  		break;
		  
		  
		  }while(true);
		  x+=b;
		  JOptionPane.showMessageDialog(null,"Ket qua " + x);
		  System.exit(0);
			
           
	}

}
