class Five {
    public static void main(String ...args) {
        byte i = 0;

        do {
            if (i == 9) {
                break;
            }

            System.out.println(++i);

            if (i == 6) {
                continue;
            }

            System.out.println("Llego al final de la ronda: " + i);
        } while (i < 10);
    }
}