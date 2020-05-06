package com.zwt.bean;

public class FoodType {

	private Integer typeId;
	
	private String typeName;

	public FoodType() {
		
	}

	public FoodType(Integer typeId, String typeName) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "FoodType [typeId=" + typeId + ", typeName=" + typeName + "]";
	}
	
}
