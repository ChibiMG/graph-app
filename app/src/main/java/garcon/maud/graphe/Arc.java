package garcon.maud.graphe;

import android.graphics.Path;
import android.graphics.Paint;

/**
 * Created by Maud Garçon & Saly Knab on 10/10/2019.
 */

public class Arc {
    // Noeud de départ de l'arc
    private Node noeudDepart;
    // Noeud d'arrivé de l'arc
    private Node noeudArrive;
    //Nom de l'arc
    private String nom;

    //parametres de dessin pour l'arc
    private Paint paint = new Paint();

    //constructeur de l'arc
    public Arc(Node noeudDepart, Node noeudArrive, String nom) {
        //definition du noeud de départ et d'arrivé
        this.noeudDepart = noeudDepart;
        this.noeudArrive = noeudArrive;
        //definition du nom de l'arc
        this.nom = nom;

        //on doit definir une taille et un style dans le paint pour le l'arc soit visible
        paint.setStrokeWidth(6F);
        paint.setStyle(Paint.Style.STROKE);
    }

    // getter et setter -----------------------------------------

    public Node getNoeudDepart() {
        return noeudDepart;
    }

    public Node getNoeudArrive() {
        return noeudArrive;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    //------------------------------------------------------------
}
