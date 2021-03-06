package org.wswright.fractal.equations;

import org.wswright.fractal.lib.ComplexAlgebraicForm;
import org.jetbrains.annotations.NotNull;

public class ZSquaredDividesSinCMinusZSquared implements org.wswright.fractal.lib.IFractalEquation{
	@Override
	public @NotNull ComplexAlgebraicForm calculateFractalIteration(ComplexAlgebraicForm z, ComplexAlgebraicForm c) {
		return z.times(z).divides(c.minus(z.times(z)).sin());
	}

	@Override
	public String getDisplayName() {
		return "Z^2 / sin(C - Z^2)";
	}
}
