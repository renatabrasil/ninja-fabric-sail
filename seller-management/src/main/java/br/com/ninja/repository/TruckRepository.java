package br.com.ninja.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "truck", path = "truck")
public interface TruckRepository {
}
