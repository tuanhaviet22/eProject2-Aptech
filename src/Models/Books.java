/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tuan
 */
@Entity
@Table(name = "books")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Books.findAll", query = "SELECT b FROM Books b"),
    @NamedQuery(name = "Books.findByBookId", query = "SELECT b FROM Books b WHERE b.bookId = :bookId"),
    @NamedQuery(name = "Books.findByBookName", query = "SELECT b FROM Books b WHERE b.bookName = :bookName"),
    @NamedQuery(name = "Books.findByBookYear", query = "SELECT b FROM Books b WHERE b.bookYear = :bookYear"),
    @NamedQuery(name = "Books.findByBookCover", query = "SELECT b FROM Books b WHERE b.bookCover = :bookCover"),
    @NamedQuery(name = "Books.findByBookPrice", query = "SELECT b FROM Books b WHERE b.bookPrice = :bookPrice"),
    @NamedQuery(name = "Books.findByBookTotal", query = "SELECT b FROM Books b WHERE b.bookTotal = :bookTotal"),
    @NamedQuery(name = "Books.findByCategoryId", query = "SELECT b FROM Books b WHERE b.categoryId = :categoryId"),
    @NamedQuery(name = "Books.findByBookAuthor", query = "SELECT b FROM Books b WHERE b.bookAuthor = :bookAuthor"),
    @NamedQuery(name = "Books.findByBookStatus", query = "SELECT b FROM Books b WHERE b.bookStatus = :bookStatus")})
public class Books implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "book_id")
    private Integer bookId;
    @Basic(optional = false)
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "book_year")
    private Integer bookYear;
    @Column(name = "book_cover")
    private String bookCover;
    @Column(name = "book_price")
    private Integer bookPrice;
    @Basic(optional = false)
    @Column(name = "book_total")
    private int bookTotal;
    @Column(name = "category_id")
    private Integer categoryId;
    @Column(name = "book_author")
    private Integer bookAuthor;
    @Basic(optional = false)
    @Column(name = "book_status")
    private int bookStatus;

    public Books() {
    }

    public Books(Integer bookId) {
        this.bookId = bookId;
    }

    public Books(Integer bookId, String bookName, int bookTotal, int bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookTotal = bookTotal;
        this.bookStatus = bookStatus;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookYear() {
        return bookYear;
    }

    public void setBookYear(Integer bookYear) {
        this.bookYear = bookYear;
    }

    public String getBookCover() {
        return bookCover;
    }

    public void setBookCover(String bookCover) {
        this.bookCover = bookCover;
    }

    public Integer getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Integer bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookTotal() {
        return bookTotal;
    }

    public void setBookTotal(int bookTotal) {
        this.bookTotal = bookTotal;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(Integer bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(int bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookId != null ? bookId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Books)) {
            return false;
        }
        Books other = (Books) object;
        if ((this.bookId == null && other.bookId != null) || (this.bookId != null && !this.bookId.equals(other.bookId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Books[ bookId=" + bookId + " ]";
    }
    
}
