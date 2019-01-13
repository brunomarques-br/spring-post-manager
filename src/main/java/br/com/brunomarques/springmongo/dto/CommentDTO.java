package br.com.brunomarques.springmongo.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class CommentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String text;
    private Date data;
    private AuthorDTO authorDTO;

    public CommentDTO() {}

    public CommentDTO(String text, Date data, AuthorDTO authorDTO) {
        this.text = text;
        this.data = data;
        this.authorDTO = authorDTO;
    }
}
