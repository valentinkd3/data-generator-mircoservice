package ru.kozhevnikov.datageneratormicroservice.model.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.kozhevnikov.datageneratormicroservice.model.Data;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptions {

    private int delayInSeconds;

    private Data.MeasurementType[] measurementTypes;
}
