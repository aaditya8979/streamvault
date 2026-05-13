package yads;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import yads.yf3;

/* JADX INFO: loaded from: classes2.dex */
public final class yf3 implements cg3, nf3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f97117k = {tn.t.f(new MutablePropertyReference1Impl(yf3.class, "adParameterManager", "getAdParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$ResponseReportParameterManager;", 0)), tn.t.f(new MutablePropertyReference1Impl(yf3.class, "requestParameterManager", "getRequestParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$RequestReportParameterManager;", 0))};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f97118l = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f97119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yj3 f97120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wb2 f97121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final eg3 f97122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pf3 f97123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bg3 f97124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ii3 f97125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f97126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wf3 f97127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xf3 f97128j;

    public /* synthetic */ yf3(Context context, lu2 lu2Var, v9 v9Var, je3 je3Var, w5 w5Var, jg3 jg3Var, ek3 ek3Var, bj3 bj3Var, zj3 zj3Var) {
        this(context, lu2Var, v9Var, je3Var, w5Var, jg3Var, ek3Var, bj3Var, zj3Var, vb2.a(false));
    }

    public yf3(Context context, lu2 lu2Var, v9 v9Var, je3 je3Var, w5 w5Var, jg3 jg3Var, ek3 ek3Var, bj3 bj3Var, zj3 zj3Var, wb2 wb2Var) {
        this.f97119a = w5Var;
        this.f97120b = zj3Var;
        this.f97121c = wb2Var;
        this.f97122d = new eg3(bj3Var, this);
        this.f97123e = new pf3(jg3Var, this);
        this.f97124f = new bg3(context, lu2Var, v9Var, w5Var);
        this.f97125g = new ii3(je3Var, ek3Var);
        wn.a aVar = wn.a.f86472a;
        this.f97127i = new wf3(this);
        this.f97128j = new xf3(this);
    }

    public static final void a(yf3 yf3Var) {
        lf0 lf0Var = new lf0();
        if3 if3Var = if3.f90814i;
        yf3Var.b();
        if (yf3Var.f97126h) {
            return;
        }
        yf3Var.f97126h = true;
        String lowerCase = if3Var.name().toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase, "toLowerCase(...)");
        String message = lf0Var.getMessage();
        if (message == null) {
            message = "";
        }
        bg3 bg3Var = yf3Var.f97124f;
        bg3Var.getClass();
        bg3Var.a(kotlin.collections.a.o(bn.h.a("status", "error"), bn.h.a("failure_reason", lowerCase), bn.h.a("error_message", message)));
    }

    public final void a() {
        eg3 eg3Var = this.f97122d;
        eg3Var.f89248c.removeCallbacksAndMessages(null);
        eg3Var.f89250e = false;
        this.f97119a.a(v5.f95942u, null);
        this.f97120b.i();
        pf3 pf3Var = this.f97123e;
        if (!pf3Var.f93586e && !pf3Var.f93585d) {
            pf3Var.f93586e = true;
            pf3Var.f93584c.post(new of3(pf3Var));
        }
        ((zb2) this.f97121c).a(f97118l, new ac2() { // from class: bt.sc
            @Override // yads.ac2
            public final void a() {
                yf3.a(this.f6295a);
            }
        });
    }

    public final void a(jf3 jf3Var) {
        b();
        if (this.f97126h) {
            return;
        }
        this.f97126h = true;
        String lowerCase = jf3Var.f91207a.name().toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase, "toLowerCase(...)");
        String message = jf3Var.f91208b.getMessage();
        if (message == null) {
            message = "";
        }
        bg3 bg3Var = this.f97124f;
        bg3Var.getClass();
        bg3Var.a(kotlin.collections.a.o(bn.h.a("status", "error"), bn.h.a("failure_reason", lowerCase), bn.h.a("error_message", message)));
    }

    public final void b() {
        eg3 eg3Var = this.f97122d;
        eg3Var.f89248c.removeCallbacksAndMessages(null);
        eg3Var.f89250e = false;
        pf3 pf3Var = this.f97123e;
        pf3Var.f93584c.removeCallbacksAndMessages(null);
        pf3Var.f93586e = false;
        ((zb2) this.f97121c).a();
    }
}
