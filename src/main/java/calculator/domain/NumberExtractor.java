package calculator.domain;

import java.util.Arrays;
import java.util.List;

import calculator.util.NumberChecker;

public class NumberExtractor {

	private static final String OR_SIGN = "|";

	public List<Long> getNumbers(String numberSection, List<String> delimiters) {

		String delimiter = String.join(OR_SIGN, delimiters);
		String[] split = numberSection.split(delimiter);
		Arrays.stream(split)
			.forEach(this::validateNumber);

		return Arrays.stream(split)
			.map(Long::parseLong)
			.toList();
	}

	private void validateNumber(String number) {
		validateNumberFormat(number);
		validatePositiveNumber(number);
	}

	private void validateNumberFormat(String number) {
		if (NumberChecker.isNotNumber(number)) {
			throw new IllegalArgumentException("Not a number: " + number);
		}
	}

	private void validatePositiveNumber(String number) {
		if (NumberChecker.isNegativeNumber(number)) {
			throw new IllegalArgumentException("Negative number: " + number);
		}
	}

}
