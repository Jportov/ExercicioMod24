package br.com.testes;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestesClienteTest {
	
			@SuppressWarnings("deprecation")
			@Test
			public void testeClasseCliente() {
				TestesClientes cli = new TestesClientes();
				cli.setNome("Joao");
				
				
				Assert.assertEquals("Joao", cli.getNome());
			}
}			
