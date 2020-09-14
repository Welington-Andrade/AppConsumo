package br.com.infnet.AppConsumo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.AppConsumo.clients.IEstadoClient;
import br.com.infnet.AppConsumo.model.negocio.Estado;
import br.com.infnet.AppConsumo.model.negocio.Municipio;

@Service
public class EstadoService {
	
	@Autowired private IEstadoClient client;
	
	public List<Estado> obterEstados(){
		
		return client.obterEstados();
	}
	
	public Estado obterEstado(Integer id) {
		
		return client.obterEstado(id);
	}

	public List<Municipio> obterMunicipios(Integer id) {
		
		return client.obterMunicipios(id);
	}

}
