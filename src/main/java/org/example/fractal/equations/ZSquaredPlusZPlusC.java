package org.example.fractal.equations;

import org.example.fractal.lib.ComplexAlgebraicForm;
import org.example.fractal.lib.IFractalEquation;
import org.jetbrains.annotations.NotNull;

public class ZSquaredPlusZPlusC implements IFractalEquation {
	@Override
	public @NotNull ComplexAlgebraicForm calculateFractalIteration(ComplexAlgebraicForm z, ComplexAlgebraicForm c) {
		return z.times(z).plus(z).plus(c);
	}

	@Override
	public String getDisplayName() {
		return "Z^2 + Z + C";
	}
}
