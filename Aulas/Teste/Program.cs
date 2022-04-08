namespace teste
{
    class primeiraClasse
    {
         static void Main()
         {
            int numero;
            Console.WriteLine("Teste");
            Console.Write("Escrita na mesma linha\n");
            Console.WriteLine("Escreva um numero: ");
            numero = Convert.ToInt16(Console.ReadLine());
            //"Console.ReadLine()" retorna uma string, eh necessario realizar uma conversao quando o tipo de dado eh integer ou numeros
            //Nao confundir com "Console.Read()"
            Console.WriteLine("O numero escrito foi: " + numero);
            
         }
    }
}