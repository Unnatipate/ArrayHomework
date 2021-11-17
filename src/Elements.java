public class Elements {

    public static void main(String[] args) {
            String[] numArray1 = {"Java", "Scala", "Python"};
            String[] numArray2 = {".Net", "Scala", "Clojure", "Java",
                    "Java Script", "Python"};
            // Outer loop
            for(int i = 0; i < numArray1.length; i++){
                for(int j = 0; j < numArray2.length; j++){// inner loop
                    if(numArray1[i].equals(numArray2[j])){
                        System.out.println(numArray1[i]);
                        break;
                    }
                }
            }
        }
    }
