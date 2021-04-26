package com.cg.spc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "concern")
public class Concern {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int concernId;
	@ManyToOne
	@JoinColumn(name = "parentId")
	private Parent parent;
	//@OneToMany(mappedBy = "concern", cascade = CascadeType.ALL)
	//@OneToOne
	private ConcernType concernType;
	private String concernDescription;
	//@OneToMany(mappedBy = "concern", cascade = CascadeType.ALL)
	//@OneToOne
	private ConcernParty concernParty;
	private boolean resolved;
	public Concern(int concernId, Parent parent, ConcernType concernType, String concernDescription,
			ConcernParty concernParty, boolean resolved) {
		super();
		this.concernId = concernId;
		this.parent = parent;
		this.concernType = concernType;
		this.concernDescription = concernDescription;
		this.concernParty = concernParty;
		this.resolved = resolved;
	}
	public Concern() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getConcernId() {
		return concernId;
	}
	public void setConcernId(int concernId) {
		this.concernId = concernId;
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	public ConcernType getConcernType() {
		return concernType;
	}
	public void setConcernType(ConcernType concernType) {
		this.concernType = concernType;
	}
	public String getConcernDescription() {
		return concernDescription;
	}
	public void setConcernDescription(String concernDescription) {
		this.concernDescription = concernDescription;
	}
	public ConcernParty getConcernParty() {
		return concernParty;
	}
	public void setConcernParty(ConcernParty concernParty) {
		this.concernParty = concernParty;
	}
	public boolean isResolved() {
		return resolved;
	}
	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}
	@Override
	public String toString() {
		return "Concern [concernId=" + concernId + ", parent=" + parent + ", concernType=" + concernType
				+ ", concernDescription=" + concernDescription + ", concernParty=" + concernParty + ", resolved="
				+ resolved + "]";
	}
	
	
	
}
