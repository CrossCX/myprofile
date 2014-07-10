package com.favccxx.favsoft.mystyle.service;

import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.QueryResults;
import org.mongodb.morphia.query.UpdateOperations;
import org.mongodb.morphia.query.UpdateResults;

import com.mongodb.WriteConcern;

public interface IBaseMongoService<T,K> {

	public long count();
	
	public long count(Query<T> q);
	
	public long count(String key, Object value);
	
	public Query<T> createQuery();
	
	public void delete(T entity);
	
	public void delete(T entity, WriteConcern wc);
	
	public void deleteById(K id);
	
	public void deleteByQuery(Query<T> q);
	
	public void ensureIndexes();
	
	public boolean exists(Query<T> q);
	
	public boolean exists(String key, Object value);
	
	public QueryResults<T> find();
	
	public QueryResults<T> find(Query<T> q);
	
	public List<K> findIds();
	
	public List<K> findIds(Query<T> q);
	
	/**
	 * Finds the entities Key by the criteria {key:value}
	 * @param key
	 * @param value
	 * @return
	 */
	public List<K> findIds(String key, Object value);
	
	public T findOne(Query<T> q);
	
	public T findOne(String key, Object value);
	
	
	/**
	 * Finds the first entity's ID
	 * @return
	 */
	public Key<T> findOneId();
	
	/**
	 * Finds the first entity's ID
	 * @param q
	 * @return
	 */
	public Key<T> findOneId(Query<T> q);
	
	/**
	 * Finds the first entity's ID
	 * @param key
	 * @param value
	 * @return
	 */
	public Key<T> findOneId(String key, Object value);
	
	/**
	 * Loads the entity by id value
	 * @param id
	 * @return
	 */
	public T get(K id);
	
	public Datastore getDatastore();
	
	public Class<T> getEntityClass();
	
	public Key<T> save(T entity);
	
	public Key<T> save(T entity, WriteConcern wc);
	
	/**
	 * Updates all entities matched by the constraints with the modifiers supplied.
	 * @param q
	 * @param ops
	 * @return
	 */
	public UpdateResults<T> update(Query<T> q, UpdateOperations<T> ops);
	
	/**
	 * Updates the first entity matched by the constraints with the modifiers supplied
	 * @param q
	 * @param ops
	 * @return
	 */
	public UpdateResults<T> updateFirst(Query<T> q, UpdateOperations<T> ops);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
