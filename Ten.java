class Ten {
    public static void main(String ...args) {

        int numbers[] = new int[10];

    // * Mas eficiente/rapido
        for(int numberIndex = 0; numberIndex < numbers.length; numberIndex++) {
            numbers[numberIndex] = (int) (Math.random() * 10);
        }

    // * Menos eficiente/rapido
        for(int number : numbers) {
            System.out.print(number + " ");
        }

    // * Ordenamiento con el metodo burbuja:
        // * La formula dice que debemos recorrer el array las mismas veces que la cantidad de elementos que contenga menos 1:
        // ! for(int v = 0; v < numbers.length - 1; v++) {
        // * Yo prefiero hacerlo asi:
        for(int round = 1; round < numbers.length; round++) {
            // * Para recorrer el array comparando 2 elementos sin dar error, debemos restarle 1 numbers la cantidad de elementos del array, ya que el ultimo elemento no podra compararse con otro.
            for(int numberIndex = 0; numberIndex < numbers.length - 1; numberIndex++) {
                if(numbers[numberIndex] > numbers[numberIndex + 1]) {
                    int temp = numbers[numberIndex];
                    numbers[numberIndex] = numbers[numberIndex + 1];
                    numbers[numberIndex + 1] = temp;
                }
            }
        }

        for(int number : numbers) {
            System.out.print(number + " ");
        }
    }
}