package Modelo;

import java.util.List;

public interface IRepositorioResultados {

	void guardarResultados(Resultado resultado);

	List<Resultado> obtenerHistorial();

}