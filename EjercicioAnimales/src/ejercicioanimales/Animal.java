package ejercicioanimales;

public abstract class Animal {
    
    protected String Sonidos;
    protected String Alimentos;
    protected String Habitat;
    protected String NombreCientifico;
    
    public abstract String getNombreCientifico();
    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String getHabitat();
    
}
