/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author crist
 */
public abstract class CategoriaPessoa {

    private String nome;
    private Double rendaAnual, valorPagar;
    

    public CategoriaPessoa() {

    }

    public CategoriaPessoa(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public Double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(Double valorPagar) {
        this.valorPagar = valorPagar;
    }
    
    

    public Double CalcularImposto() {

        return 0.0;
    }

    public StringBuilder mostrarInformacoes() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNome: ");
        sb.append(nome);
        sb.append("\nRenda Anual: ");
        sb.append(String.format("%.2f", rendaAnual));
        sb.append("\nValor a Pagar: ");
        sb.append(String.format("%.2f", CalcularImposto()));
        return sb;
    }
}
