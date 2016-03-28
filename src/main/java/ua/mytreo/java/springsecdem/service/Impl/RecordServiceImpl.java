package ua.mytreo.java.springsecdem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.mytreo.java.springsecdem.entity.Record;
import ua.mytreo.java.springsecdem.repository.RecordRepository;
import ua.mytreo.java.springsecdem.service.RecordService;

import java.util.List;


@Service
public class RecordServiceImpl implements RecordService{

    @Autowired
    private RecordRepository recordRepository;

    @Override
    public Record addRecord(Record record) {
        Record savedRecord = recordRepository.saveAndFlush(record);

        return savedRecord;
    }

    @Override
    public void delete(long id) {
        recordRepository.delete(id);
    }

    @Override
    public Record getById(Long id) {
        return recordRepository.findOne(id);
    }

    @Override
    public Record getByNum(Integer num) {
        return recordRepository.findByNum(num);
    }

    @Override
    public Record editRecord(Record record) {
        return recordRepository.saveAndFlush(record);
    }

    @Override
    public List<Record> getAll() {
        return recordRepository.findAll();
    }
}
