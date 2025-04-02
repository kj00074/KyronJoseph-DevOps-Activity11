package edu.westga.comp4420.junit_sample.test.model.telephone_checker;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

import edu.westga.comp4420.junit_sample.model.TelephoneChecker;

class TestIdentifySpam {
	
	@ParameterizedTest
	@CsvSource({"9999999999, true", "9990000000, true", "9000000000, true", "8888888888, true", "8000000000, true", "9111111111, true", "4111111111, true"})
	void test(long number, boolean expectedResult) {
		TelephoneChecker checker = new TelephoneChecker();
		
		boolean result = checker.verifyNumber(number);
		
		assertEquals(expectedResult, result, "checking if number(" + number + ") was reported as valid");
	}

}
