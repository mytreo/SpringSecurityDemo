package ua.mytreo.java.springsecdem.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TABLE_1")
public class Record {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id_rec;

    @Column(name = "num1")
    private Integer num1;
    @Column(name = "num2")
    private Integer num2;

    @Column(name = "char1")
    private String char1;
    @Column(name = "char2")
    private String char2;

    @Column(name = "date1")
    private Date date1;
    @Column(name = "date2")
    private Date date2;


    public Record() {
    }

    public Record(Integer num1, Integer num2, String char1, String char2, Date date1, Date date2) {
        this.num1 = num1;
        this.num2 = num2;
        this.char1 = char1;
        this.char2 = char2;
        this.date1 = date1;
        this.date2 = date2;
    }

    public Long getId_rec() {
        return id_rec;
    }
    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public String getChar1() {
        return char1;
    }

    public void setChar1(String char1) {
        this.char1 = char1;
    }

    public String getChar2() {
        return char2;
    }

    public void setChar2(String char2) {
        this.char2 = char2;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }
}