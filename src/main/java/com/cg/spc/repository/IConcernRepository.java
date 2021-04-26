package com.cg.spc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.Concern;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.User;
@Repository
public interface IConcernRepository extends JpaRepository<Concern,String> {
//	public Concern addConcern(Concern concern);
//	public Concern updateConcern(Concern concern);
//	public List<Concern> retrieveAllConcerns();
//	public List<Concern> retrieveAllConcernsByParent(Parent parent);
//	public List<Concern> retrieveAllUnResolvedConcerns();
//	public List<Concern> retrieveAllUnResolvedConcernsByParent(Parent parent);
	
	
	
}
