package Promocion;

import Usuario.Usuario;

public class PromocionAxB extends Promocion{
	
	
	private int costoA;

	private int costoB;

	private int costoConDescuento = costoA+costoB;

	private int costoC;
			
    private int costosinDescuento = costoA+costoB+costoC;

	private int costo;	
	
	public void promocionAXBxC() {
		if(Usuario.comprarAXBxC()) {this.costo = costoConDescuento;
		
	}
		
			

}
