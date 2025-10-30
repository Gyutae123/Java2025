package game.attack;

import java.util.Random;

public class Thief extends Enemy {
	int attackPower;
	int reward;
	int winRatio;

	Thief(int attackPower, int reward, int winRatio){
		this.attackPower = attackPower;
		this.reward = reward;
		this.winRatio = winRatio;
	}

	void Attack(Player player) {
		Random rand = new Random();
		int val = rand.nextInt(100);

		if (val < 50) {
			System.out.println("Thief Win");
			Damage(player);
		} else {
			System.out.println("Player Win");
			Reward(player);
		}
	}

	void Damage(Player player) {
		player.money -= attackPower;
	}

	void Reward(Player player) {
		player.money += reward;
	}
}
