package Model;

import java.io.Serializable;

public class OneShotTransRev implements Serializable {
	
	private int _revSeqNumber; //: INTEGER NOT NULL
	private int _transSeqNumber; //: INTEGER NULL (FK)
	private String _revTrackingNumber; //: VARCHAR2(22) NULL
	private int _revAmount; //: NUMBER(9,2) NULL
	private java.sql.Date _cardRevDate; //: Date NULL
	private java.sql.Date _revSettledDate; //: Date NULL
	private String _revUserID; //: VARCHAR2(20) NULL
	private String _settleBatchNumber; //: VARCHAR2() NULL
	private int _settleFileSeqNumber; //--number
	private int _returnFileSeqNumber; //--number
	private java.sql.Date _createdDate; //: Date NULL
	private java.sql.Date _modifiedDate; //: Date NULL
	private String _modifiedUserID; //: VARCHAR2(20) NULL
	
	
	public OneShotTransRev(
			int revSeqNumber,
			int transSeqNumber,
			String revTrackingNumber,
			int revAmount,
			java.sql.Date cardRevDate,
			java.sql.Date revSettledDate,
			String revUserID,
			String settleBatchNumber,
			int settleFileSeqNumber,
			int returnFileSeqNumber,
			java.sql.Date createdDate,
			java.sql.Date modifiedDate,
			String modifiedUserID) {
		
			this._revSeqNumber=revSeqNumber;
			this._transSeqNumber=transSeqNumber;
			this._revTrackingNumber=revTrackingNumber;
			this._revAmount=revAmount;
			this._cardRevDate=cardRevDate;
			this._revSettledDate=revSettledDate;
			this._revUserID=revUserID;
			this._settleBatchNumber=settleBatchNumber;
			this._settleFileSeqNumber=settleFileSeqNumber;
			this._returnFileSeqNumber=returnFileSeqNumber;
			this._createdDate=createdDate;
			this._modifiedDate=modifiedDate;
			this._modifiedUserID=modifiedUserID;
	}

	public int getRevSeqNumber() {
		return this._revSeqNumber;
	}


	public void setRevSeqNumber(int revSeqNumber) {
		this._revSeqNumber = revSeqNumber;
	}


	public int getTransSeqNumber() {
		return this._transSeqNumber;
	}


	public void setTransSeqNumber(int transSeqNumber) {
		this._transSeqNumber = transSeqNumber;
	}


	public String getRevTrackingNumber() {
		return this._revTrackingNumber;
	}


	public void setRevTrackingNumber(String revTrackingNumber) {
		this._revTrackingNumber = revTrackingNumber;
	}


	public int getRevAmount() {
		return this._revAmount;
	}


	public void setRevAmount(int revAmount) {
		this._revAmount = revAmount;
	}


	public java.sql.Date getCardRevDate() {
		return this._cardRevDate;
	}


	public void setCardRevDate(java.sql.Date cardRevDate) {
		this._cardRevDate = cardRevDate;
	}


	public java.sql.Date getRevSettledDate() {
		return this._revSettledDate;
	}


	public void setRevSettledDate(java.sql.Date revSettledDate) {
		this._revSettledDate = revSettledDate;
	}


	public String getRevUserID() {
		return this._revUserID;
	}


	public void setRevUserID(String revUserID) {
		this._revUserID = revUserID;
	}


	public String getSettleBatchNumber() {
		return this._settleBatchNumber;
	}


	public void setSettleBatchNumber(String settleBatchNumber) {
		this._settleBatchNumber = settleBatchNumber;
	}


	public java.sql.Date getCreatedDate() {
		return this._createdDate;
	}


	public void setCreatedDate(java.sql.Date createdDate) {
		this._createdDate = createdDate;
	}


	public java.sql.Date getModifiedDate() {
		return this._modifiedDate;
	}


	public void setModifiedDate(java.sql.Date modifiedDate) {
		this._modifiedDate = modifiedDate;
	}


	public String getModifiedUserID() {
		return this._modifiedUserID;
	}


	public void setModifiedUserID(String modifiedUserID) {
		this._modifiedUserID = modifiedUserID;
	}
	
	public int getSettleFileSeqNumber() {
		return this._settleFileSeqNumber;
	}

	public void setSettleFileSeqNumber(int settleFileSeqNumber) {
		this._settleFileSeqNumber = settleFileSeqNumber;
	}
	
	public int getReturnFileSeqNumber() {
		return this._returnFileSeqNumber;
	}

	public void setReturnFileSeqNumber(int returnFileSeqNumber) {
		this._returnFileSeqNumber = returnFileSeqNumber;
	}
}
