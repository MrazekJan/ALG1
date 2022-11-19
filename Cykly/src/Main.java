public class Main {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
            int increment = 2;

            int flag_length = 45; // minimum 24
            int flag_height = flag_length / 4;
            int blue_stars = flag_length / 10;

            boolean red = false;

            String line ="";
            String char_to_print = "[]";
            for(int i = 0; i < flag_height; i++)
            {
                for (int j = 0; j < flag_length; j++) {

                    if (i > flag_height / 2 - 1){

                        if(blue_stars > j +increment)
                        {
                            line += ANSI_BLUE+ char_to_print + ANSI_RESET;
                        }
                        else {
                            red = true;
                            line += ANSI_RED + char_to_print + ANSI_RESET;
                        }
                    }

                    else{
                        if(blue_stars > j)
                        {
                            line += ANSI_BLUE+ char_to_print + ANSI_RESET;
                        }
                        else
                            line += ANSI_WHITE + char_to_print + ANSI_RESET;
                    }
                }

                System.out.println(line);
                line = "";

                if(red == false){
                    blue_stars+=increment;
                }
                else{
                    blue_stars-=increment;
                }
            }
        }
    }