package week1;

import javax.swing.JOptionPane;

public class HelloNameDialog {

	public static void main(String[] args) {
		String result;
		result =JOptionPane.showInputDialog("Hãy nhập tên ban:");
		JOptionPane.showMessageDialog(null, "Xin chào "+result+"!");
		System.exit(0);

	}

}
