package com.nutr0n.blog.dao;

import java.util.List;

import com.nutr0n.blog.model.Blog;
public interface BlogDao {
	Blog getBlog(Blog blog);
	Blog getBlogById(Integer id);
	Integer getUserIdForBlogId(Integer blogId);
	void deleteBlog(Blog blog);
	void deleteBlogById(Integer id);
	void saveBlog(Blog blog);
	
	List<?> getBlogsByUser(Integer userId);
}
