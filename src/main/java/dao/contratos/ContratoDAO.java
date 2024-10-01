package dao.contratos;

public class ContratoDAO implements IContratoDAO {

	@Override
	public String salvar() {	
		throw new UnsupportedOperationException("Nao funciona com o banco.");
		
	}

	@Override
	public String buscar() {
		// TODO Auto-generated method stub
		return "Busca bem sucedida";
		
	}

	@Override
	public String excluir() {
		return "Contrato excluido";

		
	}

	@Override
	public String atualizar() {
		return "Atualizado!";

		
	}

}
