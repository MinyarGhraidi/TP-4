package modeles;

public class AuthentificationBean{
	private String nom;
	private String pr�nom;

	
	public AuthentificationBean(String nom ,String prenom){
		this.nom=nom;
		this.pr�nom=prenom; 
		}

	 public AuthentificationBean (){
			setNom("");
			setPr�nom("");
	 }
 public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPr�nom() {
		return pr�nom;
	}
	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
	}

 }
	


