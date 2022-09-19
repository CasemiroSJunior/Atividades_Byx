/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bayeuxadventure2;

/**
 *
 * @author Etec-User
 */
public class Heroi {
    private int vida;
    private int ataque;
    private int defesa;
    private String nome;
    //private int dano;
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setVida(int vida){
        this.vida = vida;
    }
    
    public int getVida(){
        return vida;
    }
    
    public void setAtaque(int ataque){
        this.ataque = ataque;
    }
    
    public int getAtaque(){
        return ataque;
    }
    
    public void setDefesa(int defesa){
       this.defesa = defesa;
    }
    
    public int getDefesa(){
        return defesa;
    }
}
