package br.com.brunomarques.springmongo.repository;

import br.com.brunomarques.springmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    /*
     * Documentação de referência: https://docs.mongodb.com/manual/reference/operator/query/regex/#op._S_regex
     * */
    @Query("{ 'title' : { $regex: ?0 , $options: 'i' } }")
    List<Post> findByTitle(String text);

    List<Post> findByTitleContainingIgnoreCase(String text);


    /*
     *
     * https://docs.mongodb.com/manual/reference/operator/query/gte/#op._S_gte
     * https://docs.mongodb.com/manual/reference/operator/query/or/
     * */
    @Query("{ $and: [ { date: { $gte: ?1 } }, { date: { $lte: ?2 } } , { $or: [ { 'title' : { $regex: ?0 , $options: 'i' } }, { 'body' : { $regex: ?0 , $options: 'i' } } , { 'comments.text' : { $regex: ?0 , $options: 'i' } } ] } ] }")
    List<Post> fullSearch(String text, Date minDate, Date maxDate);
}
