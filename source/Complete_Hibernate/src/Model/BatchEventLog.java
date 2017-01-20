package Model;

import java.io.Serializable;

public class BatchEventLog implements Serializable{
	
	private int _eventSeqNumber; // --INTEGER NOT NULL
	private String _eventName; // --VARCHAR2(50) NULL
	private java.util.Date _eventStartTimeStamp; // --TIMESTAMP NULL
	private java.util.Date _eventEndTimeStamp; // --TIMESTAMP NULL
	private String _eventStatus; // --VARCHAR2(3) NULL
	private java.lang.Integer _recordCount; // --INTEGER NULL
	
	public BatchEventLog(){
		super();
	}
	
	public BatchEventLog(
			int eventSeqNumber,
			String eventName,
			java.util.Date eventStartTimeStamp,
			java.util.Date eventEndTimeStamp,
			String eventStatus,
			java.lang.Integer recordCount) {
		
			this._eventSeqNumber=eventSeqNumber;
			this._eventName=eventName;
			this._eventStartTimeStamp=eventStartTimeStamp;
			this._eventEndTimeStamp=eventEndTimeStamp;
			this._eventStatus=eventStatus;
			this._recordCount=recordCount;
		
	}
	

	public java.lang.Integer getEventSeqNumber() {
		return this._eventSeqNumber;
	}

	public void setEventSeqNumber(java.lang.Integer eventSeqNumber) {
		this._eventSeqNumber = eventSeqNumber;
	}

	public String getEventName() {
		return this._eventName;
	}

	public void setEventName(String eventName) {
		this._eventName = eventName;
	}

	public java.util.Date getEventStartTimeStamp() {
		return this._eventStartTimeStamp;
	}

	public void setEventStartTimeStamp(java.util.Date eventStartTimeStamp) {
		this._eventStartTimeStamp = eventStartTimeStamp;
	}

	public java.util.Date getEventEndTimeStamp() {
		return this._eventEndTimeStamp;
	}

	public void setEventEndTimeStamp(java.util.Date eventEndTimeStamp) {
		this._eventEndTimeStamp = eventEndTimeStamp;
	}

	public String getEventStatus() {
		return this._eventStatus;
	}

	public void setEventStatus(String eventStatus) {
		this._eventStatus = eventStatus;
	}

	public java.lang.Integer getRecordCount() {
		return this._recordCount;
	}

	public void setRecordCount(java.lang.Integer recordCount) {
		this._recordCount = recordCount;
	}
}
