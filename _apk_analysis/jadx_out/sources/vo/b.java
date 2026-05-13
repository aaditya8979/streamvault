package vo;

import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import so.l;
import tn.p;
import tn.t;
import wo.p1;

/* JADX INFO: compiled from: AbstractEncoder.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class b implements Encoder, d {
    @Override // kotlinx.serialization.encoding.Encoder
    public void B(long j10) {
        J(Long.valueOf(j10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void C() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // vo.d
    public final void D(@NotNull SerialDescriptor serialDescriptor, int i10, float f10) {
        p.k(serialDescriptor, "descriptor");
        if (I(serialDescriptor, i10)) {
            n(f10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void E(char c10) {
        J(Character.valueOf(c10));
    }

    @Override // vo.d
    public final void H(@NotNull SerialDescriptor serialDescriptor, int i10, double d10) {
        p.k(serialDescriptor, "descriptor");
        if (I(serialDescriptor, i10)) {
            y(d10);
        }
    }

    public boolean I(@NotNull SerialDescriptor serialDescriptor, int i10) {
        p.k(serialDescriptor, "descriptor");
        return true;
    }

    public void J(@NotNull Object obj) {
        p.k(obj, "value");
        throw new SerializationException("Non-serializable " + t.b(obj.getClass()) + " is not supported by " + t.b(getClass()) + " encoder");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @NotNull
    public d b(@NotNull SerialDescriptor serialDescriptor) {
        p.k(serialDescriptor, "descriptor");
        return this;
    }

    @Override // vo.d
    public void c(@NotNull SerialDescriptor serialDescriptor) {
        p.k(serialDescriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void e(byte b10) {
        J(Byte.valueOf(b10));
    }

    @Override // vo.d
    public <T> void f(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull l<? super T> lVar, @Nullable T t10) {
        p.k(serialDescriptor, "descriptor");
        p.k(lVar, "serializer");
        if (I(serialDescriptor, i10)) {
            G(lVar, t10);
        }
    }

    @Override // vo.d
    public <T> void g(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull l<? super T> lVar, T t10) {
        p.k(serialDescriptor, "descriptor");
        p.k(lVar, "serializer");
        if (I(serialDescriptor, i10)) {
            z(lVar, t10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void h(@NotNull SerialDescriptor serialDescriptor, int i10) {
        p.k(serialDescriptor, "enumDescriptor");
        J(Integer.valueOf(i10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @NotNull
    public Encoder i(@NotNull SerialDescriptor serialDescriptor) {
        p.k(serialDescriptor, "descriptor");
        return this;
    }

    @Override // vo.d
    public final void j(@NotNull SerialDescriptor serialDescriptor, int i10, char c10) {
        p.k(serialDescriptor, "descriptor");
        if (I(serialDescriptor, i10)) {
            E(c10);
        }
    }

    @Override // vo.d
    public final void k(@NotNull SerialDescriptor serialDescriptor, int i10, byte b10) {
        p.k(serialDescriptor, "descriptor");
        if (I(serialDescriptor, i10)) {
            e(b10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void l(short s10) {
        J(Short.valueOf(s10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void m(boolean z10) {
        J(Boolean.valueOf(z10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void n(float f10) {
        J(Float.valueOf(f10));
    }

    @Override // vo.d
    public final void o(@NotNull SerialDescriptor serialDescriptor, int i10, int i11) {
        p.k(serialDescriptor, "descriptor");
        if (I(serialDescriptor, i10)) {
            t(i11);
        }
    }

    @Override // vo.d
    public final void p(@NotNull SerialDescriptor serialDescriptor, int i10, boolean z10) {
        p.k(serialDescriptor, "descriptor");
        if (I(serialDescriptor, i10)) {
            m(z10);
        }
    }

    @Override // vo.d
    public final void q(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull String str) {
        p.k(serialDescriptor, "descriptor");
        p.k(str, "value");
        if (I(serialDescriptor, i10)) {
            w(str);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void t(int i10) {
        J(Integer.valueOf(i10));
    }

    @Override // vo.d
    public final void u(@NotNull SerialDescriptor serialDescriptor, int i10, short s10) {
        p.k(serialDescriptor, "descriptor");
        if (I(serialDescriptor, i10)) {
            l(s10);
        }
    }

    @Override // vo.d
    public final void v(@NotNull SerialDescriptor serialDescriptor, int i10, long j10) {
        p.k(serialDescriptor, "descriptor");
        if (I(serialDescriptor, i10)) {
            B(j10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void w(@NotNull String str) {
        p.k(str, "value");
        J(str);
    }

    @Override // vo.d
    @NotNull
    public final Encoder x(@NotNull SerialDescriptor serialDescriptor, int i10) {
        p.k(serialDescriptor, "descriptor");
        return I(serialDescriptor, i10) ? i(serialDescriptor.d(i10)) : p1.f86584a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void y(double d10) {
        J(Double.valueOf(d10));
    }
}
