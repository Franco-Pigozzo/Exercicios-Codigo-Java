package poo;


public class CanetaPreta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        
        System.out.println("Cor da caneta : " + this.cor );
        
        System.out.println("Ponta da caneta : " + this.ponta);
        
        System.out.println("Está tampada ? :" + this.tampada );
        
        System.out.println("Modelo : " + this.modelo );
        
        System.out.println("Quantidade de carga : " + this.carga );
        
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
        
    }
        
    void tampada(){
        
        this.tampada = true;
        
    }
    
    void destampada(){
        
        this.tampada = false;
        
    }
    
}
