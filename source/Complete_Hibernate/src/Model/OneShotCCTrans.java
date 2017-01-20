package Model;

import java.io.Serializable;

public class OneShotCCTrans implements Serializable {
	
	private int _transSeqNymber;
	private int _cardSeqNumber;
	private int _authSeqNumber;
	private String _appID;
	private String _customerIPAddr;
	private String _policyNumber;
	private String _quoteNumber;
	private String _sourceAppCd;
	private int _transactionAmount;
	private String _trackingNumber;
	private String _merchantNumber;
	private String _transStatusCd;
	private String _insuredStateCd;
	private String _insureFirstName;
	private String _insuredMiddleName;
	private String _insuredLastName;
	private String _settleInd;
	private java.sql.Date _transDate;
	private java.sql.Date _settledDate;
	private String _settleBatchNumber;
	private String _transUserID;
	private int _settleFileSeqNumber;
	private int _returnFileSeqNumber;
	private java.sql.Date _createdDate;
	private java.sql.Date _modifiedDate;
	private String _modifiedUserID;

	
	
	public OneShotCCTrans(
			int transSeqNymber,
			int cardSeqNumber,
			int authSeqNumber,
			String appID,
			String customerIPAddr,
			String policyNumber,
			String quoteNumber,
			String sourceAppCd,
			int transactionAmount,
			String trackingNumber,
			String merchantNumber,
			String transStatusCd,
			String insuredStateCd,
			String insureFirstName,
			String insuredMiddleName,
			String insuredLastName,
			String settleInd,
			java.sql.Date transDate,
			java.sql.Date settledDate,
			String settleBatchNumber,
			String transUserID,
			int settleFileSeqNumber,
			int returnFileSeqNumber,
			java.sql.Date createdDate,
			java.sql.Date modifiedDate,
			String modifiedUserID) {
			
			this._transSeqNymber=transSeqNymber;
			this._cardSeqNumber=cardSeqNumber;
			this._authSeqNumber=authSeqNumber;
			this._appID=appID;
			this._customerIPAddr=customerIPAddr;
			this._policyNumber=policyNumber;
			this._quoteNumber=quoteNumber;
			this._sourceAppCd=sourceAppCd;
			this._transactionAmount=transactionAmount;
			this._trackingNumber=trackingNumber;
			this._merchantNumber=merchantNumber;
			this._transStatusCd=transStatusCd;
			this._insuredStateCd=insuredStateCd;
			this._insureFirstName=insureFirstName;
			this._insuredMiddleName=insuredMiddleName;
			this._insuredLastName=insuredLastName;
			this._settleInd=settleInd;
			this._transDate=transDate;
			this._settledDate=settledDate;
			this._settleBatchNumber=settleBatchNumber;
			this._transUserID=transUserID;
			this._settleFileSeqNumber=settleFileSeqNumber;
			this._returnFileSeqNumber=returnFileSeqNumber;
			this._createdDate=createdDate;
			this._modifiedDate=modifiedDate;
			this._modifiedUserID=modifiedUserID;
			
		
	}

	public int getTransSeqNymber() {
		return this._transSeqNymber;
	}


	public void setTransSeqNymber(int transSeqNymber) {
		this._transSeqNymber = transSeqNymber;
	}


	public int getCardSeqNumber() {
		return this._cardSeqNumber;
	}


	public void setCardSeqNumber(int cardSeqNumber) {
		this._cardSeqNumber = cardSeqNumber;
	}


	public int getAuthSeqNumber() {
		return this._authSeqNumber;
	}


	public void setAuthSeqNumber(int authSeqNumber) {
		this._authSeqNumber = authSeqNumber;
	}

	public String getAppID() {
		return this._appID;
	}


	public void setAppID(String appID) {
		this._appID = appID;
	}


	public String getCustomerIPAddr() {
		return this._customerIPAddr;
	}


	public void setCustomerIPAddr(String customerIPAddr) {
		this._customerIPAddr = customerIPAddr;
	}


	public String getPolicyNumber() {
		return this._policyNumber;
	}


	public void setPolicyNumber(String policyNumber) {
		this._policyNumber = policyNumber;
	}


	public String getQuoteNumber() {
		return this._quoteNumber;
	}


	public void setQuoteNumber(String quoteNumber) {
		this._quoteNumber = quoteNumber;
	}


	public String getSourceAppCd() {
		return this._sourceAppCd;
	}


	public void setSourceAppCd(String sourceAppCd) {
		this._sourceAppCd = sourceAppCd;
	}


	public int getTransactionAmount() {
		return this._transactionAmount;
	}


	public void setTransactionAmount(int transactionAmount) {
		this._transactionAmount = transactionAmount;
	}


	public String getTrackingNumber() {
		return this._trackingNumber;
	}


	public void setTrackingNumber(String trackingNumber) {
		this._trackingNumber = trackingNumber;
	}


	public String getMerchantNumber() {
		return this._merchantNumber;
	}


	public void setMerchantNumber(String merchantNumber) {
		this._merchantNumber = merchantNumber;
	}


	public String getTransStatusCd() {
		return this._transStatusCd;
	}


	public void setTransStatusCd(String transStatusCd) {
		this._transStatusCd = transStatusCd;
	}


	public String getInsuredStateCd() {
		return this._insuredStateCd;
	}


	public void setInsuredStateCd(String insuredStateCd) {
		this._insuredStateCd = insuredStateCd;
	}


	public String getInsureFirstName() {
		return this._insureFirstName;
	}


	public void setInsureFirstName(String insureFirstName) {
		this._insureFirstName = insureFirstName;
	}


	public String getInsuredMiddleName() {
		return this._insuredMiddleName;
	}


	public void setInsuredMiddleName(String insuredMiddleName) {
		this._insuredMiddleName = insuredMiddleName;
	}


	public String getInsuredLastName() {
		return this._insuredLastName;
	}


	public void setInsuredLastName(String insuredLastName) {
		this._insuredLastName = insuredLastName;
	}


	public String getSettleInd() {
		return this._settleInd;
	}


	public void setSettleInd(String settleInd) {
		this._settleInd = settleInd;
	}


	public java.sql.Date getTransDate() {
		return this._transDate;
	}


	public void setTransDate(java.sql.Date transDate) {
		this._transDate = transDate;
	}


	public java.sql.Date getSettledDate() {
		return this._settledDate;
	}


	public void setSettledDate(java.sql.Date settledDate) {
		this._settledDate = settledDate;
	}


	public String getSettleBatchNumber() {
		return this._settleBatchNumber;
	}


	public void setSettleBatchNumber(String settleBatchNumber) {
		this._settleBatchNumber = settleBatchNumber;
	}


	public String getTransUserID() {
		return this._transUserID;
	}


	public void setTransUserID(String transUserID) {
		this._transUserID = transUserID;
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
