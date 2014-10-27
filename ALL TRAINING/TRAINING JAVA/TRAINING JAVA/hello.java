import javax.swing.JOptionPane;
class hello{
	public static void main(String [] args){
		System.out.println("Hello Bozz !!!");
		JOptionPane.showMessageDialog(null,"Permulaan","pengumuman",JOptionPane.INFORMATION_MESSAGE);
		String nama=JOptionPane.showInputDialog(null,"masukkan nama anda","pengumuman",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Nama anda adalah = "+nama,"pengumuman",JOptionPane.INFORMATION_MESSAGE);
	}
}