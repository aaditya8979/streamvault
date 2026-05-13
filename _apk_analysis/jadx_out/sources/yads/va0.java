package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes3.dex */
public final class va0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx0 f96041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mx0 f96042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f96043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f96044e;

    public va0(String str, mx0 mx0Var, mx0 mx0Var2, int i10, int i11) {
        ni.a(i10 == 0 || i11 == 0);
        this.f96040a = ni.a(str);
        this.f96041b = (mx0) ni.a(mx0Var);
        this.f96042c = (mx0) ni.a(mx0Var2);
        this.f96043d = i10;
        this.f96044e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || va0.class != obj.getClass()) {
            return false;
        }
        va0 va0Var = (va0) obj;
        return this.f96043d == va0Var.f96043d && this.f96044e == va0Var.f96044e && this.f96040a.equals(va0Var.f96040a) && this.f96041b.equals(va0Var.f96041b) && this.f96042c.equals(va0Var.f96042c);
    }

    public final int hashCode() {
        return this.f96042c.hashCode() + ((this.f96041b.hashCode() + k4.a(this.f96040a, (((this.f96043d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f96044e) * 31, 31)) * 31);
    }
}
