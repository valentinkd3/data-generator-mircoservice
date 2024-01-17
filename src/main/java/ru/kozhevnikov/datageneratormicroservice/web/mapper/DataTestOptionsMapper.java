package ru.kozhevnikov.datageneratormicroservice.web.mapper;

import org.mapstruct.Mapper;
import ru.kozhevnikov.datageneratormicroservice.model.test.DataTestOptions;
import ru.kozhevnikov.datageneratormicroservice.web.dto.DataTestOptionsDto;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
