public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean [] isPrime = new boolean[n+1];
        int i = 2;
        int p = 2;
        while (i < isPrime.length){
        isPrime [i] = true;
        i++;
    }
        while (p <= Math.sqrt(n)){
        if (isPrime[p] == true)
         multiP ( isPrime , p);
         p++;
        }
        System.out.println("Prime numbers up to " + n + ":");
        int primes = numberOfTrue (isPrime);
        int ratio = (primes * 100) / n;
        
        System.out.println("There are " + primes + " primes between 2 and " + n + " (" + ratio + "% are primes)");

    }


// פונקציה הבודקת אילו מספרי מקומות במערך מתחלקים בערך p מלבד המקום הp ומחזירה מערך מעודכן
 public static void multiP (boolean[] arr, int p) {
    int i = 0;
    while (i < arr.length){
        if (arr [i] == true && i !=p && i % p ==0)
            arr [i] = false;
        i++;
    }
}


// מדפיס ומחזיר את מספר התאים במערך שערכם אמת
 public static int numberOfTrue (boolean[] arr) {
    int i = 0;
    int counter = 0;
    while (i < arr.length){
        if (arr [i] == true){
            counter++;
            System.out.println(i);
        }
        
        i++;
    }
    return counter;
}




}