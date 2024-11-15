/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author crist
 */
public class PessoaJuridica extends CategoriaPessoa{
    
    private Integer numeroFuncionarios;
    
    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(Integer numeroFuncionarios, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
    
    @Override
    public Double CalcularImposto(){
        double totalPagar = 0;
        if( numeroFuncionarios > 10){
            totalPagar = (super.getRendaAnual() * 14)/100;
        }else{
            totalPagar = (super.getRendaAnual() * 16)/100;
        }
        return totalPagar;
       
    }
    
}
