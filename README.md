# zsh
java课程作业项目仓库

#阅读程序

##实验目的
  了解类与对象，返回值，将参数赋值给其他和访问权限

##实验过程
  运用了返回值，赋值，调用等多个操作

##核心方法
  ```
  public double getSpeed(){
		return speed;
		
	}
  ```
  ```
  	public void setAmount(int m){
		amount=m;
	}
  ```
  ```
  	private double  cpu;
	private int HD;
	public void setCPU(CPU c){
		cpu=c.speed;
	}
	public void setHardDisk(HardDisk h){
	HD=h.amount;

}
  ```
  ```
  public static void main(String[] args){
	CPU cpu = new CPU();
	cpu.setSpeed(2200);
	HardDisk disk = new HardDisk();
	disk.setAmount(200);
	PC pc = new PC();
	pc.setCPU(cpu);
	pc.setHardDisk(disk);
	pc.show();
}
  ```
##实验结果
CUP的速度是2200
硬盘的容量是200


##实验感想
通过本次实验学会了类与对象，返回值，将参数赋值给其他和访问权限
