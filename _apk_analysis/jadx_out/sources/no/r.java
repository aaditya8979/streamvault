package no;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Source.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface r extends j {
    void D(@NotNull i iVar, long j10);

    boolean exhausted();

    int g0(@NotNull byte[] bArr, int i10, int i11);

    @NotNull
    a getBuffer();

    long i(@NotNull i iVar);

    @NotNull
    r peek();

    byte readByte();

    boolean request(long j10);

    void require(long j10);
}
