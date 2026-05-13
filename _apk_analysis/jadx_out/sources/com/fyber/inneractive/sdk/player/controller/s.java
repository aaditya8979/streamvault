package com.fyber.inneractive.sdk.player.controller;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.special.SpecialsBridge;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class s extends z {
    public float A;
    public float B;
    public boolean C;
    public boolean D;
    public boolean E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public r f17198z;

    public s(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, r0 r0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z10, String str) {
        super(fVar, sVar, r0Var, rVar, z10, str);
        this.B = 0.0f;
        this.C = false;
        this.D = false;
        this.E = false;
        this.A = ((r0) this.f17208b).f16099g.f16162b.intValue() / 100.0f;
        J();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53142p);
        context.startActivity(intent);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public boolean A() {
        return false;
    }

    public void F() {
        IAlog.a("%s handle buffering timeout: Skipping to end card", IAlog.a(this));
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    public final void G() {
        if (this.f17213g == null || this.E) {
            return;
        }
        I();
        super.g();
        com.fyber.inneractive.sdk.renderers.o oVar = (com.fyber.inneractive.sdk.renderers.o) ((a0) this.f17213g);
        com.fyber.inneractive.sdk.renderers.p pVar = oVar.f19344a;
        InneractiveUnitController.EventsListener eventsListener = pVar.f16283c;
        if (eventsListener != null) {
            SpecialsBridge.fyberOnAdExpanded((InneractiveAdViewEventsListener) eventsListener, pVar.f16281a);
        }
        ViewGroup viewGroup = oVar.f19344a.f19349p;
        if (viewGroup != null && viewGroup.getContext() != null) {
            com.fyber.inneractive.sdk.renderers.p pVar2 = oVar.f19344a;
            com.fyber.inneractive.sdk.display.a bVar = pVar2.f16282b instanceof com.fyber.inneractive.sdk.dv.a ? new com.fyber.inneractive.sdk.display.b() : new com.fyber.inneractive.sdk.display.c();
            if (bVar instanceof com.fyber.inneractive.sdk.display.c) {
                Context context = pVar2.f19349p.getContext();
                InneractiveAdSpot inneractiveAdSpot = oVar.f19344a.f16281a;
                Intent intent = new Intent(context, (Class<?>) InneractiveFullscreenAdActivity.class);
                intent.putExtra("spotId", inneractiveAdSpot.getLocalUniqueId());
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                try {
                    IAlog.a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.a(context), inneractiveAdSpot.getLocalUniqueId());
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                } catch (ActivityNotFoundException unused) {
                    IAlog.c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.a(context));
                }
            }
        }
        IAlog.a("%sopening fullscreen", IAlog.a(this));
        this.E = true;
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar != null) {
            com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
            nVar.a(nVar.f18974p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_FULLSCREEN, com.fyber.inneractive.sdk.model.vast.x.EVENT_EXPAND);
        }
    }

    public void H() {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        if (this.B < this.A || (fVar = this.f17207a) == null || (qVar = fVar.f18912a) == null || qVar.f17186e == com.fyber.inneractive.sdk.player.enums.b.Completed || (sVar = this.f17210d) == null || sVar.b() || this.f17207a.f18912a.f17191j == null) {
            return;
        }
        if (((r0) this.f17208b).f16098f.f16149a.booleanValue() || this.C) {
            c(IAConfigManager.O.f15963i.f16071a);
        }
    }

    public final void I() {
        if (this.f17198z != null) {
            IAlog.a("%sCancelling play runnable", IAlog.a(this));
            this.f17210d.removeCallbacks(this.f17198z);
            this.f17198z = null;
        }
    }

    public final void J() {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar == null || (qVar = fVar.f18912a) == null || qVar.f17195n) {
            return;
        }
        if (((r0) this.f17208b).f16098f.f16152d.booleanValue()) {
            this.f17207a.f18912a.b(false);
        } else {
            if (p()) {
                return;
            }
            this.f17207a.f18912a.d(false);
        }
    }

    public void K() {
        if (((r0) this.f17208b).f16098f.f16157i != TapAction.FULLSCREEN) {
            this.f17210d.n();
        }
        C();
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public void a(float f10) {
        q qVar;
        this.B = f10;
        if (IAlog.f19500a >= 3) {
            IAlog.c("%sonVisibilityChanged called with: %s vfpl = %s vfpa = %s", IAlog.a(this), Float.valueOf(f10), Float.valueOf(this.A), Float.valueOf(1.0f - this.A));
        }
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar == null || (qVar = fVar.f18912a) == null) {
            return;
        }
        if (qVar.f17186e != com.fyber.inneractive.sdk.player.enums.b.Playing) {
            H();
            return;
        }
        if (f10 <= this.A) {
            IAlog.e("%sonVisibilityChanged pausing player", IAlog.a(this));
            if (this.f17207a.f18912a.f17191j != null) {
                this.C = false;
                I();
                super.z();
                f(false);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.ui.n
    public final void a(boolean z10) {
        if (z10) {
            a(this.B);
        }
        super.a(z10);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public void b(g1 g1Var) {
        q qVar;
        TapAction tapAction = ((r0) this.f17208b).f16098f.f16157i;
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar == null || fVar.f18912a == null || this.B >= this.A) {
            if (tapAction == TapAction.CTR) {
                a(false, VideoClickOrigin.CTA, g1Var);
                return;
            }
            if (tapAction == TapAction.FULLSCREEN) {
                G();
                return;
            }
            if (tapAction != TapAction.DO_NOTHING) {
                IAlog.a("%sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.a(this), tapAction);
                return;
            }
            if (fVar == null || (qVar = fVar.f18912a) == null) {
                return;
            }
            com.fyber.inneractive.sdk.player.enums.b bVar = qVar.f17186e;
            if (bVar == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                qVar.a(1, true);
            } else {
                qVar.j();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public final void b(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar != null && (qVar = fVar.f18912a) != null && qVar.f17186e != com.fyber.inneractive.sdk.player.enums.b.Completed) {
            K();
        }
        super.b(z10);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public boolean b() {
        return !(this instanceof c0);
    }

    public final void c(int i10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar == null || (qVar = fVar.f18912a) == null || qVar.f17186e == com.fyber.inneractive.sdk.player.enums.b.Playing || this.f17198z != null) {
            return;
        }
        IAlog.a("%splayVideo %s", IAlog.a(this), this.f17210d);
        if (i10 == 0) {
            h(false);
            return;
        }
        r rVar = new r(this);
        this.f17198z = rVar;
        this.f17210d.postDelayed(rVar, i10);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.ui.controller.b
    public final void destroy() {
        I();
        this.f17213g = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void f() {
        super.f();
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar != null && fVar.f18912a != null) {
            IAlog.a("%sconnectToTextureView playing state = %s", IAlog.a(this), this.f17207a.f18912a.f17186e);
            if (this.f17207a.f18912a.h()) {
                this.f17210d.e(true ^ this.f17207a.f18918g);
                J();
            }
        }
        a(this.B);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void g() {
        I();
        super.g();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void h(boolean z10) {
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar == null || fVar.f18912a == null) {
            return;
        }
        J();
        super.h(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final int i() {
        return IAConfigManager.O.f15975u.f16144b.a("VideoAdBufferingTimeout", 5, 1) * 1000;
    }

    public final void j(boolean z10) {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        this.D = z10;
        if (!z10 || (fVar = this.f17207a) == null || (qVar = fVar.f18912a) == null || qVar.f17191j != null || !this.f17210d.f19020e || qVar.f17186e == com.fyber.inneractive.sdk.player.enums.b.Completed) {
            return;
        }
        f();
        a(this.B);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final int o() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void r() {
        IAlog.a("%s onBufferingTimeout reached", IAlog.a(this));
        if (this.f17210d.f19020e) {
            this.f17224r = true;
            F();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void t() {
        G();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void u() {
        super.u();
        I();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void v() {
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar == null || fVar.f18912a == null) {
            return;
        }
        f();
        h(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void w() {
        H();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void x() {
        super.x();
        K();
        this.C = true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void z() {
        I();
        super.z();
    }
}
