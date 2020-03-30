package poo;


public class POO {

    
    public static void main(String[] args) {
       
        CanetaPreta c1 = new CanetaPreta();
        
               
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        
        c1.carga = 90;
        c1.destampada();
        c1.rabiscar();
        c1.status();
        
        CanetaPreta c2 = new CanetaPreta();
        c2.cor = "Preta";
        c2.ponta = 0.5f;
        c2.tampada();
        c2.rabiscar();
        c2.status();
    }
    
}
