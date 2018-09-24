/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Isabella Kovarik)
 * @version (18.09.17)
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    // 2.85
    private int pages;

    // 2.88
    private String refNumber;

    // 2.91
    private int borrowed;

    // 2.92
    private boolean courseText;


    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;

        //2.85
        pages = bookPages;

        // 2.88
        refNumber = "";

        // 2.91
        borrowed = 0;

        // 2.92
        courseText = bookCourseText;
    }

    /**
        Accessor Methods
     */

    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    // 2.85
    public int getPages()
    {
        return pages;
    }

    //  2.88 mutator for refNumber: 
    public void setRefNumber(String ref)
    {
        // 2.90
        if (ref.length() >= 3)
        {
            refNumber = ref;
        } else {
            System.out.println("Error!");
        }
    }

    // 2.88
    public String getRefNumber()
    {
        return refNumber;
    }

    // 2.91
    public void borrow()
    {
        borrowed++;
    }

    // 2.91
    public int getBorrowed()
    {
        return borrowed;
    }

    // 2.92
    public boolean isCourseText()
    {
        return courseText;
    }


    /**
        Print Statements: printAuthor, printTitle and printDetails
    */

    // 2.84
    public void printAuthor()
    {
        System.out.println("Author: " + getAuthor());
    }
    
    // 2.84
    public void printTitle()
    {
        System.out.println("Title: )" + getTitle());
    }

    // 2.87
    public void printDetails()
    {
        // 2.89
        if (refNumber.length() <= 0)
        {
            refNumber = "ZZZ";
        } else {
            this.refNumber = refNumber;
        }

        System.out.println("Title: " + getTitle() + "\n" +
                            "Author: " + getAuthor() + "\n"  +
                            "Pages: " + getPages() + "\n" +
                            "Reference Number: " + getRefNumber() + "\n" +
                            "Wow! This book has been borrowed: " + getBorrowed() + " times");
    }
}
