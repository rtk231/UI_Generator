package com.logilync.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Section {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	private String name;
	private String type;
	private Long pageId;
	private Integer sectionOrder;
	private String styleClass;
	private String formObject;
	private String placeHolder;
	private String action;
	private String method;
	private String hidden;
	@OneToMany(targetEntity = Field.class, mappedBy = "sectionId")
	private Set<Field> fields;
	@OneToMany(targetEntity = OtherAttribute.class, mappedBy = "sectionId")
	private Set<OtherAttribute> otherAttributes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStyleClass() {
		return styleClass;
	}

	public void setStyleClass(String styleClass) {
		this.styleClass = styleClass;
	}

	public String getFormObject() {
		return formObject;
	}

	public void setFormObject(String formObject) {
		this.formObject = formObject;
	}

	public String getPlaceHolder() {
		return placeHolder;
	}

	public void setPlaceHolder(String placeHolder) {
		this.placeHolder = placeHolder;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
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

	public Long getPageId() {
		return pageId;
	}

	public void setPageId(Long pageId) {
		this.pageId = pageId;
	}

	public Integer getSectionOrder() {
		return sectionOrder;
	}

	public void setSectionOrder(Integer sectionOrder) {
		this.sectionOrder = sectionOrder;
	}

	public Set<Field> getFields() {
		if (this.fields == null) {
			this.fields = new HashSet<Field>();
		}
		return fields;
	}

	public void setFields(Set<Field> fields) {
		this.fields = fields;
	}

}
