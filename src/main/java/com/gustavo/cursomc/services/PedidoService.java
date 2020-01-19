package com.gustavo.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.cursomc.domain.Pedido;
import com.gustavo.cursomc.repositories.PedidoRepository;
import com.gustavo.cursomc.services.exceptions.ObjectNotFoundException;

import java.util.Optional;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		//A classe opcional em Java é usada para obter o valor dessa instância opcional, 
		//se presente. Se não houver valor presente nesta instância opcional, esse método 
		//lançará a exceção gerada pelo fornecedor especificado.
		//O orElseThrow recebe um função que instancia uma exceção
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
