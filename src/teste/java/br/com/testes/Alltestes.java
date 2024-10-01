package br.com.testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.teste.contrato.ContratoServiceTest;




@RunWith(Suite.class)
@SuiteClasses({ClienteServiceTest.class, ContratoServiceTest.class})

public class Alltestes {

}
