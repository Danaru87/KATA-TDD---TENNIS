/**
 * Created by danaru on 21/05/15.
 */
public class Joueur {
    private String nom;
    private String prenom;
    private String score;

    public Joueur(String _prenom, String _nom) {
        score = "0";
    }

    public String GetScore() {
        return score;
    }

    public void SetScore(String _score) {
        score = _score;
    }
}
