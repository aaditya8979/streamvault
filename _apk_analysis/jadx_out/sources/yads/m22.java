package yads;

import android.view.View;
import com.yandex.div.core.view2.Div2View;

/* JADX INFO: loaded from: classes2.dex */
public final class m22 implements z00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final km f92229a;

    public m22(km kmVar) {
        this.f92229a = kmVar;
    }

    @Override // yads.z00
    public final void a(j5 j5Var) {
        this.f92229a.D.a(j5Var);
    }

    @Override // yads.z00
    public final void closeNativeAd() {
        km kmVar = this.f92229a;
        ri0 ri0Var = kmVar.I;
        tc1 tc1Var = kmVar.C;
        ri0Var.getClass();
        View viewFindViewWithTag = tc1Var.findViewWithTag("rootDivkitView");
        Div2View div2View = viewFindViewWithTag instanceof Div2View ? (Div2View) viewFindViewWithTag : null;
        if (div2View != null) {
            div2View.setVariable("is_banner_closed", "closed");
        }
        kmVar.D.a();
    }

    @Override // yads.z00
    public final void onAdClicked() {
    }

    @Override // yads.z00
    public final void onLeftApplication() {
        this.f92229a.D.c();
    }

    @Override // yads.z00
    public final void onReturnedToApplication() {
        this.f92229a.D.d();
    }
}
