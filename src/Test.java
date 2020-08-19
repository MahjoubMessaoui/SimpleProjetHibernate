import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import dao.Categorie;
import dao.Produit;
import service.Services;

public class Test {

	public static void main(String[] args) {
		// load service
		Services s = new Services();

		// create Produits

		Produit p = new Produit("hp", "qqq", (double) 2200);
		Produit p1 = new Produit("hp1", "qqq1", (double) 1000);
		Produit p2 = new Produit("hp2", "qqq2", (double) 800);
		Produit p3 = new Produit("hp3", "qqq3", (double) 2200);
		Produit p4 = new Produit("hp4", "qqq4", (double) 1200);
		s.addProduit(p);
		s.addProduit(p1);
		s.addProduit(p2);
		s.addProduit(p3);
		s.addProduit(p4);

		// liste Categorie

		Categorie c1 = new Categorie("informatique", "info1", new Date());
		Categorie c2 = new Categorie("mecanique", "meca1", new Date());
		Categorie c3 = new Categorie("electronique", "elect1", new Date());
		Categorie c4 = new Categorie("informatique", "gl", new Date());

		s.addCategorie(c1);
		s.addCategorie(c2);
		s.addCategorie(c3);
		s.addCategorie(c4);

		// retourne un produit by id

		// Produit ps = s.getProduitById(new Long(1));
		// ps.showProduit();
		// // retourne un categorie by id
		// Categorie cc =s.getCategorieById(1L);
		// cc.showCategorie();
		//

		// afficher la liste des produits

		// Iterator<Produit> produit=s.getAllProduits().iterator();
		// while(produit.hasNext()){
		// Produit pe = produit.next();
		// pe.showProduit();
		// }
		//

		// Affectation
		System.out.println("Affectation");
		s.addProduitToCategorie(1L, 1L);
		s.addProduitToCategorie(1L, 2L);
		s.addProduitToCategorie(1L, 3L);
		s.addProduitToCategorie(2L, 1L);
		s.addProduitToCategorie(3L, 1L);
		s.addProduitToCategorie(4L, 2L);

		// retourne un categorie by id
		// Categorie cc =s.getCategorie(1L);
		// System.out.println("info de Cat:");
		// cc.showCategorie();
		// System.out.println("produit de cat:");
		//
		// Iterator<Produit> pro=cc.getProduits().iterator();
		// while(pro.hasNext()){
		// Produit pm=pro.next();
		// pm.showProduit();
		// }

		Produit pp = s.getProduit(1L);
		System.out.println("info de produit");
		pp.showProduit();

		System.out.println("info Categorie:");

		Iterator<Categorie> itt = pp.getCategories().iterator();
		while (itt.hasNext()) {
			Categorie ce = itt.next();
			ce.showCategorie();
		}

	}

}
