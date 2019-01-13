package br.com.brunomarques.springmongo.repository;

import br.com.brunomarques.springmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    /*
    * Documentação de referência: https://docs.mongodb.com/manual/reference/operator/query/regex/#op._S_regex
    * */
    @Query("{ 'title' : { $regex: ?0 , $options: 'i' } }")
    List<Post> findByTitle(String text);

    List<Post> findByTitleContainingIgnoreCase(String text);
}
