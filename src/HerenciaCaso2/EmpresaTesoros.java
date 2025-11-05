package HerenciaCaso2;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTesoros extends Empresa {
    private List<Departamento> departamentos;
    public EmpresaTesoros(String nombre) {
        super(nombre);
        this.departamentos = new ArrayList<>();
        this.departamentos.add(new Departamento("Adquisiciones"));
        this.departamentos.add(new Departamento("Ventas"));
        this.departamentos.add(new Departamento("Producción"));
        this.departamentos.add(new Departamento("Logística"));
        this.departamentos.add(new Departamento("Finanzas"));
    }
    public Departamento getDepartamento(){
        return this.departamentos.get(0);
    }

}
