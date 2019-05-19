public class Aluno {
   private String nome;
   private double nota1, nota2, media, pontos;
  
   // campos estáticos (devem ser inicializados). O modificador ‘final’ indica que o campo é
   // uma constante, isto é, não pode ser modificado
   static final public double DEFAULT_APROVACAO = 7.0;
   static private double minimoAprovacao = Aluno.DEFAULT_APROVACAO;
   static final public double  DEFAULT_NOTALIMITE = 10.0;
   static private double notalimite = Aluno.DEFAULT_NOTALIMITE;
 
  
 
   // métodos estáticos de interface para o campo estático minimoAprovacao
   public static double getMinimoAprovacao() {
   	return Aluno.minimoAprovacao;
   }
   public static void setMinimoAprovacao(double _minimoAprovacao) {
   	Aluno.minimoAprovacao = _minimoAprovacao;
   } 
 
   // métodos que usam membros estáticos, formato: “Classe.nomeMembroEstático”
   static public boolean isAprovado(double _media) {
   	if(_media >= Aluno.minimoAprovacao)
      	   return true;
   	else
      	   return false;
   }
   public boolean isAprovado(){
	
   	return Aluno.isAprovado(this.media);
   }
   
   static public boolean notaultrapassou(double _nota) {
	   if(_nota <= Aluno.notalimite)
		   return true;
	   else
		   return false;
   }
   
  
}
