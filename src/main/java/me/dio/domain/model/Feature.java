package me.dio.domain.model;

import jakarta.persistence.*;

@Entity // Indica que esta classe é uma entidade JPA e será mapeada para uma tabela no banco de dados
@Table(name = "tb_features") // Define o nome da tabela no DB como "tb_features"
public class Feature extends BaseItem{


}
