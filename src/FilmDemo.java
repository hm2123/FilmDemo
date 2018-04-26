import javax.swing.JOptionPane;
import java.lang.String;


public class FilmDemo {


    public static void main(String[] args) {

        Film[] films = new Film[10];
        String tempName = "";
        String tempDirector = "";
        int tempYear = 2006;
        int numberOfFilms = 0;
        int menuOption = 0;
        boolean sameFilm;
        Film tempFilm = new Film ( "hi", "hello", 2018 );

        while (menuOption != 3) {
            menuOption = Integer.parseInt ( JOptionPane.showInputDialog ( "MENU" + "\n" + "Please enter 1 to add a film to the directory." + "\n" +
                    "Please enter 2 view films in the directory." + "\n" + "Please enter 3 to quit." ) );
            if (menuOption == 1) {
                if (numberOfFilms < 11) {
                    tempFilm = new Film ( "help", "james", 1997 );
                    tempName = JOptionPane.showInputDialog ( "Enter the name of the film you want to add: " );
                    tempFilm.setName ( tempName );
                    tempDirector = JOptionPane.showInputDialog ( "Enter the name of the director of the film you wish to add: " );
                    tempFilm.setDirector ( tempDirector );
                    tempYear = Integer.parseInt ( JOptionPane.showInputDialog ( "Enter the release year of the movie you wish to add: " ) );
                    tempFilm.setReleaseYear ( tempYear );
                    sameFilm = false;

                    for (int i = 0; i < numberOfFilms; i++) {
                        if (tempFilm.equals ( tempFilm, films[i] )) {
                            sameFilm = true;
                        }
                    }
                    if (sameFilm) {
                        JOptionPane.showMessageDialog ( null, "The film you have entered is already in the directory. Please enter another one.", "Error!", 1 );
                    } else {
                        films[numberOfFilms] = tempFilm;
                        numberOfFilms++;
                    }
                    } else {
                    JOptionPane.showMessageDialog ( null, "You have gone over the directory limit!", "Error!", 1 );
                    }
            } else if (menuOption == 2) {
                    for (int i = 0; i < numberOfFilms; i++) {
                    JOptionPane.showMessageDialog ( null,films[i].getName ()+"\n"+films[i].getDirector ()+"\n"+films[i].getReleaseYear () , "Films Directory!", 2 );
                }
            }
        }
    }

}
