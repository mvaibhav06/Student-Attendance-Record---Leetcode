package DSA;

public class StudentAttendanceRecord {
    public static boolean checkRecord(String s){

        int absent = 0;

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == 'A'){
                absent++;
                if (absent>=2) return false;
            } else if (s.charAt(i)=='L') {
                if (i+2 < s.length()){
                    if (s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
