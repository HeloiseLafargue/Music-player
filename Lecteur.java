/** Lecteur spéficie les actions à exécuter sur l'ensemble des fichiers.
 * @version 1
 */
public interface Lecteur {
	
	/** Aller à la lecture suivante.
	 */
	void suivant();
	
	/** Aller à la lecture précédente.
	 */
	void precedent();
	
	/** Lire le répertoire.
	*/
	void lire();
	
	/** Mettre sur pause le répetoire.
	*/
	void pause();

}
