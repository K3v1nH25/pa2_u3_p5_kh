package com.example.demo.funcional;

public class PersonaSupplierImpl implements IPersonaSupplier<String> {

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		String cedula = "1724693112";
		cedula = cedula + "provincia";
		return cedula;
	}

}
