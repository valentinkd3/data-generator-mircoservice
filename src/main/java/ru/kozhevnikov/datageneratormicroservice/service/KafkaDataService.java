package ru.kozhevnikov.datageneratormicroservice.service;

import ru.kozhevnikov.datageneratormicroservice.model.Data;

public interface KafkaDataService {

    void send(Data data);
}
