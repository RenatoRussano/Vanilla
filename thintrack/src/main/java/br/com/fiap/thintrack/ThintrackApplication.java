package br.com.fiap.Thintrack.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class ThintrackintrackApplication {

	public static void main(String[]args) {
		SpringApplication.run(ThintrackApplication.class, args);
	}

	@RequestMapping
	@ResponseBody
	public String home() {
		return "ThinTrack";		
	}	
}
