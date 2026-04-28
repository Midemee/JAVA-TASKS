public class ArrayStart{
    public static void main(String[] args) {
        char [] [] characters = new char [3] [3];
        characters [0] [0] = 'x';
        characters [0] [1] = 'o';
        characters [0] [2] = 'x';

        characters [1] [0] = 'o';
        characters [1] [1] = 'o';
        characters [1] [2] = 'o';

        characters [2] [0] = 'x';
        characters [2] [1] = 'x';
        characters [2] [2] = 'o';

    for(int rows = 0; rows < characters.length; rows++) {
        for(int cols = 0; cols < characters.length; cols++) {
            System.out.print(characters[rows][cols]);
        }
        System.out.println();
    }


    for (int rows = 0; rows < characters.length; rows++) {
        for(int cols = 0; cols < characters.length; cols++) {

            if (characters[rows][cols] == 'x'){
                System.out.print(1);
            }
            else{
                System.out.print(0);
            }

        }

            System.out.println();
    } 
           
           
    }
}
