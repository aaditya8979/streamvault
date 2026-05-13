package yads;

import android.content.Context;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class f43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jn f89482a;

    public /* synthetic */ f43() {
        this(new jn());
    }

    public f43(jn jnVar) {
        this.f89482a = jnVar;
    }

    public final String a(Context context, String str) {
        gm0 gm0Var;
        byte[] bArrA;
        byte[] bArrDecode;
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA == null || (gm0Var = nt2VarA.X) == null) {
            gm0Var = gm0.f90035c;
        }
        String str2 = gm0Var.f90036a;
        it1 it1Var = new it1(gm0Var.f90037b, str2);
        byte[] bytes = str.getBytes(bo.c.f5639b);
        tn.p.j(bytes, "getBytes(...)");
        try {
            bArrDecode = Base64.decode(str2, 0);
        } catch (Throwable unused) {
            boolean z10 = ad1.f87661a;
        }
        if (bArrDecode != null) {
            SecureRandom secureRandom = new SecureRandom();
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[16];
            secureRandom.nextBytes(bArr2);
            secureRandom.nextBytes(bArr);
            bArrA = it1Var.a(bytes, bArr2, bArr, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode)));
        } else {
            bArrA = null;
        }
        if (bArrA == null) {
            return null;
        }
        this.f89482a.getClass();
        return jn.a(bArrA);
    }
}
