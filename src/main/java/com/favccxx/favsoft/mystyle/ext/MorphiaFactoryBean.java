package com.favccxx.favsoft.mystyle.ext;

import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.config.AbstractFactoryBean;

public class MorphiaFactoryBean extends AbstractFactoryBean<Morphia>{
	/**扫描要映射的包*/
	private String[] mapPackages;	
	/** 要映射的类*/
	private String[] mapClasses;	
	/**扫描包时，是否忽略不映射的类*/
	private boolean ignoreInvalidClasses;

	@Override
	protected Morphia createInstance() throws Exception {
		Morphia morphia = new Morphia();
		if(mapPackages != null){
			for(String packageName : mapPackages){
				morphia.mapPackage(packageName, ignoreInvalidClasses);
			}
		}
		
		if(mapClasses != null){
			for(String entityClass : mapClasses){
				morphia.map(Class.forName(entityClass));
			}
		}
		return morphia;
	}

	@Override
	public Class<?> getObjectType() {
		return Morphia.class;
	}

	public String[] getMapPackages() {
		return mapPackages;
	}

	public void setMapPackages(String[] mapPackages) {
		this.mapPackages = mapPackages;
	}

	public String[] getMapClasses() {
		return mapClasses;
	}

	public void setMapClasses(String[] mapClasses) {
		this.mapClasses = mapClasses;
	}

	public boolean isIgnoreInvalidClasses() {
		return ignoreInvalidClasses;
	}

	public void setIgnoreInvalidClasses(boolean ignoreInvalidClasses) {
		this.ignoreInvalidClasses = ignoreInvalidClasses;
	}
	
	

}
