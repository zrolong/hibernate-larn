package com.example.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * ����javax�µİ�
 *
 * @author ���ɵĺ���
 */
@Entity
public class Teacher {

    @Id
    private int id;

    private String name;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
