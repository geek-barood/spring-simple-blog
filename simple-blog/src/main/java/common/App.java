package common;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nutr0n.blog.bo.BlogBo;
import com.nutr0n.blog.model.Blog;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/BeanLocations.xml");
		BlogBo blogBo = (BlogBo)ctx.getBean("blogBo");
		
		/*
		Blog blog = new Blog();
		blog.setTitle("Working in a bad company like NRI Fintech");
		blog.setContent("I see art in everything..but my camera..chhi! I need mega pixels.");
		blog.setUserId(432);
		blog.setEntryDate(new Date());
		*/
		//blogBo.saveBlog(blog);
		blogBo.deleteBlogBydId(3);
		blogBo.deleteBlogBydId(2);
		System.out.println(blogBo.getBlogsByUser(432));
	}
}
