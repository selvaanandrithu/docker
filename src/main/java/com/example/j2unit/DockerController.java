package com.example.j2unit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DockerController {
	
	@GetMapping("/ger")
	public String getval()
	{
		return "charm beauty";
	}
}
