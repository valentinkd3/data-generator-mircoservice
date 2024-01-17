package ru.kozhevnikov.datageneratormicroservice.service;

import ru.kozhevnikov.datageneratormicroservice.model.test.DataTestOptions;

public interface TestDataService {

    void sendMessages(DataTestOptions dataTestOptions);
}
