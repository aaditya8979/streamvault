package io.ktor.utils.io;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmSerializable.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface JvmSerializer<T> extends Serializable {
    T jvmDeserialize(@NotNull byte[] bArr);

    @NotNull
    byte[] jvmSerialize(T t10);
}
