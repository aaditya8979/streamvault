package com.fyber.inneractive.sdk.player.controller;

import android.app.Application;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.fyber.adsession.media.InteractionType;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z implements b, p, o, com.fyber.inneractive.sdk.player.ui.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.f f17207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f17208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f17209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.ui.s f17210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f17211e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g0 f17213g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f17216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17217k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u f17219m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f17220n;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.g f17227u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f17228v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17212f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17214h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f17215i = -0.1f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17218l = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17221o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17222p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17223q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f17224r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17225s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ignite.m f17226t = com.fyber.inneractive.sdk.ignite.m.NONE;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f17229w = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f17231y = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Skip f17230x = null;

    public z(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z10, String str) {
        q qVar;
        this.f17207a = fVar;
        this.f17208b = s0Var;
        this.f17209c = rVar;
        this.f17210d = sVar;
        this.f17220n = z10;
        this.f17228v = str;
        sVar.setListener(this);
        if (fVar == null || (qVar = fVar.f18912a) == null) {
            return;
        }
        if (!qVar.f17183b.contains(this)) {
            qVar.f17183b.add(this);
        }
        q qVar2 = fVar.f18912a;
        if (qVar2.f17184c.contains(this)) {
            return;
        }
        qVar2.f17184c.add(this);
    }

    public static int l() {
        int i10;
        try {
            i10 = Integer.parseInt(IAConfigManager.O.f15975u.f16144b.a("max_rv_tsec", Integer.toString(30)));
        } catch (Throwable unused) {
            i10 = 30;
        }
        if (i10 < 1) {
            return 30;
        }
        return i10;
    }

    public abstract boolean A();

    public boolean B() {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        t0 t0Var;
        s0 s0Var = this.f17208b;
        boolean z10 = (s0Var == null || (t0Var = ((r0) s0Var).f16098f) == null || t0Var.f16158j != UnitDisplayType.REWARDED) ? false : true;
        if (!InneractiveAdManager.isCurrentUserAChild() || !z10 || this.f17210d == null || (fVar = this.f17207a) == null || (qVar = fVar.f18912a) == null) {
            return false;
        }
        int iB = qVar.b() / 1000;
        return (this.f17207a.f18912a.c() / 1000) - iB <= 0 || iB < l();
    }

    public void C() {
        Boolean boolC;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f17209c;
        com.fyber.inneractive.sdk.config.global.features.u uVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.u) rVar.a(com.fyber.inneractive.sdk.config.global.features.u.class) : null;
        boolean zBooleanValue = (uVar == null || (boolC = uVar.c("show_cta")) == null) ? true : boolC.booleanValue();
        g0 g0Var = this.f17213g;
        if (g0Var != null) {
            this.f17226t = g0Var.p();
        }
        com.fyber.inneractive.sdk.ignite.m mVar = this.f17226t;
        this.f17210d.a(mVar == com.fyber.inneractive.sdk.ignite.m.NONE ? zBooleanValue : true, mVar);
    }

    public final void D() {
        com.fyber.inneractive.sdk.flow.endcard.b bVarA;
        g0 g0Var;
        com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar;
        boolean z10;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar2;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar3;
        View view;
        View view2;
        com.fyber.inneractive.sdk.flow.endcard.b bVar;
        com.fyber.inneractive.sdk.model.vast.o oVar;
        this.f17210d.h();
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ = j();
        if (kVarJ != null) {
            bVarA = kVarJ.a();
            com.fyber.inneractive.sdk.flow.endcard.h hVar = kVarJ.f16328e;
            com.fyber.inneractive.sdk.flow.endcard.m mVar = kVarJ.f16325b;
            hVar.getClass();
            if (mVar.f16360a.size() >= 1) {
                com.fyber.inneractive.sdk.flow.endcard.b bVarA2 = mVar.a();
                com.fyber.inneractive.sdk.model.vast.i iVar = com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card;
                Iterator it = mVar.f16360a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bVar = null;
                        break;
                    } else {
                        bVar = (com.fyber.inneractive.sdk.flow.endcard.b) it.next();
                        if (bVar.i() == iVar) {
                            break;
                        }
                    }
                }
                if (bVarA2 != null && bVarA2.i() != com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card && bVarA2.i() != com.fyber.inneractive.sdk.model.vast.i.Default_End_Card && bVarA2.l() && (oVar = bVarA2.f16308c.f16705e.f16826f) != null && oVar.f16880d && bVar != null && bVar.l()) {
                    hVar.a(bVarA2, bVar.l());
                    hVar.a(bVar, true, bVarA2.k());
                } else if (bVarA2 == bVar || bVarA2 == null || bVarA2.g() == com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD) {
                    hVar.a(bVarA2, false, false);
                } else {
                    hVar.a(bVarA2, false);
                }
            }
        } else {
            bVarA = null;
        }
        if (bVarA == null) {
            if (e() || (g0Var = this.f17213g) == null) {
                return;
            }
            g0Var.j();
            return;
        }
        a(bVarA);
        if (n() != null) {
            com.fyber.inneractive.sdk.flow.storepromo.b bVarN = n();
            com.fyber.inneractive.sdk.player.ui.s sVar = this.f17210d;
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2 = bVarN.f16536d;
            if (bVar2 == null || (cVar = bVar2.f16545c) == null || !(z10 = cVar.f16556e)) {
                bVarN.f16533a.a();
                bVarN.a();
                bVarN.a((bVarN.f16536d == null ? com.fyber.inneractive.sdk.flow.storepromo.events.a.CONTROLLER_NOT_INITIALIZED : com.fyber.inneractive.sdk.flow.storepromo.events.a.TEMPLATE_NOT_LOADED).name(), (String) null, (String) null);
                return;
            }
            bVar2.f16551i = kVarJ;
            if (!z10 || (cVar2 = bVar2.f16546d) == null || bVar2.f16549g) {
                return;
            }
            if (cVar2.f16634b == null || (view2 = cVar2.f16633a) == null || view2.getParent() == null || cVar2.f16634b.getVisibility() != 0) {
                com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar4 = bVar2.f16546d;
                if (cVar4.f16634b == null || cVar4.f16633a == null) {
                    IAlog.f("StorePromoView: show: missing container or content", new Object[0]);
                    return;
                }
                cVar4.a();
                com.fyber.inneractive.sdk.util.v.a(cVar4.f16634b);
                sVar.addView(cVar4.f16634b);
                cVar4.f16633a.setAnimation(cVar4.f16635c);
                cVar4.f16634b.setVisibility(0);
                com.fyber.inneractive.sdk.flow.storepromo.b bVar3 = cVar4.f16638f;
                if (bVar3 != null) {
                    com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar4 = bVar3.f16536d;
                    com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar5 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar4 == null || (cVar3 = bVar4.f16546d) == null || cVar3.f16634b == null || (view = cVar3.f16633a) == null || view.getParent() == null || cVar3.f16634b.getVisibility() != 0) ? false : true, bVar3.f16541i);
                    Iterator it2 = bVar3.f16540h.iterator();
                    while (it2.hasNext()) {
                        ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it2.next()).a(bVar5);
                    }
                    JSONObject jSONObject = new JSONObject();
                    Integer numValueOf = Integer.valueOf(bVar3.f16539g);
                    try {
                        jSONObject.put("screenshots", numValueOf);
                    } catch (Exception unused) {
                        IAlog.f("Got exception adding param to json object: %s, %s", "screenshots", numValueOf);
                    }
                    com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_EVENT_SP_IMPRESSION;
                    InneractiveAdRequest inneractiveAdRequest = bVar3.f16535c;
                    com.fyber.inneractive.sdk.response.e eVar = bVar3.f16534b;
                    String str = bVar3.f16538f;
                    com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(uVar, inneractiveAdRequest, eVar);
                    try {
                        jSONObject.put("templateURL", str);
                    } catch (Exception unused2) {
                        IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str);
                    }
                    wVar.f17081f.put(jSONObject);
                    wVar.a((String) null);
                }
            }
        }
    }

    public void E() {
        boolean z10;
        q qVar;
        q qVar2;
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar != null && (((qVar2 = fVar.f18912a) != null && qVar2.f17186e == com.fyber.inneractive.sdk.player.enums.b.Completed) || this.f17223q)) {
            fVar.a();
        }
        boolean zA = IAConfigManager.O.f15975u.f16144b.a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).a();
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f17210d;
        com.fyber.inneractive.sdk.player.f fVar2 = this.f17207a;
        sVar.e((fVar2 == null || (qVar = fVar2.f18912a) == null || qVar.f17186e != com.fyber.inneractive.sdk.player.enums.b.Completed) && !(((z10 = this.f17223q) && !zA) || this.f17224r || (z10 && zA)));
    }

    public final com.fyber.inneractive.sdk.player.ui.c a(com.fyber.inneractive.sdk.player.ui.c cVar) {
        String string;
        cVar.f19012h = this.f17207a != null && com.fyber.inneractive.sdk.player.f.a(this.f17209c, this.f17226t);
        com.fyber.inneractive.sdk.config.global.r rVar = this.f17209c;
        com.fyber.inneractive.sdk.config.global.features.n nVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.n) rVar.a(com.fyber.inneractive.sdk.config.global.features.n.class) : null;
        if (nVar != null) {
            string = nVar.a("app_info_button_text", "App Info");
            if (string != null && string.length() > 30) {
                string = string.substring(0, 30);
            }
        } else {
            string = this.f17210d.getContext().getString(R.string.ia_video_app_info_text);
        }
        cVar.f19013i = string;
        cVar.f19011g = this.f17226t;
        return cVar;
    }

    public void a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    @Override // com.fyber.inneractive.sdk.player.controller.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r9) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.z.a(int):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(int i10, g1 g1Var) {
        IAlog.a("onClicked called with %d", Integer.valueOf(i10));
        switch (i10) {
            case 1:
                if (p()) {
                    i(true);
                    com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
                    if (fVar != null) {
                        com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
                        nVar.a(nVar.f18974p, VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.x.EVENT_UNMUTE);
                    }
                } else {
                    f(true);
                    com.fyber.inneractive.sdk.player.f fVar2 = this.f17207a;
                    if (fVar2 != null) {
                        com.fyber.inneractive.sdk.player.n nVar2 = (com.fyber.inneractive.sdk.player.n) fVar2;
                        nVar2.a(nVar2.f18974p, VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.x.EVENT_MUTE);
                    }
                }
                this.f17210d.setMuteButtonState(p());
                break;
            case 2:
                v();
                break;
            case 3:
                a(w0.CTA_BUTTON.a());
                a(false, VideoClickOrigin.CTA, g1Var);
                break;
            case 4:
                a(w0.COMPANION.a());
                com.fyber.inneractive.sdk.player.f fVar3 = this.f17207a;
                String str = null;
                if (fVar3 != null) {
                    com.fyber.inneractive.sdk.player.n nVar3 = (com.fyber.inneractive.sdk.player.n) fVar3;
                    com.fyber.inneractive.sdk.flow.endcard.b bVarA = nVar3.f18978t.f16325b.a();
                    if (bVarA instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
                        com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) bVarA;
                        String str2 = cVar.f16312g.f16843g;
                        if (TextUtils.isEmpty(str2)) {
                            com.fyber.inneractive.sdk.model.vast.b bVar = nVar3.f18974p;
                            if (bVar != null) {
                                str = bVar.f16822b;
                            }
                        } else {
                            str = str2;
                        }
                        fVar3.a(cVar, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                    }
                }
                com.fyber.inneractive.sdk.player.ui.s sVar = this.f17210d;
                if (sVar != null) {
                    sVar.f();
                }
                g0 g0Var = this.f17213g;
                if (g0Var != null) {
                    g0Var.a(str, g1Var, false);
                }
                break;
            case 5:
                t();
                break;
            case 6:
                if (!B()) {
                    d(true);
                } else {
                    g(true);
                }
                break;
            case 7:
                b(g1Var);
                break;
            case 8:
                a(w0.COMPANION.a());
                a(true, VideoClickOrigin.COMPANION, g1Var);
                break;
            case 9:
                com.fyber.inneractive.sdk.player.f fVar4 = this.f17207a;
                if (fVar4 != null && !this.f17210d.f19023h) {
                    fVar4.f18918g = true;
                    h(false);
                    break;
                }
                break;
            case 10:
                a(w0.APP_INFO.a());
                a(false, VideoClickOrigin.APP_INFO, g1Var);
                break;
            case 11:
                a(w0.STORE_PROMO.a());
                a(false, VideoClickOrigin.STORE_PROMO, g1Var);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    @Override // com.fyber.inneractive.sdk.player.controller.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.fyber.inneractive.sdk.flow.endcard.b r6) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.z.a(com.fyber.inneractive.sdk.flow.endcard.b):void");
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("%sonPlayerStateChanged with %s", IAlog.a(this), bVar);
        a(bVar, true);
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar, boolean z10) {
        g0 g0Var;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        switch (y.f17205a[bVar.ordinal()]) {
            case 1:
                boolean z11 = this.f17229w;
                if (z11) {
                    IAlog.a("IAVideoUIControllerBase playerStateUpdated=%s mBuffering=%s", bVar, String.valueOf(z11));
                    q();
                }
                break;
            case 2:
                if (this.f17221o) {
                    E();
                    w();
                }
                break;
            case 3:
                if (this.f17221o) {
                    this.f17229w = true;
                    q();
                }
                break;
            case 4:
                if (this.f17229w) {
                    this.f17229w = false;
                }
                if (this.f17221o) {
                    x();
                }
                break;
            case 5:
                u();
                break;
            case 6:
                if (this.f17221o || (!e() && !this.f17225s)) {
                    this.f17225s = true;
                    if (!this.f17210d.b()) {
                        this.f17210d.a(false);
                        Runnable runnable = this.f17216j;
                        if (runnable != null) {
                            this.f17210d.removeCallbacks(runnable);
                            this.f17216j = null;
                        }
                        E();
                        D();
                        this.f17217k = false;
                        this.f17214h = true;
                    }
                    if (z10 && (g0Var = this.f17213g) != null) {
                        g0Var.onCompleted();
                        break;
                    }
                }
                break;
            case 7:
                if (this.f17221o || ((sVar = this.f17210d) != null && sVar.isShown())) {
                    s();
                }
                break;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
    }

    public final void a(String str) {
        t0 t0Var;
        x0 x0Var = IAConfigManager.O.f15978x;
        s0 s0Var = this.f17208b;
        if (s0Var == null || (t0Var = ((r0) s0Var).f16098f) == null) {
            return;
        }
        x0Var.a(t0Var.f16158j, "LAST_VAST_CLICKED_TYPE", str);
    }

    public void a(boolean z10) {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        x xVar;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        Application application;
        if (this.f17221o == z10 || (fVar = this.f17207a) == null || fVar.f18912a == null) {
            return;
        }
        IAlog.a("%sonVisibilityChanged: %s my video view is%s", IAlog.a(this), Boolean.valueOf(z10), this.f17210d);
        if (!z10) {
            this.f17221o = false;
            com.fyber.inneractive.sdk.player.f fVar2 = this.f17207a;
            if (fVar2 != null && (qVar = fVar2.f18912a) != null && (xVar = qVar.f17185d) != null && xVar.equals(this.f17211e)) {
                IAlog.a("%sonVisibilityChanged pausing video", IAlog.a(this));
                z();
                if (this.f17207a.f18912a.f17186e == com.fyber.inneractive.sdk.player.enums.b.Completed || ((sVar = this.f17210d) != null && sVar.b())) {
                    this.f17210d.j();
                }
            }
            com.fyber.inneractive.sdk.player.ui.s sVar2 = this.f17210d;
            if (sVar2 == null || !sVar2.f19023h) {
                g();
                return;
            }
            return;
        }
        this.f17221o = true;
        com.fyber.inneractive.sdk.player.enums.b bVar = this.f17207a.f18912a.f17186e;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Completed || this.f17210d.b()) {
            if (!this.f17225s) {
                this.f17225s = true;
                if (!this.f17231y) {
                    if (!this.f17210d.b()) {
                        this.f17210d.a(false);
                        Runnable runnable = this.f17216j;
                        if (runnable != null) {
                            this.f17210d.removeCallbacks(runnable);
                            this.f17216j = null;
                        }
                        E();
                        D();
                        this.f17217k = false;
                        this.f17214h = true;
                    }
                    g0 g0Var = this.f17213g;
                    if (g0Var != null) {
                        g0Var.onCompleted();
                    }
                }
            }
            com.fyber.inneractive.sdk.player.ui.s sVar3 = this.f17210d;
            if (sVar3 != null) {
                sVar3.k();
                return;
            }
            return;
        }
        if (bVar != com.fyber.inneractive.sdk.player.enums.b.Error) {
            if (bVar != com.fyber.inneractive.sdk.player.enums.b.Idle) {
                if (bVar == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress || bVar == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                    x();
                }
                com.fyber.inneractive.sdk.player.f fVar3 = this.f17207a;
                if (!fVar3.f18921j) {
                    com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar3;
                    nVar.a(nVar.f18974p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CREATIVE_VIEW);
                    fVar3.f18921j = true;
                }
                f();
                if (this.f17219m != null || (application = com.fyber.inneractive.sdk.util.o.f19548a) == null) {
                    return;
                }
                u uVar = new u(this);
                this.f17219m = uVar;
                application.registerActivityLifecycleCallbacks(uVar);
                return;
            }
            this.f17207a.getClass();
        }
        s();
    }

    public final boolean a(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar == null || (bVar = ((com.fyber.inneractive.sdk.player.n) fVar).f18980v) == null) {
            IAlog.f("Unable to add store promo observer, promo manager is unavailable", new Object[0]);
            return false;
        }
        bVar.getClass();
        synchronized (com.fyber.inneractive.sdk.flow.storepromo.b.f16532k) {
            bVar.f16540h.add(aVar);
        }
        return true;
    }

    public final boolean a(boolean z10, VideoClickOrigin videoClickOrigin, g1 g1Var) {
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f17210d;
        if (sVar != null) {
            sVar.f();
        }
        g0 g0Var = this.f17213g;
        boolean z11 = false;
        if (g0Var != null) {
            if (z10) {
                com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
                if (fVar != null) {
                    com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.player.n) fVar).f18974p;
                    g0Var.a(bVar != null ? bVar.f16822b : null, g1Var, true);
                    com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) this.f17207a;
                    nVar.a(nVar.f18974p, videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                }
            } else {
                int i10 = y.f17206b[videoClickOrigin.ordinal()];
                com.fyber.inneractive.sdk.util.d0 d0VarA = this.f17213g.a(g1Var, i10 != 1 ? i10 != 2 ? i10 != 3 ? com.fyber.inneractive.sdk.util.g.VIDEO_CTA : com.fyber.inneractive.sdk.util.g.VIDEO_APP_INFO : com.fyber.inneractive.sdk.util.g.VIDEO_CLICK : com.fyber.inneractive.sdk.util.g.STORE_PROMO_CTA);
                com.fyber.inneractive.sdk.player.f fVar2 = this.f17207a;
                if (fVar2 != null) {
                    com.fyber.inneractive.sdk.player.n nVar2 = (com.fyber.inneractive.sdk.player.n) fVar2;
                    nVar2.a(nVar2.f18974p, videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                    com.fyber.inneractive.sdk.measurement.f fVar3 = this.f17207a.f18916e;
                    if (fVar3 != null && fVar3.f16766c != null) {
                        IAlog.a("%s click", "OMVideo");
                        try {
                            fVar3.f16766c.adUserInteraction(InteractionType.CLICK);
                        } catch (Throwable th2) {
                            fVar3.a(th2);
                        }
                    }
                }
                if (d0VarA.f19521a != com.fyber.inneractive.sdk.util.g0.FAILED) {
                    z11 = true;
                }
            }
        }
        if (videoClickOrigin == VideoClickOrigin.VIDEO) {
            a(w0.VIDEO.a());
        }
        return z11;
    }

    public final void b(int i10) {
        if (this.f17210d != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.f17209c;
            String str = null;
            com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.d(IAConfigManager.O.f15969o);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.f16038e;
                if (aVar != null && aVar.f16819d) {
                    str = aVar.f16818c;
                }
            }
            if (!TextUtils.isEmpty(this.f17228v) || str == null) {
                this.f17210d.setSkipText(String.valueOf(i10));
            } else {
                this.f17210d.setSkipText(str.replaceFirst("\\[TIME\\]", Integer.toString(i10)));
            }
        }
    }

    public final void b(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar == null || (bVar = ((com.fyber.inneractive.sdk.player.n) fVar).f18980v) == null) {
            IAlog.f("Unable to remove store promo observer, promo manager is unavailable", new Object[0]);
            return;
        }
        bVar.getClass();
        synchronized (com.fyber.inneractive.sdk.flow.storepromo.b.f16532k) {
            bVar.f16540h.remove(aVar);
        }
    }

    public abstract void b(g1 g1Var);

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void b(boolean z10) {
        IAlog.a("%sinitUI", IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar == null || fVar.f18912a == null) {
            return;
        }
        this.f17210d.setUnitConfig(this.f17208b);
        this.f17210d.a(this.f17220n, this.f17207a.f18912a.f(), this.f17207a.f18912a.e());
        if (A()) {
            this.f17212f = o();
        } else {
            this.f17210d.g(false);
        }
        if (!z10) {
            a(this.f17207a.f18912a.b());
            a(this.f17207a.f18912a.f17186e, false);
        }
        this.f17210d.setMuteButtonState(p());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public boolean b() {
        com.fyber.inneractive.sdk.player.ui.s sVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar == null) {
            return false;
        }
        if (!this.f17214h && fVar.f18912a != null && ((sVar = this.f17210d) == null || !sVar.i())) {
            int iC = this.f17207a.f18912a.c();
            com.fyber.inneractive.sdk.player.f fVar2 = this.f17207a;
            if (!com.fyber.inneractive.sdk.player.f.a(iC, com.fyber.inneractive.sdk.player.f.a(fVar2), ((com.fyber.inneractive.sdk.player.n) fVar2).f18977s) || this.f17214h || this.f17212f != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.n
    public void c() {
        IAlog.a("%sonVideoViewDetachedFromWindow", IAlog.a(this));
        g();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z10) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void d() {
        if (this.f17221o && !this.f17218l) {
            this.f17218l = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r6) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.z.d(boolean):void");
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public void destroy() {
        q qVar;
        Application application;
        u uVar = this.f17219m;
        if (uVar != null && (application = com.fyber.inneractive.sdk.util.o.f19548a) != null) {
            application.unregisterActivityLifecycleCallbacks(uVar);
        }
        IAlog.a("%sdestroy called", IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar != null && (qVar = fVar.f18912a) != null) {
            qVar.f17183b.remove(this);
            this.f17207a.f18912a.f17184c.remove(this);
        }
        g();
        Runnable runnable = this.f17216j;
        if (runnable != null) {
            this.f17210d.removeCallbacks(runnable);
            this.f17216j = null;
        }
        this.f17213g = null;
    }

    public final void e(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar == null || (qVar = fVar.f18912a) == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.enums.b bVar = qVar.f17186e;
        if (z10 && bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && !this.f17210d.b()) {
            h(false);
            return;
        }
        if (!z10 && bVar == com.fyber.inneractive.sdk.player.enums.b.Paused && this.f17210d.b()) {
            int iB = qVar.b();
            int iC = qVar.c();
            if (iB <= 0 || iB > iC) {
                return;
            }
            qVar.a(iB - 1, false);
            qVar.a(iB, false);
        }
    }

    public boolean e() {
        String str;
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ = j();
        if (kVarJ == null) {
            return false;
        }
        com.fyber.inneractive.sdk.response.g gVar = kVarJ.f16324a.f16704d;
        return (gVar != null && (str = gVar.E) != null && TextUtils.equals(str, "1")) ^ true;
    }

    public void f() {
        q qVar;
        q qVar2;
        com.fyber.inneractive.sdk.measurement.f fVar;
        if (this.f17227u == null) {
            com.fyber.inneractive.sdk.player.ui.g gVar = new com.fyber.inneractive.sdk.player.ui.g(this.f17210d);
            this.f17227u = gVar;
            gVar.setId(R.id.ia_inn_texture_view);
            com.fyber.inneractive.sdk.player.f fVar2 = this.f17207a;
            if (fVar2 != null && (fVar = fVar2.f18916e) != null) {
                com.fyber.inneractive.sdk.player.ui.s sVar = this.f17210d;
                View[] trackingFriendlyView = sVar.getTrackingFriendlyView();
                AdSession adSession = fVar.f16764a;
                if (adSession != null) {
                    try {
                        adSession.registerAdView(sVar);
                    } catch (Throwable th2) {
                        fVar.a(th2);
                    }
                }
                if (fVar.f16764a != null && trackingFriendlyView != null) {
                    for (View view : trackingFriendlyView) {
                        if (view != null) {
                            try {
                                fVar.f16764a.addFriendlyObstruction(view, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
                            } catch (Throwable th3) {
                                fVar.a(th3);
                            }
                        }
                    }
                }
                View[] trackingFriendlyViewObstructionPurposeOther = this.f17210d.getTrackingFriendlyViewObstructionPurposeOther();
                if (fVar.f16764a != null) {
                    for (View view2 : trackingFriendlyViewObstructionPurposeOther) {
                        if (view2 != null) {
                            try {
                                fVar.f16764a.addFriendlyObstruction(view2, FriendlyObstructionPurpose.OTHER, null);
                            } catch (Throwable th4) {
                                fVar.a(th4);
                            }
                        }
                    }
                }
            }
        }
        IAlog.a("%sconnectToTextureView called %s", IAlog.a(this), this.f17210d.getTextureHost());
        if (this.f17227u != null && this.f17210d.getTextureHost().equals(this.f17227u.getParent())) {
            IAlog.a("%sconnectToTextureView called but already connected", IAlog.a(this));
            return;
        }
        com.fyber.inneractive.sdk.player.f fVar3 = this.f17207a;
        if (fVar3 != null && (qVar2 = fVar3.f18912a) != null) {
            qVar2.a(this.f17227u);
        }
        com.fyber.inneractive.sdk.player.ui.g gVar2 = this.f17227u;
        if (gVar2 != null && gVar2.getParent() == null) {
            IAlog.a("%supdateView adding texture to parent", IAlog.a(this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.f17210d.getTextureHost().addView(this.f17227u, layoutParams);
        }
        this.f17218l = false;
        x xVar = new x(this);
        this.f17211e = xVar;
        com.fyber.inneractive.sdk.player.f fVar4 = this.f17207a;
        if (fVar4 == null || (qVar = fVar4.f18912a) == null) {
            return;
        }
        qVar.f17185d = xVar;
    }

    public final void f(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar != null && (qVar = fVar.f18912a) != null) {
            qVar.b(z10);
        }
        this.f17210d.setMuteButtonState(true);
    }

    public void g() {
        if (this.f17227u != null) {
            IAlog.a("%sdestroyTextureView", IAlog.a(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(boolean r6) {
        /*
            r5 = this;
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.c> r0 = com.fyber.inneractive.sdk.config.global.features.c.class
            com.fyber.inneractive.sdk.player.controller.f0 r1 = new com.fyber.inneractive.sdk.player.controller.f0
            com.fyber.inneractive.sdk.player.ui.s r2 = r5.f17210d
            android.content.Context r2 = r2.getContext()
            com.fyber.inneractive.sdk.config.global.r r3 = r5.f17209c
            if (r3 == 0) goto L31
            com.fyber.inneractive.sdk.config.global.features.h r3 = r3.a(r0)
            com.fyber.inneractive.sdk.config.global.features.c r3 = (com.fyber.inneractive.sdk.config.global.features.c) r3
            r3.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.HashMap r3 = r3.f16040c
            java.util.Collection r3 = r3.values()
            r4.<init>(r3)
            int r3 = r4.size()
            if (r3 <= 0) goto L31
            com.fyber.inneractive.sdk.config.global.r r3 = r5.f17209c
            com.fyber.inneractive.sdk.config.global.features.h r0 = r3.a(r0)
            com.fyber.inneractive.sdk.config.global.features.c r0 = (com.fyber.inneractive.sdk.config.global.features.c) r0
            goto L32
        L31:
            r0 = 0
        L32:
            com.fyber.inneractive.sdk.player.controller.v r3 = new com.fyber.inneractive.sdk.player.controller.v
            r3.<init>(r5, r6)
            r1.<init>(r2, r0, r3)
            android.app.Dialog r6 = r1.f17169b
            r6.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.z.g(boolean):void");
    }

    public void h() {
        if (A()) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.f17209c;
            String str = null;
            com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.d(IAConfigManager.O.f15969o);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.f16038e;
                if (aVar != null && aVar.f16819d) {
                    str = aVar.f16817b;
                }
            }
            if (!TextUtils.isEmpty(this.f17228v) || str == null) {
                com.fyber.inneractive.sdk.player.ui.s sVar = this.f17210d;
                sVar.setSkipText(sVar.getContext().getString(R.string.ia_video_skip_text));
            } else {
                this.f17210d.setSkipText(str);
            }
            this.f17210d.g();
            this.f17212f = 0;
            g0 g0Var = this.f17213g;
            if (g0Var != null) {
                g0Var.d();
            }
        }
    }

    public void h(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar != null) {
            if (!fVar.f18918g) {
                E();
                return;
            }
            if (z10 && (qVar = fVar.f18912a) != null) {
                qVar.a(0, true);
                return;
            }
            q qVar2 = fVar.f18912a;
            if (qVar2 != null) {
                com.fyber.inneractive.sdk.player.enums.b bVar = qVar2.f17186e;
                if (bVar == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                    qVar2.a(1, true);
                } else {
                    qVar2.j();
                }
            }
        }
    }

    public abstract int i();

    public final void i(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar != null && (qVar = fVar.f18912a) != null) {
            qVar.d(z10);
        }
        this.f17210d.setMuteButtonState(false);
    }

    public final com.fyber.inneractive.sdk.flow.endcard.k j() {
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar != null) {
            return ((com.fyber.inneractive.sdk.player.n) fVar).f18978t;
        }
        return null;
    }

    public com.fyber.inneractive.sdk.web.b0 k() {
        return new w(this);
    }

    public final float m() {
        try {
            return ((AudioManager) this.f17210d.getContext().getSystemService("audio")).getStreamVolume(3);
        } catch (Throwable unused) {
            return 1.0f;
        }
    }

    public com.fyber.inneractive.sdk.flow.storepromo.b n() {
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar != null) {
            return ((com.fyber.inneractive.sdk.player.n) fVar).f18980v;
        }
        return null;
    }

    public abstract int o();

    public final boolean p() {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar == null || (qVar = fVar.f18912a) == null) {
            return false;
        }
        return qVar.g() || ((double) m()) == 0.0d;
    }

    public final void q() {
        this.f17210d.a(true);
        this.f17210d.e(false);
        Runnable runnable = this.f17216j;
        if (runnable == null) {
            if (runnable == null) {
                this.f17216j = new t(this);
            }
            int i10 = i();
            IAlog.a("%s Starting buffering timeout with %d", IAlog.a(this), Integer.valueOf(i10));
            this.f17210d.postDelayed(this.f17216j, i10);
        }
    }

    public abstract void r();

    public void s() {
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    public abstract void t();

    public void u() {
        Runnable runnable = this.f17216j;
        if (runnable != null) {
            this.f17210d.removeCallbacks(runnable);
            this.f17216j = null;
        }
        this.f17210d.a(false);
        E();
    }

    public abstract void v();

    public void w() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x() {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f17210d
            r1 = 0
            r0.a(r1)
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f17210d
            r0.e(r1)
            java.lang.Runnable r0 = r5.f17216j
            if (r0 == 0) goto L17
            com.fyber.inneractive.sdk.player.ui.s r2 = r5.f17210d
            r2.removeCallbacks(r0)
            r0 = 0
            r5.f17216j = r0
        L17:
            com.fyber.inneractive.sdk.player.f r0 = r5.f17207a
            r2 = 1
            if (r0 == 0) goto L74
            boolean r0 = r5.A()
            if (r0 == 0) goto L74
            boolean r0 = r5.f17214h
            if (r0 != 0) goto L74
            com.fyber.inneractive.sdk.player.f r0 = r5.f17207a
            com.fyber.inneractive.sdk.player.controller.q r0 = r0.f18912a
            int r0 = r0.c()
            com.fyber.inneractive.sdk.player.f r3 = r5.f17207a
            r4 = r3
            com.fyber.inneractive.sdk.player.n r4 = (com.fyber.inneractive.sdk.player.n) r4
            com.fyber.inneractive.sdk.config.s0 r4 = r4.f18977s
            int r3 = com.fyber.inneractive.sdk.player.f.a(r3)
            boolean r0 = com.fyber.inneractive.sdk.player.f.a(r0, r3, r4)
            if (r0 == 0) goto L74
            int r0 = r5.f17212f
            if (r0 > 0) goto L4c
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f17210d
            r0.g(r2)
            r5.h()
            goto L74
        L4c:
            com.fyber.inneractive.sdk.player.f r0 = r5.f17207a
            if (r0 == 0) goto L64
            com.fyber.inneractive.sdk.player.controller.q r0 = r0.f18912a
            if (r0 == 0) goto L64
            int r0 = r0.c()
            int r0 = r0 / 1000
            int r3 = r5.f17212f
            if (r3 < r0) goto L64
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f17210d
            r0.g(r1)
            goto L74
        L64:
            boolean r0 = r5.f17222p
            if (r0 != 0) goto L74
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f17210d
            r0.g(r2)
            int r0 = r5.f17212f
            r5.b(r0)
            r5.f17222p = r2
        L74:
            com.fyber.inneractive.sdk.player.controller.g0 r0 = r5.f17213g
            if (r0 == 0) goto L81
            boolean r3 = r5.f17217k
            if (r3 != 0) goto L81
            r5.f17217k = r2
            r0.k()
        L81:
            r5.f17223q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.z.x():void");
    }

    public final void y() {
        com.fyber.inneractive.sdk.player.ui.g gVar;
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f17210d;
        if (sVar != null) {
            sVar.o();
        }
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar != null && fVar.f18912a != null && (gVar = this.f17227u) != null) {
            gVar.invalidate();
            this.f17227u.requestLayout();
        }
        com.fyber.inneractive.sdk.player.ui.s sVar2 = this.f17210d;
        if (sVar2 != null) {
            sVar2.invalidate();
            this.f17210d.requestLayout();
        }
    }

    public void z() {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f17207a;
        if (fVar == null || (qVar = fVar.f18912a) == null) {
            return;
        }
        if (qVar.f17186e == com.fyber.inneractive.sdk.player.enums.b.Paused) {
            IAlog.a("%spauseVideo called in bad state! %s", IAlog.a(this), qVar.f17186e);
            return;
        }
        IAlog.a("%spauseVideo %s", IAlog.a(this), this.f17210d);
        TextureView textureView = qVar.f17191j;
        if (textureView == null || textureView.getParent() == null || textureView.getParent() != this.f17210d.getTextureHost()) {
            return;
        }
        qVar.i();
    }
}
