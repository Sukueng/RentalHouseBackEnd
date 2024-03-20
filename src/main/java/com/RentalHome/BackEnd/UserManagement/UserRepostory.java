package com.RentalHome.BackEnd.UserManagement;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepostory extends MongoRepository<UserModel, String> {
}
