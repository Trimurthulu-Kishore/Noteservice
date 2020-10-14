package com.example.notesservice.service;

import java.util.List;

import com.example.notesservice.dto.NotesDto;

public interface NoteService {
	public List<NotesDto> findAll();
	public NotesDto findById(long id);
	public NotesDto addNote(NotesDto note);
	public NotesDto deleteNote(long id);
	public List<NotesDto> findAllByStatus(String status);
	public List<NotesDto> findAllByTitle(String title);
	public List<NotesDto> findAllByAuthor(String author);
	public NotesDto updateStatus(long id, String status);
}
