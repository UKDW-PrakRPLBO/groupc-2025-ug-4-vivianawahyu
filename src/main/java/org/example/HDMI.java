package org.example;

public class HDMI extends Colokan{
    public HDMI(int harga, double promisedBandwidth,String merk ) {
        super(merk, promisedBandwidth, harga);
    }
    @Override
    public double getRealBandwidth(){
        double ratio = (double) super.getHarga()/50000;
        if(ratio < 1){
            return ratio * getPromisedBandwidth();
        } else {
            return getPromisedBandwidth();
        }
    }


}