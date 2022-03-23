package org.springframework.samples.petclinic.owner;

public class VisitData extends Visit {

	private int petId;

	private int ownerId;

	public VisitData(int petId, int ownerId) {
		this.petId = petId;
		this.ownerId = ownerId;
	}

	public int getPetId() {
		return petId;
	}

	public int getOwnerId() {
		return ownerId;
	}

}
