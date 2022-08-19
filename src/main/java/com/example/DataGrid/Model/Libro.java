
package com.example.DataGrid.Model;
import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="book")
public class Libro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable=false, unique=true, updatable=false)
    private long id;
    
    @Column(name = "namebook", unique=true, length=150, nullable=false)
    private String namebook;
    
    @Column(name = "descriptionbook", unique=false, length=300, nullable=true)
    private String descriptionbook;
    
    @Column(name = "authorbook", unique=false, length=150, nullable=false)
    private String authorbook;
    
    @Column(name = "datepublishbook", unique=false, nullable=true)
    private Date datepublishbook;
    
    @Column(name = "numberbook", unique=false, nullable=true)
    private int numberbook;
    
    @Column(name = "pricebook", unique=false, nullable=true)
    private double pricebook;    
   
    
    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", namebook=" + namebook + ", descriptionbook=" + descriptionbook + ", authorbook=" + authorbook + ", datepublishbook=" + datepublishbook + ", numberbook=" + numberbook + ", pricebook=" + pricebook + '}';
    }

    
    public Libro() {

    }

    public Libro(String namebook, String descriptionbook, String authorbook, Date datepublishbook, int numberbook, double pricebook) {
        this.namebook = namebook;
        this.descriptionbook = descriptionbook;
        this.authorbook = authorbook;
        this.datepublishbook = datepublishbook;
        this.numberbook = numberbook;
        this.pricebook = pricebook;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the namebook
     */
    public String getNamebook() {
        return namebook;
    }

    /**
     * @param namebook the namebook to set
     */
    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    /**
     * @return the descriptionbook
     */
    public String getDescriptionbook() {
        return descriptionbook;
    }

    /**
     * @param descriptionbook the descriptionbook to set
     */
    public void setDescriptionbook(String descriptionbook) {
        this.descriptionbook = descriptionbook;
    }

    /**
     * @return the authorbook
     */
    public String getAuthorbook() {
        return authorbook;
    }

    /**
     * @param authorbook the authorbook to set
     */
    public void setAuthorbook(String authorbook) {
        this.authorbook = authorbook;
    }

    /**
     * @return the datepublishbook
     */
    public Date getDatepublishbook() {
        return datepublishbook;
    }

    /**
     * @param datepublishbook the datepublishbook to set
     */
    public void setDatepublishbook(Date datepublishbook) {
        this.datepublishbook = datepublishbook;
    }

    /**
     * @return the numberbook
     */
    public int getNumberbook() {
        return numberbook;
    }

    /**
     * @param numberbook the numberbook to set
     */
    public void setNumberbook(int numberbook) {
        this.numberbook = numberbook;
    }

    /**
     * @return the pricebook
     */
    public double getPricebook() {
        return pricebook;
    }

    /**
     * @param pricebook the pricebook to set
     */
    public void setPricebook(double pricebook) {
        this.pricebook = pricebook;
    }
   
    
    
}
