package yads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes11.dex */
public abstract class u73 extends f11 implements y51, g1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1 f95575d;

    public u73(Context context, v9 v9Var, lu2 lu2Var, d4 d4Var) {
        super(context, v9Var);
        this.f95575d = new e1(context, d4Var, lu2Var, v9Var, this, null);
    }

    public void a(int i10, Bundle bundle) {
        boolean z10 = ad1.f87661a;
        switch (i10) {
            case 6:
                ((qy0) this).g();
                this.f95575d.e();
                break;
            case 7:
                ((qy0) this).g();
                this.f95575d.c();
                break;
            case 8:
                this.f95575d.d();
                break;
            case 9:
                this.f95575d.a();
                break;
        }
    }
}
