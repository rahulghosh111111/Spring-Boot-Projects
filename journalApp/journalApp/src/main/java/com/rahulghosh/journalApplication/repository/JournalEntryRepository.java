package com.rahulghosh.journalApplication.repository;

import com.rahulghosh.journalApplication.Entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry , ObjectId> {

}
