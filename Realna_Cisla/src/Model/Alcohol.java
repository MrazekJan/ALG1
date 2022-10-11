package Model;

public class Alcohol { //úloha 13

    public static void Calculate(double objem_napoje , double podil_alkoholu, double telesna_hmotnost, String pohlaví){
        final double rho = 0.8;
        final double r = (pohlaví == "m") ? 0.7 : 0.6;
        final double beta = (pohlaví == "m") ? 0.1 : 0.085;

        var met = (objem_napoje * podil_alkoholu * rho) /100; //hmotnost alkoholu v g
        var prom = (met) / (telesna_hmotnost * r); //promile hned po konzumaci
        var uet = telesna_hmotnost * beta;
    }
}
