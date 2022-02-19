import org.wswright.fractal.equations.*;

/**
 * This module contains equations for the jfx-fractal application.
 */
module org.example.fractal.equations {
	requires org.jetbrains.annotations;
	requires org.example.fractal.lib;
	exports org.wswright.fractal.equations;
	opens org.wswright.fractal.equations;
	provides org.wswright.fractal.lib.IFractalEquation with
			MandelBrotFractalEquation,
			ZCubedOverC,
			ZCubedPlusC,
			ZSquaredMinusC,
			ZSquaredOverC,
			ZSquaredPlusZPlusC,
			ZTimesSinZSquaredPlusC,
			ZSquaredDividesSinCMinusZSquared;
}