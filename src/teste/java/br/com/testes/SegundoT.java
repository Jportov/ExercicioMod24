package br.com.testes;

import org.junit.Assert;
import org.junit.Test;

public class SegundoT {
	@Test
	public void testeNotEquals() {
		String nome = "joao";
		Assert.assertNotEquals("Porto", nome);
		
	}
}
