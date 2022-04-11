/** PlaylistManuelle désigne la plylist que l'utilisateur pourra configurer comme il le voudra.
 * @author jramassa
 * @version 1
 */
public class PlaylistManuelle implements Playlist {
	
	Set<FichierAudio> morceaux; // une liste des différents morceaux de la playlist
	
	public PlaylistManuelle() {
		morceaux = new NavigableSet<>;
	}
	
	@Override
	public void ajouter(FichierAudio fichier) {
		this.morceaux.add(fichier);
	}
	
	@Override
	public void supprimer(FichierAudio fichier) {
		this.morceaux.remove(fichier);
	}

}
