package testvisitor;

import java.util.ArrayList;
import java.util.List;

import testvisitor.visitor.DefaultVisitor;

public class Academie {

	private String nomAcademie;

	public Academie(final String nomAcademie) {
		this.nomAcademie = nomAcademie;
	}

	private List < Etablissement > etablissements = new ArrayList <>();

	public void add(final Etablissement etablissement) {
		etablissements.add(etablissement);
	}

	public void accept(final DefaultVisitor visiteur) {
		visiteur.visit(this);
		for (Etablissement etablissement : etablissements) {
			etablissement.accept(visiteur);
		}
	}

}
