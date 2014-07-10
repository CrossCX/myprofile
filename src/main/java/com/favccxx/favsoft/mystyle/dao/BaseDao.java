package com.favccxx.favsoft.mystyle.dao;

import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

import com.mongodb.Mongo;

public class BaseDao<K, T> extends BasicDAO<T, K> {

	protected BaseDao(Mongo mongo, Morphia morphia, String dbName) {
		super(mongo, morphia, dbName);
	}

}
