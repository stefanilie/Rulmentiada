import java.util.*

class Carte
{
	protected int _nAttack;
	protected int _nHealth;
	protected int _nMana;

	public getAttack()
	{
		return this._nAttack;
	}

	public getHealth()
	{
		return this._nHealth;
	}

	public getMana()
	{
		return this._nMana;
	}

	public setAttack(int nValue)
	{
		this._nAttack = nValue;
	}

	public setHealth(int nValue)
	{
		this._nHealth = nValue;
	}

	public setMana(int nValue)
	{
		this._nMana = nValue;
	}

	public Carte()
	{
		Random rand = new Random()
		int max = 1;
		int min = 0;

		/**
		* Generating a roandom number between 0 and 1 in order
		* to generate health and power.
		*/
		float fitness = rand.nextFloat() * (max - min) + min;
		if (fitness>0 && fitness<=0.25)
		{
			this._nHealth = 0 + (int)(Math.random() * ((3 - 0) + 1));
		}
		else if(fitness>0.25 && fitness<=0.5)
		{
			this._nHealth = 3 + (int)(Math.random() * ((5 - 3) + 1));
		}
		else if(fitness>0.5 && fitness<=0.7)
		{
			this._nHealth = 5 + (int)(Math.random() * ((7 - 5) + 1));
		}
		else if(fitness>0.7 && fitness<=1)
		{
			this._nHealth = 7 + (int)(Math.random() * ((10 - 7) + 1));
		}

		/**
		* This sets the card's power based on the random number generated before
		*/
		float power = rand.nextFloat() * (max -min) + min;
		if (power>0 && power<=0.25)
		{
			this._nHealth = 0 + (int)(Math.random() * ((3 - 0) + 1));
		}
		else if(power>0.25 && power<=0.5)
		{
			this._nHealth = 3 + (int)(Math.random() * ((5 - 3) + 1));
		}
		else if(power>0.5 && power<=0.7)
		{
			this._nHealth = 5 + (int)(Math.random() * ((7 - 5) + 1));
		}
		else if(power>0.7 && power<=1)
		{
			this._nHealth = 7 + (int)(Math.random() * ((10 - 7) + 1));
		}

		/*
		* This sets up the card's mana based on it's health and power.
		*/
		if(this._nHealth < 5 && this._nAttack < 5)
		{
			this._nMana	= (this._nHealth + this._nAttack + 7) / 3;  
		}
		else if(this._nHealth > 5 && this._nAttack < 5)
		{
			this._nMana = (this._nHealth + this._nAttack + 5) / 6;
		}
		else if(this._nHealth < 5 && this._nAttack > 5)
		{
			this._nMana = (this._nHealth + this._nAttack + 7) / 4;
		} 
		else if(this._nHealth >5 && this._nAttack > 5)
		{
			this._nMana = (this._nHealth + this._nAttack + 2) / 3;
		}
	}
}

class Justitiar extends Carte
{
	protected boolean _bIsMilitian;
	protected boolean _bIsMilitar;

	public setIsMilitian(boolean bValue)
	{
		this._bIsMilitian = bValue;
	}

	public setIsMilitar(boolean bValue)
	{
		this._bIsMilitar = bValue;
	}

	public getIsMilitar()
	{
		return this._bIsMilitar;
	}

	public getIsMilitian()
	{
		return this._bIsMilitian;
	}

	public Justitiar(boolean bType)
	{
		if(this.getIsMilitar)
		{
			//trebuie adaugata functionalitate sa blocheze atacul la rulmenti
		}
		else if(this.getIsMilitian)
		{
			//functionalitate adaugare manax`x
		}
	}
}

class JucatorCamp extends Carte
{
	boolean bIsSoarece;
	boolean bIsCocalar;
	boolean bIsMafiot;
	boolean bIsDiva;
	boolean bIsPitipoanca;
	boolean bIsBaba;

}

class Moloz extends Carte
{

}

class Deck 
{
	List<Carte> carti;

	public Deck()
	{
		carti = new List<Carte>();
	}

	public populateDeck()
	{
		/*
		 * algortim semi-inteligent care sa imi adauge in pachet 
		 * in jur de 50 de carti.
		 */
		int nDeckLimit = 50;

		for(int i=0; i<nDeckLimit; i++)
		{
			
		}
	}
}

class Player
{
	ArrayList<Integer> listRulmenti;
	Deck objDeck;

	public Player()
	{
		objDeck = new Deck();
		listRulmenti = new List<Integer>();
	}

	/**
	* This function is the marks the attack sustained by the rulments.
	* If bIsProtected has true value, that means that the rulments are protected by a Militar Card.
	*/
	public getsAttacked(boolean bIsProtected, Carte objAttacker)
	{
		if(bIsProtected)
		{
			//pop-up message that doesn't let you attack the player
		}
		else
		{
			Collections.sort(listRulmenti);
			/* 
			* Aici trebuie sa fac functionalitatea de damage.
			* In cazul in care atacul e mai mare decat valoarea unui rulment, 
			* trebuie sa ia cat mai are rulmentul ala, si sa treaca la urmatorul,
			* daca un rulment urmator mai exista. In caz contrar, jocul se incheie.
			*/
			if(listRulmenti[0] - objAttacker.getAttack() < 0)
			{
				//il scade din primu, iar valoarea reziduu negativa (ex: -3)
				listRulmenti[0] = listRulmenti[0] - objAttacker.getAttack();
				//va fi adunata la urmatorul rulment, ca sa ii scada lui, atacul fiind acum finalizat
				listRulmenti[1] = listRulmenti[1] + listRulmenti[0];
				listRulmenti.remove(0);
			}
			else if(listRulmenti[0] - objAttacker.getAttack() > 0)
			{
				listRulmenti[0] = listRulmenti[0] - objAttacker.getAttack();
			}
			else if(listRulmenti[0] - objAttacker.getAttack() == 0)
			{
				listRulmenti.remove(0);
			}
		}
	}
}