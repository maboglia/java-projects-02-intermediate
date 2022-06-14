package sanita;

import java.util.Collection;

public interface Medico extends Persona {
  public String getMatricola();
  public Collection getPazienti();
}