public class TestaCondicional {
    
    public static void main(String[] args) {
        
        System.out.println("Testando condicionais");

        int idade = 16;
        int quantidadePessoas = 3;

        if (idade >= 18){
            System.out.println("você tem mais de 18 anos");
            System.out.println("seja bem-vindo");
            
        } else {
            if (quantidadePessoas <=3){
                System.out.println("Você não tem 18, mas pode entrar");

            }else{
                System.out.println("Infelizmente você não pode entrar, pois está acompanhado");
            }
        }
    }
}
