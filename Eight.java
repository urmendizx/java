class Eight {
    public static void main(String ...args) {
        //for each/array
        byte []a = new byte[]{1,2,3,4,5,6,7,8,9,10};
        String []names = new String[]{"Kevin","Angela","Alana"};

        for(byte v : a) {
            System.out.println(v);

        }

        for(String name : names) {
            System.out.println(name);
        }
    }
}