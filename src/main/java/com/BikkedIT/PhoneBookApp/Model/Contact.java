package com.BikkedIT.PhoneBookApp.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity  
@Table(name="CONTACT_DETLS")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CONTACT_ID")
	private Integer contactId;
	@Column(name="CONTACT_NAME")
	private String contactName;
	@Column(name="CONTACT_EMAIL")
	private String email;
	@Column(name="ACTIVE_SWATICH")
	private boolean activeSw;
	@Column(name="CREATE_DATE",updatable = false)
	@CreationTimestamp
	private LocalDate createDate;
	@Column(name="UPDATE_DATE",insertable = false)
	private LocalDate updatedDate;
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean getActiveSw() {
		return activeSw;
	}
	public void setActiveSw(boolean activeSw) {
		this.activeSw = activeSw;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Contact(Integer contactId, String contactName, String email, boolean activeSw, LocalDate createDate,
			LocalDate updatedDate) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.email = email;
		this.activeSw = activeSw;
		this.createDate = createDate;
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", email=" + email + ", activeSw="
				+ activeSw + ", createDate=" + createDate + ", updatedDate=" + updatedDate + "]";
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
