package br.com.ifgoiano.aula1909.sobreposicao;

import br.com.ifgoiano.aula1909.sobrecarga.Calculadora;

/**
 *
 * @author aluno
 */
public class CalculadoraCientifica extends Calculadora{
    
    @Override
    public int somar (int a, int b){
        return a + b;
}
    
    @Override
    public int somar (int a, int b, int c){
        return a + b + c;
}
    
    @Override
    public double somar (double a, double b){
        return a + b;
}
    
    @Override
    public String somar (String a, String b){
        return a + b;
}

    
    
    
}
