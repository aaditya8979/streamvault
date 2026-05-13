package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes12.dex */
public abstract class sn1 extends hk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ao1 f94885c;

    public sn1(CustomizableMediaView customizableMediaView, ao1 ao1Var) {
        super(customizableMediaView);
        this.f94885c = ao1Var;
    }

    public abstract void a(CustomizableMediaView customizableMediaView);

    @Override // yads.hk3
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(CustomizableMediaView customizableMediaView, on1 on1Var) {
        ao1 ao1Var = this.f94885c;
        rn1 rn1VarD = d();
        if (ao1Var.f87764c) {
            if (ao1Var.f87762a.f88740a == e00.f89043g) {
                zn1 zn1Var = new zn1(ao1Var, customizableMediaView, rn1VarD);
                wl3 wl3Var = kl3.f91651a;
                customizableMediaView.getViewTreeObserver().addOnPreDrawListener(new jl3(customizableMediaView, zn1Var));
            }
            ao1Var.f87764c = false;
        }
    }

    public abstract void a(on1 on1Var);

    public abstract rn1 d();
}
