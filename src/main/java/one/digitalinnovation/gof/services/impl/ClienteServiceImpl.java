package one.digitalinnovation.gof.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.services.ClienteService;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 * 
 * @author DAYVS
 *
 */
public class ClienteServiceImpl implements ClienteService{

	// TODO Singleton: injetar os componentes do Spring com @Autowired.
	// TODO Strategy: Implementar os métodos definidos na interface.
	// TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples.
	
	@Override
	public Iterable<Cliente> buscarTodos() {
		// FIXME Buscar todos os Clientes.
		return null;
	}

	@Override
	public Cliente buscarPorId(Long id) {
		// FIXME Buscar cliente por ID.
		return null;
	}

	@Override
	public void inserir(Cliente cliente) {
		// FIXME Verificar se o Endereço do Cliente já existe (pelo CEP).
		// FIXME Caso não exista, integrar com o ViaCep e persistir o retorno.
		// FIXME inserir Cliente, vinculando i Endereço (novo ou existente).
		
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		// FIXME Atualizar Cliente por ID.
		
	}
	
	@Override
	public void deletar(Long id) {
		// FIXME Deletar Cliente por ID.
	}

}
