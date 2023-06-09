package com.hbs.auracar.integration.repository;

import com.hbs.auracar.integration.model.CarEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface CarRepository extends ReactiveCrudRepository<CarEntity, Long> {
    Flux<CarEntity> findByActiveOrderById( Boolean active );

    Mono<CarEntity> findByIdAndActiveOrderById( Long id, Boolean active );
}
