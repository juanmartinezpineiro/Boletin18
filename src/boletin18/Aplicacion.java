package boletin18;

public class Aplicacion {

 /**
 *
 * @author jmartinezpineiro
 */
    
    public static void main(String[] args) {
    
        Academica obx = new Academica();
        obx.setNota();
        obx.setNome("Alonso");
        System.out.println(obx.toString());
        Academica obx2 = new Academica();
        obx2.setNota();
        obx.setNome("Paco");
        System.out.println(obx.toString());
    } 
}
