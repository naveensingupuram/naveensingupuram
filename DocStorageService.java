package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Doc;
//import com.example.demo.DocRepository;

@Service
public class DocStorageService {
  @Autowired
  private DocRepo docRepository;
  
  public Doc saveFile(MultipartFile files,String papertitle,String authername,String dept,String auther_mail,String address,String journelname,String country) {
	 // Doc o=new Doc();
	  Doc o=new Doc();
	  String docname = files.getOriginalFilename();
	  try {
		
		//  System.out.println("only 3");
		
		  
		  Doc doc2 = new Doc(docname,files.getContentType(),papertitle,authername,auther_mail,address,journelname,country,files.getBytes(),dept);
		return docRepository.save(doc2);
		  
		    
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  o.setPapertitle(papertitle);
		o.setAuthername(authername);
		o.setAuther_mail(auther_mail);
		o.setAddress(address);
		o.setJournelname(journelname);
		o.setCountry(country);
		o.setDept(dept);
		System.out.println("save working");
		//docRepository.save(o);
	  
	  return docRepository.save(o);
  }
  public Optional<Doc> getFile(Integer fileId) {
	  return docRepository.findById(fileId);
  }
  public List<Doc> getFiles(){
	  return docRepository.findAll();
  }
public List<Doc> findByPapertitle(String papertitle) {

	return docRepository.findByPapertitle(papertitle);
}
//public List<Doc> findByAuthername(String authername) {
//	
//	return docRepository.findByAuthername(authername);
//}
public List<Doc> findByJournelname(String journelname) {
	// TODO Auto-generated method stub
	return docRepository.findByJournelname(journelname);
}
//public List<Doc> findByDept(String dept) {
//	// TODO Auto-generated method stub
//	return docRepository.findByDept(dept);
//}
public Optional<Doc> findAllById(int id) {
	// TODO Auto-generated method stub
	return docRepository.findAllById(id);
}
}