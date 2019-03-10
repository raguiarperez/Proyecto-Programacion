
package Documentación;

import java.io.Serializable;




/**
 * @author Rafa y Edu
 */
public class Seguros implements Serializable{
    private String nPoliza;
    private String nomCompania;
    private String matricula;
    

    public Seguros(String nPoliza, String nomCompania, String matricula) {
        this.nPoliza = nPoliza;
        this.nomCompania = nomCompania;
        this.matricula = matricula;
    }

    public Seguros(){
        
    }

    public String getnPoliza() {
        return nPoliza;
    }

    public void setnPoliza(String nPoliza) {
        this.nPoliza = nPoliza;
    }


    public String getNomCompania() {
        return nomCompania;
    }

    public void setNomCompania(String nomCompañia) {
        this.nomCompania = nomCompañia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }




    @Override
    public String toString() {
        return  nPoliza +" "+ nomCompania +" "+ matricula;
    }

    


    
}
