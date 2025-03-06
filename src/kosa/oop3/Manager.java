package kosa.oop3;

public class Manager {
	private Role role;
	
	public Manager(){}
	
	public Manager(Role role){
		super();
		this.role = role;
	}
	
	public void justdoit() {
		role.doing();
	}
}
