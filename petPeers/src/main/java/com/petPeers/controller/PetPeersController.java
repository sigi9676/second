package com.petPeers.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.petPeers.model.Pet;
import com.petPeers.services.PetServices;

@Controller
public class PetPeersController {
	@Autowired
	private PetServices petServices;

	@GetMapping(value = "/first")
	public String sayHello() {

		return "Welcome to Spring boot";
	}

	@PostMapping(value = "/create")
	public Pet updatePet(@RequestBody Pet pet) {
      
		return petServices.save(pet);
	}
	@DeleteMapping(value = "/delete/{pet_id}")
	public void deletePet(@Valid @PathVariable int pet_id) {
        this.petServices.deletePet(pet_id);
	
	}
}
