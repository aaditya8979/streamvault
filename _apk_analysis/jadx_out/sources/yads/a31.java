package yads;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class a31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jm0 f87554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5 f87555b;

    public a31(jm0 jm0Var, a5 a5Var) {
        this.f87554a = jm0Var;
        this.f87555b = a5Var;
    }

    public final void a(Context context, z21 z21Var) {
        String strA;
        tg tgVar = z21Var.f97362a;
        String str = z21Var.f97363b;
        e31 e31Var = z21Var.f97364c;
        a5 a5Var = this.f87555b;
        a5Var.getClass();
        int iOrdinal = e31Var.ordinal();
        if (iOrdinal == 0) {
            strA = a5Var.a(context);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            strA = tgVar.f95200a;
            if (strA == null) {
                strA = a5Var.a(context);
            }
        }
        jm0 jm0Var = this.f87554a;
        jm0Var.f91281e = strA;
        jm0Var.f91277a = tgVar.f95201b;
        String str2 = tgVar.f95202c;
        synchronized (jm0.f91276h) {
            if (str2 != null) {
                if (str2.length() != 0) {
                    jm0Var.f91283g = str2;
                }
                bn.r rVar = bn.r.f5635a;
            } else {
                bn.r rVar2 = bn.r.f5635a;
            }
        }
        this.f87554a.f91280d = str;
    }
}
