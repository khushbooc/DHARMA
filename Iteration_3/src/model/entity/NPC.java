import model.entity;

public class NPC {
	public NPC(Occupation occupation, Inventory inventory,
			EquipmentContainer equicontainer) {
		super(occupation, inventory, equicontainer);
		
		protected Inventory createInventory(){
			//TODO;
			
		protected boolean createFriendly(){
			return false;
		}
		protected Inventory getInventory(){
			//TODO;
		}
		
		public Takeable sellItem(int position, Entity purchaser){
			
		}
                //TODO;		
		}
 
		public void buyItem(Takeable item, Entity puchaser){
			//TODO;
		}
		
}
