class ifj {
    public static void main(String[] args) {

        String[] name = {"fjs", "abhs", "pqr"};
        int[] roll = {1, 2, 3};

        if (name[0].equals("fjs") && roll[0] == 1) {
            System.out.println("Info of fjs");
        }
        else if (name[1].equals("abhs") && roll[1] == 2) {
            System.out.println("Info of abhs");
        }
        else if (name[2].equals("pqr") && roll[2] == 4) {
            System.out.println("Info of pqr");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
