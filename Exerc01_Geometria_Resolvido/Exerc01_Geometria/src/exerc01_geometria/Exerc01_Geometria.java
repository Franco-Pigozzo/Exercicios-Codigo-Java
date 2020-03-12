
package exerc01_geometria;

import dimensao.bidimensional.TrianguloRetangulo;

public class Exerc01_Geometria {
    
    // DONE 1 crie um pacote chamado dimensao
    // DONE 2 dentro do pacote dimensao, crie outro pacote chamado bidimensional
    // DONE 3 dentro do pacote dimensao.bidimensional, crie a classe TrianguloRetangulo
    
    ///////////// FAÇA DENTRO DA CLASSE TrianguloRetangulo:
    ///////////// Sempre usando o modificador de acesso default para a classe, 
    ///////////// atributos e métodos
    // DONE 4 remova o "public" de "public class TrianguloRetangulo"
    // DONE 5 declare o atributo cateto1 
    // DONE 6 declare o atributo cateto2 
    // DONE 7 declare o atributo hipotenusa 
    // DONE 8 declare o atributo alturaHipotenusa 
    // DONE 9 crie um método para calcular e retornar a área do triângulo
    // DONE 10 crie um método para calcular e retornar o perímetro do triângulo
    // DONE 11 crie o contrutor padrão (vazio) e o parametrizado da classe (dica: Alt+Insert)
    //////////////////////////////////////////////

    public static void main(String[] args) {
        // Done 12 crie aqui um objeto da classe TrianguloRetangulo
        TrianguloRetangulo tr1 = new TrianguloRetangulo();
        // DONE 13 escreva como comentário: por que aconteceu um erro na criação do objeto?
        //Erro ocorre por que a classe TrianguloRetangulo está invisivel(default)e esta em outro
        //pacote
        // DONE 14 escreva como comentário: o que pode ser feito para resolver o erro?
        //Para resolver devemos declarar a classe TrianguloRetangulo como "public" ou no mesmo pacote
        // DONE 15 altere o modificador da classe TrianguloRetangulo para public
        // DONE 16 escreva como comentário: por que o erro continua?
        //Deve-se fazer a importação
        // DONE 17 adicione a importação da classe TrianguloRetangulo (clique na lâmpada ao lado)
        
        // DONE 18 através do objeto, atribua valor dentro dos atributos diretamente
        double cateto1 = 4;
        double cateto2 = 2;
        double hipotenusa = 6;
        double alturaHipotenusa = 6;
        
        // DONE 19 escreva como comentário: é possível realizar esta atribuição? Justifique.
        //Não, porque os atributos estão declarados como default e fazem
        // parte de outro pacote.
        // DONE 20 escreva como comentário: o que pode ser feito para resolver este problema?
        // Encapsular a classe!
        
    }
    
}
