package yads;

import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class hr2 implements MediatedRewardedAdapterListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f90513e = {tn.t.f(new MutablePropertyReference1Impl(hr2.class, "contentController", "getContentController()Lcom/monetization/ads/rewarded/content/RewardedAdContentController;", 0)), wb.a(hr2.class, "loadController", "getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do1 f90514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w51 f90515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2 f90516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm2 f90517d;

    public /* synthetic */ hr2(fy0 fy0Var, do1 do1Var) {
        this(fy0Var, do1Var, new w51(do1Var));
    }

    public hr2(fy0 fy0Var, do1 do1Var, w51 w51Var) {
        this.f90514a = do1Var;
        this.f90515b = w51Var;
        this.f90516c = mm2.a(null);
        this.f90517d = mm2.a(fy0Var);
    }
}
