package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Doc;
import com.example.demo.repository.DocRepo;
import com.example.demo.repository.DocStorageService;

@RestController
@CrossOrigin("http://localhost:3000")
public class DocController {

	
	@Autowired
	private DocRepo repo;
	@Autowired 
	private DocStorageService docStorageService;
	
	  @GetMapping("/getall")
	    List<Doc> getAlldata() {
		 
	        return repo.findAll();
	    }
	  
	  
	  @GetMapping("/getall/{id}")
	    Optional<Doc> getDocById(@PathVariable int id) {
		  System.out.println("find by id");
	        return repo.findById(id);
	    }
	  
	  
	  
	  
	  @PostMapping("/uploadFiles")
		
		public Doc uploadMultipleFiles(@RequestBody MultipartFile files,
				@RequestParam("papertitle") String papertitle,
				@RequestParam("authername") String authername,
				@RequestParam("auther_mail") String auther_mail,
				@RequestParam("address") String address,
				@RequestParam("journelname") String journelname,
				@RequestParam("dept") String dept,
				@RequestParam("country") String country) {
			
			System.out.println("uploading data ");
		  return docStorageService.saveFile(files,papertitle,authername,auther_mail,address,journelname,dept,country);
				
			 
	}
	  
	  @GetMapping("/downloadFile/{fileId}")
	  
		public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Integer fileId){
		 System.out.println("download link");
			Doc doc = docStorageService.getFile(fileId).get();
			return ResponseEntity.ok()
					.contentType(MediaType.parseMediaType(doc.getDocType()))
					.header(HttpHeaders.CONTENT_DISPOSITION,"attachment:filename=\""+doc.getDocName()+"\"")
					.body(new ByteArrayResource(doc.getData()));
	  
	  	  
}
	  
	  
	  @RequestMapping("/aut/{authername}")
	 // /{authername}
	  List<Doc> findByAuthername(@PathVariable  String authername) {
		  System.out.println("find a authername");
			return repo.findAllByAuthername(authername);
		
		}
	  

	  @RequestMapping("/journelname/{journelname}")
	 // /{authername}
	  List<Doc> findByJournelname(@PathVariable  String journelname) {
		  System.out.println("find a journalname");
			return repo.findAllByJournelname(journelname);
		
		}
	  
	  @RequestMapping("/papertitle/{papertitle}")
		 // /{authername}
		  List<Doc> findByPapertitle(@PathVariable  String papertitle) {
			  System.out.println("find a papertitle");
				return repo.findAllByPapertitle(papertitle);
			
			}
	  
	  
	  @RequestMapping("/country/{country}")
		 // /{authername}
		  List<Doc> findByCountry(@PathVariable  String country) {
			  System.out.println("find a country");
				return repo.findAllByCountry(country);
			
			}

	  
		@GetMapping("/dept/{dept}")
		
			List<Doc> findByDept(@PathVariable  String dept) {
			return repo.findAllByDept(dept);
		}
		
		
		
//		@RequestMapping("del/{id}")    //this mapping is used to delete user  ///alien/{aid}//alien
//		public String delet(@PathVariable int id) {
//			Doc a=repo.getOne(id);
//			return repo.delete(a);
//		}
//		
		
		@GetMapping("maps")
		 List<Object> maps() {
	return repo.getCountByCountry();
			
			
	}
		
//		 List<Object> maps() {
//				//return repo.getCountByCountry();
//					Gson gson=new Gson();
//					List<Object> jso=gson.Json(repo.getCountByCountry());
//					return jso;		
					
		
		
		
	  
	  
}
