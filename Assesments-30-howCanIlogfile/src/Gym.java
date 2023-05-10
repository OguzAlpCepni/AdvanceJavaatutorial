public class Gym {
    private int burpee;
    private int pushup;
    private int situp;
    private int squat;

     Gym(int burpee,int pushup,int situp,int squat){
        this.burpee = burpee;
        this.pushup = pushup;
        this.situp  = situp;
        this.squat  = squat;

    }

    public int getBurpee() {
        return burpee;
    }

    public void setBurpee(int burpee) {
        this.burpee = burpee;
    }

    public int getPushup() {
        return pushup;
    }

    public void setPushup(int pushup) {
        this.pushup = pushup;
    }

    public int getSitup() {
        return situp;
    }

    public void setSitup(int situp) {
        this.situp = situp;
    }

    public int getSquat() {
        return squat;
    }

    public void setSquat(int squat) {
        this.squat = squat;
    }
    public void hareketYap(String hareketTuru,int sayi){
        if (hareketTuru.equals("Burpee")){

            burpeeYap(sayi);

        }
        else if (hareketTuru.equals("Pushup")){
            pushupYap(sayi);


        }
        else if (hareketTuru.equals("Situp")){
            situpYap(sayi);


        }
        else if (hareketTuru.equals("Squat")){
            squatYap(sayi);


        }
        else {
            System.out.println("GeÃ§ersiz Hareket...");
        }

    }
    public void burpeeYap(int sayi) {

        if (burpee == 0) {
            System.out.println("Yapacak burpee kalmadÄ±...");
        }
        if (burpee - sayi < 0) {
            System.out.println("HedeflediÄŸin burpee sayÄ±sÄ±nÄ± geÃ§tin.Tebrikler!");
            burpee = 0;
            System.out.println("Kalan Burpee : " + burpee);

        }
        else {

            burpee -= sayi;

            System.out.println("Kalan Burpee SayÄ±sÄ± : " + burpee);

        }


    }
    public void pushupYap(int sayi) {

        if (pushup == 0) {
            System.out.println("Yapacak pushup kalmadÄ±...");
        }
        if (pushup - sayi < 0) {
            System.out.println("HedeflediÄŸin pushup sayÄ±sÄ±nÄ± geÃ§tin.Tebrikler!");
            pushup = 0;
            System.out.println("Kalan Pushup : " + pushup);

        }
        else {

            pushup -= sayi;

            System.out.println("Kalan Pushup SayÄ±sÄ± : " + pushup);

        }


    }
    public void situpYap(int sayi) {

        if (situp == 0) {
            System.out.println("Yapacak Situp  kalmadÄ±...");
        }
        if (situp - sayi < 0) {
            System.out.println("HedeflediÄŸin situp sayÄ±sÄ±nÄ± geÃ§tin.Tebrikler!");
            situp = 0;
            System.out.println("Kalan Situp : " + situp);

        }
        else {

            situp -= sayi;

            System.out.println("Kalan Situp SayÄ±sÄ± : " + situp);

        }


    }
    public void squatYap(int sayi) {

        if (squat == 0) {
            System.out.println("Yapacak squat kalmadÄ±...");
        }
        if (squat - sayi < 0) {
            System.out.println("HedeflediÄŸin squat sayÄ±sÄ±nÄ± geÃ§tin.Tebrikler!");
            squat = 0;
            System.out.println("Kalan Squat : " + squat);

        }
        else {

            squat -= sayi;

            System.out.println("Kalan Squat SayÄ±sÄ± : " + squat);

        }


    }
    public boolean idmanBittiMi() {

        return (burpee == 0 ) && (pushup == 0 ) && (situp == 0 ) && (squat == 0 );

    }

}
