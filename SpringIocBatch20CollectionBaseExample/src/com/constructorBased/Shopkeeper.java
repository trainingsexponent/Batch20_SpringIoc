package com.constructorBased;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Shopkeeper {

	
	private int sid;
	
	private String shopName;
	
	private List<String> cloth;
	
	private Set<String> books;
	
	private Map<Integer, String> map;

	public Shopkeeper(int sid, String shopName, List<String> cloth, Set<String> books, Map<Integer, String> map) {
		super();
		this.sid = sid;
		this.shopName = shopName;
		this.cloth = cloth;
		this.books = books;
		this.map = map;
	}

	
	public int getSid() {
		return sid;
	}


	public String getShopName() {
		return shopName;
	}


	public List<String> getCloth() {
		return cloth;
	}


	public Set<String> getBooks() {
		return books;
	}


	public Map<Integer, String> getMap() {
		return map;
	}


	@Override
	public String toString() {
		return "Shopkeeper [sid=" + sid + ", shopName=" + shopName + ", cloth=" + cloth + ", books=" + books + ", map="
				+ map + "]";
	}
	
	
}
