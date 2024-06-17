package org.lessons.java.snacks;

//Snack 3: Registro Studenti
//Crea una classe RegistroStudenti che rappresenti un registro di studenti. 
//Utilizza un array privato per memorizzare oggetti Studente.
//Implementa un costruttore senza parametri per inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro. 
//Aggiungi un metodo che stampi la lista degli studenti.


public class RegistroStudenti {

	private Studente[] studenti;
	
	public RegistroStudenti() {
		this.studenti=new Studente[0];
	}
	
	public Studente[] getStudenti() {
		return this.studenti;
	}
	
	public void aggiungiStudente (Studente nuovoStudente) {
		Studente[] nuoviStudenti=new Studente [this.studenti.length +1];
		for (int i=0; i>this.studenti.length;i++) {
			nuoviStudenti[i]=this.studenti[i];
		}
		nuoviStudenti[nuoviStudenti.length -1]= nuovoStudente;
		this.studenti=nuoviStudenti;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
RegistroStudenti registro = new RegistroStudenti();
registro.aggiungiStudente(new Studente("Zaphod","Beeblebrox", 42));
System.out.println(registro.getStudenti()[registro.getStudenti().length-1].getInfoStudente());
registro.aggiungiStudente(new Studente("John", "Dorian", 30));
System.out.println(registro.getStudenti()[registro.getStudenti().length-1].getInfoStudente());
	}

}
