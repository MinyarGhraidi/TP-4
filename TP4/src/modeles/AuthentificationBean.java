package modeles;

public class AuthentificationBean{
	private String nom;
	private String prénom;

	
	public AuthentificationBean(String nom ,String prenom){
		this.nom=nom;
		this.prénom=prenom; 
		}

	 public AuthentificationBean (){
			setNom("");
			setPrénom("");
	 }
 public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrénom() {
		return prénom;
	}
	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}

 }
	


