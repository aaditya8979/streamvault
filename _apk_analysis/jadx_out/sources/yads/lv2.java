package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class lv2 extends sn1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f92122j = {tn.t.f(new MutablePropertyReference1Impl(lv2.class, "weakMediaView", "getWeakMediaView()Lcom/monetization/ads/nativeads/CustomizableMediaView;", 0)), tn.t.f(new MutablePropertyReference1Impl(lv2.class, "weakMediaValue", "getWeakMediaValue()Lcom/monetization/ads/network/model/MediaValue;", 0)), tn.t.f(new MutablePropertyReference1Impl(lv2.class, "currentViewAdapter", "getCurrentViewAdapter()Lcom/monetization/ads/nativeads/assetadapter/viewadapter/MediaViewAdapter;", 0))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sn1 f92123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sn1 f92124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yz2 f92125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lm2 f92126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lm2 f92127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kv2 f92128i;

    public lv2(CustomizableMediaView customizableMediaView, hv2 hv2Var, sn1 sn1Var, ao1 ao1Var, yz2 yz2Var) {
        super(customizableMediaView, ao1Var);
        this.f92123d = hv2Var;
        this.f92124e = sn1Var;
        this.f92125f = yz2Var;
        this.f92126g = mm2.a(null);
        this.f92127h = mm2.a(null);
        wn.a aVar = wn.a.f86472a;
        this.f92128i = new kv2(hv2Var, this);
        customizableMediaView.setOnSizeChangedListener$mobileads_externalRelease(new iv2(new WeakReference(this)));
    }

    @Override // yads.hk3
    public final void a() {
        ((sn1) this.f92128i.getValue(this, f92122j[2])).a();
    }

    @Override // yads.hk3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.f92123d.a((View) customizableMediaView);
        this.f92124e.a((View) customizableMediaView);
    }

    @Override // yads.sn1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.f92123d.a(customizableMediaView);
        this.f92124e.a(customizableMediaView);
    }

    @Override // yads.sn1
    /* JADX INFO: renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, on1 on1Var) {
        lm2 lm2Var = this.f92126g;
        KProperty<?>[] kPropertyArr = f92122j;
        KProperty<?> kProperty = kPropertyArr[0];
        lm2Var.getClass();
        lm2Var.f92035a = new WeakReference(customizableMediaView);
        lm2 lm2Var2 = this.f92127h;
        KProperty<?> kProperty2 = kPropertyArr[1];
        lm2Var2.getClass();
        lm2Var2.f92035a = new WeakReference(on1Var);
        ((sn1) this.f92128i.getValue(this, kPropertyArr[2])).b(customizableMediaView, on1Var);
    }

    @Override // yads.hk3
    public final void a(oi oiVar, kk3 kk3Var, Object obj) {
        on1 on1Var = (on1) obj;
        this.f92123d.a(oiVar, kk3Var, on1Var);
        this.f92124e.a(oiVar, kk3Var, on1Var);
    }

    @Override // yads.sn1
    public final void a(on1 on1Var) {
        ((sn1) this.f92128i.getValue(this, f92122j[2])).a(on1Var);
    }

    @Override // yads.hk3
    public final boolean a(View view, Object obj) {
        return ((sn1) this.f92128i.getValue(this, f92122j[2])).a(view, obj);
    }

    @Override // yads.sn1
    public final rn1 d() {
        return ((sn1) this.f92128i.getValue(this, f92122j[2])).d();
    }
}
