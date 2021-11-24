package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		CalcolaValutazione[] studenti = new CalcolaValutazione[20];
		Random rng = new Random();
		
		int id, rngAssenze;
		float rngVoti;
		int[] voti = new int[rng.nextInt(rng.nextInt(50)) + 1];
		int i = 0;
		
		// dato che non era possibile inserire un parametro massimo a rng.nextFloat ho creato un sistema che
		// crea un array di voti di lunghezza random (ho dovuto dare un massimo perche' altrimenti finiva la 
		// memoria) e assegna un valore random tra 1 e 5 a ogni elemento dell'array per poi fare la media.
		// Ho scelto di dare un numero non troppo grande perche' ovviamente piu' sono i numeri piu' la media tende
		// verso la mediana, in questo caso 2.5.
		
		while(i < studenti.length){
			float somma = 0;			
			for (int j = 0; j < voti.length; j++) {
				voti[j] = rng.nextInt(5) + 1;
				somma = somma + voti[j];
			}
			
			id = i + 1;
			rngAssenze = rng.nextInt(101);
			rngVoti = somma / voti.length;
			studenti[i] = new CalcolaValutazione(id, rngAssenze, rngVoti);
			if(studenti[i].promosso()) {
				System.out.println("Valutazione studente id " + id + ": promosso");
			}else if(!studenti[i].promosso()) {
				System.out.println("Valutazione studente id " + id + ": bocciato");
			}
			i++;
		}
	}

}
