package combat;
import characters.Entity;


public class Skill {
	
	class Effect{
		String name;
		String description;
		double chance;
		
	}
	
	void applyStatus(Effect effect, Entity enemy) {
		if(effect.name == "Stun") {
			double random = Math.random()*1 + 0;
			if(random < effect.chance){
					enemy.status = "Stunned";
			}	
		}
	}
	
	String effect;
	String effectDescription;
	int skillLevel;
}
