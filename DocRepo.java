package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Doc;

public interface DocRepo  extends JpaRepository<Doc,Integer>{

	List<Doc> findByPapertitle(String papertitle);

	List<Doc> findAllByAuthername(String authername);

	List<Doc> findByJournelname(String journelname);

	List<Doc> findAllByDept(String dept);

	Optional<Doc> findAllById(int id);

//	
//	@Query("SELECT COUNT(dept),dept from docs GROUP BY dept")
//	  List<Doc> maps();
////	
	
	@Query(value="SELECT dept,count(*) As count FROM docs GROUP BY dept",
			nativeQuery=true)
	 List<Object> getCountByCountry();

	List<Doc> findAllByJournelname(String journelname);

	List<Doc> findAllByPapertitle(String papertitle);

	List<Doc> findAllByCountry(String country);
}
