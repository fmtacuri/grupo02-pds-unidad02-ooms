package com.grupo02.bridge;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class InscripcionPresencialImpl implements InscripcionImpl {

  @Override
  public void generarUI() {
    log.info("UI generada para Inscripción presencial");
  }

  @Override
  public void administraNivelEstudio() {
    throw new UnsupportedOperationException(
        "Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

}
