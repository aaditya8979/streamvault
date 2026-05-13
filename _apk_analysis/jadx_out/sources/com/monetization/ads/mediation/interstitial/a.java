package com.monetization.ads.mediation.interstitial;

import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import tn.t;
import yads.do1;
import yads.fy0;
import yads.lm2;
import yads.mm2;
import yads.w51;
import yads.wb;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements MediatedInterstitialAdapter.MediatedInterstitialAdapterListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f51092e = {t.f(new MutablePropertyReference1Impl(a.class, "contentController", "getContentController()Lcom/monetization/ads/fullscreen/FullscreenContentController;", 0)), wb.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do1 f51093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w51 f51094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2 f51095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm2 f51096d;

    public /* synthetic */ a(fy0 fy0Var, do1 do1Var) {
        this(fy0Var, do1Var, new w51(do1Var));
    }

    public a(fy0 fy0Var, do1 do1Var, w51 w51Var) {
        this.f51093a = do1Var;
        this.f51094b = w51Var;
        this.f51095c = mm2.a(null);
        this.f51096d = mm2.a(fy0Var);
    }
}
