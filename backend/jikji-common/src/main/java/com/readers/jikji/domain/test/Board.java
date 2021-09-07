package com.readers.jikji.domain.test;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "board")
@Getter
@Setter
public class Board {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column(length = 100)
    private String title;

    @Column(length = 4000)
    private String contents;

    public Board(){}

    public Board(String title, String contents){
        this.title = title;
        this.contents = contents;
    }

}
