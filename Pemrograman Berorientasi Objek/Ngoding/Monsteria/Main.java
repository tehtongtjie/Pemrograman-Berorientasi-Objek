// import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Alien Zograd = new Alien("Zograd", 80,20,10);
		Monster Sally = new Monster("Sally", 80,20,10);
		
		// Random random = new Random();
		
		Zograd.showEntity();
		Sally.showEntity();
		System.out.println();
		System.out.println("Battle Start!!");
		
		boolean MonsterDuluanNyerang = true;
		// MonsterDuluanNyerang= random.nextBoolean();
		
//		int turnAlien=1;
//		int turnMonster=1;
		
		//KASUS EKSPLORASI (10 POINT)
		// int turnMonsterSpecial = random.nextInt(9)+1;
		// int turnAlienSpecial = random.nextInt(9)+1;
		
		//Uncomment dua baris kode dibawah && comment dua baris kode diatas
		//jika ingin mengetes untuk kasus PRIORITAS
		
		//KASUS PRIORITAS (90 POINT)
		int turnMonsterSpecial = 3;
		int turnAlienSpecial = 4;
		if(MonsterDuluanNyerang) {
			System.out.println("Monster duluan nyerang");
			while(!Sally.dead() && !Zograd.dead()) {
				System.out.println("==================================");
				if(Sally.getCount()%turnMonsterSpecial==0) {
					//nambah darah
					Sally.setHealth(Sally.specialSkill());
					System.out.println(Zograd.getName()+" | "+Zograd.getHealth());
					System.out.println(Sally.getName()+" | "+Sally.getHealth());
					System.out.println();
				}else{
					int atk=Sally.attack(Zograd.getDefence());
					Zograd.setHealth(Zograd.getHealth()-atk);
					System.out.println(Zograd.getName()+" | "+Zograd.getHealth());
					System.out.println(Sally.getName()+" | "+Sally.getHealth());
					System.out.println();
				}
				
				if(Zograd.getCount()%turnAlienSpecial==0) {
					//alien ng-ulti
					int atk=Zograd.specialSkill();
					Sally.setHealth(Sally.getHealth()-atk);
					System.out.println(Zograd.getName()+" | "+Zograd.getHealth());
					System.out.println(Sally.getName()+" | "+Sally.getHealth());
					System.out.println();
				}else{
					
					int atk=Zograd.attack(Sally.getDefence());
					Sally.setHealth(Sally.getHealth()-atk);
					System.out.println(Zograd.getName()+" | "+Zograd.getHealth());
					System.out.println(Sally.getName()+" | "+Sally.getHealth());
					System.out.println();
				}
				System.out.println("==================================");
			}
		}else {
			System.out.println("Alien duluan nyerang");
			while(!Sally.dead() && !Zograd.dead()) {
				System.out.println("==================================");
				if(Zograd.getCount()%turnAlienSpecial==0) {
					//alien ng-ulti
					int atk=Zograd.specialSkill();
					Sally.setHealth(Sally.getHealth()-atk);
					System.out.println(Zograd.getName()+" | "+Zograd.getHealth());
					System.out.println(Sally.getName()+" | "+Sally.getHealth());
					System.out.println();
				}else{
					int atk=Zograd.attack(Sally.getDefence());
					Sally.setHealth(Sally.getHealth()-atk);
					System.out.println(Zograd.getName()+" | "+Zograd.getHealth());
					System.out.println(Sally.getName()+" | "+Sally.getHealth());
					System.out.println();
				}
				
				if(Sally.getCount()%turnMonsterSpecial==0) {
					//nambah darah
					Sally.setHealth(Sally.specialSkill());
					System.out.println(Zograd.getName()+" | "+Zograd.getHealth());
					System.out.println(Sally.getName()+" | "+Sally.getHealth());
					System.out.println();
				}else{
					int atk=Sally.attack(Zograd.getDefence());
					Zograd.setHealth(Zograd.getHealth()-atk);
					System.out.println(Zograd.getName()+" | "+Zograd.getHealth());
					System.out.println(Sally.getName()+" | "+Sally.getHealth());
					System.out.println();
				}
				
				System.out.println("==================================");
			}
		}
		
		if(Sally.dead()) {
			System.out.println("the aliens wins!!");
			System.out.println("the monster "+Sally.getName()+" is dead!");
		}else if(Zograd.dead()) {
			System.out.println("the monster wins!!");
			System.out.println("the aliens "+Zograd.getName()+" is dead!");
		}
	}

}
