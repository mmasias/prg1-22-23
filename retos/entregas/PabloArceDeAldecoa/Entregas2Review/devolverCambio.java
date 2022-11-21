import java.util.Scanner;
public class devolverCambio{
    public static void main(String[] args){
        Scanner entry = new Scanner (System.in);
        System.out.println("-".repeat(30));
        System.out.print("Monto entregado (en euros): ");
        final double MontoEntregado = entry.nextDouble();
        System.out.print("Monto a pagar (en euros): ");
        Double MontoPagar = entry.nextDouble();
        System.out.println("-".repeat(30));
        double diff = MontoEntregado-MontoPagar;
        if (diff>=500){
            int BQUIN = (int)(diff) / 500; System.out.println(BQUIN+" billete(s) de 500.");
            diff-=BQUIN*500;}
        if (diff>=200) {
            int BDOS=(int)(diff) / 200; System.out.println(BDOS+" billete(s) de 200.");
            diff-=BDOS*200;}
        if (diff>=100) {
            int BCIE=(int)(diff) / 100; System.out.println(BCIE+" billete(s) de 100.");
            diff-=BCIE*100;}
        if (diff>=50) {
            int BCINQ=(int)(diff) / 50; System.out.println(BCINQ+" billete(s) de 50.");
            diff-=BCINQ*50;}
        if (diff>=20) {
            int BVEIN=(int)(diff) / 20; System.out.println(BVEIN+" billete(s) de 20.");
            diff-=BVEIN*20;}       
        if (diff>=10) {
            int BDIEZ=(int)(diff) / 10; System.out.println(BDIEZ+" billete(s) de 10.");
            diff-=BDIEZ*10;}
        if (diff>=5) {
            int BCINCO=(int)(diff) / 5; System.out.println(BCINCO+" billete(s) de 5.");
            diff-=BCINCO*5;}     
        if (diff>=2) {
            int M2=(int)(diff) / 2; System.out.println(M2+" moneda(s) de 2.");
            diff-=M2*2;}
        if (diff>=1) {
            int MUNO=(int)(diff) / 1; System.out.println(MUNO+" moneda(s) de 1.");
            diff-=MUNO*1;}
        if (diff>=0.5) {
            int MCINQ=(int)(diff*100) / 50; System.out.println(MCINQ+" moneda(s) de 0,5.");
            diff-=MCINQ*0.5;}
        if (diff>=0.2) {
            int MVEIN=(int)(diff*100) / 20; System.out.println(MVEIN+" moneda(s) de 0,2.");
            diff-=MVEIN*0.2;}  
        if (diff>=0.1) {
            int MDIEZ=(int)(diff*100) / 10; System.out.println(MDIEZ+" moneda(s) de 0,1.");
            diff-=MDIEZ*0.1;}  
        if (diff>=0.05) {
            int MCINCO=(int)(diff*100) / 5; System.out.println(MCINCO+" moneda(s) de 0,05.");
            diff-=MCINCO*0.05;}  
        if (diff>=0.02) {
            int MDOS=(int)(diff*100) / 2; System.out.println(MDOS+" moneda(s) de 0,02.");
            diff-=MDOS*0.02;}    
        if (diff>=0.01) {
            int MUNO=(int)(diff*100) / 1; System.out.println(MUNO+" moneda(s) de 0,01.");
            diff-=MUNO*0.01;}                                                                            
    }      
}