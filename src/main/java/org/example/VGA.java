package org.example;

public class VGA extends Colokan{
    public VGA(int harga, double promisedBandwidth,String merk ) {
        super(merk, promisedBandwidth, harga);
    }
    @Override
    public double getRealBandwidth(){
        double ratio = (double) super.getHarga()/30000;

        if(ratio < 1){
            return ratio * getPromisedBandwidth();
        } else {
            return getPromisedBandwidth();
        }
    }


}