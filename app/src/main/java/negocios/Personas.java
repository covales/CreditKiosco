package negocios;

public class Personas {

    private String nombre;
    private  String apellidosP;
    private String apellidoM;
    private String ci;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidosP() {
        return apellidosP;
    }

    public void setApellidosP(String apellidosP) {
        this.apellidosP = apellidosP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



    public void persona(String Nombre, String Apellidop, String ApellidoM, String Ci, String Telefono){

        Nombre    = nombre;
        Apellidop = Apellidop;
        ApellidoM = ApellidoM;
        Ci        =ci;
        Telefono  = telefono;
    }

    public  void registrarPersona(Personas persona){
        if (nombre!="" && apellidosP!="" && apellidoM!="" && ci!="" && telefono!=""){

        }
    }



}
