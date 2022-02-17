class Three {
    public static void main(String ...args) {
        byte age = 19;

        if (age >= 0) {
            if (age < 18) {
                System.out.println("Eres menor de edad");                
            } else if (age <= 100) {
                System.out.println("Eres mayor de edad");
            } else {
                System.out.println("Nadie puede tener una edad mayor a 100");
            }
        } else {
            System.out.println("Nadie puede tener una edad menor que 0");
        }
    }
}