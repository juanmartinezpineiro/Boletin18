package boletin18;

import javax.swing.JOptionPane;
import persoal.Persoal;

/**
 *
 * @author jmartinezpineiro
 */

public class Academica {

     Persoal alum = new Persoal();
    
    private static int numReferencia = 2018 -1;
    private String nome;
    private int nota;
    private Persoal per;
    

    public Academica() {
        per = new Persoal();
        numReferencia ++;
    }
    
    public Academica(String nome, int nota,int tf,String correo) {
        per =new Persoal(tf,correo);
        this.nome = nome;
        this.nota = nota;
        numReferencia ++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int setNota(){
        do{
            nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del alumno"));
            if (nota < 1 || nota > 10)
                JOptionPane.showMessageDialog(null, "La nota del alumno no puede ser menor a 1 ni mayor a 10");
        }while (nota < 1 || nota > 10);
        return nota;
    }
    
    
   
    @Override
    public String toString() {
        return "Aplicacion{" + "per=" + alum + ", nome=" + nome + ", nota=" + nota + ", numReferencia" + numReferencia + '}';
    }    
    
    
}
