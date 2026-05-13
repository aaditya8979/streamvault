package com.mbridge.msdk.mbbanner.controll;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbanner.common.manager.c;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;

/* JADX INFO: compiled from: BannerController.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static String f38538x = "BannerController";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MBridgeIds f38542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f38543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MBBannerView f38545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f38547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f38548j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private BannerAdListener f38550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CampaignUnit f38551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f38552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l f38553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private j f38554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f38555q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f38556r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f38557s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f38558t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f38559u;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f38549k = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.c f38560v = new C0462a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.b f38561w = new b();

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.controll.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerController.java */
    public class C0462a implements com.mbridge.msdk.mbbanner.common.listener.c {
        public C0462a() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a() {
            if (a.this.f38550l != null) {
                a.this.f38550l.showFullScreen(a.this.f38542d);
                a.this.f38559u = true;
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(2, a.this.f38540b, a.this.f38539a, null, null);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(CampaignEx campaignEx) {
            a.this.c();
            if (a.this.f38550l != null) {
                a.this.f38550l.onLogImpression(a.this.f38542d);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(a.this.f38539a, campaignEx.getLocalRequestId());
                cVarA.a(campaignEx);
                cVarA.h(campaignEx.isBidCampaign() ? "1" : "0");
                int i10 = 1;
                cVarA.g(a.this.f38552n != null ? a.this.f38552n.c() : 1);
                if (a.this.f38548j != 0) {
                    i10 = 2;
                }
                cVarA.b(i10);
                cVarA.c(a.this.f38548j);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000128", cVarA, (e) null);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000130", cVarA, (e) null);
            } catch (Exception e10) {
                q0.b(a.f38538x, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(bVar);
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(List<CampaignEx> list) {
            q0.b(a.f38538x, "onShowSuccessed:");
            if (a.this.f38550l != null) {
                a.this.f38550l.onLoadSuccessed(a.this.f38542d);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(a.this.f38539a, list.get(0).getLocalRequestId());
                cVarA.b(list);
                cVarA.g(1);
                cVarA.d(TextUtils.isEmpty(list.get(0).getBannerUrl()) ? 2 : 1);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000048", cVarA, (e) null);
            } catch (Exception e10) {
                q0.b(a.f38538x, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void b() {
            if (a.this.f38550l != null) {
                a.this.f38550l.onCloseBanner(a.this.f38542d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void c() {
            if (a.this.f38550l != null) {
                a.this.f38550l.onClick(a.this.f38542d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void d() {
            if (a.this.f38550l != null) {
                a.this.f38550l.closeFullScreen(a.this.f38542d);
                a.this.f38559u = false;
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, a.this.f38540b, a.this.f38539a, new com.mbridge.msdk.mbbanner.common.data.a(a.this.f38547i + VastAttributes.HORIZONTAL_POSITION + a.this.f38546h, a.this.f38548j * 1000), a.this.f38561w);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void onLeaveApp() {
            if (a.this.f38550l != null) {
                a.this.f38550l.onLeaveApp(a.this.f38542d);
            }
        }
    }

    /* JADX INFO: compiled from: BannerController.java */
    public class b implements com.mbridge.msdk.mbbanner.common.listener.b {
        public b() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(2, bVar);
            a.this.a(bVar.k(), bVar);
            a.this.c();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(String str, int i10, boolean z10) {
            if (a.this.f38545g != null) {
                a.this.f38558t = true;
                a.this.j();
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(String str, CampaignUnit campaignUnit, boolean z10) {
            a.this.f38551m = campaignUnit;
            a.this.a(1, (com.mbridge.msdk.foundation.error.b) null);
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void b(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(bVar.k(), bVar);
            a.this.c();
        }
    }

    public a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f38545g = mBBannerView;
        if (bannerSize != null) {
            this.f38546h = bannerSize.getHeight();
            this.f38547i = bannerSize.getWidth();
        }
        this.f38539a = str2;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f38540b = str;
        this.f38542d = new MBridgeIds(str, this.f38539a);
        f();
    }

    private int a(int i10) {
        if (i10 <= 0) {
            return i10;
        }
        if (i10 < 10) {
            return 10;
        }
        return i10 > 180 ? BaseTransientBottomBar.ANIMATION_FADE_DURATION : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, com.mbridge.msdk.foundation.error.b bVar) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f38539a, bVar == null ? this.f38551m.getLocalRequestId() : bVar.k());
            e eVar = new e();
            eVar.a("result", Integer.valueOf(i10));
            CampaignUnit campaignUnit = this.f38551m;
            if (campaignUnit != null && !campaignUnit.getAds().isEmpty()) {
                CampaignEx campaignEx = this.f38551m.getAds().get(0);
                if (campaignEx != null) {
                    cVarA.d(TextUtils.isEmpty(campaignEx.getBannerUrl()) ? 2 : 1);
                }
                cVarA.b(this.f38551m.getAds());
            }
            if (bVar != null) {
                cVarA.a(bVar);
            }
            com.mbridge.msdk.mbbanner.common.report.a.a("2000126", cVarA, eVar);
        } catch (Exception e10) {
            q0.b(f38538x, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        a(this.f38541c, bVar);
        if (bVar.g() != 880044) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.error.b bVar) {
        CampaignUnit campaignUnit;
        String strL = "";
        if (bVar != null) {
            try {
                strL = bVar.l();
                if (TextUtils.isEmpty(str)) {
                    str = bVar.k();
                }
            } catch (Throwable th2) {
                q0.b(f38538x, th2.getMessage());
            }
        }
        if (TextUtils.isEmpty(str) && (campaignUnit = this.f38551m) != null) {
            str = campaignUnit.getLocalRequestId();
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f38539a, str);
        CampaignUnit campaignUnit2 = this.f38551m;
        cVarA.b(campaignUnit2 != null ? campaignUnit2.getAds() : null);
        cVarA.a(bVar);
        CampaignUnit campaignUnit3 = this.f38551m;
        if (campaignUnit3 != null && !campaignUnit3.getAds().isEmpty()) {
            cVarA.d(TextUtils.isEmpty(this.f38551m.getAds().get(0).getBannerUrl()) ? 1 : 2);
        }
        cVarA.b(true);
        com.mbridge.msdk.mbbanner.common.report.a.a("2000047", cVarA, (e) null);
        BannerAdListener bannerAdListener = this.f38550l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f38542d, strL);
        }
    }

    private boolean a(View view) {
        return true;
    }

    private void b(String str, String str2) {
        if (this.f38554p == null) {
            this.f38554p = new j();
        }
        this.f38554p.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, this.f38539a);
    }

    private void f() {
        b(com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f38557s || !this.f38558t) {
            return;
        }
        if (!a(this.f38545g)) {
            a(new com.mbridge.msdk.foundation.error.b(880044));
        } else if (this.f38551m != null) {
            if (this.f38552n == null) {
                this.f38552n = new c(this.f38545g, this.f38560v, this.f38540b, this.f38539a, this.f38543e, this.f38553o);
            }
            this.f38552n.a(this.f38541c);
            this.f38552n.b(this.f38555q);
            this.f38552n.d(this.f38556r);
            this.f38552n.a(this.f38543e, this.f38544f);
            this.f38552n.b(this.f38551m);
        } else {
            a(new com.mbridge.msdk.foundation.error.b(880043));
        }
        this.f38558t = false;
    }

    private void k() {
        MBBannerView mBBannerView = this.f38545g;
        if (mBBannerView != null) {
            if (!this.f38555q || !this.f38556r || this.f38559u || e1.a(mBBannerView, 1)) {
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(2, this.f38540b, this.f38539a, null, null);
            } else {
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, this.f38540b, this.f38539a, new com.mbridge.msdk.mbbanner.common.data.a(this.f38547i + VastAttributes.HORIZONTAL_POSITION + this.f38546h, this.f38548j * 1000), this.f38561w);
            }
            if (this.f38555q) {
                return;
            }
            com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f38540b, this.f38539a, null, null);
            com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f38539a);
        }
    }

    private void l() {
        l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38539a);
        this.f38553o = lVarE;
        if (lVarE == null) {
            this.f38553o = l.i(this.f38539a);
        }
        if (this.f38549k == -1) {
            this.f38548j = a(this.f38553o.D());
        }
        if (this.f38544f == 0) {
            boolean z10 = this.f38553o.g() == 1;
            this.f38543e = z10;
            c cVar = this.f38552n;
            if (cVar != null) {
                cVar.c(z10);
            }
        }
    }

    public void a(int i10, int i11, int i12, int i13) {
        c cVar = this.f38552n;
        if (cVar != null) {
            cVar.a(i10, i11, i12, i13);
        }
    }

    public void a(BannerAdListener bannerAdListener) {
        this.f38550l = bannerAdListener;
    }

    public void a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f38546h = bannerSize.getHeight();
            this.f38547i = bannerSize.getWidth();
        }
    }

    public void a(String str, String str2) {
        if (this.f38546h < 1 || this.f38547i < 1) {
            a(str2, new com.mbridge.msdk.foundation.error.b(880037));
            return;
        }
        boolean zB = false;
        try {
            zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
        } catch (Exception e10) {
            q0.b(f38538x, e10.getMessage());
        }
        if (!zB) {
            a(str2, new com.mbridge.msdk.foundation.error.b(880029));
            return;
        }
        this.f38541c = str2;
        com.mbridge.msdk.mbbanner.common.data.a aVar = new com.mbridge.msdk.mbbanner.common.data.a(this.f38547i + VastAttributes.HORIZONTAL_POSITION + this.f38546h, this.f38548j * 1000);
        aVar.a(str);
        aVar.c(this.f38540b);
        aVar.b(str2);
        com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f38540b, this.f38539a, aVar, this.f38561w);
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(1, this.f38540b, this.f38539a, aVar, this.f38561w);
    }

    public void a(boolean z10) {
        this.f38543e = z10;
        this.f38544f = z10 ? 1 : 2;
    }

    public void b() {
        k();
        c cVar = this.f38552n;
        if (cVar != null) {
            cVar.b(this.f38555q);
            this.f38552n.d(this.f38556r);
        }
    }

    public void b(int i10) {
        int iA = a(i10);
        this.f38549k = iA;
        this.f38548j = iA;
    }

    public void b(boolean z10) {
        this.f38555q = z10;
        b();
        j();
    }

    public void c() {
        if (this.f38557s) {
            return;
        }
        k();
        l();
        com.mbridge.msdk.mbbanner.common.data.a aVar = new com.mbridge.msdk.mbbanner.common.data.a(this.f38547i + VastAttributes.HORIZONTAL_POSITION + this.f38546h, this.f38548j * 1000);
        aVar.c(this.f38540b);
        aVar.a(true);
        aVar.b(com.mbridge.msdk.mbbanner.common.report.a.b(""));
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(this.f38540b, this.f38539a, aVar, this.f38561w);
    }

    public void c(boolean z10) {
        this.f38556r = z10;
        b();
    }

    public String d() {
        CampaignUnit campaignUnit = this.f38551m;
        return campaignUnit != null ? com.mbridge.msdk.foundation.same.c.b(campaignUnit.getAds()) : "";
    }

    public String e() {
        CampaignUnit campaignUnit = this.f38551m;
        return (campaignUnit == null || campaignUnit.getRequestId() == null) ? "" : this.f38551m.getRequestId();
    }

    public void g() {
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f38540b, this.f38539a, new com.mbridge.msdk.mbbanner.common.data.a(this.f38547i + VastAttributes.HORIZONTAL_POSITION + this.f38546h, this.f38548j * 1000), this.f38561w);
    }

    public void h() {
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, this.f38540b, this.f38539a, new com.mbridge.msdk.mbbanner.common.data.a(this.f38547i + VastAttributes.HORIZONTAL_POSITION + this.f38546h, this.f38548j * 1000), this.f38561w);
    }

    public void i() {
        this.f38557s = true;
        if (this.f38550l != null) {
            this.f38550l = null;
        }
        if (this.f38561w != null) {
            this.f38561w = null;
        }
        if (this.f38560v != null) {
            this.f38560v = null;
        }
        if (this.f38545g != null) {
            this.f38545g = null;
        }
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f38540b, this.f38539a, null, null);
        com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f38539a);
        com.mbridge.msdk.mbbanner.common.manager.a.b().c();
        c cVar = this.f38552n;
        if (cVar != null) {
            cVar.h();
        }
    }
}
