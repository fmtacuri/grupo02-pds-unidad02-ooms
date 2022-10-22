package com.grupo02;

import com.grupo02.bridge.InscripcionGrado;
import com.grupo02.bridge.InscripcionPresencialImpl;
import com.grupo02.bridge.NivelEstudio;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class PdsUnidad02OomsApplication {

  public static void main(String[] args) {
    SpringApplication.run(PdsUnidad02OomsApplication.class, args);
    bridge();
  }

  public static void bridge() {
    log.info("Bridge");
    var inscripcion1 = new InscripcionGrado(new InscripcionPresencialImpl());
    inscripcion1.setNivelEstudio(NivelEstudio.GRADO);
    if (inscripcion1.controlNivelEstudio()) {
      inscripcion1.inscribir();
    } else {
      log.info("No es posible inscribir al estudiante");
    }
  }

}
