package yads;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class tn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dk3 f95296a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vn2 f95298c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dq f95297b = new dq();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rn2 f95299d = new rn2();

    public tn2(dk3 dk3Var, r62 r62Var) {
        this.f95296a = dk3Var;
        this.f95298c = new vn2(dk3Var, r62Var);
    }

    public final void a() {
        e72 e72Var = (e72) this.f95296a.b();
        if (e72Var != null) {
            un2 un2Var = e72Var.f89137c.f92744a;
            vn2 vn2Var = this.f95298c;
            vn2Var.getClass();
            un2Var.setVisibility(4);
            un2Var.f95729a.setOnClickListener(vn2Var.f96141a);
            Bitmap bitmap = e72Var.f89136b.getBitmap();
            if (bitmap != null) {
                this.f95297b.f88956a.execute(new cq(bitmap, new sn2(this, e72Var, un2Var), new Handler(Looper.getMainLooper()), new kq()));
            }
        }
    }
}
