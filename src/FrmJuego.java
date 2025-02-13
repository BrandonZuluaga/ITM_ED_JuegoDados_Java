import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
public class FrmJuego extends JFrame {

    public FrmJuego(){
        setSize(500, 300);
        setTitle("Juego de Dados");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel Dado1 = new JLabel();
        String NombreImagen = "/imagenes/1.jpg";
        ImageIcon imagen = new ImageIcon(getClass().getResource(NombreImagen)) ;

        Dado1.setIcon(imagen);
        Dado1.setBounds(10,10,imagen.getIconWidth(),imagen.getIconHeight());
        getContentPane().add(Dado1);

        JLabel Dado2 = new JLabel();
        Dado2.setIcon(imagen);
        Dado2.setBounds(10+imagen.getIconWidth(),10,imagen.getIconWidth(),imagen.getIconHeight());
        getContentPane().add(Dado2);

        JLabel Titulo1=new JLabel("Lanzamientos");
        Titulo1.setBounds(50+2*imagen.getIconWidth(),10,100,25);
        getContentPane().add(Titulo1);

        JLabel Titulo2=new JLabel("Cenas");
        Titulo2.setBounds(160+2*imagen.getIconWidth(),10,100,25);
        getContentPane().add(Titulo2);





    }    
}
