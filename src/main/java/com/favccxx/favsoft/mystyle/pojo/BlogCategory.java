package com.favccxx.favsoft.mystyle.pojo;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("Blog.BlogCategory")
public class BlogCategory {
	
	@Id
	private String categoryId;
	
	/**
	 * 博客类目标题
	 */
	private String categoryName;
	
	/**
	 * 博客类目顺序
	 */
	private int categoryOrder;
	
	/**
	 * 博客菜单等级
	 */
	private int categoryLevel;
	
	/**是否可见*/
	private int isHidden;
	
	private String addUserId;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getCategoryOrder() {
		return categoryOrder;
	}

	public void setCategoryOrder(int categoryOrder) {
		this.categoryOrder = categoryOrder;
	}

	public int getCategoryLevel() {
		return categoryLevel;
	}

	public void setCategoryLevel(int categoryLevel) {
		this.categoryLevel = categoryLevel;
	}

	public int getIsHidden() {
		return isHidden;
	}

	public void setIsHidden(int isHidden) {
		this.isHidden = isHidden;
	}

	public String getAddUserId() {
		return addUserId;
	}

	public void setAddUserId(String addUserId) {
		this.addUserId = addUserId;
	}

	
	

}
