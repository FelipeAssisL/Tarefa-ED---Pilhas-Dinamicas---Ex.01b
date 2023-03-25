package view;

import br.edu.fateczl.pilhaint.Pilha;

public class main {

	public static void main(String[] args) {
		
		Pilha p = new Pilha();
		for (int i = 100 ; i < 115 ; i++) {
			if (p.isEmpty()) {
			p.push(i+100);
			} else {
			if (p.size() <= 4) {
				p.push(i + 50);
			} else {
				try {
					p.pop();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			}
			try {
				int topo = p.top();
				System.out.println("Topo atual--> " + topo);			
				} catch (Exception e) {
				e.printStackTrace();
			}
			}
		int tamanho = p.size();
		System.out.println("Tamanho final da Pilha --> "+tamanho);
	}

}
