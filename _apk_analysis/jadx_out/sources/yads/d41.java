package yads;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class d41 implements up2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f88755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k41 f88756b;

    public d41(k41 k41Var, String str) {
        this.f88756b = k41Var;
        this.f88755a = str;
    }

    @Override // yads.up2
    public final void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        k41 k41Var = this.f88756b;
        String str = this.f88755a;
        ((t82) k41Var.f91479b).a(str, bitmap);
        g41 g41Var = (g41) k41Var.f91480c.remove(str);
        if (g41Var != null) {
            g41Var.f89806b = bitmap;
            k41Var.f91481d.put(str, g41Var);
            if (k41Var.f91483f == null) {
                f41 f41Var = new f41(k41Var);
                k41Var.f91483f = f41Var;
                k41Var.f91482e.postDelayed(f41Var, 100);
            }
        }
    }
}
