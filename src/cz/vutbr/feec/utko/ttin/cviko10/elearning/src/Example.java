package cz.vutbr.feec.utko.ttin.cviko10.elearning.src;

public class Example {
    private double[] data;

    public Example(String line) {
        // prevede radek textu na pole realnych cisel
        String[] splitLine = line.split(";");
        data = new double[splitLine.length + 1];
        for (int i = 0; i < splitLine.length; i++) {
            data[i] = Double.parseDouble(splitLine[i]);
        }
    }

    public Example(double[] data2) {
        this.data = data.clone();
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < data.length; i++) {
            res += data[i] + ", ";
        }
        return res;
    }

    public double getLabel() {
        return data[data.length - 2];
    }

    public void setLabel(double value) {
        data[data.length - 2] = value;
    }

    public double getPrediction() {
        return data[data.length - 1];
    }

    public void setPrediction(double value) {
        data[data.length - 1] = value;
    }
}
