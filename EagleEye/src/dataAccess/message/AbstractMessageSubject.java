package dataAccess.message;

import dataAccess.database.DataModel;

public abstract class AbstractMessageSubject {
	IMessagerSystem observer;
	DataModel dm;
	
	public abstract void attach(MessageSystem Ms);
	
	public abstract void detach(MessageSystem Ms);
	
	public abstract void notifyObserver();
}
