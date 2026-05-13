package wo;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uo.k;
import uo.l;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends g2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final uo.k f86506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final bn.g f86507n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(@NotNull final String str, final int i10) {
        super(str, null, i10, 2, null);
        tn.p.k(str, "name");
        this.f86506m = k.b.f85772a;
        this.f86507n = kotlin.b.b(new sn.a() { // from class: wo.e0
            @Override // sn.a
            public final Object invoke() {
                return f0.y(i10, str, this);
            }
        });
    }

    public static final SerialDescriptor[] y(int i10, String str, f0 f0Var) {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            serialDescriptorArr[i11] = uo.j.e(str + '.' + f0Var.f(i11), l.d.f85776a, new SerialDescriptor[0], null, 8, null);
        }
        return serialDescriptorArr;
    }

    @Override // wo.g2, kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor d(int i10) {
        return z()[i10];
    }

    @Override // wo.g2
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.getKind() == k.b.f85772a && tn.p.f(h(), serialDescriptor.h()) && tn.p.f(b2.a(this), b2.a(serialDescriptor));
    }

    @Override // wo.g2, kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public uo.k getKind() {
        return this.f86506m;
    }

    @Override // wo.g2
    public int hashCode() {
        int iHashCode = h().hashCode();
        Iterator<String> it = uo.h.b(this).iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            int i10 = iHashCode2 * 31;
            String next = it.next();
            iHashCode2 = i10 + (next != null ? next.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // wo.g2
    @NotNull
    public String toString() {
        return cn.f0.D0(uo.h.b(this), ", ", h() + '(', ")", 0, null, null, 56, null);
    }

    public final SerialDescriptor[] z() {
        return (SerialDescriptor[]) this.f86507n.getValue();
    }
}
