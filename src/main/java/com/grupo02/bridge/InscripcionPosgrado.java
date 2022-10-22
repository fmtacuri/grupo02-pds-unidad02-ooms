package com.grupo02.bridge;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class InscripcionPosgrado extends Inscripcion {

    public InscripcionPosgrado(InscripcionImpl inscripcionImpl) {
        super(inscripcionImpl);
    }

    
    @Override
    public boolean controlNivelEstudio() {
        var retorno = false;
        if(this.getNivelEstudio().equals(NivelEstudio.POSGRADO)){
            retorno=true;
        }
        return retorno;
    }
}
