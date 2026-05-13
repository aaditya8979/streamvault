package yads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class ek0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zj0 f89283a;

    public ek0(Context context) {
        this.f89283a = new zj0(context.getApplicationContext());
    }

    public final Drawable a(byte[] bArr) {
        yj0 hqVar;
        s41 s41VarA = t41.a(bArr);
        zj0 zj0Var = this.f89283a;
        zj0Var.getClass();
        int iOrdinal = s41VarA.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            hqVar = new hq();
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            hqVar = new hq();
        } else {
            hqVar = new oz0();
        }
        return hqVar.a(bArr, zj0Var.f97623a.getApplicationContext());
    }
}
