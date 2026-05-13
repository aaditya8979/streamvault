package yads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import yads.pn0;
import yads.xq;

/* JADX INFO: loaded from: classes2.dex */
public final class pn0 extends be2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f93641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f93642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f93643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mx0 f93644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f93645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final rm1 f93646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f93647j;

    static {
        new wq() { // from class: bt.i8
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return new pn0(bundle);
            }
        };
    }

    public pn0(int i10, Throwable th2, int i11, int i12) {
        this(a(i10, null, null, -1, null, 4), th2, i11, i10, null, -1, null, 4, null, SystemClock.elapsedRealtime(), false);
    }

    public pn0(Bundle bundle) {
        super(bundle);
        this.f93641d = bundle.getInt(be2.a(1001), 2);
        this.f93642e = bundle.getString(be2.a(1002));
        this.f93643f = bundle.getInt(be2.a(1003), -1);
        Bundle bundle2 = bundle.getBundle(be2.a(1004));
        this.f93644g = bundle2 == null ? null : (mx0) mx0.I.fromBundle(bundle2);
        this.f93645h = bundle.getInt(be2.a(1005), 4);
        this.f93647j = bundle.getBoolean(be2.a(1006), false);
        this.f93646i = null;
    }

    public pn0(String str, Throwable th2, int i10, int i11, String str2, int i12, mx0 mx0Var, int i13, ym1 ym1Var, long j10, boolean z10) {
        super(str, th2, i10, j10);
        ni.a(!z10 || i11 == 1);
        ni.a(th2 != null || i11 == 3);
        this.f93641d = i11;
        this.f93642e = str2;
        this.f93643f = i12;
        this.f93644g = mx0Var;
        this.f93645h = i13;
        this.f93646i = ym1Var;
        this.f93647j = z10;
    }

    public static String a(int i10, String str, String str2, int i11, mx0 mx0Var, int i12) {
        String string;
        String str3;
        if (i10 == 0) {
            string = "Source error";
        } else if (i10 != 1) {
            string = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" error, index=");
            sb2.append(i11);
            sb2.append(", format=");
            sb2.append(mx0Var);
            sb2.append(", format_supported=");
            int i13 = ib3.f90737a;
            if (i12 == 0) {
                str3 = "NO";
            } else if (i12 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i12 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i12 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            sb2.append(str3);
            string = sb2.toString();
        }
        if (TextUtils.isEmpty(str)) {
            return string;
        }
        return string + ": " + str;
    }
}
