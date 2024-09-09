package Pg3ev.Cliente1;

import java.util.List;

public interface ClienteDAOInterface {
	public boolean alta(Cliente c);
	public void baja(String idCliente);
	public void modificacion(Cliente c);
	public Cliente consulta(String idCliente);
	public List<Cliente> consulta();
}
