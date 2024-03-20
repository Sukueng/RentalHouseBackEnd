package com.RentalHome.BackEnd.PostManagement;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepostory extends MongoRepository<PostModel, String> {
}
