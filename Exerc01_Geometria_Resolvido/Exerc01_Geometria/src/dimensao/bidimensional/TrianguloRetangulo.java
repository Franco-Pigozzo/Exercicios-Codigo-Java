package dimensao.bidimensional;


public class TrianguloRetangulo {
    
    double cateto1;
    double cateto2;
    double hipotenusa;
    double alturaHipotenusa;
    
        
   ////Area do trinaguo
    double calcularArea(){
        
        double area = cateto1 * cateto2 / 2;
        System.out.println(area);
        
        return area;
        
    }
    //Perimetro do triangulo
    double calcularPerimetro(){
        
        double perimetro = cateto1 + cateto2 + hipotenusa;
        System.out.println(perimetro);
        
        return perimetro;
        
        
    }

    public TrianguloRetangulo() {
    }

    public TrianguloRetangulo(double cateto1, double cateto2, double hipotenusa, double alturaHipotenusa) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenusa = hipotenusa;
        this.alturaHipotenusa = alturaHipotenusa;
        
    }
    
    
    
    
}
