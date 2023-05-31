package indra.talentCamp.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import banco.*;

class CuentaBancariaTests {
	
	Cliente demoCliente;
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Antes de ejectuar todos los tests");
	}
	
	@BeforeEach
	public void before() {
		System.out.println("Antes de ejecutar un unit test");
		
		demoCliente = Cliente.builder()
				.setIdentificador(123)
				.setNombre("Jane")
				.setApellido("Doe")
				.build();
	}

	@Test
	void ShouldAutoincrementCuentaBancariaNumero() {

		Banco banco = new Banco();		
//		Cliente demoCliente = new Cliente(123, "Jane", "Doe");
		/*Cliente demoCliente = Cliente.builder()
								.setIdentificador(123)
								.setNombre("Jane")
								.setApellido("Doe")
								.build(); */
		
		CuentaBancaria cuentaUno = banco.crearCuentaCorriente(demoCliente);
		CuentaBancaria cuentaDos = banco.crearCajaDeAhorro(demoCliente);
		
		assertTrue(cuentaUno.getNumeroCuenta() < cuentaDos.getNumeroCuenta(), 
				"Las dos cuentas no son correlaciones");
		assertEquals(1,  cuentaUno.getNumeroCuenta());
		assertEquals(2,  cuentaDos.getNumeroCuenta(), "La cuenta dos no tiene número dos");
	}
		
	@Test
	void ShouldNotBeAbleToExtractMoreFromCajaDeAhorro() {
		Banco banco = new Banco();
		/*Cliente demoCliente = Cliente.builder()
				.setIdentificador(123)
				.setNombre("Jane")
				.setApellido("Doe")
				.build(); */
		
		CuentaBancaria cajaDeAhorro = banco.crearCajaDeAhorro(demoCliente);
		cajaDeAhorro.depositar(100);
		
		assertTrue(cajaDeAhorro.getSaldo() > 0);		
		assertThrows(SaldoInsuficienteException.class, () -> cajaDeAhorro.extraer(200));	
	}	
	
	@Test
	void ShouldExtraxtCorrectly() throws SaldoInsuficienteException {
		Banco banco = new Banco();
		/*Cliente demoCliente = Cliente.builder()
				.setIdentificador(123)
				.setNombre("Jane")
				.setApellido("Doe")
				.build(); */
		
		CuentaBancaria cajaDeAhorro = banco.crearCajaDeAhorro(demoCliente);
		cajaDeAhorro.depositar(100);
		cajaDeAhorro.extraer(50);
		
		assertEquals(50,  cajaDeAhorro.getSaldo());		
	}
	
	
}