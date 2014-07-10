package com.favccxx.favsoft.mystyle.service.impl;

import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.QueryResults;
import org.mongodb.morphia.query.UpdateOperations;
import org.mongodb.morphia.query.UpdateResults;

import com.favccxx.favsoft.mystyle.service.IBaseMongoService;
import com.mongodb.WriteConcern;

public class BaseMongoServiceImpl<T, K> implements IBaseMongoService<T, K>{
	
	private DAO<T,K> baseDao;

	public DAO getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(DAO baseDao) {
		baseDao.ensureIndexes();	//为被索引注解的所有字段创建索引。
		this.baseDao = baseDao;
	}

	@Override
	public long count() {
		return baseDao.count();
	}

	@Override
	public long count(Query<T> q) {
		return baseDao.count(q);
	}

	@Override
	public long count(String key, Object value) {
		return baseDao.count(key, value);
	}

	@Override
	public Query<T> createQuery() {
		return baseDao.createQuery();
	}

	@Override
	public void delete(T entity) {
		baseDao.delete(entity);
	}

	@Override
	public void delete(T entity, WriteConcern wc) {
		baseDao.delete(entity, wc);
	}

	@Override
	public void deleteById(K id) {
		baseDao.deleteById(id);
	}

	@Override
	public void deleteByQuery(Query<T> q) {
		baseDao.deleteByQuery(q);
	}

	@Override
	public void ensureIndexes() {
		baseDao.ensureIndexes();
	}

	@Override
	public boolean exists(Query<T> q) {
		return baseDao.exists(q);
	}

	@Override
	public boolean exists(String key, Object value) {
		return baseDao.exists(key, value);
	}

	@Override
	public QueryResults<T> find() {
		return baseDao.find();
	}

	@Override
	public QueryResults<T> find(Query<T> q) {
		return baseDao.find(q);
	}

	@Override
	public List<K> findIds() {
		return baseDao.findIds();
	}

	@Override
	public List<K> findIds(Query<T> q) {
		return baseDao.findIds(q);
	}

	@Override
	public List<K> findIds(String key, Object value) {
		return baseDao.findIds(key, value);
	}

	@Override
	public T findOne(Query<T> q) {
		return baseDao.findOne(q);
	}

	@Override
	public T findOne(String key, Object value) {
		return baseDao.findOne(key, value);
	}

	@Override
	public Key<T> findOneId() {
		return baseDao.findOneId();
	}

	@Override
	public Key<T> findOneId(Query<T> q) {
		return baseDao.findOneId(q);
	}

	@Override
	public Key<T> findOneId(String key, Object value) {
		return baseDao.findOneId(key, value);
	}

	@Override
	public T get(K id) {
		return baseDao.get(id);
	}

	@Override
	public Datastore getDatastore() {
		return baseDao.getDatastore();
	}

	@Override
	public Class<T> getEntityClass() {
		return baseDao.getEntityClass();
	}

	@Override
	public Key<T> save(T entity) {
		return baseDao.save(entity);
	}

	@Override
	public Key<T> save(T entity, WriteConcern wc) {
		return baseDao.save(entity,wc);
	}

	@Override
	public UpdateResults<T> update(Query<T> q, UpdateOperations<T> ops) {
		return baseDao.update(q, ops);
	}

	@Override
	public UpdateResults<T> updateFirst(Query<T> q, UpdateOperations<T> ops) {
		return baseDao.updateFirst(q, ops);
	}

	
	

	
}
