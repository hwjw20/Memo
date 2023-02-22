package com.jiwon.memo.post.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jiwon.memo.post.model.Post;

@Repository
public interface PostDAO {

	public int insertPost(
			@Param("userId") int userId
			, @Param("title") String title
			, @Param("content") String content
			, @Param("imagePath") String imagePath);
	
	public List<Post> selectPostList(@Param("userId") int userId);
	
	public Post selectPost(@Param("postId") int postId);
	
	public int updatePost(
			@Param("postId") int postId
			, @Param("title") String title
			, @Param("content") String content);
	
	public int deletePost(@Param("postId") int postId);
}
