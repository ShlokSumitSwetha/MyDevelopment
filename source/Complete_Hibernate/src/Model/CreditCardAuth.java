package Model;

import java.io.Serializable;

public class CreditCardAuth implements Serializable {
	
	private java.lang.Integer _authSeqNumber; //: INTEGER NOT NULL
	private java.lang.Integer _cardSeqNumber; //: INTEGER NULL (FK)
	private String _authTypeCode; //: VARCHAR2(10) NULL
	private int _authAmount; //: NUMBER(9,2) NULL
	private String _ccAuthCode; //: VARCHAR2(10) NULL
	private String _rsponseCode; //: VARCHAR2(10) NULL
	private String _responseDesc; //: VARCHAR2(20) NULL
	private java.util.Date _createdDate; //: DATE NULL
	
	public CreditCardAuth(
			java.lang.Integer authSeqNumber,
			java.lang.Integer cardSeqNumber,
			String authTypeCode,
			int authAmount,
			String ccAuthCode,
			String rsponseCode,
			String responseDesc,
			java.sql.Date createdDate) {
			
			this._authSeqNumber=authSeqNumber;
			this._cardSeqNumber=cardSeqNumber;
			this._authTypeCode=authTypeCode;
			this._authAmount=authAmount;
			this._ccAuthCode=ccAuthCode;
			this._rsponseCode=rsponseCode;
			this._responseDesc=responseDesc;
			this._createdDate=createdDate;
	}
	public CreditCardAuth(){
		
	}
	public java.lang.Integer getAuthSeqNumber() {
		return this._authSeqNumber;
	}

	public void setAuthSeqNumber(java.lang.Integer authSeqNumber) {
		this._authSeqNumber = authSeqNumber;
	}

	public java.lang.Integer getCardSeqNumber() {
		return this._cardSeqNumber;
	}

	public void setCardSeqNumber(java.lang.Integer cardSeqNumber) {
		this._cardSeqNumber = cardSeqNumber;
	}

	public String getAuthTypeCode() {
		return this._authTypeCode;
	}

	public void setAuthTypeCode(String authTypeCode) {
		this._authTypeCode = authTypeCode;
	}

	public int getAuthAmount() {
		return this._authAmount;
	}

	public void setAuthAmount(int authAmount) {
		this._authAmount = authAmount;
	}

	public String getCcAuthCode() {
		return this._ccAuthCode;
	}

	public void setCcAuthCode(String ccAuthCode) {
		this._ccAuthCode = ccAuthCode;
	}

	public String getRsponseCode() {
		return this._rsponseCode;
	}

	public void setRsponseCode(String rsponseCode) {
		this._rsponseCode = rsponseCode;
	}

	public String getResponseDesc() {
		return this._responseDesc;
	}

	public void setResponseDesc(String responseDesc) {
		this._responseDesc = responseDesc;
	}

	public java.util.Date getCreatedDate() {
		return this._createdDate;
	}

	public void setCreatedDate(java.util.Date createdDate) {
		this._createdDate = createdDate;
	}
}
