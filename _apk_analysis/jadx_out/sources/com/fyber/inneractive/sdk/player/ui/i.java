package com.fyber.inneractive.sdk.player.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.h1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends s {
    public final t0 A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o f19025y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p f19026z;

    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(android.content.Context r22, com.fyber.inneractive.sdk.player.ui.a r23, com.fyber.inneractive.sdk.player.n r24, com.fyber.inneractive.sdk.config.global.r r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.ui.i.<init>(android.content.Context, com.fyber.inneractive.sdk.player.ui.a, com.fyber.inneractive.sdk.player.n, com.fyber.inneractive.sdk.config.global.r, java.lang.String):void");
    }

    public static boolean a(p pVar) {
        return (pVar == null || pVar.L.f19046h || !pVar.a()) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(int i10, int i11) {
        this.f19025y.a(i10, i11);
        if (a(this.f19026z)) {
            this.f19026z.a(i10, i11);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, b bVar2) {
        this.f19025y.a(bVar, bVar2);
        p pVar = this.f19026z;
        if (pVar != null) {
            pVar.destroy();
            this.f19026z = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, b bVar) {
        ViewGroup viewGroup;
        p pVar;
        this.f19025y.a(dVar, bVar);
        if (!a(this.f19026z) || (viewGroup = this.f19077q) == null || viewGroup.getVisibility() != 0 || (pVar = this.f19026z) == null) {
            return;
        }
        pVar.destroy();
        this.f19026z = null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void a(h1 h1Var, int i10, int i11) {
        this.f19025y.a(h1Var, i10, i11);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10) {
        if (a(this.f19026z)) {
            this.f19026z.a(z10);
        } else {
            this.f19025y.a(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, int i10, int i11) {
        this.f19074n = i10;
        this.f19075o = i11;
        this.f19076p = z10;
        o oVar = this.f19025y;
        oVar.f19074n = i10;
        oVar.f19075o = i11;
        oVar.f19076p = z10;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, com.fyber.inneractive.sdk.ignite.m mVar) {
        if (a(this.f19026z)) {
            this.f19026z.a(z10, mVar);
        } else {
            this.f19025y.a(z10, mVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, String str) {
        this.f19025y.a(z10, str);
        if (a(this.f19026z)) {
            this.f19026z.a(z10, str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, com.fyber.inneractive.sdk.player.ui.m
    public final boolean a() {
        p pVar = this.f19026z;
        return pVar != null && pVar.a();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void b(boolean z10) {
        this.f19025y.b(z10);
        if (a(this.f19026z)) {
            this.f19026z.b(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void c(boolean z10) {
        this.f19025y.c(z10);
        if (a(this.f19026z)) {
            this.f19026z.c(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void d(boolean z10) {
        this.f19025y.d(z10);
        if (a(this.f19026z)) {
            this.f19026z.d(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.e, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53142p, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void e(boolean z10) {
        if (a(this.f19026z)) {
            this.f19026z.e(z10);
        } else {
            this.f19025y.e(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f() {
        o oVar = this.f19025y;
        oVar.p();
        oVar.B = true;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f(boolean z10) {
        this.f19025y.f(z10);
        if (a(this.f19026z)) {
            this.f19026z.f(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g() {
        this.f19025y.g();
        if (a(this.f19026z)) {
            this.f19026z.g();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g(boolean z10) {
        if (a(this.f19026z)) {
            this.f19026z.g(z10);
        } else {
            this.f19025y.g(z10);
        }
    }

    public InneractiveAdRequest getAdRequest() {
        t0 t0Var = this.A;
        if (t0Var != null) {
            return t0Var.f16695a;
        }
        return null;
    }

    public com.fyber.inneractive.sdk.response.e getAdResponse() {
        t0 t0Var = this.A;
        if (t0Var != null) {
            return t0Var.f16696b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View getEndCardView() {
        return this.f19025y.getEndCardView();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyView() {
        return a(this.f19026z) ? this.f19026z.getTrackingFriendlyView() : this.f19025y.getTrackingFriendlyView();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return a(this.f19026z) ? this.f19026z.getTrackingFriendlyViewObstructionPurposeOther() : this.f19025y.getTrackingFriendlyViewObstructionPurposeOther();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void h() {
        this.f19025y.h();
        if (a(this.f19026z)) {
            this.f19026z.h();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean i() {
        return a(this.f19026z) ? this.f19026z.L.f19052n : this.f19025y.i();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void j() {
        this.f19025y.j();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void k() {
        this.f19025y.k();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean l() {
        return a(this.f19026z) ? this.f19026z.L.f19051m : this.f19025y.l();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void m() {
        this.f19025y.m();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void n() {
        this.f19025y.n();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void o() {
        this.f19025y.o();
        this.f19080t = this.f19025y.f19080t;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setAppInfoButtonRound(TextView textView) {
        this.f19025y.setAppInfoButtonRound(textView);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public void setListener(n nVar) {
        super.setListener(nVar);
        this.f19025y.setListener(nVar);
        if (a(this.f19026z)) {
            this.f19026z.setListener(nVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setMuteButtonState(boolean z10) {
        this.f19025y.setMuteButtonState(z10);
        if (a(this.f19026z)) {
            this.f19026z.setMuteButtonState(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setRemainingTime(String str) {
        this.f19025y.setRemainingTime(str);
        if (a(this.f19026z)) {
            this.f19026z.setRemainingTime(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setSkipText(String str) {
        this.f19025y.setSkipText(str);
        if (a(this.f19026z)) {
            this.f19026z.setSkipText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public void setUnitConfig(s0 s0Var) {
        super.setUnitConfig(s0Var);
        this.f19025y.setUnitConfig(s0Var);
        if (a(this.f19026z)) {
            this.f19026z.setUnitConfig(s0Var);
        }
    }
}
