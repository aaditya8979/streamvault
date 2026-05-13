package com.ironsource;

import android.content.Context;
import com.ironsource.C3978d4;
import com.ironsource.InterfaceC4262t4;
import com.ironsource.M8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class Ee implements M8, M8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fe f29270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4323we f29271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4262t4 f29272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f29274e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f29275a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29276b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f29277c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f29278d = -1;

        private a() {
        }
    }

    public Ee(@NotNull Fe fe2, @NotNull InterfaceC4323we interfaceC4323we, @NotNull InterfaceC4262t4 interfaceC4262t4) {
        tn.p.k(fe2, C3978d4.a.f31215k);
        tn.p.k(interfaceC4323we, "initResponseStorage");
        tn.p.k(interfaceC4262t4, "currentTimeProvider");
        this.f29270a = fe2;
        this.f29271b = interfaceC4323we;
        this.f29272c = interfaceC4262t4;
        this.f29273d = -1;
        this.f29274e = -1L;
    }

    public /* synthetic */ Ee(Fe fe2, InterfaceC4323we interfaceC4323we, InterfaceC4262t4 interfaceC4262t4, int i10, tn.i iVar) {
        this(fe2, (i10 & 2) != 0 ? new C4340xe() : interfaceC4323we, (i10 & 4) != 0 ? new InterfaceC4262t4.a() : interfaceC4262t4);
    }

    private final long a(Context context, Fe fe2) {
        long jA = fe2.a(context, -1L);
        if (this.f29271b.a(context) || jA != -1) {
            return jA;
        }
        long jA2 = this.f29272c.a();
        IronLog.INTERNAL.verbose("set first session timestamp = " + jA2);
        fe2.b(context, jA2);
        return jA2;
    }

    private final int b(Context context, Fe fe2) {
        int iB = fe2.b(context, 0) + 1;
        fe2.a(context, iB);
        return iB;
    }

    @Override // com.ironsource.M8
    public long a() {
        return this.f29274e;
    }

    @Override // com.ironsource.M8.a
    public void a(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f29273d = b(context, this.f29270a);
        this.f29274e = a(context, this.f29270a);
    }

    @Override // com.ironsource.M8
    @NotNull
    public String b() {
        String strD = IronSourceUtils.d();
        tn.p.j(strD, "getSessionId()");
        return strD;
    }

    @Override // com.ironsource.M8
    public int c() {
        return this.f29273d;
    }
}
