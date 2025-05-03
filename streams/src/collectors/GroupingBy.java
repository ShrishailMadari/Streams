package collectors;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book{

    String title;
    String author;
    int pages;
    String department;

    public Book(String title, String author, int pages,String department) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.department = department;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
public class GroupingBy {
    public static void main(String[] args) {
//        Group Books by Author and Count Pages
        List<Book> books = Arrays.asList( new Book("Clean Code", "Robert Martin", 464, "Software Engineering"),
                new Book("Effective Java", "Joshua Bloch", 416, "Software Engineering"),
                new Book("Design Patterns", "Erich Gamma", 395, "Software Engineering"),
                new Book("Test-Driven Development", "Kent Beck", 240, "Software Engineering"),
                new Book("Refactoring", "Martin Fowler", 473, "Software Engineering"),
                new Book("Clean Architecture", "Robert Martin", 432, "Software Engineering"),
                new Book("The Pragmatic Programmer", "Andy Hunt", 352, "Software Engineering") );

        books.stream().collect(Collectors.groupingBy(Book::getAuthor,Collectors.summingInt(Book::getPages))).forEach((author,pages)->{
            System.out.println("Author: "+author+": "+" Pages: "+pages);
        });
        System.out.println("*********************************");
        Map<String, Map<String, Integer>> collect = books.stream()
                .collect(Collectors.groupingBy(Book::getDepartment,
                Collectors.groupingBy(Book::getAuthor, Collectors.summingInt(Book::getPages))));
        collect.forEach((dept,author)->{
            System.out.println("Department: "+ dept);
            author.forEach((auth,page)->{
                System.out.println(" "+"Auth: "+auth+" "+" page: "+page);
            });
            System.out.println();
        });
        System.out.println("***************************************************");
        // Print the result
        collect.forEach((department, authorMap) -> {
            System.out.println(department + ":");
            authorMap.forEach((author, totalPages) -> {
                System.out.println("  " + author + " → " + totalPages + " pages");
            });
            System.out.println();
        });
    }
}
