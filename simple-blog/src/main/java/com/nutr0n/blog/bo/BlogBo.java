package com.nutr0n.blog.bo;

import java.util.List;

import com.nutr0n.blog.model.Blog;

public interface BlogBo {
	Blog getBlog(Blog blog);
	Blog getBlogById(Integer id);
	Integer getUserIdForBlogId(Integer blogId);
	void deleteBlog(Blog blog);
	void deleteBlogBydId(Integer id);
	void saveBlog(Blog blog);
	
	List<?> getBlogsByUser(Integer userId);
}
