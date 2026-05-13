package vo;

import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: AbstractDecoder.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class a implements Decoder, c {
    @Override // kotlinx.serialization.encoding.Decoder
    public boolean B() {
        Object objK = K();
        p.i(objK, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objK).booleanValue();
    }

    @Override // vo.c
    @Nullable
    public final <T> T C(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull so.c<? extends T> cVar, @Nullable T t10) {
        p.k(serialDescriptor, "descriptor");
        p.k(cVar, "deserializer");
        return (cVar.getDescriptor().b() || F()) ? (T) J(cVar, t10) : (T) h();
    }

    @Override // vo.c
    public final byte D(@NotNull SerialDescriptor serialDescriptor, int i10) {
        p.k(serialDescriptor, "descriptor");
        return I();
    }

    @Override // vo.c
    public final boolean E(@NotNull SerialDescriptor serialDescriptor, int i10) {
        p.k(serialDescriptor, "descriptor");
        return B();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean F() {
        return true;
    }

    @Override // vo.c
    public final short G(@NotNull SerialDescriptor serialDescriptor, int i10) {
        p.k(serialDescriptor, "descriptor");
        return n();
    }

    @Override // vo.c
    public final double H(@NotNull SerialDescriptor serialDescriptor, int i10) {
        p.k(serialDescriptor, "descriptor");
        return o();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte I();

    public <T> T J(@NotNull so.c<? extends T> cVar, @Nullable T t10) {
        p.k(cVar, "deserializer");
        return (T) A(cVar);
    }

    @NotNull
    public Object K() {
        throw new SerializationException(t.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @NotNull
    public c b(@NotNull SerialDescriptor serialDescriptor) {
        p.k(serialDescriptor, "descriptor");
        return this;
    }

    @Override // vo.c
    public void c(@NotNull SerialDescriptor serialDescriptor) {
        p.k(serialDescriptor, "descriptor");
    }

    @Override // vo.c
    public final long f(@NotNull SerialDescriptor serialDescriptor, int i10) {
        p.k(serialDescriptor, "descriptor");
        return j();
    }

    @Override // vo.c
    public final int g(@NotNull SerialDescriptor serialDescriptor, int i10) {
        p.k(serialDescriptor, "descriptor");
        return u();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @Nullable
    public Void h() {
        return null;
    }

    @Override // vo.c
    public <T> T i(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull so.c<? extends T> cVar, @Nullable T t10) {
        p.k(serialDescriptor, "descriptor");
        p.k(cVar, "deserializer");
        return (T) J(cVar, t10);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long j();

    @Override // vo.c
    @NotNull
    public final String k(@NotNull SerialDescriptor serialDescriptor, int i10) {
        p.k(serialDescriptor, "descriptor");
        return q();
    }

    @Override // vo.c
    @NotNull
    public Decoder m(@NotNull SerialDescriptor serialDescriptor, int i10) {
        p.k(serialDescriptor, "descriptor");
        return x(serialDescriptor.d(i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short n();

    @Override // kotlinx.serialization.encoding.Decoder
    public double o() {
        Object objK = K();
        p.i(objK, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objK).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char p() {
        Object objK = K();
        p.i(objK, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objK).charValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @NotNull
    public String q() {
        Object objK = K();
        p.i(objK, "null cannot be cast to non-null type kotlin.String");
        return (String) objK;
    }

    @Override // vo.c
    public final char r(@NotNull SerialDescriptor serialDescriptor, int i10) {
        p.k(serialDescriptor, "descriptor");
        return p();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int s(@NotNull SerialDescriptor serialDescriptor) {
        p.k(serialDescriptor, "enumDescriptor");
        Object objK = K();
        p.i(objK, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objK).intValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int u();

    @Override // kotlinx.serialization.encoding.Decoder
    @NotNull
    public Decoder x(@NotNull SerialDescriptor serialDescriptor) {
        p.k(serialDescriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float y() {
        Object objK = K();
        p.i(objK, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objK).floatValue();
    }

    @Override // vo.c
    public final float z(@NotNull SerialDescriptor serialDescriptor, int i10) {
        p.k(serialDescriptor, "descriptor");
        return y();
    }
}
