public class Aluno {
    private String nome;
    private String ra;
    private double notas[] = new double[4];
    private double media;

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void cadastrarAluno(String nome, String ra, double n1, double n2, double n3, double n4) {
        this.nome = nome;
        this.ra = ra;
        notas[0] = n1;
        notas[1] = n2;
        notas[2] = n3;
        notas[3] = n4;

    }

    public void calcularMedia() {
        for (int i = 0; i < 4; i++) {
            this.media = this.media + this.notas[i];
        }
        this.media = this.media / 4;
        System.out.println(this.media);
    }

    public double calcularMedia(double n1, double n2, double n3) {
        this.media = 0; 
        this.notas[0] = n1;
        this.notas[1] = n2;
        this.notas[2] = n3;
        for (int i = 0; i < 3; i++) {
            this.media = this.media + this.notas[i];
        }
        this.media = this.media / 3;
        return this.media;
    }

    public void calcularMedia(double n1, double n2, double n3, double n4) {
        this.media = 0;
        this.notas[0] = n1;
        this.notas[1] = n2;
        this.notas[2] = n3;
        this.notas[3] = n4;
        for (int i = 0; i < 4; i++) {
            this.media = this.media + this.notas[i];
        }
        this.media = this.media / 4;
    }

    public double calcularMedia(int n1, int n2, int n3, int n4) {
        this.media = 0;
        this.notas[0] = n1;
        this.notas[1] = n2;
        this.notas[2] = n3;
        this.notas[3] = n4;
        for (int i = 0; i < 4; i++) {
            this.media = this.media + this.notas[i];
        }
        this.media = this.media / 4;
        return this.media;
    }
}
