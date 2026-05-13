package yads;

import android.graphics.Bitmap;
import android.os.Handler;
import yads.cq;

/* JADX INFO: loaded from: classes3.dex */
public final class cq implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f88579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sn2 f88580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f88581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kq f88582e;

    public cq(Bitmap bitmap, sn2 sn2Var, Handler handler, kq kqVar) {
        this.f88579b = bitmap;
        this.f88580c = sn2Var;
        this.f88581d = handler;
        this.f88582e = kqVar;
    }

    public static final void a(cq cqVar, Bitmap bitmap) {
        sn2 sn2Var = cqVar.f88580c;
        rn2 rn2Var = sn2Var.f94886a.f95299d;
        e72 e72Var = sn2Var.f94887b;
        un2 un2Var = sn2Var.f94888c;
        rn2Var.getClass();
        rn2.a(e72Var, un2Var, bitmap);
    }

    public final void a(final Bitmap bitmap) {
        this.f88581d.post(new Runnable() { // from class: bt.r0
            @Override // java.lang.Runnable
            public final void run() {
                cq.a(this.f6256b, bitmap);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        kq kqVar = this.f88582e;
        Bitmap bitmapA = this.f88579b;
        kqVar.getClass();
        try {
            bitmapA = kq.a(bitmapA, 0.1d);
        } catch (Throwable unused) {
        }
        a(bitmapA);
    }
}
