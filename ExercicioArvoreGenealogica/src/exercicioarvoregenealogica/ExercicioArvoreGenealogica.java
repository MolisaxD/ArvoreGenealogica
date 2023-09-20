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
public class ExercicioArvoreGenealogica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa teste = new Pessoa("Putz", "Mãe", "Pai");
        Pessoa irma = new Pessoa ("Irmã", "Mãe", "Pai");
        Pessoa mae = new Pessoa("Mãe", "Avó", "Avô");
        Pessoa pai = new Pessoa("Pai", "Avó", "Avô");
        Pessoa teste2 = new Pessoa("Xbox Studios", "Microsoft", "Bill Gates");
        
        
        //Igualdade
        teste.checarParentesco(teste);
        
        //Fraternidade
        teste.checarParentesco(irma);
        
        //Mãe
        teste.checarParentesco(mae);
        
        //Pai
        teste.checarParentesco(pai);
        
        //Sem parentesco
        teste.checarParentesco(teste2);
    }
    
}
