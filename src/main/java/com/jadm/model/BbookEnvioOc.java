package com.jadm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BBOOK_ENVIO_OC")
public class BbookEnvioOc {

	@Column(name = "idd", columnDefinition = "varchar2(100)")
	private String id;

	@Column(name = "pmg_po_number", columnDefinition = "number(12)")
	private long pmgPoNumber;

	@Column(name = "pmg_ext_po_num", columnDefinition = "varchar2(40)")
	private String pmgExtPoNum;

	@Id
	@Column(name = "prd_upc", columnDefinition = "number(18)")
	private long prdUpc;

	@Column(name = "prd_lvl_number", columnDefinition = "varchar2(15)")
	private String prdLvlNumber;

	@Column(name = "prd_name_full", columnDefinition = "varchar2(100)")
	private String prdNameFull;

	@Column(name = "prd_desc", columnDefinition = "varchar2(80)")
	private String prdDesc;

	@Column(name = "prd_lvl_parent_num", columnDefinition = "varchar2(15)")
	private String prdLvlParentNum;

	@Column(name = "prd_pdd_code_1", columnDefinition = "varchar2(12)")
	private String prdPddCode1;

	@Column(name = "prd_pdd_code_2", columnDefinition = "varchar2(12)")
	private String prdPddCode2;

	@Column(name = "prd_pdd_code_3", columnDefinition = "varchar2(12)")
	private String prdPddCode3;

	@Column(name = "precio_3x", columnDefinition = "varchar2(44)")
	private String precio3x;

	@Column(name = "precio_2x", columnDefinition = "varchar2(44)")
	private String precio2x;

	@Column(name = "precio_unitario", columnDefinition = "number(11,3)")
	private long precioUnitario;

	@Column(name = "value", columnDefinition = "varchar2(100)")
	private String value;

	@Column(name = "proforma_invoice", columnDefinition = "varchar2(40)")
	private String proformaInvoice;

	@Column(name = "status", columnDefinition = "number(1)")
	private long status;

	@Column(name = "error", columnDefinition = "varchar2(2)")
	private String error;

	@Column(name = "qr", columnDefinition = "varchar2(100)")
	private String qr;


	public BbookEnvioOc() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BbookEnvioOc(String id, long pmgPoNumber, String pmgExtPoNum, long prdUpc, String prdLvlNumber,
						String prdNameFull, String prdDesc, String prdLvlParentNum, String prdPddCode1, String prdPddCode2,
						String prdPddCode3, String precio3x, String precio2x, long precioUnitario, String value, String proformaInvoice, long status,
						String error, String qr) {
		super();
		this.id = id;
		this.pmgPoNumber = pmgPoNumber;
		this.pmgExtPoNum = pmgExtPoNum;
		this.prdUpc = prdUpc;
		this.prdLvlNumber = prdLvlNumber;
		this.prdNameFull = prdNameFull;
		this.prdDesc = prdDesc;
		this.prdLvlParentNum = prdLvlParentNum;
		this.prdPddCode1 = prdPddCode1;
		this.prdPddCode2 = prdPddCode2;
		this.prdPddCode3 = prdPddCode3;
		this.precio3x = precio3x;
		this.precio2x = precio2x;
		this.precioUnitario = precioUnitario;
		this.value = value;
		this.proformaInvoice = proformaInvoice;
		this.status = status;
		this.error = error;
		this.qr = qr;
	}


	@Override
	public String toString() {
		return "BbookEnvioOc{" +
				"id='" + id + '\'' +
				", pmgPoNumber=" + pmgPoNumber +
				", pmgExtPoNum='" + pmgExtPoNum + '\'' +
				", prdUpc=" + prdUpc +
				", prdLvlNumber='" + prdLvlNumber + '\'' +
				", prdNameFull='" + prdNameFull + '\'' +
				", prdDesc='" + prdDesc + '\'' +
				", prdLvlParentNum='" + prdLvlParentNum + '\'' +
				", prdPddCode1='" + prdPddCode1 + '\'' +
				", prdPddCode2='" + prdPddCode2 + '\'' +
				", prdPddCode3='" + prdPddCode3 + '\'' +
				", precio3x='" + precio3x + '\'' +
				", precio2x='" + precio2x + '\'' +
				", precioUnitario=" + precioUnitario +
				", value='" + value + '\'' +
				", proformaInvoice='" + proformaInvoice + '\'' +
				", status=" + status +
				", error='" + error + '\'' +
				", qr='" + qr + '\'' +
				'}';
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getPmgPoNumber() {
		return pmgPoNumber;
	}

	public void setPmgPoNumber(long pmgPoNumber) {
		this.pmgPoNumber = pmgPoNumber;
	}

	public String getPmgExtPoNum() {
		return pmgExtPoNum;
	}

	public void setPmgExtPoNum(String pmgExtPoNum) {
		this.pmgExtPoNum = pmgExtPoNum;
	}

	public long getPrdUpc() {
		return prdUpc;
	}

	public void setPrdUpc(long prdUpc) {
		this.prdUpc = prdUpc;
	}

	public String getPrdLvlNumber() {
		return prdLvlNumber;
	}

	public void setPrdLvlNumber(String prdLvlNumber) {
		this.prdLvlNumber = prdLvlNumber;
	}

	public String getPrdNameFull() {
		return prdNameFull;
	}

	public void setPrdNameFull(String prdNameFull) {
		this.prdNameFull = prdNameFull;
	}

	public String getPrdDesc() {
		return prdDesc;
	}

	public void setPrdDesc(String prdDesc) {
		this.prdDesc = prdDesc;
	}

	public String getPrdLvlParentNum() {
		return prdLvlParentNum;
	}

	public void setPrdLvlParentNum(String prdLvlParentNum) {
		this.prdLvlParentNum = prdLvlParentNum;
	}

	public String getPrdPddCode1() {
		return prdPddCode1;
	}

	public void setPrdPddCode1(String prdPddCode1) {
		this.prdPddCode1 = prdPddCode1;
	}

	public String getPrdPddCode2() {
		return prdPddCode2;
	}

	public void setPrdPddCode2(String prdPddCode2) {
		this.prdPddCode2 = prdPddCode2;
	}

	public String getPrdPddCode3() {
		return prdPddCode3;
	}

	public void setPrdPddCode3(String prdPddCode3) {
		this.prdPddCode3 = prdPddCode3;
	}

	public String getPrecio3x() {
		return precio3x;
	}

	public void setPrecio3x(String precio3x) {
		this.precio3x = precio3x;
	}

	public String getPrecio2x() {
		return precio2x;
	}

	public void setPrecio2x(String precio2x) {
		this.precio2x = precio2x;
	}

	public long getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(long precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getProformaInvoice() {
		return proformaInvoice;
	}

	public void setProformaInvoice(String proformaInvoice) {
		this.proformaInvoice = proformaInvoice;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getQr() {
		return qr;
	}

	public void setQr(String qr) {
		this.qr = qr;
	}
}