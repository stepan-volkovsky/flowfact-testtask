package com.flowfact.test.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
public abstract class Model implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "CREATE_TIMESTAMP", insertable = true, updatable = false)
	private Date createTimestamp;

	@Column(name = "UPDATE_TIMESTAMP", insertable = false, updatable = true)
	private Date updateTimestamp;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Date createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Date getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	@PrePersist
	protected void onCreate() {
		createTimestamp = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		updateTimestamp = new Date();
	}

}
