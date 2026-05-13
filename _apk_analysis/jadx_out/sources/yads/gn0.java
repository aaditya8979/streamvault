package yads;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class gn0 implements bq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final en0 f90040a;

    public gn0(Handler handler) {
        this.f90040a = new en0(handler);
    }

    public final void a(po2 po2Var, vp2 vp2Var, sr srVar) {
        synchronized (po2Var.f93673f) {
            po2Var.f93679l = true;
        }
        po2Var.a("post-response");
        en0 en0Var = this.f90040a;
        en0Var.f89318a.post(new fn0(po2Var, vp2Var, srVar));
    }
}
