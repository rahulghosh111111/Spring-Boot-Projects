package com.rahulghosh.journalApplication.repository;

import com.rahulghosh.journalApplication.Entity.JournalEntry;
import com.rahulghosh.journalApplication.Entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);

    void deleteByUserName(String username);
}
