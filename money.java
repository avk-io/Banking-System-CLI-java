class money {
    public double computePayment(double loanAmt,double rate,double futureValue,int numPeriods){
        double interest = rate/100.0;
        double partiall = Math.pow((1+interest),-numPeriods);
        double denominator = (1-partiall)/interest;
        double answer = (-loanAmt/denominator)-((futureValue*partiall)/denominator);
        return answer;
    }

    public static void main(String[] args){
        money m = new money();
        double payment = m.computePayment(10000, 5, 0, 12);
        System.out.println("Monthly Payment: " + payment);
    }
}

