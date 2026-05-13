package yo;

import com.ironsource.C3978d4;
import com.ironsource.Q6;
import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uo.l;

/* JADX INFO: compiled from: JsonPath.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Object[] f97965a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public int[] f97966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f97967c;

    /* JADX INFO: compiled from: JsonPath.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f97968a = new a();
    }

    public n0() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f97966b = iArr;
        this.f97967c = -1;
    }

    @NotNull
    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i10 = this.f97967c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f97965a[i11];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!tn.p.f(serialDescriptor.getKind(), l.b.f85774a)) {
                    int i12 = this.f97966b[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(serialDescriptor.f(i12));
                    }
                } else if (this.f97966b[i11] != -1) {
                    sb2.append(C3978d4.j.f31383d);
                    sb2.append(this.f97966b[i11]);
                    sb2.append(C3978d4.j.f31385e);
                }
            } else if (obj != a.f97968a) {
                sb2.append(C3978d4.j.f31383d);
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append(C3978d4.j.f31385e);
            }
        }
        return sb2.toString();
    }

    public final void b() {
        int i10 = this.f97967c;
        int[] iArr = this.f97966b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f97967c = i10 - 1;
        }
        int i11 = this.f97967c;
        if (i11 != -1) {
            this.f97967c = i11 - 1;
        }
    }

    public final void c(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, Q6.f30284z0);
        int i10 = this.f97967c + 1;
        this.f97967c = i10;
        if (i10 == this.f97965a.length) {
            e();
        }
        this.f97965a[i10] = serialDescriptor;
    }

    public final void d() {
        int[] iArr = this.f97966b;
        int i10 = this.f97967c;
        if (iArr[i10] == -2) {
            this.f97965a[i10] = a.f97968a;
        }
    }

    public final void e() {
        int i10 = this.f97967c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f97965a, i10);
        tn.p.j(objArrCopyOf, "copyOf(...)");
        this.f97965a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f97966b, i10);
        tn.p.j(iArrCopyOf, "copyOf(...)");
        this.f97966b = iArrCopyOf;
    }

    public final void f(@Nullable Object obj) {
        int[] iArr = this.f97966b;
        int i10 = this.f97967c;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f97967c = i11;
            if (i11 == this.f97965a.length) {
                e();
            }
        }
        Object[] objArr = this.f97965a;
        int i12 = this.f97967c;
        objArr[i12] = obj;
        this.f97966b[i12] = -2;
    }

    public final void g(int i10) {
        this.f97966b[this.f97967c] = i10;
    }

    @NotNull
    public String toString() {
        return a();
    }
}
