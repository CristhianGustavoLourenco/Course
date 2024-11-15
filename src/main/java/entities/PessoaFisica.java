/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author crist
 */
public class PessoaFisica extends CategoriaPessoa{
    
    private Double gastoComSaude;
    
    public PessoaFisica(){
        super();
    }

    public PessoaFisica(Double gastoComSaude, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    

    public Double getGastoComSaude() {
        return gastoComSaude;
    }

    public void setGastoComSaude(Double gastoComSaude) {
        this.gastoComSaude = gastoComSaude;
    }
    
    @Override
    public Double CalcularImposto(){
        double totalPagar = 0;
        if(super.getRendaAnual() > 20000.00){
            totalPagar = (super.getRendaAnual() * 25)/100;
        }else if(super.getRendaAnual() < 20000.00){
            totalPagar = (super.getRendaAnual() * 15)/100;
        }
        
        if(gastoComSaude > 0.00){
            totalPagar -= (gastoComSaude*50)/100;
        }
        return totalPagar;
    }
    
}
