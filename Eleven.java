class Eleven {
    public static void main(String ...args) {

        int numbers[] = new int[10];

        for(int numberIndex = 0; numberIndex < numbers.length; numberIndex++) {
            numbers[numberIndex] = (int) (Math.random() * 10);
        }

        for(int number: numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        int elementToSearch = 5;

        for(int numberIndex = 0; numberIndex < numbers.length; numberIndex++) {
            if(numbers[numberIndex] == elementToSearch) {
                System.out.println("El numero " + elementToSearch + " se encuentra en indice " + numberIndex);
                break;
            }
        }
    }
}