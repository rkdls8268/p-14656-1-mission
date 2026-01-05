package com.back.domain.post.repository;

import com.back.domain.post.document.Post;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PostRepository extends ElasticsearchRepository<Post,String> {

  List<Post> findAll();
}