package Ventanas;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class VentanaJTable extends JFrame{
	
	public VentanaJTable() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("VentanaJList y scroll panel");
		setSize(400, 200);
		setVisible(true);
		
		DefaultTableModel tableModel = new DefaultTableModel();
		JTable table = new JTable(tableModel);
		
		table.setColumnSelectionAllowed(false);
		table.setRowSelectionAllowed(false);
		
		tableModel.addColumn("Nombre");
		tableModel.addColumn("Apellido");
		tableModel.addColumn("Direccion");
		
        tableModel.addRow(new Object[]{"Alice","Arroyo", "Nueva York"});
        tableModel.addRow(new Object[] {"Marcos","Perolo","VIBLAO"});
        
        
        add(table);
        
     

	}
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new VentanaJTable();				
			}
        });
	}
}
