package yads;

import android.net.Uri;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes2.dex */
public final class pl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f93637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f93639d;

    public pl2(String str, long j10, long j11) {
        this.f93638c = str == null ? "" : str;
        this.f93636a = j10;
        this.f93637b = j11;
    }

    public final Uri a(String str) {
        return Uri.parse(oa3.a(str, this.f93638c));
    }

    public final pl2 a(pl2 pl2Var, String str) {
        String strA = oa3.a(str, this.f93638c);
        if (pl2Var != null && strA.equals(oa3.a(str, pl2Var.f93638c))) {
            long j10 = this.f93637b;
            if (j10 != -1) {
                long j11 = this.f93636a;
                if (j11 + j10 == pl2Var.f93636a) {
                    long j12 = pl2Var.f93637b;
                    return new pl2(strA, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = pl2Var.f93637b;
            if (j13 != -1) {
                long j14 = pl2Var.f93636a;
                if (j14 + j13 == this.f93636a) {
                    return new pl2(strA, j14, j10 == -1 ? -1L : j13 + j10);
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pl2.class != obj.getClass()) {
            return false;
        }
        pl2 pl2Var = (pl2) obj;
        return this.f93636a == pl2Var.f93636a && this.f93637b == pl2Var.f93637b && this.f93638c.equals(pl2Var.f93638c);
    }

    public final int hashCode() {
        if (this.f93639d == 0) {
            this.f93639d = this.f93638c.hashCode() + ((((((int) this.f93636a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f93637b)) * 31);
        }
        return this.f93639d;
    }

    public final String toString() {
        return "RangedUri(referenceUri=" + this.f93638c + ", start=" + this.f93636a + ", length=" + this.f93637b + ")";
    }
}
