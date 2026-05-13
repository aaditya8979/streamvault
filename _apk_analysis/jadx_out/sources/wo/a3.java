package wo;

import java.util.ArrayList;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a3<Tag> implements Encoder, vo.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<Tag> f86475a = new ArrayList<>();

    private final boolean I(SerialDescriptor serialDescriptor, int i10) {
        Z(X(serialDescriptor, i10));
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void B(long j10) {
        R(Y(), j10);
    }

    @Override // vo.d
    public final void D(@NotNull SerialDescriptor serialDescriptor, int i10, float f10) {
        tn.p.k(serialDescriptor, "descriptor");
        O(X(serialDescriptor, i10), f10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void E(char c10) {
        L(Y(), c10);
    }

    @Override // vo.d
    public final void H(@NotNull SerialDescriptor serialDescriptor, int i10, double d10) {
        tn.p.k(serialDescriptor, "descriptor");
        M(X(serialDescriptor, i10), d10);
    }

    public abstract void J(Tag tag, boolean z10);

    public abstract void K(Tag tag, byte b10);

    public abstract void L(Tag tag, char c10);

    public abstract void M(Tag tag, double d10);

    public abstract void N(Tag tag, @NotNull SerialDescriptor serialDescriptor, int i10);

    public abstract void O(Tag tag, float f10);

    @NotNull
    public Encoder P(Tag tag, @NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "inlineDescriptor");
        Z(tag);
        return this;
    }

    public abstract void Q(Tag tag, int i10);

    public abstract void R(Tag tag, long j10);

    public abstract void S(Tag tag, short s10);

    public abstract void T(Tag tag, @NotNull String str);

    public abstract void U(@NotNull SerialDescriptor serialDescriptor);

    public final Tag V() {
        return (Tag) cn.f0.F0(this.f86475a);
    }

    @Nullable
    public final Tag W() {
        return (Tag) cn.f0.G0(this.f86475a);
    }

    public abstract Tag X(@NotNull SerialDescriptor serialDescriptor, int i10);

    public final Tag Y() {
        if (!(!this.f86475a.isEmpty())) {
            throw new SerializationException("No tag in stack for requested element");
        }
        ArrayList<Tag> arrayList = this.f86475a;
        return arrayList.remove(cn.w.o(arrayList));
    }

    public final void Z(Tag tag) {
        this.f86475a.add(tag);
    }

    @Override // vo.d
    public final void c(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        if (!this.f86475a.isEmpty()) {
            Y();
        }
        U(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void e(byte b10) {
        K(Y(), b10);
    }

    @Override // vo.d
    public <T> void f(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull so.l<? super T> lVar, @Nullable T t10) {
        tn.p.k(serialDescriptor, "descriptor");
        tn.p.k(lVar, "serializer");
        if (I(serialDescriptor, i10)) {
            G(lVar, t10);
        }
    }

    @Override // vo.d
    public <T> void g(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull so.l<? super T> lVar, T t10) {
        tn.p.k(serialDescriptor, "descriptor");
        tn.p.k(lVar, "serializer");
        if (I(serialDescriptor, i10)) {
            z(lVar, t10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void h(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "enumDescriptor");
        N(Y(), serialDescriptor, i10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @NotNull
    public Encoder i(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        return P(Y(), serialDescriptor);
    }

    @Override // vo.d
    public final void j(@NotNull SerialDescriptor serialDescriptor, int i10, char c10) {
        tn.p.k(serialDescriptor, "descriptor");
        L(X(serialDescriptor, i10), c10);
    }

    @Override // vo.d
    public final void k(@NotNull SerialDescriptor serialDescriptor, int i10, byte b10) {
        tn.p.k(serialDescriptor, "descriptor");
        K(X(serialDescriptor, i10), b10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void l(short s10) {
        S(Y(), s10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void m(boolean z10) {
        J(Y(), z10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void n(float f10) {
        O(Y(), f10);
    }

    @Override // vo.d
    public final void o(@NotNull SerialDescriptor serialDescriptor, int i10, int i11) {
        tn.p.k(serialDescriptor, "descriptor");
        Q(X(serialDescriptor, i10), i11);
    }

    @Override // vo.d
    public final void p(@NotNull SerialDescriptor serialDescriptor, int i10, boolean z10) {
        tn.p.k(serialDescriptor, "descriptor");
        J(X(serialDescriptor, i10), z10);
    }

    @Override // vo.d
    public final void q(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull String str) {
        tn.p.k(serialDescriptor, "descriptor");
        tn.p.k(str, "value");
        T(X(serialDescriptor, i10), str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void t(int i10) {
        Q(Y(), i10);
    }

    @Override // vo.d
    public final void u(@NotNull SerialDescriptor serialDescriptor, int i10, short s10) {
        tn.p.k(serialDescriptor, "descriptor");
        S(X(serialDescriptor, i10), s10);
    }

    @Override // vo.d
    public final void v(@NotNull SerialDescriptor serialDescriptor, int i10, long j10) {
        tn.p.k(serialDescriptor, "descriptor");
        R(X(serialDescriptor, i10), j10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void w(@NotNull String str) {
        tn.p.k(str, "value");
        T(Y(), str);
    }

    @Override // vo.d
    @NotNull
    public final Encoder x(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return P(X(serialDescriptor, i10), serialDescriptor.d(i10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void y(double d10) {
        M(Y(), d10);
    }
}
