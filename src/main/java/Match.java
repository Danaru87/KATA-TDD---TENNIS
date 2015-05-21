import java.util.HashMap;

/**
 * Created by danaru on 21/05/15.
 */
public class Match {
    private Joueur joueur1;
    private Joueur joueur2;


    public Match(Joueur _leJoueur1, Joueur _leJoueur2) {
        joueur1 = _leJoueur1;
        joueur2 = _leJoueur2;

    }

    public Joueur getJoueur1()
    {
        return joueur1;
    }

    public Joueur getJoueur2()
    {
        return joueur2;
    }

    public void GagneLePoint(Joueur _leJoueurGagnant)
    {
        if( _leJoueurGagnant.GetScore().equals("0"))
        {
            _leJoueurGagnant.SetScore("15");
        }
        else if (_leJoueurGagnant.GetScore().equals("15"))
        {
            _leJoueurGagnant.SetScore("30");
        }
        else if (_leJoueurGagnant.GetScore().equals("30"))
        {
            _leJoueurGagnant.SetScore("40");
        }


        else
        {
            Joueur perdant;
            if(_leJoueurGagnant.equals(joueur1))
            {
                perdant = joueur2;

            }
            else
            {
                perdant = joueur1;
            }

            if( perdant.GetScore().equals("40"))
            {
                _leJoueurGagnant.SetScore("ADV");
            }
            else if (perdant.GetScore().equals("ADV"))
            {
                perdant.SetScore("40");
                _leJoueurGagnant.SetScore("40");
            }
            else
            {
                _leJoueurGagnant.SetScore("GAGNE");
                perdant.SetScore("PERDU");
            }
        }
    }

}
