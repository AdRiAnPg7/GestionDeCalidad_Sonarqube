package JUnit;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Casosdeuso.*;
import Persistencia.RegistrosSQL;

class TestCargarUsuarios {

	@Test
	void obtenerCasoDeUso() {
		CargarUsuarios cargarUsuarios= new CargarUsuarios(new RegistrosSQL());
		assertEquals("CasoDeUsoCargarUsuarios", cargarUsuarios.obtenerCasoDeUso());
	}

}