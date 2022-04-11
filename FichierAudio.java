/** FichierAudio spécifie la manipulation des différents types de fichiers audio.
 * @version 1
 */
public interface FichierAudio {
	
	/** Lire un fichier audio.
	 * @param fichier le fichier à lire
	 */
	void lire(FichierAudio fichier);
	
	/** Mettre sur pause un fichier audio en lecture.
	 * @param fichier le fichier à mettre sur pause
	 */
	void pause(FichierAudio fichier);
	
	

}
