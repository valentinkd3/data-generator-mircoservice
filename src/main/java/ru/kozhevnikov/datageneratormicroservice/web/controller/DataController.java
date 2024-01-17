package ru.kozhevnikov.datageneratormicroservice.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kozhevnikov.datageneratormicroservice.model.Data;
import ru.kozhevnikov.datageneratormicroservice.model.test.DataTestOptions;
import ru.kozhevnikov.datageneratormicroservice.service.KafkaDataService;
import ru.kozhevnikov.datageneratormicroservice.service.TestDataService;
import ru.kozhevnikov.datageneratormicroservice.web.dto.DataDto;
import ru.kozhevnikov.datageneratormicroservice.web.dto.DataTestOptionsDto;
import ru.kozhevnikov.datageneratormicroservice.web.mapper.DataMapper;
import ru.kozhevnikov.datageneratormicroservice.web.mapper.DataTestOptionsMapper;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;

    private final TestDataService testDataService;

    private final DataMapper dataMapper;

    private final DataTestOptionsMapper dataTestOptionsMapper;


    @PostMapping("/send")
    public void send(@RequestBody DataDto dto) {
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto dataTestOptionsDto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(dataTestOptionsDto);
        testDataService.sendMessages(testOptions);
    }
}
