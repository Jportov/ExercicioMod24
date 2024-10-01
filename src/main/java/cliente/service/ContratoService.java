package cliente.service;

import dao.contratos.IContratoDAO;

public class ContratoService implements IContratoService {

	private IContratoDAO contratoDAO;
		
	public ContratoService(IContratoDAO dao) {
		this.contratoDAO = dao;
	}

	@Override
	public String salvar() {
		contratoDAO.salvar();
		// TODO Auto-generated method stub
		return "Contrato salvo com sucesso!";
	}

	@Override
	public String buscar() {
		// TODO Auto-generated method stub
		contratoDAO.buscar();
		return "Buscando contratos, aguarde...";
	}

	@Override
	public String excluir() {
		contratoDAO.excluir();
		return "Contrato excluido com sucesso!";
	}

	@Override
	public String atualizar() {
		contratoDAO.atualizar();
		return "Lista de contratos atualizada.";
	}

}
