﻿# SpringLesson6
  В проекте используем обязательно Spring Data и Lombok!
Разработайте небольшое веб-приложение на Spring Boot, которое будет представлять собой сервис для учета личных заметок.
 Приложение должно поддерживать следующие функции:
Все методы контроллера возвращают ResponseEntity(как на семинаре)
1. Добавление заметки. (Подсказка @PostMapping)
2. Просмотр всех заметок.(Подсказка @GetMapping)
3. Получение заметки по id. (Подсказка @GetMapping("/{id}") )
4. Редактирование заметки.(Подсказка @PutMapping("/{id}") )
5. Удаление заметки.(Подсказка @DeleteMapping("/{id}") )
Структура заметки:
- ID (автоинкрементное)(тип - Long)
- Заголовок (не может быть пустым)(тип - String)
- Содержимое (не может быть пустым)(тип - String)
- Дата создания (автоматически устанавливается при создании заметки)(тип - LocalDateTime)

Подсказка:
Репозиторий наследует JpaRepository<Note, Long>. В репозитории добавляем метод Optional<Note> findById(Long id);
Подсказка:
В проект добавляем зависимости: spring data jpa, h2, lombok, spring web
====================================================================================================================
Задание со звездочкой(при успешном выполнении задания со звездочкой выполнять базовое задание не нужно)
На основе проекта показанного на семинаре разработать сайт:
- Отображающий список героев мультсериала Rick and Morty(с картинками)
- При выборе героя отобразить карточку товара с персонажем(с картинкой)
- В проекте использовать шаблонизатор thymeleaf
- Магическую строчку вынести в настройки проекта.

Достаточно реализовать отображение данных присланных в одном запросе (как в примере на семинаре)
