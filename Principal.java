public class Principal {
    public static void main(String[] args) {
      Aluno in = new Aluno();
      in.cadastrarAluno("Joao", "123124332", 1, 1, 1, 1);
      in.calcularMedia();
      System.out.println(in.calcularMedia(10, 10, 10));
      System.out.println(in.calcularMedia(20, 20, 20, 20));
      System.out.println(in.calcularMedia(40, 40, 40, 40));
    }
}
