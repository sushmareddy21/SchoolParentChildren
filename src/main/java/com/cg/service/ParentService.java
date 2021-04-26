package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;
import com.cg.spc.repository.IParentRepository;
import com.cg.spc.service.IParentService;
@Service
@Transactional
public class ParentService implements IParentService{
		@Autowired
		private IParentRepository iparentRepository;
		private Logger logger = LoggerFactory.getLogger(ParentService.class);
		
		public List<Parent> retrieveParentListByClass(ClassId classId)
        {
//			List<Parent> parents = new ArrayList<>();
//			iparentRepository.findAll().forEach(parents::add);
//			return parents;
			return null;
 	       }

		@Override
		public Parent addParent(Parent parent)
		{
			return iparentRepository.save(parent);
			
			
		}

		@Override
		public Parent updateParent(Parent parent) 
		{
			return iparentRepository.save(parent);
	
		}

		@Override
		public Parent retrieveParentByStudent(Student student)
		{
			
			//return iparentRepository.retrieveParentByStudent(student);
			return null;
		}

		@Override
		public Parent retrieveParentById(int id) 
		{
//			Optional<Parent> opt = iparentRepository.findById(id);
//			if(!opt.isPresent())
//			{
//				throw new ParentNotFoundException();
//			}
//			Parent parent  = opt.get();
//			logger.info("***Retrieving Parent by Id: " + parent.getParentId() + "***");
//			return parent;
			return null;
	
		}

	}

