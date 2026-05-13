package wo;

import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class z2<Tag> implements Decoder, vo.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList<Tag> f86654b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f86655c;

    public static final Object L(z2 z2Var, so.c cVar, Object obj) {
        return (cVar.getDescriptor().b() || z2Var.F()) ? z2Var.N(cVar, obj) : z2Var.h();
    }

    public static final Object M(z2 z2Var, so.c cVar, Object obj) {
        return z2Var.N(cVar, obj);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean B() {
        return O(c0());
    }

    @Override // vo.c
    @Nullable
    public final <T> T C(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull final so.c<? extends T> cVar, @Nullable final T t10) {
        tn.p.k(serialDescriptor, "descriptor");
        tn.p.k(cVar, "deserializer");
        return (T) e0(a0(serialDescriptor, i10), new sn.a() { // from class: wo.x2
            @Override // sn.a
            public final Object invoke() {
                return z2.L(this.f86641b, cVar, t10);
            }
        });
    }

    @Override // vo.c
    public final byte D(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return P(a0(serialDescriptor, i10));
    }

    @Override // vo.c
    public final boolean E(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return O(a0(serialDescriptor, i10));
    }

    @Override // vo.c
    public final short G(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return X(a0(serialDescriptor, i10));
    }

    @Override // vo.c
    public final double H(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return R(a0(serialDescriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte I() {
        return P(c0());
    }

    public <T> T N(@NotNull so.c<? extends T> cVar, @Nullable T t10) {
        tn.p.k(cVar, "deserializer");
        return (T) A(cVar);
    }

    public abstract boolean O(Tag tag);

    public abstract byte P(Tag tag);

    public abstract char Q(Tag tag);

    public abstract double R(Tag tag);

    public abstract int S(Tag tag, @NotNull SerialDescriptor serialDescriptor);

    public abstract float T(Tag tag);

    @NotNull
    public Decoder U(Tag tag, @NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "inlineDescriptor");
        d0(tag);
        return this;
    }

    public abstract int V(Tag tag);

    public abstract long W(Tag tag);

    public abstract short X(Tag tag);

    @NotNull
    public abstract String Y(Tag tag);

    @Nullable
    public final Tag Z() {
        return (Tag) cn.f0.G0(this.f86654b);
    }

    public abstract Tag a0(@NotNull SerialDescriptor serialDescriptor, int i10);

    @NotNull
    public final ArrayList<Tag> b0() {
        return this.f86654b;
    }

    public final Tag c0() {
        ArrayList<Tag> arrayList = this.f86654b;
        Tag tagRemove = arrayList.remove(cn.w.o(arrayList));
        this.f86655c = true;
        return tagRemove;
    }

    public final void d0(Tag tag) {
        this.f86654b.add(tag);
    }

    public final <E> E e0(Tag tag, sn.a<? extends E> aVar) {
        d0(tag);
        E eInvoke = aVar.invoke();
        if (!this.f86655c) {
            c0();
        }
        this.f86655c = false;
        return eInvoke;
    }

    @Override // vo.c
    public final long f(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return W(a0(serialDescriptor, i10));
    }

    @Override // vo.c
    public final int g(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return V(a0(serialDescriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @Nullable
    public final Void h() {
        return null;
    }

    @Override // vo.c
    public final <T> T i(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull final so.c<? extends T> cVar, @Nullable final T t10) {
        tn.p.k(serialDescriptor, "descriptor");
        tn.p.k(cVar, "deserializer");
        return (T) e0(a0(serialDescriptor, i10), new sn.a() { // from class: wo.y2
            @Override // sn.a
            public final Object invoke() {
                return z2.M(this.f86649b, cVar, t10);
            }
        });
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long j() {
        return W(c0());
    }

    @Override // vo.c
    @NotNull
    public final String k(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return Y(a0(serialDescriptor, i10));
    }

    @Override // vo.c
    @NotNull
    public final Decoder m(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return U(a0(serialDescriptor, i10), serialDescriptor.d(i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short n() {
        return X(c0());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double o() {
        return R(c0());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char p() {
        return Q(c0());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @NotNull
    public final String q() {
        return Y(c0());
    }

    @Override // vo.c
    public final char r(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return Q(a0(serialDescriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int s(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "enumDescriptor");
        return S(c0(), serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int u() {
        return V(c0());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @NotNull
    public Decoder x(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        return U(c0(), serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float y() {
        return T(c0());
    }

    @Override // vo.c
    public final float z(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return T(a0(serialDescriptor, i10));
    }
}
