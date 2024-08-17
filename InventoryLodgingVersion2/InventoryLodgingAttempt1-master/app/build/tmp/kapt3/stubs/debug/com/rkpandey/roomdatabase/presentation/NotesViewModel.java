package com.rkpandey.roomdatabase.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012\u00a8\u0006\""}, d2 = {"Lcom/rkpandey/roomdatabase/presentation/NotesViewModel;", "Landroidx/lifecycle/ViewModel;", "dao", "Lcom/rkpandey/roomdatabase/data/NoteDao;", "(Lcom/rkpandey/roomdatabase/data/NoteDao;)V", "_isSearching", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_items", "", "Lcom/rkpandey/roomdatabase/data/Note;", "_searchText", "_state", "Lcom/rkpandey/roomdatabase/presentation/NoteState;", "get_state", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "isSearching", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "isSortedByDateAdded", "", "items", "getItems", "notes", "searchText", "getSearchText", "state", "getState", "onEvent", "", "event", "Lcom/rkpandey/roomdatabase/presentation/NotesEvent;", "onSearchTextChange", "text", "app_debug"})
public final class NotesViewModel extends androidx.lifecycle.ViewModel {
    private final com.rkpandey.roomdatabase.data.NoteDao dao = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _searchText = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> searchText = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _isSearching = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> isSearching = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.rkpandey.roomdatabase.data.Note>> _items = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.rkpandey.roomdatabase.data.Note>> items = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isSortedByDateAdded = null;
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.rkpandey.roomdatabase.data.Note>> notes;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.rkpandey.roomdatabase.presentation.NoteState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.rkpandey.roomdatabase.presentation.NoteState> state = null;
    
    public NotesViewModel(@org.jetbrains.annotations.NotNull
    com.rkpandey.roomdatabase.data.NoteDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSearchText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> isSearching() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.rkpandey.roomdatabase.data.Note>> getItems() {
        return null;
    }
    
    public final void onSearchTextChange(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.rkpandey.roomdatabase.presentation.NoteState> get_state() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.rkpandey.roomdatabase.presentation.NoteState> getState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.rkpandey.roomdatabase.presentation.NotesEvent event) {
    }
}