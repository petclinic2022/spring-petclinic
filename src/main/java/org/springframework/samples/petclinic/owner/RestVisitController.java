package org.springframework.samples.petclinic.owner;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestVisitController {

	private final OwnerRepository ownerRepository;

	public RestVisitController(OwnerRepository owners) {
		this.ownerRepository = owners;
	}

	@PostMapping("/pets/new-visit")
	@ResponseStatus(HttpStatus.CREATED)
	Owner addPetVisit(@RequestBody VisitData visitData) {
		Owner owner = ownerRepository.findById(visitData.getOwnerId());
		Visit visit = new Visit();
		visit.setDate(visitData.getDate());
		visit.setDescription(visitData.getDescription());
		owner.addVisit(visitData.getPetId(), visit);
		ownerRepository.save(owner);
		return owner;
	}

}
