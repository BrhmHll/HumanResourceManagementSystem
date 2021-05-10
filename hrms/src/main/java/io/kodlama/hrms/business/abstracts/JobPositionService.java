package io.kodlama.hrms.business.abstracts;

import java.util.List;

import io.kodlama.hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	List<JobPosition> getAll();
	
	void add(JobPosition jobPosition);
}
