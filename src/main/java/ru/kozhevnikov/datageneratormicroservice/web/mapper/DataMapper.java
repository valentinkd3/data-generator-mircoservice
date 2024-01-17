package ru.kozhevnikov.datageneratormicroservice.web.mapper;

import org.mapstruct.Mapper;
import ru.kozhevnikov.datageneratormicroservice.model.Data;
import ru.kozhevnikov.datageneratormicroservice.web.dto.DataDto;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
