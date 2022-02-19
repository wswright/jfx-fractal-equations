package org.wswright.fractal.equations;

import org.wswright.fractal.lib.ComplexAlgebraicForm;
import org.wswright.fractal.lib.IFractalEquation;
import org.jetbrains.annotations.NotNull;

public class MandelBrotFractalEquation implements IFractalEquation {
	@Override
	public @NotNull ComplexAlgebraicForm calculateFractalIteration(ComplexAlgebraicForm z, ComplexAlgebraicForm c) {
		return z.times(z).plus(c);
	}

	@Override
	public String getDisplayName() {
		return "Mandelbrot";
	}
}
