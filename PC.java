package P;

import C.CPU;
import H.HardDisk;

public class PC {
	private double  cpu;
	private int HD;
	public void setCPU(CPU c){
		cpu=c.speed;
	}
	public void setHardDisk(HardDisk h){
	HD=h.amount;

}
public void show(){
	System.out.println("cpu���ٶȣ�"+cpu);
	System.out.println("Ӳ�̵�������"+HD);
}
}