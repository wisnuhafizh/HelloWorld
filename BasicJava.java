public class BasicJava {
    public static void cetakPesan() {
        System.out.println("Selamat Pagi");
        System.out.println("Selamat mendapat pekerjaan");
    }

    public class Candidate{
        //Instance variable
        private String firstName;
        private String lastName;
        private String party;

        //Methods
        public void setFirstName(String fname){
            firstName = fname;
        }
        public String getFirstName(){
            return firstName;
        }
    }

    Candidate candidate1 = new Candidate();
    Candidate candidate2 = new Candidate();


    public static void main() {
        cetakPesan();
        System.out.println("Hell O World");
        System.out.println();

        //Statement

        //How to write in Bracket

        //Reformat

        /*ini adalah
        multiline */
    }
}
