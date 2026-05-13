package kotlinx.serialization.encoding;

import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import so.c;
import tn.p;

/* JADX INFO: compiled from: Decoding.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface Decoder {
    default <T> T A(@NotNull c<? extends T> cVar) {
        p.k(cVar, "deserializer");
        return cVar.deserialize(this);
    }

    boolean B();

    boolean F();

    byte I();

    @NotNull
    zo.c a();

    @NotNull
    vo.c b(@NotNull SerialDescriptor serialDescriptor);

    @Nullable
    Void h();

    long j();

    short n();

    double o();

    char p();

    @NotNull
    String q();

    int s(@NotNull SerialDescriptor serialDescriptor);

    int u();

    @NotNull
    Decoder x(@NotNull SerialDescriptor serialDescriptor);

    float y();
}
