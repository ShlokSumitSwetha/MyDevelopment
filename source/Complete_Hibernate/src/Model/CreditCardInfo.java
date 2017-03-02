package Model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class CreditCardInfo implements Serializable {

	private java.lang.Integer _cardSeqNumber; //: INTEGER NOT NULL
	private java.lang.Integer _vaultSeqNumber; //: INTEGER NULL (FK)
	private String _appID; //: VARCHAR2(5) NULL	
	private String _secureTokenID; //: VARCHAR2(16) NULL
	private java.util.Date _cardExpDate; //: DATE NULL
	private String _cardTypeDesc; //: VARCHAR2(4) NULL
	private String _policyNumber; //: VARCHAR2(20) NULL
	private String _quoteNumber; //: VARCHAR2(20) NULL
	private String _firstName; //: VARCHAR2(20) NULL
	private String _middleName; //: VARCHAR2(1) NULL
	private String  _lastName; //: VARCHAR2(20) NULL
	private String _lineOneAddr; //: VARCHAR2(30) NULL
	private String _lineTwoAddr; //: VARCHAR2(30) NULL
	private String _cityName; //: VARCHAR2(22) NULL
	private String _stateCode; //: VARCHAR2(2) NULL
	private String _zipCode; //: VARCHAR2(5) NULL
	private String _cardDataStatusCode; //: VARCHAR2(3) NULL
	private String _lastActivityTypeCode; //: VARCHAR2(3) NULL
	private java.util.Date _lastAuthDate; //: Date NULL
	private java.util.Date _lastSettleDate; //: Date NULL
	private java.util.Date _createdDate; //: Date NULL
	private java.util.Date _modifiedDate; //: Date NULL
	CreditCardAuth creditCardAuth;
	private  Set<CreditCardAuth> creditcardauth= new HashSet<CreditCardAuth>();
	
	
	public CreditCardInfo(
			java.lang.Integer cardSeqNumber,
			java.lang.Integer vaultSeqNumber,
			String appID,
			String secureTokenID,
			java.util.Date cardExpDate,
			String cardTypeDesc,
			String policyNumber,
			String quoteNumber,
			String firstName,
			String middleName,
			String  lastName,
			String lineOneAddr,
			String lineTwoAddr,
			String cityName,
			String stateCode,
			String zipCode,
			String cardDataStatusCode,
			String lastActivityTypeCode,
			java.util.Date lastAuthDate,
			java.util.Date lastSettleDate,
			java.util.Date createdDate,
			java.util.Date modifiedDate) {
		
			this._cardSeqNumber=cardSeqNumber;
			this._vaultSeqNumber=vaultSeqNumber;
			this._appID=appID;
			this._secureTokenID=secureTokenID;
			this._cardExpDate=cardExpDate;
			this._cardTypeDesc=cardTypeDesc;
			this._policyNumber=policyNumber;
			this._quoteNumber=quoteNumber;
			this._firstName=firstName;
			this._middleName=middleName;
			this._lastName=lastName;
			this._lineOneAddr=lineOneAddr;
			this._lineTwoAddr=lineTwoAddr;
			this._cityName=cityName;
			this._stateCode=stateCode;
			this._zipCode=zipCode;
			this._cardDataStatusCode=cardDataStatusCode;
			this._lastActivityTypeCode=lastActivityTypeCode;
			this._lastAuthDate=lastAuthDate;
			this._lastSettleDate=lastSettleDate;
			this._createdDate=createdDate;
			this._modifiedDate=modifiedDate;

	}
	public CreditCardInfo(){
		
	}

	public java.lang.Integer getCardSeqNumber() {
		return this._cardSeqNumber;
	}


	public void setCardSeqNumber(java.lang.Integer cardSeqNumber) {
		this._cardSeqNumber = cardSeqNumber;
	}


	public java.lang.Integer getVaultSeqNumber() {
		return this._vaultSeqNumber;
	}


	public void setVaultSeqNumber(java.lang.Integer vaultSeqNumber) {
		this._vaultSeqNumber = vaultSeqNumber;
	}


	public String getAppID() {
		return this._appID;
	}


	public void setAppID(String appID) {
		this._appID = appID;
	}

	
	public String getSecureTokenID() {
		return this._secureTokenID;
	}


	public void setSecureTokenID(String secureTokenID) {
		this._secureTokenID = secureTokenID;
	}


	public java.util.Date getCardExpDate() {
		return this._cardExpDate;
	}


	public void setCardExpDate(java.util.Date cardExpDate) {
		this._cardExpDate = cardExpDate;
	}


	public String getCardTypeDesc() {
		return this._cardTypeDesc;
	}


	public void setCardTypeDesc(String cardTypeDesc) {
		this._cardTypeDesc = cardTypeDesc;
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


	public String getFirstName() {
		return this._firstName;
	}


	public void setFirstName(String firstName) {
		this._firstName = firstName;
	}


	public String getMiddleName() {
		return this._middleName;
	}


	public void setMiddleName(String middleName) {
		this._middleName = middleName;
	}


	public String getLastName() {
		return this._lastName;
	}


	public void setLastName(String lastName) {
		this._lastName = lastName;
	}


	public String getLineOneAddr() {
		return this._lineOneAddr;
	}


	public void setLineOneAddr(String lineOneAddr) {
		this._lineOneAddr = lineOneAddr;
	}


	public String getLineTwoAddr() {
		return this._lineTwoAddr;
	}


	public void setLineTwoAddr(String lineTwoAddr) {
		this._lineTwoAddr = lineTwoAddr;
	}


	public String getCityName() {
		return this._cityName;
	}


	public void setCityName(String cityName) {
		this._cityName = cityName;
	}


	public String getStateCode() {
		return this._stateCode;
	}


	public void setStateCode(String stateCode) {
		this._stateCode = stateCode;
	}


	public String getZipCode() {
		return this._zipCode;
	}


	public void setZipCode(String zipCode) {
		this._zipCode = zipCode;
	}


	public String getCardDataStatusCode() {
		return this._cardDataStatusCode;
	}


	public void setCardDataStatusCode(String cardDataStatusCode) {
		this._cardDataStatusCode = cardDataStatusCode;
	}


	public String getLastActivityTypeCode() {
		return this._lastActivityTypeCode;
	}


	public void setLastActivityTypeCode(String lastActivityTypeCode) {
		this._lastActivityTypeCode = lastActivityTypeCode;
	}


	public java.util.Date getLastAuthDate() {
		return this._lastAuthDate;
	}


	public void setLastAuthDate(java.util.Date lastAuthDate) {
		this._lastAuthDate = lastAuthDate;
	}


	public java.util.Date getLastSettleDate() {
		return this._lastSettleDate;
	}


	public void setLastSettleDate(java.util.Date lastSettleDate) {
		this._lastSettleDate = lastSettleDate;
	}


	public java.util.Date getCreatedDate() {
		return this._createdDate;
	}


	public void setCreatedDate(java.util.Date createdDate) {
		this._createdDate = createdDate;
	}


	public java.util.Date getModifiedDate() {
		return this._modifiedDate;
	}


	public void setModifiedDate(java.util.Date modifiedDate) {
		this._modifiedDate = modifiedDate;
	}
	public CreditCardAuth getCreditCardAuth() {
		return creditCardAuth;
	}
	public void setCreditCardAuth(CreditCardAuth creditCardAuth) {
		this.creditCardAuth = creditCardAuth;
	}
	public Set<CreditCardAuth> getCreditcardauth() {
		return creditcardauth;
	}
	public void setCreditcardauth(Set<CreditCardAuth> creditcardauth) {
		this.creditcardauth = creditcardauth;
	}

}
