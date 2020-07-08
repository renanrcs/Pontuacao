
public class CalculadoraBonus {
	
	public int bonusDia = 1;
	
	public int bonus(Usuario u) {
		int multiplicador = bonusDia;
		if(u.vip)
			multiplicador *= 5;
		return multiplicador;
	}
}
