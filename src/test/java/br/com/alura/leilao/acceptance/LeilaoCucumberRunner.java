package br.com.alura.leilao.acceptance;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//ESSA CLASSE FAZ A INTEGRACAO ENTRE CUCUMBER E JUNIT

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features") //, tags = "@leilao"
public class LeilaoCucumberRunner {
	

}
