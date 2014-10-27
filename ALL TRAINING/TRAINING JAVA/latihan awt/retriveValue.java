import javax.swing.JTable;

public class retriveValue{
  public static void main(String[] argv) throws Exception {
    int rows = 3;
    int cols = 3;
    JTable table = new JTable(rows, cols);

    int rowIndex = 1;
    int vColIndex = 2;
    Object o = table.getValueAt(rowIndex, vColIndex);
	String nilai=String.valueOf(o);
	int x=Integer.parseInt(nilai);
	System.out.println("nilainya adalah = "+nilai);
  }
}