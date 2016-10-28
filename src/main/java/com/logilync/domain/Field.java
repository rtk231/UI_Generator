package com.logilync.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Field {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	private String name;
	private String type;
	private Long sectionId;
	private Integer fieldOrder;
	private String label;
	private String labelStyle;
	private String description;
	private String placeHolder;
	private String style;
	private String required;
	private String readOnly;
	private String hidden;
	@OneToMany(targetEntity = OtherAttribute.class, mappedBy = "fieldId")
	private Set<OtherAttribute> otherAttributes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPlaceHolder() {
		return placeHolder;
	}

	public void setPlaceHolder(String placeHolder) {
		this.placeHolder = placeHolder;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getRequired() {
		return required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public String getHidden() {
		return hidden;
	}

	public void setHidden(String hidden) {
		this.hidden = hidden;
	}

	public Set<OtherAttribute> getOtherAttributes() {
		if (this.otherAttributes == null) {
			this.otherAttributes = new HashSet<OtherAttribute>();
		}
		return otherAttributes;
	}

	public void setOtherAttributes(Set<OtherAttribute> otherAttribute) {
		this.otherAttributes = otherAttribute;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getSectionId() {
		return sectionId;
	}

	public void setSectionId(Long sectionId) {
		this.sectionId = sectionId;
	}

	public Integer getFieldOrder() {
		return fieldOrder;
	}

	public void setFieldOrder(Integer fieldOrder) {
		this.fieldOrder = fieldOrder;
	}

	public String getLabelStyle() {
		return labelStyle;
	}

	public void setLabelStyle(String labelStyle) {
		this.labelStyle = labelStyle;
	}

	public String getReadOnly() {
		return readOnly;
	}

	public void setReadOnly(String readOnly) {
		this.readOnly = readOnly;
	}

	
	

}
