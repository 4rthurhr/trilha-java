package Model;

public enum GameStatusEnum {
	
	NON_STARTED("Não iniciado"),
	INCOMPLETE("Incompleto"),
	COMPLETE("Completo");
	
	public String label;
	
	  GameStatusEnum(final String label){
	        this.label = label;
	    }

	    public String getLabel() {
	        return label;
	    }
}
