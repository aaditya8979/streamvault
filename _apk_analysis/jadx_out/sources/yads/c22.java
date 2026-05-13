package yads;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;
import java.util.LinkedHashMap;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final class c22 implements MediatedNativeAdapterListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f88269p = {wb.a(c22.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f88270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f88271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final do1 f88272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jo1 f88273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hp1 f88274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w51 f88275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f88276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lm2 f88277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f88278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f88279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c41 f88280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gp1 f88281l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final po1 f88282m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qp1 f88283n;

    public /* synthetic */ c22(v9 v9Var, lu2 lu2Var, m02 m02Var, do1 do1Var) {
        this(v9Var, lu2Var, m02Var, do1Var, new jo1(), new hp1(), new w51(do1Var));
    }

    public c22(v9 v9Var, lu2 lu2Var, m02 m02Var, do1 do1Var, jo1 jo1Var, hp1 hp1Var, w51 w51Var) {
        this.f88270a = v9Var;
        this.f88271b = lu2Var;
        this.f88272c = do1Var;
        this.f88273d = jo1Var;
        this.f88274e = hp1Var;
        this.f88275f = w51Var;
        Context applicationContext = m02Var.g().getApplicationContext();
        this.f88276g = applicationContext;
        this.f88277h = mm2.a(m02Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f88278i = linkedHashMap;
        this.f88279j = new LinkedHashMap();
        c41 c41Var = new c41(m02Var.g());
        this.f88280k = c41Var;
        gp1 gp1Var = new gp1(m02Var.g());
        this.f88281l = gp1Var;
        this.f88282m = new po1(m02Var.g(), c41Var, gp1Var);
        this.f88283n = new qp1(applicationContext, do1Var, linkedHashMap);
    }
}
