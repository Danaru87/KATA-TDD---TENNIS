
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by danaru on 21/05/15.
 */
public class TennisTests
{
    Joueur leJoueur1 = new Joueur("Arnaud", "Da Silva");
    Joueur leJoueur2 = new Joueur("Maxime", "Lamarche");
    Match leMatch = new Match (leJoueur1, leJoueur2);

    @Test
    public void Joueur1_0_Joueur2_0 ()
    {
        Assert.assertEquals("0", leMatch.getJoueur1().GetScore());
        Assert.assertEquals("0", leMatch.getJoueur2().GetScore());
    }

    @Test
    public void Joueur1_15_Joueur2_0()
    {
        leMatch.GagneLePoint(leJoueur1);
        Assert.assertEquals("15", leMatch.getJoueur1().GetScore());
        Assert.assertEquals("0", leMatch.getJoueur2().GetScore());

    }

    @Test
    public void Joueur1_30_Joueur2_0()
    {
        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur1);
        Assert.assertEquals("30", leMatch.getJoueur1().GetScore());
        Assert.assertEquals("0", leMatch.getJoueur2().GetScore());
    }

    @Test
    public void Joueur1_40_Joueur2_0()
    {
        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur1);

        Assert.assertEquals("40", leMatch.getJoueur1().GetScore());
        Assert.assertEquals("0", leMatch.getJoueur2().GetScore());
    }

    @Test
    public void Joueur1_ADV_Joueur2_40()
    {
        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur1);

        leMatch.GagneLePoint(leJoueur2);
        leMatch.GagneLePoint(leJoueur2);
        leMatch.GagneLePoint(leJoueur2);

        leMatch.GagneLePoint(leJoueur1);

        Assert.assertEquals("ADV", leMatch.getJoueur1().GetScore());
        Assert.assertEquals("40", leMatch.getJoueur2().GetScore());

    }

    @Test
    public void Joueur2_ADV_Joueur1_40()
    {
        leMatch.GagneLePoint(leJoueur2);
        leMatch.GagneLePoint(leJoueur2);
        leMatch.GagneLePoint(leJoueur2);

        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur1);

        leMatch.GagneLePoint(leJoueur2);

        Assert.assertEquals("ADV", leMatch.getJoueur2().GetScore());
        Assert.assertEquals("40", leMatch.getJoueur1().GetScore());

    }

    @Test
    public void Joueur1_PerdADV()
    {
        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur1);

        leMatch.GagneLePoint(leJoueur2);
        leMatch.GagneLePoint(leJoueur2);
        leMatch.GagneLePoint(leJoueur2);

        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur2);

        Assert.assertEquals("40", leMatch.getJoueur1().GetScore());
        Assert.assertEquals("40", leMatch.getJoueur2().GetScore());
    }

    @Test
    public void JoueurGagneJeu()
    {
        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur1);

        Assert.assertEquals("GAGNE", leMatch.getJoueur1().GetScore());
        Assert.assertEquals("PERDU", leMatch.getJoueur2().GetScore());

    }
    @Test
    public void JoueurGagneJeuParADV()
    {
        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur1);

        leMatch.GagneLePoint(leJoueur2);
        leMatch.GagneLePoint(leJoueur2);
        leMatch.GagneLePoint(leJoueur2);

        leMatch.GagneLePoint(leJoueur1);
        leMatch.GagneLePoint(leJoueur1);

        Assert.assertEquals("GAGNE", leMatch.getJoueur1().GetScore());
        Assert.assertEquals("PERDU", leMatch.getJoueur2().GetScore());

    }
}
