package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.inmobi.media.n9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3605n9 implements InterfaceC3580m9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Gh f27675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mj f27676b;

    public C3605n9(Context context, double d10, Ab ab2, boolean z10, int i10, long j10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(ab2, "logLevel");
        this.f27676b = new Mj();
        if (z10) {
            return;
        }
        Gh gh2 = new Gh(context, d10, ab2, j10, i10);
        this.f27675a = gh2;
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f25950a;
        tn.p.h(gh2);
        Lb.b(gh2);
    }

    public final void a() {
        Gh gh2 = this.f27675a;
        if (gh2 != null) {
            gh2.b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f25950a;
        Lb.a(this.f27675a);
    }

    public final void a(String str, String str2) {
        tn.p.k(str, "tag");
        tn.p.k(str2, "message");
        Gh gh2 = this.f27675a;
        if (gh2 != null) {
            gh2.a(Ab.f25152b, str, str2);
        }
        if (this.f27676b != null) {
            tn.p.k(str, "tag");
            tn.p.k(str2, "message");
        }
    }

    public final void a(String str, String str2, Exception exc) {
        tn.p.k(str, "tag");
        tn.p.k(str2, "message");
        tn.p.k(exc, "error");
        Gh gh2 = this.f27675a;
        if (gh2 != null) {
            gh2.a(Ab.f25153c, str, str2 + "\nError: " + bn.d.b(exc));
        }
        if (this.f27676b != null) {
            tn.p.k(str, "tag");
            tn.p.k(str2, "message");
            tn.p.k(exc, "error");
        }
    }

    public final void a(boolean z10) {
        Gh gh2 = this.f27675a;
        if (gh2 != null) {
            gh2.b(z10);
        }
        if (z10) {
            return;
        }
        Gh gh3 = this.f27675a;
        if (gh3 == null || !gh3.f25537f.a()) {
            CopyOnWriteArrayList copyOnWriteArrayList = Mb.f25950a;
            Lb.a(this.f27675a);
            this.f27675a = null;
        }
    }

    public final void b(String str, String str2) {
        tn.p.k(str, "tag");
        tn.p.k(str2, "message");
        Gh gh2 = this.f27675a;
        if (gh2 != null) {
            gh2.a(Ab.f25153c, str, str2);
        }
        if (this.f27676b != null) {
            tn.p.k(str, "tag");
            tn.p.k(str2, "message");
        }
    }

    public final void c(String str, String str2) {
        tn.p.k(str, "tag");
        tn.p.k(str2, "message");
        Gh gh2 = this.f27675a;
        if (gh2 != null) {
            gh2.a(Ab.f25151a, str, str2);
        }
        if (this.f27676b != null) {
            tn.p.k(str, "tag");
            tn.p.k(str2, "message");
        }
    }

    public final void d(String str, String str2) {
        tn.p.k(str, "tag");
        tn.p.k(str2, "message");
        Gh gh2 = this.f27675a;
        if (gh2 != null) {
            gh2.a(Ab.f25154d, str, str2);
        }
        if (this.f27676b != null) {
            tn.p.k(str, "tag");
            tn.p.k("STATE_CHANGE: " + str2, "message");
        }
    }
}
