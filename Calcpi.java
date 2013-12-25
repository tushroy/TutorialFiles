public class Calcpi {
    public static void main(String[] args) {
        double x, y;
        int insideCircle = 0, total = 999999;//Integer.MAX_VALUE; //MAX_VALUE will need a lots of time but will yeild better result
        for (int i = 0; i < total; i++) {
            x = Math.random();
            y = Math.random();
            if (x * x + y * y <= 1){
            	insideCircle++;
            	System.out.print("Calculating pi "+Math.round((100.0*i)/total)+"%\r");
            }
        }
        System.out.println("\n"+(4.0 * insideCircle / total)+" as i calculated");
        System.out.println(Math.PI+" as the system uses");
    }
}