/** Playlist spécifie les actions possibles pour un utilisateur souhaitant créer une playlist.
 * @version 1
 */
public interface Playlist {
	
	/** Ajouter un morceau à la playlist.
	 * @param fichier l'audio à ajouter
	 */
	void ajouter(FichierAudio fichier);
	
	/** Supprimer un morceau.
	 * @param fichier le morceau à supprimer.
	 */
	void supprimer(FichierAudio fichier);

}
