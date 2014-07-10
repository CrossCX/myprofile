package com.favccxx.favsoft.mystyle.pojo;

import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexed;

@Entity("blog")
public class Blog {

	@Id
	private String oid = new ObjectId().toString();
	
	/**
	 * 博客性质
	 */
	private int blogProperty;	//1:原创 ，2：转载，3：翻译
	
	/**
	 * 博客标题
	 */
	@Indexed
	private String blogTitle;
	
	/**博客内容*/
	private String blogContent;
	
	/**博客标签*/
	private String blogTags;
	
	/**系统分类*/
	private String blogCategory;
	
	/**个人分类*/
	private String myCategory;
	
	/**是否置顶*/
	private int isTop;
	
	/**发布日期*/
	private Date addDate;
	
	/**发布人*/
	private String userId;
	
	/**是否被推荐*/
	private int isRecommended;	//1:钻石推荐，2：金色推荐，3：银色推荐，4：通牌推荐，5：个人自荐，0：未推荐
	
	/**状态*/
	private String status; //发布，草稿

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public int getBlogProperty() {
		return blogProperty;
	}

	public void setBlogProperty(int blogProperty) {
		this.blogProperty = blogProperty;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	public String getBlogTags() {
		return blogTags;
	}

	public void setBlogTags(String blogTags) {
		this.blogTags = blogTags;
	}

	public String getBlogCategory() {
		return blogCategory;
	}

	public void setBlogCategory(String blogCategory) {
		this.blogCategory = blogCategory;
	}

	public String getMyCategory() {
		return myCategory;
	}

	public void setMyCategory(String myCategory) {
		this.myCategory = myCategory;
	}

	public int getIsTop() {
		return isTop;
	}

	public void setIsTop(int isTop) {
		this.isTop = isTop;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getIsRecommended() {
		return isRecommended;
	}

	public void setIsRecommended(int isRecommended) {
		this.isRecommended = isRecommended;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}

