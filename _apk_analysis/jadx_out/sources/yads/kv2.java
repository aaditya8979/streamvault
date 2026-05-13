package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
public final class kv2 extends wn.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lv2 f91783a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv2(hv2 hv2Var, lv2 lv2Var) {
        super(hv2Var);
        this.f91783a = lv2Var;
    }

    @Override // wn.b
    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        tn.p.k(kProperty, "property");
        sn1 sn1Var = (sn1) obj2;
        sn1 sn1Var2 = (sn1) obj;
        if (tn.p.f(sn1Var, sn1Var2)) {
            return;
        }
        lm2 lm2Var = this.f91783a.f92126g;
        KProperty[] kPropertyArr = lv2.f92122j;
        KProperty kProperty2 = kPropertyArr[0];
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) lm2Var.f92035a.get();
        if (customizableMediaView == null) {
            return;
        }
        lm2 lm2Var2 = this.f91783a.f92127h;
        KProperty kProperty3 = kPropertyArr[1];
        on1 on1Var = (on1) lm2Var2.f92035a.get();
        if (on1Var == null) {
            return;
        }
        sn1Var2.a(customizableMediaView);
        customizableMediaView.post(new jv2(sn1Var, customizableMediaView, on1Var));
    }
}
