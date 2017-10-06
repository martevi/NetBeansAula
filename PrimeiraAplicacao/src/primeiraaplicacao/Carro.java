/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaplicacao;

/**
 *
 * @author Gustavo Schmidth
 */
public class Carro {

    private String chassi;
    private String cor;
    private String modelo;

/**
 * 
 * @return 
 * RETORNA CHASSI;
 */
    public String getChassi() {
        return chassi;
    }
/**
 * 
 * @param chassi 
 * ESTE MÉTODO RECEBE O CHASSI DO CARRO;
 */
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
/**
 * 
 * @return
 * RETORNA COR;
 */
    public String getCor() {
        return cor;
    }
/**
 * 
 * @param cor
 * ESTE MÉTODO RECEBE A COR DO CARRO;
 */
    
    public void setCor(String cor) {
        this.cor = cor;
    }
/**
 * 
 * @return
 * RETORNA MODELO;
 */
    public String getModelo() {
        return modelo;
    }
/**
 * @param modelo
 * ESTE MÉTODO RECEBE O MODELO DO CARRO;
 */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
//
//}
//// VOID NÃO RETORNA NADA
//// GETTERS AND SETTERS
////Atributos;
//// Tipo, Nome;
//// Exemplo
//// String = Nome;
//// int = Idade;
