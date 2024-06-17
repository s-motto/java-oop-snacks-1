package org.lessons.java.snacks;
//Snack 1: Studente
//Scrivi una classe Studente con i seguenti attributi: nome, cognome, età. 
//Implementa un costruttore che accetta tre parametri per inizializzare questi attributi. 
//Aggiungi un metodo che restituisca una stringa concatenata dei valori (es. Anselmo Bitta, 24 anni).
public class Studente {

	private String nome;
	private String cognome;
	private int eta;
	
	
	public Studente (String nome, String cognome, int eta) {
		this.nome=nome;
		this.cognome=cognome;
		this.eta=eta;
	}
	
	
	
	
	
	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public String getCognome() {
		return cognome;
	}





	public void setCognome(String cognome) {
		this.cognome = cognome;
	}





	public int getEta() {
		return eta;
	}





	public void setEta(int eta) {
		this.eta = eta;
	}





	public String getInfoStudente() {
		return this.nome + " "+ this.cognome +", "+ this.eta+" anni.";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Studente studenteUno= new Studente("Khadim", "Diop", 10);
    Studente studenteDue= new Studente("Sabrina", "Motto", 33);
    
    System.out.println(studenteUno.getInfoStudente());
    System.out.println(studenteDue.getInfoStudente());
	}

}
