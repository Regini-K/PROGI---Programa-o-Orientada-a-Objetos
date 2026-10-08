/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._10_07_aula15;

/**
 *
 * @author alunolab11
 */
public class Aguia extends Animal{
    private double envergadura;
    
    public Aguia(String nome, double peso, String habitat, double envergadura){
        super(nome, peso, habitat);
        this.envergadura = envergadura;
    }
    
    @Override
    public void emitirSom(){
        System.out.println("KREEE KREEEE");
    }
    
    @Override
    public void alimentar(){
        emitirSom();
        System.out.println("Shuaaaaaa");
        System.out.println("Pegou o Peixe");
    }
    
}
