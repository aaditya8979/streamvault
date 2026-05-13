package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes4.dex */
public final class hv2 extends sn1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik3 f90581d;

    public hv2(CustomizableMediaView customizableMediaView, ao1 ao1Var, ik3 ik3Var) {
        super(customizableMediaView, ao1Var);
        this.f90581d = ik3Var;
    }

    @Override // yads.hk3
    public final void a() {
        this.f90581d.f90870a.a();
    }

    @Override // yads.hk3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.f90581d.a();
        customizableMediaView.setVisibility(8);
        customizableMediaView.setOnClickListener(null);
        customizableMediaView.setOnTouchListener(null);
        customizableMediaView.setSelected(false);
    }

    @Override // yads.sn1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.f90581d.a();
    }

    @Override // yads.sn1
    /* JADX INFO: renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, on1 on1Var) {
        super.b(customizableMediaView, on1Var);
        sd3 sd3Var = on1Var.f93292b;
        if (sd3Var == null) {
            return;
        }
        this.f90581d.b(sd3Var);
    }

    @Override // yads.hk3
    public final void a(oi oiVar, kk3 kk3Var, Object obj) {
        on1 on1Var = (on1) obj;
        this.f90581d.a(oiVar, kk3Var, on1Var != null ? on1Var.f93292b : null);
    }

    @Override // yads.sn1
    public final void a(on1 on1Var) {
    }

    @Override // yads.hk3
    public final boolean a(View view, Object obj) {
        sd3 sd3Var = ((on1) obj).f93292b;
        if (sd3Var != null) {
            return this.f90581d.a(sd3Var);
        }
        return false;
    }

    @Override // yads.sn1
    public final rn1 d() {
        return rn1.f94523d;
    }
}
