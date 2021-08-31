package com.sysco.obte.cucumber;

import com.sysco.obte.DpfServiceApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = DpfServiceApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
