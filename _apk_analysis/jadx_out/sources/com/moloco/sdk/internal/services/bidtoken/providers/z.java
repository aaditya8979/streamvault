package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Context;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import bo.a0;
import com.moloco.sdk.internal.MolocoLogger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class z implements j<y> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f47282f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f47283g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f47284h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f47285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f47286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f47287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public y f47288e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        byte[] bArrDecode = Base64.decode(new byte[]{98, 87, 57, 115, 98, 50, 78, 118, 88, 50, 82, 108, 98, 87, 57, 102, 100, 71, 86, 122, 100, 71, 108, 117, 90, 119, 61, 61, 10}, 0);
        tn.p.j(bArrDecode, "decode(...)");
        f47284h = a0.B(bArrDecode);
    }

    public z(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "preferencesName");
        tn.p.k(str2, "key");
        this.f47285b = context;
        this.f47286c = str;
        this.f47287d = str2;
        this.f47288e = f();
    }

    public /* synthetic */ z(Context context, String str, String str2, int i10, tn.i iVar) {
        this(context, (i10 & 2) != 0 ? f47284h : str, (i10 & 4) != 0 ? "test_config" : str2);
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f47288e = f();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        y yVarF = f();
        boolean z10 = !tn.p.f(yVarF, this.f47288e);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "TCSignalProvider", "[CBT] TCS needsRefresh: " + z10 + ", current: " + yVarF.a() + ", cached: " + this.f47288e.a(), false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return "TCSignalProvider";
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public y d() {
        y yVar = this.f47288e;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "TCSignalProvider", "[CBT] TCS providing: " + yVar.a(), false, 4, null);
        return yVar;
    }

    public final y f() {
        try {
            return new y(this.f47285b.getSharedPreferences(this.f47286c, 0).getString(this.f47287d, null));
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "TCSignalProvider", "[CBT] TCS Error", e10, false, 8, null);
            return new y(null);
        }
    }
}
