class Loops {

    static void main(String... args) {

        //while loops
        def count = 0
        while (count < 10) {
            println "Count now is at $count"
            ++count

        }

        //for loops
        for (int i = 0; i < 10; i++) {
            if (i < 5) continue
            println "i now is at $i";
        }

        //for in loops
        def marks = 0..5;
        for (mark in marks) {
            println "printing mark $mark"
        }

    }

}
