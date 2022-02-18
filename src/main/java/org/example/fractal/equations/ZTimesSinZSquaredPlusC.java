package org.example.fractal.equations;

import org.example.fractal.lib.ComplexAlgebraicForm;
import org.jetbrains.annotations.NotNull;

public class ZTimesSinZSquaredPlusC implements org.example.fractal.lib.IFractalEquation{
	@Override
	public @NotNull ComplexAlgebraicForm calculateFractalIteration(ComplexAlgebraicForm z, ComplexAlgebraicForm c) {
		return z.times(z.times(z).sin()).plus(c);
	}

	@Override
	public String getDisplayName() {
		return "Z * sin(Z^2) + C";
	}
}
