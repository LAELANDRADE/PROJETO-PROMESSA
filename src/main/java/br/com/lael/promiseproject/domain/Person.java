package br.com.lael.promiseproject.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by caioaraujo on 09/11/19.
 * www.c410.com.br | caiofaar@gmail.com
 */
@Data
@Entity
@Table(name = "pessoa")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name = "nome", length = 300)
    public String name;
    @Column(name = "idade")
    public Integer age;
    @Column(name = "email", length = 300)
    public String email;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento")
    public Date bornDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_cadastro")
    public Date createdAt;

}
