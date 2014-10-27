import javax.swing.JTable;

public class EditCell {
  public static void main(String[] argv) throws Exception {
    int rows = 10;
    int cols = 5;
    JTable table = new JTable(rows, cols);

    table.setColumnSelectionAllowed(true);
    table.setRowSelectionAllowed(true);

    int row = 1;
    int col = 3;
    boolean success = table.editCellAt(row, col);
    if (success) {
      boolean toggle = false;
      boolean extend = false;
      table.changeSelection(row, col, toggle, extend);
    }
  }
}