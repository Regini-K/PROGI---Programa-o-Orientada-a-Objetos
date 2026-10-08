/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._10_07_aula15;

/**
 *
 * @author alunolab11
 */
public abstract class Animal {
    private String nome;
    private double peso;
    private String habitat;
    
    public Animal(String nome, double peso, String habitat){
        this.nome = nome;
        this.peso = peso;
        this.habitat = habitat;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public String getHabitat(){
        return habitat;
    }
    
    public void exibirFicha(){
        System.out.println("Animal: " + getNome());
        System.out.println("Peso: " + getPeso());
        System.out.println("Habitat: " + getHabitat());
    }
    
    public abstract void emitirSom();
    public abstract void alimentar();
}
