package org.example.fractal.equations;

import org.example.fractal.lib.ComplexAlgebraicForm;
import org.jetbrains.annotations.NotNull;

public class ZSquaredDividesSinCMinusZSquared implements org.example.fractal.lib.IFractalEquation{
	@Override
	public @NotNull ComplexAlgebraicForm calculateFractalIteration(ComplexAlgebraicForm z, ComplexAlgebraicForm c) {
		return z.times(z).divides(c.minus(z.times(z)).sin());
	}

	@Override
	public String getDisplayName() {
		return "Z^2 / sin(C - Z^2)";
	}
}
