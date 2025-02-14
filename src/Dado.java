import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dado {
    private int numero;
    public void lanzarB(Random r){
        numero = r.nextInt(6)+1;
    }
    public int getNumero() {
        return numero;
    }
    public void mostrar(JLabel M){
     String NombreImagen = "/imagenes/"+String.valueOf(numero)+ ".jpg";
     ImageIcon imagen = new ImageIcon(getClass().getResource(NombreImagen)) ;
     M.setIcon(imagen);
    }
        

}
