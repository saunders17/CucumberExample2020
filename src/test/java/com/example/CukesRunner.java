package com.example;

import io.cucumber.junit.*;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources"}
)
public class CukesRunner {}
