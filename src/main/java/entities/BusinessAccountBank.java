/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author crist
 */
public class BusinessAccountBank extends AccountBank{
    
    private Double loanLimit;
    
    public BusinessAccountBank(){
        super();
    }

    public BusinessAccountBank(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
    public void loan(double amount){
        if(amount <= loanLimit){
        balance += amount - 10.0;
        }
    }
    
    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.00;
    }
    
}
