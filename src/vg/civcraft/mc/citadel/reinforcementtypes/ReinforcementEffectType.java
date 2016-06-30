package vg.civcraft.mc.citadel.reinforcementtypes;

import org.bukkit.Effect;

public class ReinforcementEffectType {
	private Effect effect;
	private int amount; 
	private int viewDistance;
	
	public ReinforcementEffectType(Effect effect, int amount, int viewDistance) {
		this.effect = effect;
		this.amount = amount;
		this.viewDistance = viewDistance;
	}

	/**
	 * 
	 * @return Get the type of particle used in this effect
	 */
	public Effect getEffect() {
		return effect;
	}

	/**
	 * 
	 * @return Get the amount of particle this effect includes. 
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * 
	 * @return Get the distance from which players will be able to see the effect. 
	 */
	public int getViewDistance() {
		return viewDistance;
	}
}
