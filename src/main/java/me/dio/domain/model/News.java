package me.dio.domain.model;

import jakarta.persistence.*;

@Entity // Indica que esta classe é uma entidade JPA e será mapeada para uma tabela no banco de dados
@Table(name = "tb_news") // Define o nome da tabela no DB como "tb_news"
public class News extends BaseItem {

}
