package tn.utm.isi.imd.cont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Contr {
	
	@GetMapping
	String getTest() {
		return "Hello World";
	}

}
