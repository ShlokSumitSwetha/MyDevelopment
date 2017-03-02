package Many2Many;

import java.util.HashSet;
import java.util.Set;

public class Human {
	
	Integer humanid;
	String humanname;
	Set monkeys;
	
	public Integer getHumanid() {
		return humanid;
	}
	public void setHumanid(Integer humanid) {
		this.humanid = humanid;
	}
	public Set getMonkeys() {
		return monkeys;
	}
	public void setMonkeys(Set monkeys) {
		this.monkeys = monkeys;
	}
	public String getHumanname() {
		return humanname;
	}
	public void setHumanname(String humanname) {
		this.humanname = humanname;
	}
	

	

}
