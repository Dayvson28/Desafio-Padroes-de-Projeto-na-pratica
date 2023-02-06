package one.digitalinnovation.gof.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import one.digitalinnovation.gof.model.Endereco;

/**
 * Cliente HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
 * <b>ViaCep</b>.
 * 
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring
 *      OpenFeign</a>
 * @see <a href="https://viacep.com.br/">VoaCep</a>
 * 
 * @author DAYVSON
 *
 */

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

	@RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
}
