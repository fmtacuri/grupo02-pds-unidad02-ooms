package com.grupo02.bridge;

import lombok.extern.log4j.Log4j2;

@Log4j2
public abstract class Inscripcion {

  private final InscripcionImpl inscripcionImpl;
  private NivelEstudio nivelEstudio;

  Inscripcion(InscripcionImpl inscripcionImpl) {
    this.inscripcionImpl = inscripcionImpl;
  }

  public void inscribir() {
    log.info("Estudiante inscrito...");
  }

  public abstract boolean controlNivelEstudio();

  public NivelEstudio getNivelEstudio() {
    return nivelEstudio;
  }

  public void setNivelEstudio(NivelEstudio nivelEstudio) {
    this.nivelEstudio = nivelEstudio;
  }
}
