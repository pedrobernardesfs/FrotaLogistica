public class Motorista {
     private String nome;
     private String cpf;
     private String cnh;
     private ValidadeCnh validadeCnh;

     private boolean validarDados(String campo) {
          return campo == null || campo.trim().isEmpty();
     }
     private boolean validarCampos(){
          if ( (campoVazio(nome)) || (campoVazio(cpf)) || (campoVazio(cnh))
                  || (campoVazio(validadeCnh)) {
               System.out.println("Preencha com os campos obrigatórios!");
               return false;
          }
               return true;
     public String getNome() {
          return nome;
     }
     public void setNome(String nome) {
          this.nome = nome;
     }
     public String getCpf() {
          return cpf;
     }
     public void setCpf(String cpf) {
          this.cpf = cpf;
     }
     public String getCnh() {
          return cnh;
     }
     public void setCnh(String cnh) {
          this.cnh = cnh;
     }
     public ValidadeCnh getValidadeCnh() {
          return validadeCnh;
     }
     public void setValidadeCnh(ValidadeCnh validadeCnh) {
          this.validadeCnh = validadeCnh;
     }
}
