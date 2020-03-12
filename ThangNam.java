package week1;

import javax.swing.JOptionPane;

public class ThangNam {

	public static void main(String[] args) {
		String nam,thang;
		int n,t;
		String strHienThi = "So ngay trong thang la:";
	    nam = JOptionPane.showInputDialog(null,
		            "Hay nhap nam: ","Nhap nam", 
		            JOptionPane.INFORMATION_MESSAGE);
		if(Integer.parseInt(nam)<0) 
		    {
		    	n=JOptionPane.showConfirmDialog(null,"Ban nhap nam sai roi!. Co muon nhap lai khong?", "Loi",JOptionPane.YES_NO_OPTION, 
                         JOptionPane.ERROR_MESSAGE);
		    	if(n == JOptionPane.YES_OPTION)
		    	{
		    		nam = JOptionPane.showInputDialog(null,
				            "Hay nhap nam: ","Nhap nam", 
				            JOptionPane.INFORMATION_MESSAGE);
		    	}else 
		    		System.exit(0);
		    		
		    }
		
		thang = JOptionPane.showInputDialog(null,"Nhập vào tháng bạn muốn:",
				                             "Nhập tháng",JOptionPane.INFORMATION_MESSAGE);
		if( (Integer.parseInt(thang) < 0) || (Integer.parseInt(thang) > 12) ) 
		    {
		    	t =JOptionPane.showConfirmDialog(null,"Ban nhap thang sai roi!. Co muon nhap lai khong?", "Loi",JOptionPane.YES_NO_OPTION, 
                      JOptionPane.ERROR_MESSAGE);
		    	if(t == JOptionPane.YES_OPTION)
		    	{
		    		thang = JOptionPane.showInputDialog(null,
				            "Hay nhap thang: ","Nhap thang", 
				            JOptionPane.INFORMATION_MESSAGE);
		    	}else 
		    		System.exit(0);
		    }
		 n = Integer.parseInt(nam);
		 t = Integer.parseInt(thang);
		 if(t ==1 || t==3 || t==5 || t==7 || t==8 || t==10 || t==12)
		 {
			 strHienThi+="31";
		     JOptionPane.showMessageDialog(null,strHienThi, 
		             "So ngay trong thang", JOptionPane.INFORMATION_MESSAGE);
		    System.exit(0);
		 }
		 
		 if(t ==4 || t==6 || t==9 || t==11)
		 {
			 strHienThi+="30";
		     JOptionPane.showMessageDialog(null,strHienThi, 
		             "So ngay trong thang", JOptionPane.INFORMATION_MESSAGE);
		    System.exit(0);
		 }
		 if(t==2)
		 {
			 if(n%4==0)
				 strHienThi+=29;
			 else 
				 strHienThi+=28;
			 JOptionPane.showMessageDialog(null,strHienThi, 
		             "So ngay trong thang", JOptionPane.INFORMATION_MESSAGE);
		     System.exit(0);
			 
		 }
		 
			
	}

}
