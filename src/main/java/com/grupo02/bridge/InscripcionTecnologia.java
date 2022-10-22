package com.grupo02.bridge;

public class InscripcionTecnologia extends Inscripcion {

  public InscripcionTecnologia(InscripcionImpl inscripcionImpl) {
    super(inscripcionImpl);
  }

  @Override
  public boolean controlNivelEstudio() {
    return this.getNivelEstudio().equals(NivelEstudio.TECNOLOGIA);
  }

}
