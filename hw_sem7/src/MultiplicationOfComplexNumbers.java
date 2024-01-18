public class MultiplicationOfComplexNumbers implements ValueToString {
    
    private double real;
    private double imaginary;

    public MultiplicationOfComplexNumbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public MultiplicationOfComplexNumbers() {

    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public MultiplicationOfComplexNumbers multiply(MultiplicationOfComplexNumbers otherNumbers) {
        double newReal = real * otherNumbers.getReal() - imaginary * otherNumbers.getImaginary();
        double newImaginary = imaginary * otherNumbers.getReal() + real * otherNumbers.getImaginary();
        return new MultiplicationOfComplexNumbers(newReal, newImaginary);
    }

    @Override
    public String answerToString() {
        LoggingOfResults.log(real + " + " + imaginary + "i\n");
        return real + " * " + imaginary + "i";
    }
}
