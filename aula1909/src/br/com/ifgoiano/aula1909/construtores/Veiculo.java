/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifgoiano.aula1909.construtores;

/**
 *
 * @author aluno
 */
public class Veiculo {
    
    private String cor, modelo;
    private double preco;
    
    //construtor vazio
    public Veiculo(){
        
    }
    
    //construtor passando os parametros modelo e preco
    public Veiculo( String modelo, double preco){
        this.modelo = modelo;
        this.preco = preco;
    }
    
    public Veiculo( String cor, String modelo, double preco){
        this.modelo = modelo;
        this.preco = preco;
        this.cor = cor;
    }
    
    public void imprimirAtributos(){
        
        System.out.print("Cor: "+this.cor);
        System.out.print("Modelo: "+this.modelo);
        System.out.print("Preco: "+this.preco);

    }
    
    
    
}
