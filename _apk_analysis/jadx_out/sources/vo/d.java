package vo;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import so.l;
import tn.p;

/* JADX INFO: compiled from: Encoding.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface d {
    void D(@NotNull SerialDescriptor serialDescriptor, int i10, float f10);

    void H(@NotNull SerialDescriptor serialDescriptor, int i10, double d10);

    void c(@NotNull SerialDescriptor serialDescriptor);

    <T> void f(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull l<? super T> lVar, @Nullable T t10);

    <T> void g(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull l<? super T> lVar, T t10);

    void j(@NotNull SerialDescriptor serialDescriptor, int i10, char c10);

    void k(@NotNull SerialDescriptor serialDescriptor, int i10, byte b10);

    void o(@NotNull SerialDescriptor serialDescriptor, int i10, int i11);

    void p(@NotNull SerialDescriptor serialDescriptor, int i10, boolean z10);

    void q(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull String str);

    default boolean r(@NotNull SerialDescriptor serialDescriptor, int i10) {
        p.k(serialDescriptor, "descriptor");
        return true;
    }

    void u(@NotNull SerialDescriptor serialDescriptor, int i10, short s10);

    void v(@NotNull SerialDescriptor serialDescriptor, int i10, long j10);

    @NotNull
    Encoder x(@NotNull SerialDescriptor serialDescriptor, int i10);
}
