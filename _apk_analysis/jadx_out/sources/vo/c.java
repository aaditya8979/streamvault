package vo;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Decoding.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f86125a = a.f86126a;

    /* JADX INFO: compiled from: Decoding.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f86126a = new a();
    }

    static /* synthetic */ Object e(c cVar, SerialDescriptor serialDescriptor, int i10, so.c cVar2, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
        if ((i11 & 8) != 0) {
            obj = null;
        }
        return cVar.i(serialDescriptor, i10, cVar2, obj);
    }

    @Nullable
    <T> T C(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull so.c<? extends T> cVar, @Nullable T t10);

    byte D(@NotNull SerialDescriptor serialDescriptor, int i10);

    boolean E(@NotNull SerialDescriptor serialDescriptor, int i10);

    short G(@NotNull SerialDescriptor serialDescriptor, int i10);

    double H(@NotNull SerialDescriptor serialDescriptor, int i10);

    @NotNull
    zo.c a();

    void c(@NotNull SerialDescriptor serialDescriptor);

    long f(@NotNull SerialDescriptor serialDescriptor, int i10);

    int g(@NotNull SerialDescriptor serialDescriptor, int i10);

    <T> T i(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull so.c<? extends T> cVar, @Nullable T t10);

    @NotNull
    String k(@NotNull SerialDescriptor serialDescriptor, int i10);

    default boolean l() {
        return false;
    }

    @NotNull
    Decoder m(@NotNull SerialDescriptor serialDescriptor, int i10);

    char r(@NotNull SerialDescriptor serialDescriptor, int i10);

    default int v(@NotNull SerialDescriptor serialDescriptor) {
        p.k(serialDescriptor, "descriptor");
        return -1;
    }

    int w(@NotNull SerialDescriptor serialDescriptor);

    float z(@NotNull SerialDescriptor serialDescriptor, int i10);
}
