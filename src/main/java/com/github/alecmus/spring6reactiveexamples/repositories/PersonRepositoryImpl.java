package com.github.alecmus.spring6reactiveexamples.repositories;

import com.github.alecmus.spring6reactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PersonRepositoryImpl implements PersonRepository {

    Person michael = Person.builder().id(1).firstName("Michael").lastName("Weston").build();
    Person fiona = Person.builder().id(2).firstName("Fiona").lastName("Glenanne").build();
    Person sam = Person.builder().id(3).firstName("Sam").lastName("Axe").build();
    Person jesse = Person.builder().id(4).firstName("Jesse").lastName("Porter").build();

    @Override
    public Mono<Person> getById(Integer id) {
        return Mono.just(michael);
    }

    @Override
    public Flux<Person> findAll() {
        return Flux.just(michael, fiona, sam, jesse);
    }
}
