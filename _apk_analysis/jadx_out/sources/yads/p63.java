package yads;

import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;
import yads.p63;
import yads.xq;

/* JADX INFO: loaded from: classes12.dex */
public final class p63 implements xq {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final wq f93446i = new wq() { // from class: bt.a8
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return p63.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f93447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f93448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f93449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f93450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f93451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f93452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e6 f93453h = e6.f89106h;

    public static p63 a(Bundle bundle) {
        int i10 = bundle.getInt(Integer.toString(0, 36), 0);
        long j10 = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
        long j11 = bundle.getLong(Integer.toString(2, 36), 0L);
        boolean z10 = bundle.getBoolean(Integer.toString(3, 36));
        Bundle bundle2 = bundle.getBundle(Integer.toString(4, 36));
        e6 e6Var = bundle2 != null ? (e6) e6.f89108j.fromBundle(bundle2) : e6.f89106h;
        p63 p63Var = new p63();
        p63Var.a(null, null, i10, j10, j11, e6Var, z10);
        return p63Var;
    }

    public final int a(int i10) {
        return this.f93453h.a(i10).a(-1);
    }

    public final int a(long j10) {
        e6 e6Var = this.f93453h;
        long j11 = this.f93450e;
        e6Var.getClass();
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = e6Var.f89113f;
        while (i10 < e6Var.f89110c) {
            if (e6Var.a(i10).f88761b == Long.MIN_VALUE || e6Var.a(i10).f88761b > j10) {
                d6 d6VarA = e6Var.a(i10);
                if (d6VarA.f88762c == -1 || d6VarA.a(-1) < d6VarA.f88762c) {
                    break;
                }
            }
            i10++;
        }
        if (i10 < e6Var.f89110c) {
            return i10;
        }
        return -1;
    }

    public final long a() {
        return this.f93451f;
    }

    public final long a(int i10, int i11) {
        d6 d6VarA = this.f93453h.a(i10);
        if (d6VarA.f88762c != -1) {
            return d6VarA.f88765f[i11];
        }
        return -9223372036854775807L;
    }

    public final p63 a(Object obj, Object obj2, int i10, long j10, long j11, e6 e6Var, boolean z10) {
        this.f93447b = obj;
        this.f93448c = obj2;
        this.f93449d = i10;
        this.f93450e = j10;
        this.f93451f = j11;
        this.f93453h = e6Var;
        this.f93452g = z10;
        return this;
    }

    public final int b(long j10) {
        e6 e6Var = this.f93453h;
        long j11 = this.f93450e;
        int i10 = e6Var.f89110c - 1;
        while (i10 >= 0 && j10 != Long.MIN_VALUE) {
            long j12 = e6Var.a(i10).f88761b;
            if (j12 != Long.MIN_VALUE) {
                if (j10 >= j12) {
                    break;
                }
                i10--;
            } else {
                if (j11 != -9223372036854775807L && j10 >= j11) {
                    break;
                }
                i10--;
            }
        }
        if (i10 >= 0) {
            d6 d6VarA = e6Var.a(i10);
            if (d6VarA.f88762c == -1) {
                return i10;
            }
            for (int i11 = 0; i11 < d6VarA.f88762c; i11++) {
                int i12 = d6VarA.f88764e[i11];
                if (i12 == 0 || i12 == 1) {
                    return i10;
                }
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p63.class.equals(obj.getClass())) {
            return false;
        }
        p63 p63Var = (p63) obj;
        return ib3.a(this.f93447b, p63Var.f93447b) && ib3.a(this.f93448c, p63Var.f93448c) && this.f93449d == p63Var.f93449d && this.f93450e == p63Var.f93450e && this.f93451f == p63Var.f93451f && this.f93452g == p63Var.f93452g && ib3.a(this.f93453h, p63Var.f93453h);
    }

    public final int hashCode() {
        Object obj = this.f93447b;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31;
        Object obj2 = this.f93448c;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f93449d) * 31;
        long j10 = this.f93450e;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f93451f;
        return this.f93453h.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f93452g ? 1 : 0)) * 31);
    }
}
