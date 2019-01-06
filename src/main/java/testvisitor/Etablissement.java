package testvisitor;

import java.util.ArrayList;
import java.util.List;

import testvisitor.visitor.DefaultVisitor;

public class Etablissement {

	private String nomEtablissement;

	private List < Classe > classes = new ArrayList <>();

	public Etablissement(final String nomEtablissement) {
		this.nomEtablissement = nomEtablissement;

	}

	public void add(final Classe classe) {
		classes.add(classe);
	}

	public String getNomEtablissement() {
		return nomEtablissement;
	}

	public void accept(final DefaultVisitor visiteur) {
		visiteur.visit(this);
		for (Classe classe : classes) {
			classe.accept(visiteur);
		}
	}

}
