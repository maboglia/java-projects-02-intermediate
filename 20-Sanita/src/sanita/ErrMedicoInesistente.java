package sanita;


public class ErrMedicoInesistente extends Exception {
	public ErrMedicoInesistente(){
		super("Medico inesistente");
	}
}
