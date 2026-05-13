package io.ktor.http;

import bo.a0;
import gl.i0;
import io.ktor.utils.io.JvmSerializer;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Url.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class UrlJvmSerializer implements JvmSerializer<Url> {

    @NotNull
    public static final UrlJvmSerializer INSTANCE = new UrlJvmSerializer();

    private UrlJvmSerializer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.ktor.utils.io.JvmSerializer
    @NotNull
    public Url jvmDeserialize(@NotNull byte[] bArr) {
        p.k(bArr, "value");
        return i0.d(a0.B(bArr));
    }

    @Override // io.ktor.utils.io.JvmSerializer
    @NotNull
    public byte[] jvmSerialize(@NotNull Url url) {
        p.k(url, "value");
        return a0.E(url.toString());
    }
}
