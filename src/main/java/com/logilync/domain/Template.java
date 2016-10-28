package com.logilync.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Template {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long templateId;
	private String name;
	private String type;
	private Long headerPageId;
	private Long footerPageId;
	private Long contentPageId;

	public Long getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
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

	public Long getHeaderPageId() {
		return headerPageId;
	}

	public void setHeaderPageId(Long headerPageId) {
		this.headerPageId = headerPageId;
	}

	public Long getFooterPageId() {
		return footerPageId;
	}

	public void setFooterPageId(Long footerPageId) {
		this.footerPageId = footerPageId;
	}

	public Long getContentPageId() {
		return contentPageId;
	}

	public void setContentPageId(Long contentPageId) {
		this.contentPageId = contentPageId;
	}

}
