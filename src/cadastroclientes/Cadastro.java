
package cadastroclientes;

public class Cadastro {

    public static void main(String[] args) {
        
        UICadastro form = new UICadastro();
        Clientes c = new Clientes(form.name,form.cpf,form.sexo,form.endereco,form.cidade,form.estado);
        
        
        
    }
    
}
