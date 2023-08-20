import javax.swing.JOptionPane;

public class Login 
{
    public static void main(String[] args) 
    {
        String email, senha;

        email = JOptionPane.showInputDialog("Insira o Email");
        senha = JOptionPane.showInputDialog("Insira a Senha");

        if (email.equals("exemplo@gmail.com") && senha.equals("12345"))
        {
            JOptionPane.showMessageDialog (null, "Login correto");
        }
        else 
        {
            JOptionPane.showMessageDialog (null, "Email ou senha invalido");
        }
    }
}