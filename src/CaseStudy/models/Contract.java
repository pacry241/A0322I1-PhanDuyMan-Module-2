package CaseStudy.models;

public class Contract {
    private int numContract;
    private int codeBooking;
    private long depoist,totalPayment;

    public Contract() {
    }

    public Contract(int numContract, int codeBooking, long depoist, long totalPayment) {
        this.numContract = numContract;
        this.codeBooking = codeBooking;
        this.depoist = depoist;
        this.totalPayment = totalPayment;
    }

    public int getNumContract() {
        return numContract;
    }

    public void setNumContract(int numContract) {
        this.numContract = numContract;
    }

    public int getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(int codeBooking) {
        this.codeBooking = codeBooking;
    }

    public long getDepoist() {
        return depoist;
    }

    public void setDepoist(long depoist) {
        this.depoist = depoist;
    }

    public long getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(long totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numContract=" + numContract +
                ", codeBooking=" + codeBooking +
                ", depoist=" + depoist +
                ", totalPayment=" + totalPayment +
                '}';
    }
}
