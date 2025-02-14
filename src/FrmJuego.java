import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class FrmJuego extends JFrame {
    private JLabel Dado1;
    private JLabel Dado2;
    private int lanzamientos, cenas;
    private JLabel Lanzamientos, Cenas;

    public FrmJuego(){
        setSize(500, 300);
        setTitle("Juego de Dados");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
    
        Dado1 = new JLabel();
        String NombreImagen = "/imagenes/1.jpg";
        ImageIcon imagen = new ImageIcon(getClass().getResource(NombreImagen)) ;
    
        Dado1.setIcon(imagen);
        Dado1.setBounds(10,10,imagen.getIconWidth(),imagen.getIconHeight());
        getContentPane().add(Dado1);
    
        Dado2 = new JLabel();
        Dado2.setIcon(imagen);
        Dado2.setBounds(10+imagen.getIconWidth(),10,imagen.getIconWidth(),imagen.getIconHeight());
        getContentPane().add(Dado2);
    
        JLabel Titulo1=new JLabel("Lanzamientos");
        Titulo1.setBounds(50+2*imagen.getIconWidth(),10,100,25);
        getContentPane().add(Titulo1);
        Titulo1.setHorizontalAlignment(SwingConstants.CENTER);
    
        JLabel Titulo2=new JLabel("Cenas");
        Titulo2.setBounds(160+2*imagen.getIconWidth(),10,100,25);
        getContentPane().add(Titulo2);
        Titulo2.setHorizontalAlignment(SwingConstants.CENTER);
    
    
        Lanzamientos = new JLabel("0");
        Lanzamientos.setBounds(50+2*imagen.getIconWidth(),40,100,100);
            
        Lanzamientos.setBackground(new Color(0, 0, 0));
        Lanzamientos.setForeground(new Color(51,255,0));
        Lanzamientos.setFont(new Font("Tahoma",1,70));
        Lanzamientos.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(Lanzamientos);
        Lanzamientos.setOpaque(true);
    
        Cenas = new JLabel("0");
        Cenas.setBounds(160+2*imagen.getIconWidth(),40,100,100);
            
        Cenas.setBackground(new Color(0, 0, 0));
        Cenas.setForeground(new Color(51,255,0));
        Cenas.setFont(new Font("Tahoma",1,70));
        Cenas.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(Cenas);
        Cenas.setOpaque(true);
    
        JButton iniciar = new JButton("Iniciar");
        iniciar.setBounds(10,140,100,25);
        getContentPane().add(iniciar);
    
        JButton lanzar = new JButton("Lanzar");
        lanzar.setBounds(110,140,100,25);
        getContentPane().add(lanzar);
    
        iniciar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarB();
            }      
        });
        lanzar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                lanzarB();
            }      
        });
    
        dado1=new Dado();
        dado2=new Dado();
        lanzamientos=0;
        cenas=0;
    }            
      private Dado dado1, dado2;
      private Random r=new Random();

         private void iniciarB() {
            Lanzamientos.setText("0");
            Cenas.setText("0");

        }

         private void lanzarB() {
        dado1.lanzarB(r);
        dado2.lanzarB(r);

        dado1.mostrar(Dado1);
        dado2.mostrar(Dado2);

        lanzamientos++;
        Lanzamientos.setText(String.valueOf(lanzamientos));
        
        if(dado1.getNumero()+dado2.getNumero()>=11){
            cenas++;
            Cenas.setText(String.valueOf(cenas));
        }
    
    
    }

    
}
