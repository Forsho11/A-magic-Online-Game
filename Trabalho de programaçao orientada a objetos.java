// Trabalho de Programação Orientada a Objetos - Unilasalle
// Aluno: Matheus Matos - RA: 202112810
// Link do projeto no Repl.it: https://replit.com/@MatheusMatos9/taskCharacter?v=1

// Definição da classe Personagem
class Personagem {
    String nome;
    String tipo;
    int nivel;
    protected int id;
    
   // Construtor da classe Personagem
    public Personagem(int ID) {
      this.id = ID;
      this.nome = "Astaroth";
      this.tipo = "Guerreiro";
      this.nivel = 55;
    }
    
   // Método para imprimir os dados do personagem
    public void imprimeDados() {
      System.out.println("Personagem do tipo "+this.tipo+ " com ID = "+this.id);
      System.out.println("Possui nivel "+this.nivel+" e se chama "+this.nome);
    }
  }
  
  // Definição da classe Dragao, que herda de Personagem
  class Dragao extends Personagem {
    int peso;
    int atividade;
    boolean ocupado;
  
    // Construtor da classe Dragao
    public Dragao(int ID) {
      super(ID);
      this.tipo = "dragao";
      this.nome = "Astaroth";
      this.nivel = 70;
      this.atividade = 0;
      this.ocupado = false;
    }
  
    // Construtor da classe Dragao com parâmetro adicional para o nome do dragão
    public Dragao(int ID, String nome) {
      super(ID);
      this.tipo = "dragao";
      this.nome = nome;
      this.nivel = 70;
      this.atividade = 0;
      this.ocupado = false;
    }
   }
  
  // Definição da classe Unicornio, que herda de Personagem
  class Unicornio extends Personagem {
    int nivelMagia;
  
    // Construtor da classe Unicornio
    public Unicornio(int ID) {
      super(ID);
      this.tipo = "unicornio";
      this.nome = "indefinido";
      this.nivelMagia = 0;
    }
  
  // Construtor da classe Unicornio com parâmetros adicionais para o nome e nível de magia do unicórnio
    public Unicornio(int ID, String nome, int nivelMagia) {
      super(ID);
      this.tipo = "unicornio";
      this.nome = "Mystic";
      this.nivel = 60;
      this.nivelMagia = nivelMagia;
    }
  
    // Método para o unicórnio usar magia
    public void usarMagia() {
      this.imprimeDados();
      System.out.println(this.nome+" Usou magia de nível "+nivelMagia);
    }
  }
  
  // Classe principal do programa
  public class Main {
    public static void main(String[] args) {
      System.out.println("Aluno: Matheus Matos de Melo - RA: 202112810");
      System.out.println("Link do projeto no Repl.it: https://replit.com/@ChatGPT/AtividadeProducao20231");
      
      Personagem p = new Personagem(1);
      p.imprimeDados();
  
      Dragao d1 = new Dragao(2, "Hades");
      d1.imprimeDados();
  
      int idUnicornio = 2810; // identificador do personagem será os 4 últimos números da minha matrícula
      Unicornio u = new Unicornio(idUnicornio, "Mystic", 10);
      u.usarMagia();
    }
  }
  