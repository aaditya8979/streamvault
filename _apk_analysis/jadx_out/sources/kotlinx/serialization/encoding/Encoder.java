package kotlinx.serialization.encoding;

import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import so.l;
import tn.p;
import vo.d;
import zo.c;

/* JADX INFO: compiled from: Encoding.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface Encoder {
    @NotNull
    default d A(@NotNull SerialDescriptor serialDescriptor, int i10) {
        p.k(serialDescriptor, "descriptor");
        return b(serialDescriptor);
    }

    void B(long j10);

    void C();

    void E(char c10);

    default void F() {
    }

    default <T> void G(@NotNull l<? super T> lVar, @Nullable T t10) {
        p.k(lVar, "serializer");
        if (lVar.getDescriptor().b()) {
            z(lVar, t10);
        } else if (t10 == null) {
            C();
        } else {
            F();
            z(lVar, t10);
        }
    }

    @NotNull
    c a();

    @NotNull
    d b(@NotNull SerialDescriptor serialDescriptor);

    void e(byte b10);

    void h(@NotNull SerialDescriptor serialDescriptor, int i10);

    @NotNull
    Encoder i(@NotNull SerialDescriptor serialDescriptor);

    void l(short s10);

    void m(boolean z10);

    void n(float f10);

    void t(int i10);

    void w(@NotNull String str);

    void y(double d10);

    /* JADX WARN: Multi-variable type inference failed */
    default <T> void z(@NotNull l<? super T> lVar, T t10) {
        p.k(lVar, "serializer");
        lVar.serialize(this, t10);
    }
}
