public class Book implements Comparable<Book>{
        public String name;
        public String author;
        public int publishYear;
        public int pageCount;
        public Book(String name, String author, int publishYear, int pageCount)  {
            this.name = name;
            this.author = author;
            this.publishYear = publishYear;
            this.pageCount = pageCount;
        }
        
        @Override
        public int compareTo(Book o) {
            return this.name.compareToIgnoreCase(o.name);
        }
        
    }