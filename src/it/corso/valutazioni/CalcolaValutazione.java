package it.corso.valutazioni;

public class CalcolaValutazione {
	
	int id, assenze;
	float voti;
	
	CalcolaValutazione(int id, int assenze, float voti){
		this.id = id;
		this.assenze = assenze;
		this.voti = voti;
		}
	
	boolean promosso(){
		
		
		if(assenze > 25 && assenze < 50 && voti > 2){
			return true;
		}else if(assenze < 25 && voti >= 2) {
			return true;
		}else {
			return false;
		}
				
	}
	
}

