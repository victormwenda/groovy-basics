class DecisionMaking {

    static void main(String... args) {

        def items = 0..5

        for (int item = 0; item < items.size(); item++)
            switch (items.get(item)) {
                case 0: println "Go to origin"
                    break
                case 1: println "Release first Release Candidate"
                    break
                case 2: println "Operate from first Disaster Recovery site"
                    break
                default: println "Deploy to Disaster Recovery site $item"
            }

    }

}
