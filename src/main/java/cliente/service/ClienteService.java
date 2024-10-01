package cliente.service;


import dao.cliente.IClienteDAO;

public class ClienteService {
		
	
	
		private IClienteDAO clienteDAO;
		
		
	public ClienteService(IClienteDAO clienteDAO) {
		//clienteDAOMock = new ClienteDAO();
		//clienteDAO = new ClienteDAO();
		this.clienteDAO = clienteDAO;
	}
	
	public String salvar() {
		clienteDAO.salvar();
		return "Sucesso";
	}
}
