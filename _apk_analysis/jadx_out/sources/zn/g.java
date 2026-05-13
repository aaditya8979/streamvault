package zn;

import cn.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes10.dex */
public class g implements Iterable<Integer>, un.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f98353e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f98356d;

    /* JADX INFO: compiled from: Progressions.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final g a(int i10, int i11, int i12) {
            return new g(i10, i11, i12);
        }
    }

    public g(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f98354b = i10;
        this.f98355c = ln.c.c(i10, i11, i12);
        this.f98356d = i12;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (this.f98354b != gVar.f98354b || this.f98355c != gVar.f98355c || this.f98356d != gVar.f98356d) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f98354b;
    }

    public final int g() {
        return this.f98355c;
    }

    public final int h() {
        return this.f98356d;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f98354b * 31) + this.f98355c) * 31) + this.f98356d;
    }

    public boolean isEmpty() {
        if (this.f98356d > 0) {
            if (this.f98354b > this.f98355c) {
                return true;
            }
        } else if (this.f98354b < this.f98355c) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public k0 iterator() {
        return new h(this.f98354b, this.f98355c, this.f98356d);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f98356d > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f98354b);
            sb2.append("..");
            sb2.append(this.f98355c);
            sb2.append(" step ");
            i10 = this.f98356d;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f98354b);
            sb2.append(" downTo ");
            sb2.append(this.f98355c);
            sb2.append(" step ");
            i10 = -this.f98356d;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
