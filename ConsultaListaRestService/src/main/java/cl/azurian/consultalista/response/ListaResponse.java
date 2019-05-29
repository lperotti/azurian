package cl.azurian.consultalista.response;

import java.util.List;

import cl.azurian.consultalista.model.Nombres;

public class ListaResponse extends Response{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1315279777859695418L;
	
	private List<Nombres> nombres;

	public List<Nombres> getNombres() {
		return nombres;
	}

	public void setNombres(List<Nombres> nombres) {
		this.nombres = nombres;
	}

	

}
