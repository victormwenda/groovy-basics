class Ranges {
    static void main (String...args){

        def items = 0..100

        for (int item = 0; item < items.size(); item++) {
            println(items.get(item))
        }

    }
}
