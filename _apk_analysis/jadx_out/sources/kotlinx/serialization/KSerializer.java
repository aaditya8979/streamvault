package kotlinx.serialization;

import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import so.c;
import so.l;

/* JADX INFO: compiled from: KSerializer.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface KSerializer<T> extends l<T>, c<T> {
    @Override // so.l, so.c
    @NotNull
    SerialDescriptor getDescriptor();
}
