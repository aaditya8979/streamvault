package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4839hi implements Sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5273z0 f66922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bh f66923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f66924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f66925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReporterConfig f66926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5091ri f66927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Pe f66928g;

    public C4839hi(Context context, Bh bh2, C5273z0 c5273z0, C5091ri c5091ri, ReporterConfig reporterConfig) {
        this(context, bh2, c5273z0, c5091ri, reporterConfig, new Pe(new Rh(c5273z0, context, reporterConfig)));
    }

    public C4839hi(Context context, Bh bh2, C5273z0 c5273z0, C5091ri c5091ri, ReporterConfig reporterConfig, Pe pe2) {
        this.f66924c = C4696c4.l().g().a();
        this.f66925d = context;
        this.f66923b = bh2;
        this.f66922a = c5273z0;
        this.f66927f = c5091ri;
        this.f66926e = reporterConfig;
        this.f66928g = pe2;
    }

    public C4839hi(Context context, String str, C5273z0 c5273z0) {
        this(context, new Bh(), c5273z0, new C5091ri(), ReporterConfig.newConfigBuilder(str).build());
    }

    public C4839hi(@NonNull ICommonExecutor iCommonExecutor, @NonNull Context context, @NonNull String str) {
        this(context.getApplicationContext(), str, new C5273z0());
    }

    public static Sa a(C5273z0 c5273z0, Context context, ReporterConfig reporterConfig) {
        c5273z0.getClass();
        return C5248y0.a(context).f().c(reporterConfig);
    }

    public final void a(@NonNull ReporterConfig reporterConfig) {
        this.f66923b.getClass();
        this.f66927f.getClass();
        this.f66924c.execute(new Vh(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.Va
    public final void a(@NonNull Rn rn2) {
        this.f66923b.f65048d.a(rn2);
        this.f66927f.getClass();
        this.f66924c.execute(new Zh(this, rn2));
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.InterfaceC4795g0
    public final void a(@NonNull V v10) {
        this.f66923b.getClass();
        this.f66927f.getClass();
        this.f66924c.execute(new RunnableC4684bi(this, v10));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f66923b.getClass();
        this.f66927f.getClass();
        this.f66924c.execute(new RunnableC4761ei(this));
    }

    public final void d(@NonNull String str) {
        ReporterConfig reporterConfigBuild = ReporterConfig.newConfigBuilder(str).build();
        this.f66923b.getClass();
        this.f66927f.getClass();
        this.f66924c.execute(new Uh(this, reporterConfigBuild));
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this.f66928g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f66923b.getClass();
        this.f66927f.getClass();
        this.f66924c.execute(new Mh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
        this.f66923b.getClass();
        this.f66927f.getClass();
        this.f66924c.execute(new RunnableC4736di(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        this.f66923b.f65052h.a(adRevenue);
        this.f66927f.getClass();
        this.f66924c.execute(new Qh(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z10) {
        this.f66923b.f65052h.a(adRevenue);
        this.f66927f.getClass();
        this.f66924c.execute(new Yh(this, adRevenue, z10));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f66923b.f65054j.a(map);
        this.f66927f.getClass();
        this.f66924c.execute(new RunnableC4658ai(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        this.f66923b.f65053i.a(eCommerceEvent);
        this.f66927f.getClass();
        this.f66924c.execute(new Sh(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th2) {
        this.f66923b.f65047c.a(str);
        this.f66927f.getClass();
        this.f66924c.execute(new Jh(this, str, str2, th2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th2) {
        this.f66923b.f65046b.a(str);
        this.f66927f.getClass();
        if (th2 == null) {
            th2 = new O1();
            th2.fillInStackTrace();
        }
        this.f66924c.execute(new Ih(this, str, th2));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        this.f66923b.getClass();
        this.f66927f.getClass();
        this.f66924c.execute(new Wh(this, moduleEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.f66923b.f65045a.a(str);
        this.f66927f.getClass();
        this.f66924c.execute(new RunnableC4787fi(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable String str2) {
        this.f66923b.f65045a.a(str);
        this.f66927f.getClass();
        this.f66924c.execute(new RunnableC4813gi(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        this.f66923b.f65045a.a(str);
        this.f66927f.getClass();
        this.f66924c.execute(new Hh(this, str, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        this.f66923b.f65051g.a(revenue);
        this.f66927f.getClass();
        this.f66924c.execute(new Ph(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th2) {
        this.f66923b.f65049e.a(th2);
        this.f66927f.getClass();
        this.f66924c.execute(new Kh(this, th2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        this.f66923b.f65050f.a(userProfile);
        this.f66927f.getClass();
        this.f66924c.execute(new Oh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f66923b.getClass();
        this.f66927f.getClass();
        this.f66924c.execute(new Lh(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f66923b.getClass();
        this.f66927f.getClass();
        this.f66924c.execute(new RunnableC4710ci(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z10) {
        this.f66923b.getClass();
        this.f66927f.getClass();
        this.f66924c.execute(new Th(this, z10));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        this.f66923b.getClass();
        this.f66927f.getClass();
        this.f66924c.execute(new Xh(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
        this.f66923b.getClass();
        this.f66927f.getClass();
        this.f66924c.execute(new Nh(this, str));
    }
}
