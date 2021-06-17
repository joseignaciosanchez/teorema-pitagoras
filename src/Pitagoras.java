public class Pitagoras {
	public double calcularHipotenusa(int catetoA, int catetoB) {
        
        double hipotenusa = Math.sqrt((catetoA*catetoA)+(catetoB*catetoB));
        System.out.println(hipotenusa);
        return hipotenusa;
    }
}
