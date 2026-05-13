package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Ne;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class De {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final X9 f29177a = new X9();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4250s9 f29178b = new C4250s9(IronSourceThreadManager.INSTANCE.getInitHandler());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final B7 f29179c = Lb.f29764s.d().i();

    public static final class a extends AbstractRunnableC4078ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f29180b;

        public a(Runnable runnable) {
            this.f29180b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            this.f29180b.run();
        }
    }

    public static /* synthetic */ void a(De de2, AbstractRunnableC4078ie abstractRunnableC4078ie, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        de2.a(abstractRunnableC4078ie, j10);
    }

    public static /* synthetic */ void a(De de2, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        de2.a(runnable, j10);
    }

    @Nullable
    public final Ne a(@NotNull Context context, @NotNull String str) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "appKey");
        return com.ironsource.mediationsdk.r.m().a(context, str);
    }

    @NotNull
    public final String a(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        String strB = com.ironsource.mediationsdk.r.m().b(context);
        tn.p.j(strB, "getInstance().getAdvertiserId(context)");
        return strB;
    }

    public final void a() {
        Cd.c().a();
    }

    public final void a(long j10, @NotNull Ne.a aVar) {
        tn.p.k(aVar, "responseOrigin");
        com.ironsource.mediationsdk.r.m().a(j10, aVar);
    }

    public final void a(@NotNull Be be2) {
        tn.p.k(be2, "initStatus");
        Ce.f28890a.a(be2);
    }

    public final void a(@NotNull D1 d12) {
        tn.p.k(d12, "reporterSettings");
        C4228r4.d().a(d12.b(), d12.d(), d12.c(), d12.e(), IronSourceUtils.d(), d12.a(), d12.g());
    }

    public final void a(@NotNull AbstractRunnableC4078ie abstractRunnableC4078ie) {
        tn.p.k(abstractRunnableC4078ie, "safeRunnable");
        a(this, abstractRunnableC4078ie, 0L, 2, (Object) null);
    }

    public final void a(@NotNull AbstractRunnableC4078ie abstractRunnableC4078ie, long j10) {
        tn.p.k(abstractRunnableC4078ie, "safeRunnable");
        this.f29178b.a(abstractRunnableC4078ie, j10);
    }

    public final void a(@NotNull C4169ne c4169ne, @Nullable String str, @Nullable String str2) {
        tn.p.k(c4169ne, "error");
        JSONObject jSONObjectB = IronSourceUtils.b(false);
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_ERROR_CODE, c4169ne.c());
            jSONObjectB.put("reason", c4169ne.d());
            String str3 = "";
            if (!TextUtils.isEmpty(str)) {
                str3 = "request=" + str + ";";
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = str3 + "body=" + str2;
            }
            if (str3.length() > 0) {
                jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, str3);
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.getMessage());
        }
        Lb.f29764s.d().q().a(new C5(D5.TROUBLESHOOTING_SERVER_INIT_FAILED, jSONObjectB));
    }

    public final void a(@NotNull Runnable runnable) {
        tn.p.k(runnable, "callback");
        this.f29178b.a(runnable);
    }

    public final void a(@NotNull Runnable runnable, long j10) {
        tn.p.k(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j10);
    }

    public final void a(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "key");
        tn.p.k(str2, "value");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        N6.a().a(str, str2);
    }

    @NotNull
    public final B7 b() {
        return this.f29179c;
    }

    @NotNull
    public final String b(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        String strM = this.f29179c.M(context);
        tn.p.j(strM, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return strM;
    }

    public final void b(@NotNull AbstractRunnableC4078ie abstractRunnableC4078ie) {
        tn.p.k(abstractRunnableC4078ie, "safeRunnable");
        this.f29178b.a(abstractRunnableC4078ie);
    }

    public final void b(@NotNull Runnable runnable) {
        tn.p.k(runnable, "runnable");
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    @NotNull
    public final X9 c() {
        return this.f29177a;
    }

    public final void c(@NotNull Runnable runnable) {
        tn.p.k(runnable, "runnable");
        this.f29178b.b(runnable);
    }

    public final boolean c(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        return IronSourceUtils.g(context);
    }

    @Nullable
    public final C4002ea d() {
        return com.ironsource.mediationsdk.r.m().s();
    }

    public final void d(@NotNull Runnable runnable) {
        tn.p.k(runnable, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final void e(@NotNull Runnable runnable) {
        tn.p.k(runnable, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(runnable), 0L, 2, null);
    }

    public final boolean e() {
        return IronSourceUtils.g();
    }

    public final void f() {
        com.ironsource.mediationsdk.r.m().S();
    }

    public final void g() {
        Lb.f29764s.d().q().a(new C5(D5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
    }
}
