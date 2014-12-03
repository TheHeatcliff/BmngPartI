package ar.com.bumerang.pedidos;

import ar.com.bumerang.cache.BumexMemcached;

public class PedidosServiceFacade {
	
	private BumexMemcached cache = BumexMemcached.getInstance();
	
	/**
	 * Se asume manejo de excepciones adecuado y BumexMemcached thread safe para mantener consistente la bbdd y cache
	 * @param pedido
	 */
	public void insertOrUpdate(Pedido pedido) {
		
		PedidosDAO.insertOrUpdate(pedido);
		
		String key = pedido.getId().toString();
		
		cache.set(key, pedido);
	}
	
	
	public Pedido search(Integer id) {
		
		Pedido pedido = cache.get(id.toString());
		
		if (pedido == null){
			pedido = PedidosDAO.select(id);
		}
		
		return pedido;
	}
	
	/**
	 * Se asume manejo de excepciones adecuado y BumexMemcached thread safe para mantener consistente la bbdd y cache
	 * @param pedido
	 */
	public void delete(Pedido pedido) {
		
		String key = pedido.getId().toString();
		
		PedidosDAO.delete(pedido);
		
		cache.delete(key);
	}
}
