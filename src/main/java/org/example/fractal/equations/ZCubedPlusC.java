package org.example.fractal.equations;

import org.example.fractal.lib.ComplexAlgebraicForm;
import org.example.fractal.lib.IFractalEquation;
import org.jetbrains.annotations.NotNull;

public class ZCubedPlusC implements IFractalEquation {
	@Override
	public @NotNull ComplexAlgebraicForm calculateFractalIteration(ComplexAlgebraicForm z, ComplexAlgebraicForm c) {
			return z.times(z).times(z).plus(c);
	}

	@Override
	public String getDisplayName() {
		return "Z^3 + C";
	}
}
