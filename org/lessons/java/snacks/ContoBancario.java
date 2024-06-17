package org.lessons.java.snacks;


//Snack 2: Gestione di un Conto
//Crea una classe ContoBancario con attributi per numero di conto e saldo. 
//Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. 
//Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.


public class ContoBancario {
	private int numeroConto;
	private double saldo;
	
	
	public ContoBancario(int numeroConto) {
		this.numeroConto=numeroConto;
		this.saldo=0.0D;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	String getSaldoDueDecimali() {
		return String.format("%.2f", this.saldo);
	}
	
	public void deposito(double cifraDepositata) {
		this.saldo += cifraDepositata;
	}
	
	public void prelievo( double cifraPrelevata) {
		double saldoAggiornato= this.saldo-cifraPrelevata;
		if(saldoAggiornato>0) {
			this.saldo= saldoAggiornato;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContoBancario conto2345=new ContoBancario(2345);
		conto2345.deposito(235.56);
		conto2345.prelievo(45.6);
		System.out.println("Il tuo saldo aggiornato è di "+conto2345.getSaldoDueDecimali()+ " euro.");
	}

}
