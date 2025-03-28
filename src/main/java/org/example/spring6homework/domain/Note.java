package org.example.spring6homework.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

//Структура заметки:
//        - ID (автоинкрементное)(тип - Long)
//        - Заголовок (не может быть пустым)(тип - String)
//        - Содержимое (не может быть пустым)(тип - String)
//        - Дата создания (автоматически устанавливается при создании заметки)(тип - LocalDateTime)
@EqualsAndHashCode(callSuper = false)
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "notes")
public class Note extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String content;


}
