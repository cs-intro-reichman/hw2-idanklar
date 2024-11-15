public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        int hours = Integer.parseInt(time.charAt(0) + "" + time.charAt(1));
        int minutes = Integer.parseInt(time.charAt(3) + "" + time.charAt(4));
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);
        // //System.out.println("hours: " + hours + " minutes: " + minutes + " min to add: " + minutesToAdd + 
        //                     " new hours: " + newHours + " new minutes: " + newMinutes);
            System.out.printf("%02d:%02d %n", newHours, newMinutes);

        
        
        
    }
}
