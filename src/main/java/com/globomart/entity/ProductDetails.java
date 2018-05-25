package com.globomart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_details")
public class ProductDetails {
	@Id
	@Column(name = "product_id")
	private int productID;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_type")
	private String productType;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	@Override
	public String toString() {
		return "ProdcutDetails [lastName=" + productName + ", firstName=" + productType + ", empID=" + productID + "]";
	}
}
