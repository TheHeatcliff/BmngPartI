package ar.com.bumerang.cache;

import ar.com.bumerang.pedidos.Pedido;

public class BumexMemcached {

	private static BumexMemcached bumexMemcached = new BumexMemcached();
	
	public void set(String key, Object value){}
	
    public Pedido get(String key){ return null;}
	
	public void delete(String key){}

	private BumexMemcached(){}

	public static BumexMemcached getInstance() {
		return bumexMemcached;
	}
}