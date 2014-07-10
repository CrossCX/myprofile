package com.favccxx.favsoft.mystyle.ext;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.config.AbstractFactoryBean;

import com.mongodb.Mongo;

public class DataStoreFactoryBean extends AbstractFactoryBean<Datastore> {
	
	private Morphia morphia;
	private Mongo mongo;
	private String dbName;
	private boolean toEnsureIndexes;
	private boolean toEnsureCaps;
	
	@Override
	protected Datastore createInstance() throws Exception {
		Datastore ds = morphia.createDatastore(mongo, dbName);
		if(toEnsureIndexes){
			ds.ensureIndexes();
		}
		if(toEnsureCaps){
			ds.ensureCaps();
		}
		return ds;
	}

	@Override
	public Class<?> getObjectType() {
		return Datastore.class;
	}

	public Morphia getMorphia() {
		return morphia;
	}

	public void setMorphia(Morphia morphia) {
		this.morphia = morphia;
	}

	public Mongo getMongo() {
		return mongo;
	}

	public void setMongo(Mongo mongo) {
		this.mongo = mongo;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public boolean isToEnsureIndexes() {
		return toEnsureIndexes;
	}

	public void setToEnsureIndexes(boolean toEnsureIndexes) {
		this.toEnsureIndexes = toEnsureIndexes;
	}

	public boolean isToEnsureCaps() {
		return toEnsureCaps;
	}

	public void setToEnsureCaps(boolean toEnsureCaps) {
		this.toEnsureCaps = toEnsureCaps;
	}
	
	

}
