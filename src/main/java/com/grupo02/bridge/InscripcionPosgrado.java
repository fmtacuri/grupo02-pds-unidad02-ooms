package com.grupo02.bridge;

public class InscripcionPosgrado extends Inscripcion {

  public InscripcionPosgrado(InscripcionImpl inscripcionImpl) {
    super(inscripcionImpl);
  }

  @Override
  public boolean controlNivelEstudio() {
    return this.getNivelEstudio().equals(NivelEstudio.POSGRADO);
  }
}
