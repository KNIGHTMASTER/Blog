import java.util.Arrays;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class buildtableindata {
  public static void main(String[] argv) {
    Vector rowData = new Vector();
    for (int i = 0; i < 1; i++) {
      Vector colData = new Vector(Arrays.asList("qq"));
      rowData.add(colData);
    }
    
    String[] columnNames = {"a"};
    
    Vector columnNamesV = new Vector(Arrays.asList(columnNames));

    JTable table = new JTable(rowData, columnNamesV);
    JFrame f = new JFrame();
    f.setSize(300, 300);
    f.add(new JScrollPane(table));
    f.setVisible(true);
  }
}