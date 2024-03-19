public class Book implements Comparable<Book>{

    String title;
    String author;
    int pageCount;
    int publicationYear;

    public Book(String title, String author, int pageCount, int publicationYear) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.publicationYear = publicationYear;
    }

    //method to alphabetically order the books by title
    @Override
    public int compareTo(Book comparedBook) {
        return this.title.compareTo(comparedBook.title);
    }

    //a better printout appearance for this class
    @Override
    public String toString() {
        return "Book{" +
                "title= '" + title + '\'' +
                ", pageCount= " + pageCount +
                ", author= '" + author + '\'' +
                ", publicationDate= " + publicationYear +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
