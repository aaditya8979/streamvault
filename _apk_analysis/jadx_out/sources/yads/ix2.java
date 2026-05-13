package yads;

import android.net.Uri;
import java.io.Closeable;

/* JADX INFO: loaded from: classes7.dex */
public final class ix2 extends as2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p30 f91028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u30 f91029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ mx2 f91030k;

    public ix2(mx2 mx2Var, rr rrVar, u30 u30Var) {
        this.f91030k = mx2Var;
        this.f91028i = rrVar;
        this.f91029j = u30Var;
    }

    @Override // yads.as2
    public final Object b() {
        p30 p30Var = this.f91028i;
        pb2 pb2Var = this.f91030k.f92626b;
        u30 u30Var = this.f91029j;
        r33 r33Var = new r33(p30Var);
        vf1.f96078a.getAndIncrement();
        r33Var.f94278b = 0L;
        r30 r30Var = new r30(r33Var, u30Var);
        try {
            r30Var.f94268a.a(r30Var.f94269b);
            r30Var.f94271d = true;
            Uri uri = r33Var.f94277a.getUri();
            uri.getClass();
            Object objA = pb2Var.a(uri, r30Var);
            ib3.a((Closeable) r30Var);
            objA.getClass();
            return (dv0) objA;
        } catch (Throwable th2) {
            ib3.a((Closeable) r30Var);
            throw th2;
        }
    }
}
