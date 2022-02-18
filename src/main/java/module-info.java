import org.example.fractal.equations.*;

module org.example.fractal.equations {
	requires org.jetbrains.annotations;
	requires org.example.fractal.lib;
	exports org.example.fractal.equations;
	opens org.example.fractal.equations;
	provides org.example.fractal.lib.IFractalEquation with
			MandelBrotFractalEquation,
			ZCubedOverC,
			ZCubedPlusC,
			ZSquaredMinusC,
			ZSquaredOverC,
			ZSquaredPlusZPlusC,
			ZTimesSinZSquaredPlusC,
			ZSquaredDividesSinCMinusZSquared;
}