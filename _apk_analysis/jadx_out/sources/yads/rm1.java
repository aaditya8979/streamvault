package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes6.dex */
public class rm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f94492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f94495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f94496e;

    public rm1(int i10, long j10, Object obj) {
        this(obj, -1, -1, j10, i10);
    }

    public rm1(Object obj) {
        this(obj, -1L);
    }

    public rm1(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public rm1(Object obj, int i10, int i11, long j10, int i12) {
        this.f94492a = obj;
        this.f94493b = i10;
        this.f94494c = i11;
        this.f94495d = j10;
        this.f94496e = i12;
    }

    public rm1(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public rm1(rm1 rm1Var) {
        this.f94492a = rm1Var.f94492a;
        this.f94493b = rm1Var.f94493b;
        this.f94494c = rm1Var.f94494c;
        this.f94495d = rm1Var.f94495d;
        this.f94496e = rm1Var.f94496e;
    }

    public final boolean a() {
        return this.f94493b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm1)) {
            return false;
        }
        rm1 rm1Var = (rm1) obj;
        return this.f94492a.equals(rm1Var.f94492a) && this.f94493b == rm1Var.f94493b && this.f94494c == rm1Var.f94494c && this.f94495d == rm1Var.f94495d && this.f94496e == rm1Var.f94496e;
    }

    public final int hashCode() {
        return ((((((((this.f94492a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f94493b) * 31) + this.f94494c) * 31) + ((int) this.f94495d)) * 31) + this.f94496e;
    }
}
