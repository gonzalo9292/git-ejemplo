package Ventanas;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

public class VentanaJLIst extends JFrame{
	private JList<String> lista;
	private DefaultListModel<String> listModel;
	public VentanaJLIst() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("VentanaJList y scroll panel");
		setSize(500, 300);
		setVisible(true);
		
		

        listModel = new DefaultListModel<>();
        lista = new JList<>(listModel);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Puedes cambiar esto según tus necesidades

        // Agrega algunos elementos a la lista
        listModel.addElement("Elemento 1");
        listModel.addElement("Elemento 2");
        listModel.addElement("Elemento 3");
        
        add(lista);
        //JScrollPane scrollpane = new JScrollPane(lista);
        //add(scrollpane);
        
	}
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new VentanaJLIst();				
			}
        });
	}


}
