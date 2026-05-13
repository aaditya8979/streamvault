package yads;

import android.util.Base64;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class vo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ju1 f96151a;

    static {
        ju1 ju1Var = ju1.f91373b;
        f96151a = iu1.a();
    }

    public static final void a(long j10, po2 po2Var, e82 e82Var) {
        String strB;
        String str;
        byte[] bArrB = po2Var.b();
        String strB2 = null;
        if (bArrB != null) {
            try {
                strB = bo.a0.B(bArrB);
            } catch (Exception unused) {
                strB = "UNKNOWN_CONTENT";
            }
            str = strB;
        } else {
            str = null;
        }
        byte[] bArr = e82Var.f89158b;
        if (bArr != null) {
            if (po2Var instanceof o41) {
                strB2 = "IMAGE_CONTENT";
            } else {
                try {
                    strB2 = bo.a0.B(Base64.decode(bArr, 0));
                } catch (IllegalArgumentException unused2) {
                    strB2 = bo.a0.B(bArr);
                } catch (Exception unused3) {
                    strB2 = "UNKNOWN_CONTENT";
                }
            }
        }
        ju1 ju1Var = f96151a;
        int i10 = po2Var.f93670c;
        String str2 = i10 == 0 ? "GET" : i10 == 1 ? "POST" : i10 == 2 ? "PUT" : i10 == 3 ? "DELETE" : i10 == 4 ? "HEAD" : i10 == 5 ? "OPTIONS" : i10 == 6 ? "TRACE" : i10 == 7 ? "PATCH" : "UNKNOWN";
        String strG = po2Var.g();
        Map mapD = po2Var.d();
        Integer numValueOf = Integer.valueOf(e82Var.f89157a);
        Map map = e82Var.f89159c;
        ju1Var.getClass();
        if (eu1.f89374b) {
            hu1 hu1Var = new hu1(new mu1(j10, str2, strG, mapD, str), new pu1(System.currentTimeMillis(), numValueOf, map, strB2));
            synchronized (ju1.f91374c) {
                if (ju1Var.f91375a.size() > 100) {
                    ju1Var.f91375a.removeFirst();
                }
                ju1Var.f91375a.add(hu1Var);
            }
        }
    }
}
