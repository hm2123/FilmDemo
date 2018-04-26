import javax.swing.*;

public class Film {
    private String name;
    private String director;
    private int releaseYear;

    public Film(String name, String director, int releaseYear){
        this.name = name;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public String getDirector(){
        return director;
    }

    public void setReleaseYear(int releaseYear){
        if(releaseYear > 1890 ){
            this.releaseYear = releaseYear;
        }

        else {
            JOptionPane.showMessageDialog ( null,"The release year you entered is invalid. Please enter a valid release year: ","Error!",3);
        }
    }
    public int getReleaseYear(){
        return releaseYear;
    }

    public boolean equals(Film film1,Film film2) {
        if (film1.getName ().equals ( film2.name) &&
                film1.getDirector ().equals ( film2.getDirector () ) &&
                film1.releaseYear == film2.releaseYear)   {
            return true;}
        else{
            return false;
        }
    }

}