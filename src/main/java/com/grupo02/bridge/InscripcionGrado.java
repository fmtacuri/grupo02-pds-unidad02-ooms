package com.grupo02.bridge;

public class InscripcionGrado extends Inscripcion {

  public InscripcionGrado(InscripcionImpl inscripcionImpl) {
    super(inscripcionImpl);
  }

  @Override
  public boolean controlNivelEstudio() {
    return this.getNivelEstudio().equals(NivelEstudio.GRADO);
  }

}
