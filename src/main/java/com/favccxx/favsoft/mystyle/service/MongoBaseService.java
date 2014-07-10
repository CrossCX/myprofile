package com.favccxx.favsoft.mystyle.service;

import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.QueryResults;
import org.mongodb.morphia.query.UpdateOperations;
import org.mongodb.morphia.query.UpdateResults;

import com.mongodb.WriteConcern;

public class MongoBaseService<T,K> {
	
	protected DAO<T,K> baseDao;
	
	public DAO<T, K> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(DAO<T, K> baseDao) {
		this.baseDao = baseDao;
	}

	public long count() {
		return baseDao.count();
	}
	
	public long count(Query<T> q) {
		return baseDao.count(q);
	}

	
	public long count(String key, Object value) {
		return baseDao.count(key, value);
	}

	
	public Query<T> createQuery() {
		return baseDao.createQuery();
	}

	
	public void delete(T entity) {
		baseDao.delete(entity);
	}

	
	public void delete(T entity, WriteConcern wc) {
		baseDao.delete(entity, wc);
	}

	
	public void deleteById(K id) {
		baseDao.deleteById(id);
	}

	
	public void deleteByQuery(Query<T> q) {
		baseDao.deleteByQuery(q);
	}

	
	public void ensureIndexes() {
		baseDao.ensureIndexes();
	}

	
	public boolean exists(Query<T> q) {
		return baseDao.exists(q);
	}

	
	public boolean exists(String key, Object value) {
		return baseDao.exists(key, value);
	}

	
	public QueryResults<T> find() {
		return baseDao.find();
	}

	
	public QueryResults<T> find(Query<T> q) {
		return baseDao.find(q);
	}

	
	public List<K> findIds() {
		return baseDao.findIds();
	}

	
	public List<K> findIds(Query<T> q) {
		return baseDao.findIds(q);
	}

	
	public List<K> findIds(String key, Object value) {
		return baseDao.findIds(key, value);
	}

	
	public T findOne(Query<T> q) {
		return baseDao.findOne(q);
	}

	
	public T findOne(String key, Object value) {
		return baseDao.findOne(key, value);
	}

	
	public Key<T> findOneId() {
		return baseDao.findOneId();
	}

	
	public Key<T> findOneId(Query<T> q) {
		return baseDao.findOneId(q);
	}

	
	public Key<T> findOneId(String key, Object value) {
		return baseDao.findOneId(key, value);
	}

	
	public T get(K id) {
		return baseDao.get(id);
	}

	
	public Datastore getDatastore() {
		return baseDao.getDatastore();
	}

	
	public Class<T> getEntityClass() {
		return baseDao.getEntityClass();
	}

	
	public Key<T> save(T entity) {
		return baseDao.save(entity);
	}

	
	public Key<T> save(T entity, WriteConcern wc) {
		return baseDao.save(entity,wc);
	}

	
	public UpdateResults<T> update(Query<T> q, UpdateOperations<T> ops) {
		return baseDao.update(q, ops);
	}

	
	public UpdateResults<T> updateFirst(Query<T> q, UpdateOperations<T> ops) {
		return baseDao.updateFirst(q, ops);
	}

}
