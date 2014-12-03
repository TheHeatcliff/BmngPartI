package ar.com.bumerang.pedidos;


public class Pedido {

	private Integer id;
	
	private String nombre;
	
	private String descuento;
	
	private String monto;	
	
	public Pedido(Integer id, String nombre, String descuento, String monto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descuento = descuento;
		this.monto = monto;
	}

	/**
	 * other methods/attributes
	 */
	
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @return the descuento
	 */
	public String getDescuento() {
		return descuento;
	}


	/**
	 * @return the monto
	 */
	public String getMonto() {
		return monto;
	}
}
