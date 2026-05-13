package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.u;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l extends s {
    public static final g1 I;
    public final com.fyber.inneractive.sdk.flow.g A;
    public boolean B;
    public v1 C;
    public k D;
    public int E;
    public int F;
    public View G;
    public boolean H;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f19030y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LayoutInflater f19031z;

    static {
        g1 g1Var = new g1();
        g1Var.f19530c = true;
        I = g1Var;
    }

    public l(Context context, com.fyber.inneractive.sdk.flow.g gVar, a aVar, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        super(context, rVar, str);
        this.B = false;
        this.H = true;
        this.A = gVar;
        this.f19031z = LayoutInflater.from(context);
        this.f19030y = aVar;
    }

    public abstract void a(int i10);

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void a(int i10, int i11) {
        Runnable runnable = this.D;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.D = null;
        }
        this.F = getMaxTickFactor() + i11;
        int maxTickFactor = (getMaxTickFactor() / getTickFractions()) + i11;
        int i12 = this.F;
        if (i12 <= 0 || i12 > i10) {
            return;
        }
        int i13 = this.E;
        if (maxTickFactor < i13 && i13 > 0) {
            a(i12);
            return;
        }
        this.E = maxTickFactor;
        a(maxTickFactor);
        k kVar = new k(this);
        this.D = kVar;
        postDelayed(kVar, this.f19071k);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, b bVar2) {
        Integer num;
        this.G = bVar2.f19000e;
        ViewGroup viewGroup = this.f19078r;
        if (viewGroup != null) {
            bVar.a(viewGroup, bVar2);
            this.f19078r.setVisibility(0);
            com.fyber.inneractive.sdk.model.vast.i iVar = bVar2.f19001f;
            com.fyber.inneractive.sdk.model.vast.i iVar2 = com.fyber.inneractive.sdk.model.vast.i.Static;
            if (iVar2 == iVar) {
                a(getEndCardView(), 4);
            }
            if ((iVar2 == iVar || iVar == com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card) && (num = bVar2.f18999d) != null) {
                b(iVar != iVar2 ? 8 : 4, num.intValue());
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void a(h1 h1Var, int i10, int i11) {
        this.f19030y.a(this.f19019d, this.f19074n, this.f19075o, this.f19076p, h1Var, i10, i11, this.f19017b, ((r0) this.f19018c).f16098f.f16154f.intValue());
    }

    public void b(int i10, int i11) {
        if (this.B || this.C != null) {
            return;
        }
        IAlog.a("Start Autoclick timer - %d seconds", Integer.valueOf(i11));
        v1 v1Var = new v1(TimeUnit.SECONDS, i11);
        this.C = v1Var;
        v1Var.f19580e = new j(this, i10);
        t1 t1Var = new t1(v1Var);
        v1Var.f19578c = t1Var;
        v1Var.f19579d = false;
        t1Var.sendEmptyMessage(1932593528);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.e, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53142p, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f() {
        p();
        this.B = true;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View getEndCardView() {
        return this.G;
    }

    public String getLocalizedCtaButtonText() {
        com.fyber.inneractive.sdk.config.global.r rVar = this.f19082v;
        com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
        if (dVar == null) {
            return null;
        }
        dVar.d(IAConfigManager.O.f15969o);
        com.fyber.inneractive.sdk.model.vast.a aVar = dVar.f16038e;
        if (aVar == null || !aVar.f16819d) {
            return null;
        }
        return aVar.f16816a;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public int getMaxTickFactor() {
        return 1000;
    }

    public int getSingleTickTime() {
        return 1000 / getTickFraction();
    }

    public int getTickFraction() {
        return 5;
    }

    public void h(boolean z10) {
        String string = getContext().getString(R.string.ia_video_app_info_text);
        com.fyber.inneractive.sdk.config.global.r rVar = this.f19082v;
        if (rVar != null) {
            Boolean boolC = ((u) rVar.a(u.class)).c("show_ad_identifier_original_design");
            this.H = boolC != null ? boolC.booleanValue() : true;
            string = ((com.fyber.inneractive.sdk.config.global.features.n) this.f19082v.a(com.fyber.inneractive.sdk.config.global.features.n.class)).a("app_info_button_text", "App Info");
            if (string != null && string.length() > 30) {
                string = string.substring(0, 30);
            }
        }
        if (z10 && this.H) {
            b(false);
            a(true, string);
            c(true);
        } else if (z10) {
            b(false);
            a(true, string);
            c(false);
        } else if (!this.H) {
            b(true);
            c(false);
        } else {
            a(false, (String) null);
            b(false);
            c(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void j() {
        if (this.C != null) {
            IAlog.a("Autoclick paused", new Object[0]);
            v1 v1Var = this.C;
            v1Var.f19579d = true;
            t1 t1Var = v1Var.f19578c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void k() {
        if (this.C != null) {
            IAlog.a("Autoclick resumed", new Object[0]);
            v1 v1Var = this.C;
            v1Var.f19579d = false;
            v1Var.a(SystemClock.uptimeMillis());
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void o() {
        this.f19080t = this.f19030y.a(this.f19019d, this.f19074n, this.f19075o, this.f19079s, this.f19017b, this.f19072l);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
    }

    public final void p() {
        if (this.C != null) {
            IAlog.a("Autoclick is removed ", new Object[0]);
            this.C.f19580e = null;
            this.C = null;
        }
    }

    public void setEndCardView(View view) {
        this.G = view;
    }
}
