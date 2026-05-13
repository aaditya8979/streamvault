package no;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sink.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface q extends i {
    static /* synthetic */ void h0(q qVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        qVar.write(bArr, i10, i11);
    }

    @NotNull
    a getBuffer();

    long j(@NotNull j jVar);

    void q(byte b10);

    void write(@NotNull byte[] bArr, int i10, int i11);
}
