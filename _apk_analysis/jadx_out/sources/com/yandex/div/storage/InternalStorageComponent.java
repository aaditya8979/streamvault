package com.yandex.div.storage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InternalStorageComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InternalStorageComponent implements DivStorageComponent {

    @NotNull
    private final RawJsonRepository rawJsonRepository;

    @NotNull
    private final DivDataRepository repository;

    @NotNull
    private final DivStorage storage;

    public InternalStorageComponent(@NotNull DivDataRepository divDataRepository, @NotNull RawJsonRepository rawJsonRepository, @NotNull DivStorage divStorage) {
        this.repository = divDataRepository;
        this.rawJsonRepository = rawJsonRepository;
        this.storage = divStorage;
    }

    @Override // com.yandex.div.storage.DivStorageComponent
    @NotNull
    public RawJsonRepository getRawJsonRepository() {
        return this.rawJsonRepository;
    }
}
