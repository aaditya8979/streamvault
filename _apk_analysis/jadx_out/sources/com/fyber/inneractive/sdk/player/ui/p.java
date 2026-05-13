package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends l {
    public int J;
    public com.fyber.inneractive.sdk.player.ui.remote.f K;
    public final com.fyber.inneractive.sdk.player.ui.remote.d L;

    public p(Context context, a aVar, com.fyber.inneractive.sdk.player.ui.remote.d dVar, o oVar) {
        super(context, null, aVar, null, null);
        this.J = 0;
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = new com.fyber.inneractive.sdk.player.ui.remote.f(oVar);
        this.K = fVar;
        this.L = dVar;
        dVar.f19039a = fVar;
        attachViewToParent(dVar.f19040b, getChildCount() - 1, new RelativeLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public final void a(int i10) {
        int i11 = this.J;
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.L;
        dVar.getClass();
        dVar.f19042d.a("FyberRemoteUiBridge.updateProgressBar(%d, %.2f)", String.format(Locale.US, "FyberRemoteUiBridge.updateProgressBar(%d, %.2f)", Integer.valueOf(i11), Float.valueOf((i10 / i11) * 100.0f)), dVar.f19040b.f19700j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l, com.fyber.inneractive.sdk.player.ui.s
    public final void a(int i10, int i11) {
        this.J = i10;
        super.a(i10, i11);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, b bVar) {
        super.a(dVar, bVar);
        ViewGroup viewGroup = this.f19077q;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return;
        }
        this.L.a();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.K;
        if (fVar != null) {
            fVar.f19059d = z10;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.L;
        dVar.getClass();
        dVar.f19042d.a("FyberRemoteUiBridge.showBufferingOverlay(%s)", "FyberRemoteUiBridge.showBufferingOverlay(" + z10 + ")", dVar.f19040b.f19700j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, com.fyber.inneractive.sdk.ignite.m mVar) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.K;
        if (fVar != null) {
            fVar.f19060e = z10;
            fVar.f19066k = mVar;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, String str) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.K;
        if (fVar != null) {
            fVar.f19065j = z10;
            fVar.f19067l = str;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, com.fyber.inneractive.sdk.player.ui.m
    public final boolean a() {
        return this.L.f19040b.f19700j;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void b(boolean z10) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.K;
        if (fVar != null) {
            fVar.f19062g = z10;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.L;
        dVar.getClass();
        dVar.f19042d.a("FyberRemoteUiBridge.showCountdownText(%s)", "FyberRemoteUiBridge.showCountdownText(" + z10 + ")", dVar.f19040b.f19700j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void c(boolean z10) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.K;
        if (fVar != null) {
            fVar.f19063h = z10;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void d(boolean z10) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.K;
        if (fVar != null) {
            fVar.f19064i = z10;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.L;
        dVar.getClass();
        String str = z10 ? "FyberRemoteUiBridge.showMuteButton()" : "FyberRemoteUiBridge.hideMuteButton()";
        dVar.f19042d.a(str, str, dVar.f19040b.f19700j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.m
    public final void destroy() {
        IAlog.a("%s: destroy() : destroying remote UI", "IAVideoViewRemote");
        removeView(this.L.f19040b);
        this.L.a();
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.K;
        if (fVar != null) {
            fVar.f19056a = null;
            this.K = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l, com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.e, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53142p, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void e(boolean z10) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.K;
        if (fVar != null) {
            fVar.f19058c = z10;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.L;
        dVar.getClass();
        dVar.f19042d.a("FyberRemoteUiBridge.showPlayOverlay(%s)", "FyberRemoteUiBridge.showPlayOverlay(" + z10 + ")", dVar.f19040b.f19700j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f(boolean z10) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.K;
        if (fVar != null) {
            fVar.f19061f = z10;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.L;
        dVar.getClass();
        dVar.f19042d.a("FyberRemoteUiBridge.showProgressBar(%s)", "FyberRemoteUiBridge.showProgressBar(" + z10 + ")", dVar.f19040b.f19700j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g() {
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.L;
        dVar.f19042d.a("FyberRemoteUiBridge.enableSkip()", "FyberRemoteUiBridge.enableSkip()", dVar.f19040b.f19700j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g(boolean z10) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.K;
        if (fVar != null) {
            fVar.f19057b = z10;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.L;
        dVar.getClass();
        dVar.f19042d.a("FyberRemoteUiBridge.showSkipLayout(%s)", "FyberRemoteUiBridge.showSkipLayout(" + z10 + ")", dVar.f19040b.f19700j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public int getTickFractions() {
        return 15;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyView() {
        return new View[]{this.L.f19040b};
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return new View[0];
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void h() {
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.L;
        dVar.f19042d.a("FyberRemoteUiBridge.hideOverlays()", "FyberRemoteUiBridge.hideOverlays()", dVar.f19040b.f19700j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean i() {
        return this.L.f19052n;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean l() {
        return this.L.f19051m;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void m() {
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void n() {
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setAppInfoButtonRound(TextView textView) {
    }

    public void setIsSkipEnabled(boolean z10) {
        this.L.f19052n = z10;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public void setListener(n nVar) {
        super.setListener(nVar);
        this.L.f19043e = nVar;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setMuteButtonState(boolean z10) {
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.L;
        dVar.getClass();
        String str = z10 ? "FyberRemoteUiBridge.setMute()" : "FyberRemoteUiBridge.setUnmute()";
        com.fyber.inneractive.sdk.player.ui.remote.e eVar = dVar.f19042d;
        eVar.f19055c = z10;
        com.fyber.inneractive.sdk.player.ui.remote.d dVar2 = eVar.f19053a;
        if (dVar2 != null) {
            dVar2.f19040b.a(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setRemainingTime(String str) {
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.L;
        dVar.getClass();
        dVar.f19042d.a("FyberRemoteUiBridge.setRemainingTime(\"%s\")", "FyberRemoteUiBridge.setRemainingTime(\"" + str + "\")", dVar.f19040b.f19700j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setSkipText(String str) {
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.L;
        dVar.getClass();
        dVar.f19042d.a("FyberRemoteUiBridge.setSkipText(\"%s\")", "FyberRemoteUiBridge.setSkipText(\"" + str + "\")", dVar.f19040b.f19700j);
    }
}
