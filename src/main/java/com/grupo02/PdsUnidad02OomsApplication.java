package com.grupo02;

import com.grupo02.bridge.InscripcionGrado;
import com.grupo02.bridge.InscripcionPresencialImpl;
import com.grupo02.bridge.NivelEstudio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PdsUnidad02OomsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdsUnidad02OomsApplication.class, args);
		bridge();
	}

	public static void bridge(){
		System.out.println("Bridge");
		var inscripcion1 = new InscripcionGrado(new InscripcionPresencialImpl());
		inscripcion1.setNivelEstudio(NivelEstudio.GRADO);
		if(inscripcion1.controlNivelEstudio()){
			inscripcion1.inscribir();
		}
		else{
			System.out.println("No es posible inscribir al estudiante");
		}


	}

}
