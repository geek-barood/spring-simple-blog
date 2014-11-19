package com.nutr0n.blog.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutr0n.blog.bo.BlogBo;
import com.nutr0n.blog.dao.BlogDao;
import com.nutr0n.blog.model.Blog;

@Service("blogBo")
public class BlogBoImpl implements BlogBo {

	@Autowired
	BlogDao blogDao;
	
	@Override
	public Blog getBlog(Blog blog) {
		return blogDao.getBlog(blog);
	}

	@Override
	public Integer getUserIdForBlogId(Integer blogId) {
		return blogDao.getUserIdForBlogId(blogId);
	}

	@Override
	public void deleteBlog(Blog blog) {
		blogDao.deleteBlog(blog);

	}

	@Override
	public void saveBlog(Blog blog) {
		blogDao.saveBlog(blog);

	}

	@Override
	public List<?> getBlogsByUser(Integer userId) {
		return blogDao.getBlogsByUser(userId);
	}

	@Override
	public void deleteBlogBydId(Integer id) {
		blogDao.deleteBlogById(id);
		
	}

	@Override
	public Blog getBlogById(Integer id) {
		return blogDao.getBlogById(id);
	}

}
