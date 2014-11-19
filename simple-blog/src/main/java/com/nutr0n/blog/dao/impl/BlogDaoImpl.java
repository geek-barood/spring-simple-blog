package com.nutr0n.blog.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nutr0n.blog.dao.BlogDao;
import com.nutr0n.blog.model.Blog;
import com.nutr0n.blog.util.CustomHibernateSupport;

@Repository("blogDao")
public class BlogDaoImpl extends CustomHibernateSupport implements BlogDao {

	@Override
	public Blog getBlog(Blog blog) {
		return (Blog) getHibernateTemplate().get("Blog", blog.getId());
	}

	@Override
	public Integer getUserIdForBlogId(Integer blogId) {
		List<?> list = getHibernateTemplate().find("from Blog where blogId=?", blogId);
		Blog blog = (Blog)list.get(0);
		return blog.getUserId();
	}

	@Override
	public void deleteBlog(Blog blog) {
		getHibernateTemplate().delete(blog);
		
	}

	@Override
	public void saveBlog(Blog blog) {
		getHibernateTemplate().save(blog);
	}

	@Override
	public List<?> getBlogsByUser(Integer userId) {
		List<?> list = getHibernateTemplate().find("from Blog where userId=?", userId);
		return list;
	}

	@Override
	public Blog getBlogById(Integer id) {
		return (Blog)getHibernateTemplate().get(Blog.class, id);
	}

	@Override
	public void deleteBlogById(Integer id) {
		Blog blog = getBlogById(id);
		getHibernateTemplate().delete(blog);
		
	}

}
