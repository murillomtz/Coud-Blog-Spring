package br.com.mtz.coudblogspring.model;

import java.time.LocalDate;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "TB_POST")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	@NotBlank
    private String titulo;
	@NotBlank
    private String autor;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate data;
	
	@NotBlank
	@Lob
    private String texto;

	public Post() {
	}


	public Post(final Long id, final String titulo, final String autor, final LocalDate data, final String texto) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.data = data;
		this.texto = texto;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(final String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(final String autor) {
		this.autor = autor;
	}

	public LocalDate getData() {
		return this.data;
	}

	public void setData(final LocalDate data) {
		this.data = data;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(final String texto) {
		this.texto = texto;
	}


    

}