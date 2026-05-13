package wo;

import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class h0<T extends Enum<T>> implements KSerializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final T[] f86532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public SerialDescriptor f86533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final bn.g f86534c;

    public h0(@NotNull final String str, @NotNull T[] tArr) {
        tn.p.k(str, "serialName");
        tn.p.k(tArr, "values");
        this.f86532a = tArr;
        this.f86534c = kotlin.b.b(new sn.a() { // from class: wo.g0
            @Override // sn.a
            public final Object invoke() {
                return h0.d(this.f86513b, str);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(@NotNull String str, @NotNull T[] tArr, @NotNull SerialDescriptor serialDescriptor) {
        this(str, tArr);
        tn.p.k(str, "serialName");
        tn.p.k(tArr, "values");
        tn.p.k(serialDescriptor, "descriptor");
        this.f86533b = serialDescriptor;
    }

    public static final SerialDescriptor d(h0 h0Var, String str) {
        SerialDescriptor serialDescriptor = h0Var.f86533b;
        return serialDescriptor == null ? h0Var.c(str) : serialDescriptor;
    }

    public final SerialDescriptor c(String str) {
        f0 f0Var = new f0(str, this.f86532a.length);
        for (T t10 : this.f86532a) {
            g2.o(f0Var, t10.name(), false, 2, null);
        }
        return f0Var;
    }

    @Override // so.c
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public T deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        int iS = decoder.s(getDescriptor());
        boolean z10 = false;
        if (iS >= 0 && iS < this.f86532a.length) {
            z10 = true;
        }
        if (z10) {
            return this.f86532a[iS];
        }
        throw new SerializationException(iS + " is not among valid " + getDescriptor().h() + " enum values, values size is " + this.f86532a.length);
    }

    @Override // so.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull T t10) {
        tn.p.k(encoder, "encoder");
        tn.p.k(t10, "value");
        int iI0 = cn.r.i0(this.f86532a, t10);
        if (iI0 != -1) {
            encoder.h(getDescriptor(), iI0);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t10);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().h());
        sb2.append(", must be one of ");
        String string = Arrays.toString(this.f86532a);
        tn.p.j(string, "toString(...)");
        sb2.append(string);
        throw new SerializationException(sb2.toString());
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f86534c.getValue();
    }

    @NotNull
    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().h() + '>';
    }
}
