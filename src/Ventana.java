import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana {

    private JList LstListar;
    private JButton btnMostrar;
    private JComboBox cboUbicacion;
    private JButton btnUbicacion;
    private JPanel Ventana;
    private JLabel lblValor;
    private JLabel lblResultado;
    private Equipo equipo1 = new Equipo();

    public Ventana() {
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               DefaultListModel dlm=new DefaultListModel<>();
               for (int i =0; i<equipo1.size();i++){
                   Jugador aux = equipo1.getValor(i);
                   dlm.addElement(aux.getNombre() + "-" + aux.getAnio() + "-" + aux.getPrecio() );

               }
               LstListar.setModel(dlm);
               lblValor.setText("El valor total es: " + equipo1.sumaTotal());

            }
        });
        LstListar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int indice = LstListar.getSelectedIndex();
                Jugador jugador=equipo1.getValor(indice);
                JOptionPane.showMessageDialog(null, jugador.toString());
            }
        });
        btnUbicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ubicacion = String.valueOf(cboUbicacion.getSelectedIndex());
                float total = equipo1.sumaTotal2(ubicacion);
                lblResultado.setText("Total: " + ubicacion + ":" + total);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
