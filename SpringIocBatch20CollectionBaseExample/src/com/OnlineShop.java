package com;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OnlineShop {

	private int oid;
	
	private String shopName;
	
	private List<String> cloth;
	
	private Set<String> electronic;
	
	private Map<Integer, String> map;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<String> getCloth() {
		return cloth;
	}

	public void setCloth(List<String> cloth) {
		this.cloth = cloth;
	}

	public Set<String> getElectronic() {
		return electronic;
	}

	public void setElectronic(Set<String> electronic) {
		this.electronic = electronic;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "OnlineShop [oid=" + oid + ", shopName=" + shopName + ", cloth=" + cloth + ", electronic=" + electronic
				+ ", map=" + map + "]";
	}
	
	
	
}
