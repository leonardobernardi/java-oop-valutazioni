package it.corso.valutazioni;

public class CalcolaValutazione {
	
	int id, assenze;
	float voti;
	
	CalcolaValutazione(int id, int assenze, float voti){
		this.id = id;
		this.assenze = assenze;
		this.voti = voti;
		}
	
	String calculate(){
		
		String valutazione;
		
		if(assenze > 25 && assenze < 50 && voti > 2){
			valutazione = "promosso";
		}else if(assenze < 25 && voti >= 2) {
			valutazione = "promosso";
		}else {
			valutazione = "bocciato";
		}
		
		return valutazione;			
	}
	
}

