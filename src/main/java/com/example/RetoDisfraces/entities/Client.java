package com.example.RetoDisfraces.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;

    
    @OneToMany(mappedBy ="client", cascade = CascadeType.ALL)
    private Set<Message> messages = new HashSet<>();
    @OneToMany(mappedBy ="client", cascade = CascadeType.ALL)
    private Set<Reservation> reservations = new HashSet<>();
    

    public Integer getIdClient() {
        return idClient;
    }
    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public Set<Message> getMessages() {
        return messages;
    }
    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }
    public Set<Reservation> getReservations() {
        return reservations;
    }
    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }
    
}