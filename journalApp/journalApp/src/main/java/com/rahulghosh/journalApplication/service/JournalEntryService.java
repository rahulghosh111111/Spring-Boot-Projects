package com.rahulghosh.journalApplication.service;

import com.rahulghosh.journalApplication.Entity.JournalEntry;
import com.rahulghosh.journalApplication.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalEntryService {

    private final JournalEntryRepository journalEntryRepository;

    @Autowired
    public JournalEntryService(JournalEntryRepository journalEntryRepository) {
        this.journalEntryRepository = journalEntryRepository;
    }

    public void saveEntry(JournalEntry journalEntry) {
        journalEntryRepository.save(journalEntry);
    }
    public List<JournalEntry> getAll(){
        return journalEntryRepository.findAll();
    }

    public Optional<JournalEntry> findById(ObjectId  id){
        return journalEntryRepository.findById(id);
    }

    public void deleteById(ObjectId  id){
        journalEntryRepository.deleteById(id);
    }
    // Add other service methods as needed
}
