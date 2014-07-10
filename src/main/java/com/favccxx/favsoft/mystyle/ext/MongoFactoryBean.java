package com.favccxx.favsoft.mystyle.ext;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.AbstractFactoryBean;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientOptions.Builder;
import com.mongodb.ServerAddress;

public class MongoFactoryBean extends AbstractFactoryBean<MongoClient> {
	
	private List<ServerAddress> replicaSetSeeds = new ArrayList<ServerAddress>();
	private Builder builder = new MongoClientOptions.Builder();
	private MongoClientOptions mongoClientOptions = builder.build();
	
	

	@Override
	protected MongoClient createInstance() throws Exception {
		if(replicaSetSeeds.size()>0){
			if(mongoClientOptions != null){
				return new MongoClient(replicaSetSeeds, mongoClientOptions);
			}
			return new MongoClient(replicaSetSeeds);
		}
		return new MongoClient();
	}

	@Override
	public Class<?> getObjectType() {
		return Mongo.class;
	}

	public List<ServerAddress> getReplicaSetSeeds() {
		return replicaSetSeeds;
	}

	public void setReplicaSetSeeds(List<ServerAddress> replicaSetSeeds) {
		this.replicaSetSeeds = replicaSetSeeds;
	}

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public MongoClientOptions getMongoClientOptions() {
		return mongoClientOptions;
	}

	public void setMongoClientOptions(MongoClientOptions mongoClientOptions) {
		this.mongoClientOptions = mongoClientOptions;
	}

	

	
	

}
