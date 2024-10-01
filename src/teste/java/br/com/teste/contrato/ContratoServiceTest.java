package br.com.teste.contrato;

import org.junit.Assert;
import org.junit.Test;

import cliente.service.ContratoService;
import cliente.service.IContratoService;
import dao.contratos.ContratoDAO;
import dao.contratos.ContratoDaoMock;
import dao.contratos.IContratoDAO;

public class ContratoServiceTest {
	@Test
	public void salvarTest() {
		IContratoDAO dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Contrato salvo com sucesso!", retorno);
	}
	@Test(expected = UnsupportedOperationException.class)
	public void esperandoErroSalvarComBancoDeDadoTest() {
		IContratoDAO dao = new ContratoDAO();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
	@Test
	public void atualizandoTest() {
		IContratoDAO atual = new ContratoDAO();
		IContratoService service = new ContratoService(atual);
		String retorno = service.atualizar();
		Assert.assertEquals("Lista de contratos atualizada.", retorno);
	}
	@Test
	public void excluir() {
	IContratoDAO ex = new ContratoDAO();
	IContratoService service = new ContratoService(ex);
	String retorno = service.excluir();
	Assert.assertEquals("Contrato excluido com sucesso!", retorno);
}
	@Test
	public void buscar() {
	IContratoDAO bus = new ContratoDAO();
	IContratoService service = new ContratoService(bus);
	String retorno = service.buscar();
	Assert.assertEquals("Buscando contratos, aguarde...", retorno);
}
}
