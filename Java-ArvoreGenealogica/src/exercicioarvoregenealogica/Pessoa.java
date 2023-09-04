/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioarvoregenealogica;

/**
 *
 * @author mborges
 */
public class Pessoa {

    String nome;
    String mae;
    String pai;

    public Pessoa(String n) {
        this.nome = n;
        this.mae = null;
        this.pai = null;
    }

    public Pessoa(String n, String m, String p) {
        this.nome = n;
        this.mae = m;
        this.pai = p;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getPai() {
        return this.pai;
    } 

    public void setPai(String p) {
        this.pai = p;
    }

    public String getMae() {
        return this.mae;
    }

    public void setMae(String m) {
        this.mae = m;
    }

    public void checarParentesco(Pessoa p) {
        
            if (this.getNome().equals(p.getNome()) && this.getMae().equals(p.getMae())) {
                System.out.println("São a mesma pessoa.");
            } else if (this.getMae().equals(p.getMae()) && this.getPai().equals(p.getPai())) {
                System.out.println("São irmãos/irmãs.");
            } else {
                if (this.getMae().equals(p.getNome())) {
                    System.out.println("Esta pessoa é sua mãe.");
                } else if (this.getPai().equals(p.getNome())) {
                    System.out.println("Esta pessoa é seu pai.");
                } else {
                    System.out.println("Não há parentesco");
                }
            }
    }
}
