package com.logilync.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Page {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long pageId;
	private String name;
	private String type;
	private Long templateId;
	@OneToMany(targetEntity=Section.class,mappedBy="pageId")
	private Set<Section> sections;

	public Long getPageId() {
		return pageId;
	}

	public void setPageId(Long pageId) {
		this.pageId = pageId;
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

	public Long getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public Set<Section> getSections() {
		if(this.sections==null){
			this.sections = new HashSet<Section>();
		}
		return sections;
	}

	public void setSections(Set<Section> sections) {
		this.sections = sections;
	}
	

}
