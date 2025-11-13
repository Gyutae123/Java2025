package exam04;

public class Main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Person worker = new Person() {
//			void Wake() {
//				System.out.println("Wake up at 6!!");
//				Work();
//			}
//			void Work() {
//				System.out.println("Go to Work!!");
//			}
//		};
//		worker.Wake();
//		worker.Work();
		NPCGenerator npc = new NPCGenerator();
//		npc.worker.Wake(); 
//		npc.GeneratorWalker();
		npc.GeneratorPerson(
				new Person() {
					void Wake() {
						System.out.println("Wake up at 8!!");
						Work();
					}
					void Work() {
						System.out.println("Go to School!!");
					}
				}
		);
	}
	
}
