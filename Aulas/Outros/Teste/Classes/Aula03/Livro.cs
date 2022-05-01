using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes {
    class Livro {
        public string name;
        public string author;
        public int year;
        public int pages;
        public Livro(string name, string author, int year, int pages) {
            this.name = name;
            this.author = author;
            this.year = year;
            this.pages = pages;
            Console.WriteLine("Nome do livro: " + name);
            Console.WriteLine("Nome do autor: " + author);
            Console.WriteLine("Ano de lançamento: " + year);
            Console.WriteLine("Numero de paginas: " + pages);
            Console.WriteLine();
        }
    }
}
