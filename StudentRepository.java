package com.example.DTO.projection_example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student,Integer> 
{
	@Query("select new com.example.DTO.projection_example.StudentDTO(s.id,s.name,s.city) from studDTO s where s.id=?1")
	StudentDTO getById(int id);

	StudentDTO2 getDetailById(int id);
	StudentInterface getInfoById(int id);
}
