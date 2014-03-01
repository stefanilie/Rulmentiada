import java.util.*

class Carte
{
	private int _nAttack;
	private int _nHealth;
	private int _nMana;

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
			this._nMana = (this._nHealth + this.j)
		} 

	}

}

class Justitiar extends Carte
{
	boolean bIsMilitian;
	boolean bIsMilitar;

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

}