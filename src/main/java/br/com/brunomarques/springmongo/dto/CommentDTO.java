package br.com.brunomarques.springmongo.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class CommentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String texto;
    private Date data;
    private AuthorDTO authorDTO;

    public CommentDTO() {}

    public CommentDTO(String texto, Date data, AuthorDTO authorDTO) {
        this.texto = texto;
        this.data = data;
        this.authorDTO = authorDTO;
    }
}
