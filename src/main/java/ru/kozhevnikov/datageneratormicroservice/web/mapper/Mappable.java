package ru.kozhevnikov.datageneratormicroservice.web.mapper;

public interface Mappable<E, D> {

    E toEntity(D d);

    D toDto(E entity);
}
