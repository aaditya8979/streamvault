package yads;

import android.graphics.Bitmap;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class i41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f90663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j41 f90664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k41 f90666d;

    public i41(k41 k41Var, Bitmap bitmap, String str, j41 j41Var) {
        this.f90666d = k41Var;
        this.f90663a = bitmap;
        this.f90665c = str;
        this.f90664b = j41Var;
    }

    public final void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
        if (this.f90664b == null) {
            return;
        }
        g41 g41Var = (g41) this.f90666d.f91480c.get(this.f90665c);
        if (g41Var != null) {
            g41Var.f89808d.remove(this);
            if (g41Var.f89808d.size() == 0) {
                g41Var.f89805a.a();
                this.f90666d.f91480c.remove(this.f90665c);
                return;
            }
            return;
        }
        g41 g41Var2 = (g41) this.f90666d.f91481d.get(this.f90665c);
        if (g41Var2 != null) {
            g41Var2.f89808d.remove(this);
            if (g41Var2.f89808d.size() == 0) {
                g41Var2.f89805a.a();
            }
            if (g41Var2.f89808d.size() == 0) {
                this.f90666d.f91481d.remove(this.f90665c);
            }
        }
    }
}
