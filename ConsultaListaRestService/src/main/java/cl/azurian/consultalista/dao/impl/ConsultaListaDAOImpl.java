package cl.azurian.consultalista.dao.impl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.azurian.consultalista.dao.ConsultaListaDAO;
import cl.azurian.consultalista.model.Nombres;
import cl.azurian.consultalista.response.ListaResponse;
import cl.azurian.consultalista.response.Response;

public class ConsultaListaDAOImpl implements ConsultaListaDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(ConsultaListaDAOImpl.class);
	
	private EntityManagerFactory factory;
    private static final String PERSISTENCE_UNIT_NAME = "lista";  

	@Override
	public Response consulta() {
		
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		ListaResponse response  = new ListaResponse();
		
		logger.info("::::::::Metodo consulta:::::::::");
		
		EntityManager entity = factory.createEntityManager();
		entity.getTransaction().begin();
		
		TypedQuery<Nombres> query = entity.createQuery("FROM Nombres", Nombres.class);
		List<Nombres> listaNombre = query.getResultList();
		
		response.setCodigo("0");
		response.setNombres(listaNombre);
		
		return response;
	}
	
	
}
