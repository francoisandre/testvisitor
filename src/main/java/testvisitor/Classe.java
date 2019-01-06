package testvisitor;

import java.util.ArrayList;
import java.util.List;

import testvisitor.visitor.DefaultVisitor;

public class Classe {

	private String nomClasse;

	public Classe(final String nomClasse) {
		this.nomClasse = nomClasse;
	}

	private List < Eleve > eleves = new ArrayList <>();

	public void addEleve(final Eleve eleve) {
		eleves.add(eleve);
	}

	public void accept(final DefaultVisitor visiteur) {
		visiteur.visit(this);
		for (Eleve eleve : eleves) {
			eleve.accept(visiteur);
		}
	}

}
