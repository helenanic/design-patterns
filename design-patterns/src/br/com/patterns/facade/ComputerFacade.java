package br.com.patterns.facade;

public class ComputerFacade {

	private CPU cpu;
	private HD hd;
	private Memory memory;
	
	public ComputerFacade() {
		this.cpu = new CPU();
		this.hd = new HD();
		this.memory = new Memory();
	}
	
	public void run() {
		cpu.processData();
		memory.loadData();
		hd.readData();
	}
	
	
}
