package org.example.spring6homework.services;
//1. Добавление заметки. (Подсказка @PostMapping)
//        2. Просмотр всех заметок.(Подсказка @GetMapping)
//        3. Получение заметки по id. (Подсказка @GetMapping("/{id}") )
//        4. Редактирование заметки.(Подсказка @PutMapping("/{id}") )
//        5. Удаление заметки.(Подсказка @DeleteMapping("/{id}") )

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.spring6homework.domain.Note;
import org.example.spring6homework.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class NoteService {
    private final NoteRepository noteRepository;

    public Note add(Note note) {
        log.info("Save note: {}", note);
        return noteRepository.save(note);
    }

    /**
     * Просмотр всех заметок.
     */
    public List<Note> findAll() {
        log.info("Find all notes");
        return noteRepository.findAll();
    }

    /**
     *
     * Получение заметки по id.
     */
    public Optional<Note> findById(Long id) {
        log.info("Find note by id: {}", id);
        return noteRepository.findById(id);
    }

    /**
     *
     *  Редактирование заметки.
     */
    public Optional<Note> update(Long id, Note note) {
        Optional<Note> updateNote = noteRepository.findById(id);
        if (updateNote.isPresent()) {
            updateNote.get().setTitle(note.getTitle());
            updateNote.get().setContent(note.getContent());
        }
        log.info("Update note: {}", updateNote);
        return updateNote;
    }

    /**
     * Удаление заметки.
     */
    public void delete(Long id) {
        log.info("Delete note by id: {}", id);
        noteRepository.deleteById(id);
    }

}
