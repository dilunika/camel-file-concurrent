package org.jkd.camel.concurrent;

public class InventoryItem {

	private int itemId;
	
	private String code;
	
	private int quantity;

	public InventoryItem(int itemId, String code, int quantity) {
		super();
		this.itemId = itemId;
		this.code = code;
		this.quantity = quantity;
	}

	public int getItemId() {
		return itemId;
	}

	public String getCode() {
		return code;
	}

	public int getQuantity() {
		return quantity;
	}
}
