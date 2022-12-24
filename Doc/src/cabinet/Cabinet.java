/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinet;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import sun.util.calendar.BaseCalendar;

/**
 *
 * @author DELL
 */
public class Cabinet extends JFrame{
    private static datechooser.beans.DateChooserCombo dateChooserCombo1;

   
    public static void main(String[] args) {
        // TODO code application logic here
       

    JTable table = new JTable();
    DefaultTableModel model = (DefaultTableModel) table.getModel();

    model.addColumn("A", new Object[] { "item1" });
    model.addColumn("B", new Object[] { "item2" });

    String[] values = new String[] { "1", "2", "3" };
    TableColumn col = table.getColumnModel().getColumn(0);
    col.setCellEditor((TableCellEditor) new SpinnerEditor(values));
  }
}

class SpinnerEditor extends AbstractCellEditor implements TableCellEditor {
  final JSpinner spinner = new JSpinner();

  public SpinnerEditor(String[] items) {
    spinner.setModel(new SpinnerListModel(Arrays.asList(items)));
  }

  public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected,
      int row, int column) {
    spinner.setValue(value);
    return spinner;
  }

  public boolean isCellEditable(EventObject evt) {
    if (evt instanceof MouseEvent) {
      return ((MouseEvent) evt).getClickCount() >= 2;
    }
    return true;
  }

  public Object getCellEditorValue() {
    return spinner.getValue();
  }
    
}
