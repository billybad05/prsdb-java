package com.bootrcamp.capstone.prsdb.requestline;

import javax.persistence.*;

import com.bootrcamp.capstone.prsdb.product.Product;
import com.bootrcamp.capstone.prsdb.request.Request;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Requestlines")
public class Requestline {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int quantity = 1;
	@JsonBackReference
	@ManyToOne(optional=false)
	@JoinColumn(name="requestId", columnDefinition="int")
	private Request request;
	@ManyToOne(optional=false)
	@JoinColumn(name="productId", columnDefinition="int")
	private Product product;
	
	public Requestline () {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
