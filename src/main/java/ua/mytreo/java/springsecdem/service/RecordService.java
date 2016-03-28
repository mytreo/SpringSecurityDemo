package ua.mytreo.java.springsecdem.service;

import ua.mytreo.java.springsecdem.entity.Record;

import java.util.List;

public interface RecordService {
    Record addRecord(Record record);
    void delete(long id);
    Record getById(Long id);
    Record getByNum(Integer num);
    Record editRecord(Record record);
    List<Record> getAll();
}
