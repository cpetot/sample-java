package io.github.cpetot.sample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SampleTest {

	@Test
	public void always_passing_test() {
		assertThat(new Sample()).isNotNull();
	}
}