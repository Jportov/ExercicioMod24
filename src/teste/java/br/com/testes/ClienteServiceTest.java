package br.com.testes;

import org.junit.Assert;
import org.junit.Test;

import cliente.service.ClienteService;
import dao.cliente.ClienteDAO;
import dao.cliente.ClienteDAOMock;

public class ClienteServiceTest {
	
		@Test
		public void salvarTest() {
			ClienteDAOMock mockDao = new ClienteDAOMock();
			ClienteService service = new ClienteService(mockDao);
			String retorno = service.salvar();
			Assert.assertEquals("Sucesso", retorno);
		}
		
		@Test(expected = UnsupportedOperationException.class)
		public void EsperadoErroNosalvarTest() {
			ClienteDAO mockDao = new ClienteDAO();
			ClienteService service = new ClienteService(mockDao);
			String retorno = service.salvar();
			Assert.assertEquals("Sucesso", retorno);
			
		}
}
