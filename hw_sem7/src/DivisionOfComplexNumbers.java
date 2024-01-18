public class DivisionOfComplexNumbers implements ValueToString{

    private double real;
    private double imaginary;

    public DivisionOfComplexNumbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public DivisionOfComplexNumbers() {

    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public DivisionOfComplexNumbers div(DivisionOfComplexNumbers otherNumbers) {

        double newReal = ((real * otherNumbers.getReal()) + (imaginary * otherNumbers.getImaginary()))
                / (Math.pow(otherNumbers.getReal(), 2) + Math.pow(otherNumbers.getImaginary(), 2));
                
        double newImaginary = ((imaginary * otherNumbers.getReal()) - (real * otherNumbers.getImaginary()))
                / (Math.pow(otherNumbers.getReal(), 2) + Math.pow(otherNumbers.getImaginary(), 2));
        return new DivisionOfComplexNumbers(newReal, newImaginary);
    }

    @Override
    public String answerToString() {
        LoggingOfResults.log(String.format("%.3f", real) + " + " + String.format("%.3f", imaginary) + "i\n");
        return String.format("%.3f", real) + " + " + String.format("%.3f", imaginary) + "i";
    }
}
