package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.mo;
import com.safedk.android.internal.partials.InMobiNetworkBridge;
import java.util.Map;
import kotlin.Result;

/* JADX INFO: loaded from: classes12.dex */
public final class mo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Je f27646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3450h3 f27647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public sn.a f27649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public lo f27650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f27651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f27652g;

    public mo(Je je2, C3450h3 c3450h3, long j10, sn.a aVar) {
        tn.p.k(je2, "mNetworkRequest");
        tn.p.k(c3450h3, "mWebViewClient");
        this.f27646a = je2;
        this.f27647b = c3450h3;
        this.f27648c = j10;
        this.f27649d = aVar;
        this.f27651f = new Handler(Looper.getMainLooper());
    }

    public static final void a(mo moVar) {
        tn.p.j("mo", "TAG");
        String str = moVar.f27646a.f25725a;
        moVar.a();
        sn.a aVar = moVar.f27649d;
        if (aVar != null) {
            aVar.invoke();
        }
        moVar.f27649d = null;
    }

    public final void a() {
        Runnable runnable = this.f27652g;
        if (runnable != null) {
            this.f27651f.removeCallbacks(runnable);
        }
        this.f27652g = null;
        try {
            Result.a aVar = Result.Companion;
            lo loVar = this.f27650e;
            if (loVar != null && !loVar.f27588a) {
                loVar.stopLoading();
                loVar.removeAllViews();
                loVar.destroy();
            }
            Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        this.f27650e = null;
    }

    public final void b() {
        try {
            Context context = Ji.f25747a;
            if (context != null) {
                lo loVar = new lo(context);
                loVar.setWebViewClient(this.f27647b);
                loVar.getSettings().setJavaScriptEnabled(true);
                loVar.getSettings().setCacheMode(2);
                this.f27650e = loVar;
            }
            lo loVar2 = this.f27650e;
            if (loVar2 != null) {
                Je je2 = this.f27646a;
                String strA = Se.a(je2.f25725a, je2.f25728d);
                Map mapJ = this.f27646a.f25726b;
                if (mapJ == null) {
                    mapJ = kotlin.collections.a.j();
                }
                InMobiNetworkBridge.webviewLoadUrl(loVar2, strA, mapJ);
            }
            if (this.f27648c > 0) {
                Runnable runnable = new Runnable() { // from class: n9.o9
                    @Override // java.lang.Runnable
                    public final void run() {
                        mo.a(this.f75548b);
                    }
                };
                this.f27651f.postDelayed(runnable, this.f27648c);
                this.f27652g = runnable;
            }
        } catch (Exception e10) {
            tn.p.j("mo", "TAG");
            e10.getMessage();
        }
    }
}
