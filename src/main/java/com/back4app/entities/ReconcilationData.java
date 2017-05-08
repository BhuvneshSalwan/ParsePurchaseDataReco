package com.back4app.entities;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "parse_sale_reconcilation_data")
public class ReconcilationData {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "objectID")
	private String objectID;
	
	@Column(name = "purchase_data_id")
	private String purchase_data_id;
	
	@Column(name = "total_amount")
	private String total_amount;
	
	@Column(name = "order_id")
	private String order_id;
	
	@Column(name = "calc_total_amount")
	private String calc_total_amount;
	
	@Column(name = "calc_order_id")
	private String calc_order_id;
	
	@Column(name = "hostname")
	private String hostname;
	
	@Column(name = "page_url")
	private String page_url;
	
	@Column(name = "gtm_container_id")
	private String gtm_container_id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updatedAt")
	private Date updatedAt;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdAt")
	private Date createdAt;

	public String getGtm_container_id() {
		return gtm_container_id;
	}

	public void setGtm_container_id(String gtm_container_id) {
		this.gtm_container_id = gtm_container_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObjectID() {
		return objectID;
	}

	public void setObjectID(String objectID) {
		this.objectID = objectID;
	}

	public String getPurchase_data_id() {
		return purchase_data_id;
	}

	public void setPurchase_data_id(String purchase_data_id) {
		this.purchase_data_id = purchase_data_id;
	}

	public String getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getCalc_total_amount() {
		return calc_total_amount;
	}

	public void setCalc_total_amount(String calc_total_amount) {
		this.calc_total_amount = calc_total_amount;
	}

	public String getCalc_order_id() {
		return calc_order_id;
	}

	public void setCalc_order_id(String calc_order_id) {
		this.calc_order_id = calc_order_id;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getPage_url() {
		return page_url;
	}

	public void setPage_url(String page_url) {
		this.page_url = page_url;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getString() {
		return "ReconcilationData [id=" + id + ", objectID=" + objectID + ", purchase_data_id=" + purchase_data_id
				+ ", total_amount=" + total_amount + ", order_id=" + order_id + ", calc_total_amount="
				+ calc_total_amount + ", calc_order_id=" + calc_order_id + ", hostname=" + hostname + ", page_url="
				+ page_url + ", gtm_container_id=" + gtm_container_id + ", updatedAt=" + updatedAt + ", createdAt="
				+ createdAt + "]";
	}
	
}