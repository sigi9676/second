package com.petPeers.dao;

import javax.validation.Valid;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.petPeers.model.Pet;
@Repository
public interface PetRepository extends CrudRepository<Pet, Integer>{
	public abstract Pet save(Pet pet);

	public abstract void deleteById(@Valid int pet_id);
	
}
