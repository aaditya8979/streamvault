package com.mbridge.msdk.advanced.middle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.advanced.view.MBOutNativeAdvancedViewGroup;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import org.json.JSONObject;

/* JADX INFO: compiled from: NativeAdvancedProvider.java */
/* JADX INFO: loaded from: classes8.dex */
public class c {
    private static String G = "NativeAdvancedProvider";
    private boolean A;
    private boolean B;
    private boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f35472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.b f35473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.c f35474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f35475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private NativeAdvancedAdListener f35476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f35477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBNativeAdvancedView f35478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBNativeAdvancedWebview f35479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.advanced.view.a f35480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private l f35481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j f35483n;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private JSONObject f35493x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private MBOutNativeAdvancedViewGroup f35495z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35484o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f35485p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f35486q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f35487r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f35488s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f35489t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f35490u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f35491v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f35492w = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f35494y = false;
    private boolean D = true;
    public boolean E = false;
    private ViewTreeObserver.OnScrollChangedListener F = new a();

    /* JADX INFO: compiled from: NativeAdvancedProvider.java */
    public class a implements ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.middle.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativeAdvancedProvider.java */
        public class RunnableC0419a implements Runnable {
            public RunnableC0419a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.D = true;
            }
        }

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (c.this.D) {
                c.this.D = false;
                if (c.this.f35495z != null) {
                    c.this.f35495z.postDelayed(new RunnableC0419a(), 1000L);
                }
                try {
                    c.this.i();
                } catch (Exception e10) {
                    q0.b(c.G, e10.getMessage());
                }
            }
        }
    }

    public c(String str, String str2, Activity activity) {
        this.f35471b = TextUtils.isEmpty(str) ? "" : str;
        this.f35470a = str2;
        this.f35472c = new MBridgeIds(str, str2);
        a(activity);
    }

    private void a(int i10) {
        if (this.f35485p) {
            this.f35484o = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f35479j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            int i11 = this.f35484o;
            if (i11 == 1) {
                this.f35474e.a(true);
                com.mbridge.msdk.advanced.signal.a.a(this.f35479j, "showCloseButton", "", null);
            } else if (i11 == 0) {
                this.f35474e.a(false);
                com.mbridge.msdk.advanced.signal.a.a(this.f35479j, "hideCloseButton", "", null);
            }
        }
    }

    private void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f35491v = i10;
        this.f35490u = i11;
        this.f35495z.setLayoutParams(new ViewGroup.LayoutParams(i11, i10));
    }

    private void a(Activity activity) {
        com.mbridge.msdk.advanced.view.a aVar;
        if (this.f35474e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35471b, this.f35470a);
            this.f35474e = cVar;
            cVar.a(this);
        }
        if (this.f35479j == null) {
            try {
                this.f35479j = new MBNativeAdvancedWebview(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception e10) {
                q0.b(G, e10.getMessage());
            }
            if (this.f35480k == null) {
                try {
                    this.f35480k = new com.mbridge.msdk.advanced.view.a(this.f35470a, this.f35474e.b(), this);
                } catch (Exception e11) {
                    q0.b(G, e11.getMessage());
                }
            }
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f35479j;
            if (mBNativeAdvancedWebview != null && (aVar = this.f35480k) != null) {
                mBNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.f35478i == null) {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            Context context = activity;
            if (activity == null) {
                context = contextD;
            }
            MBNativeAdvancedView mBNativeAdvancedView = new MBNativeAdvancedView(context);
            this.f35478i = mBNativeAdvancedView;
            mBNativeAdvancedView.setAdvancedNativeWebview(this.f35479j);
            MBNativeAdvancedWebview mBNativeAdvancedWebview2 = this.f35479j;
            if (mBNativeAdvancedWebview2 != null && mBNativeAdvancedWebview2.getParent() == null) {
                this.f35478i.addView(this.f35479j, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f35495z == null) {
            this.f35495z = new MBOutNativeAdvancedViewGroup(com.mbridge.msdk.foundation.controller.c.n().d());
            this.f35495z.setLayoutParams((this.f35490u == 0 || this.f35491v == 0) ? new ViewGroup.LayoutParams(-1, -1) : new ViewGroup.LayoutParams(this.f35490u, this.f35491v));
            this.f35495z.setProvider(this);
            this.f35495z.addView(this.f35478i);
            this.f35495z.getViewTreeObserver().addOnScrollChangedListener(this.F);
        }
        if (this.f35483n == null) {
            this.f35483n = new j();
        }
        this.f35483n.a(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c(), this.f35470a);
    }

    private void a(CampaignEx campaignEx) {
        if (com.mbridge.msdk.advanced.manager.d.a(this.f35478i, campaignEx, this.f35471b, this.f35470a)) {
            this.f35474e.a(this.f35477h);
            q0.b(G, "start show process");
            this.f35474e.a(campaignEx, this.f35478i, true);
        }
    }

    private void a(String str, int i10) {
        this.D = true;
        synchronized (this.f35492w) {
            if (this.f35482m) {
                if (this.f35475f != null) {
                    this.f35475f.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i10);
                    this.f35482m = true;
                }
                return;
            }
            this.f35482m = true;
            if (this.f35490u == 0 || this.f35491v == 0) {
                if (this.f35475f != null) {
                    this.f35475f.a(new com.mbridge.msdk.foundation.error.b(880028), i10);
                    return;
                }
                return;
            }
            if (this.f35478i == null) {
                if (this.f35475f != null) {
                    this.f35475f.a(new com.mbridge.msdk.foundation.error.b(880030), i10);
                    return;
                }
                return;
            }
            boolean zB = false;
            try {
                zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception e10) {
                q0.b(G, e10.getMessage());
            }
            if (!zB) {
                if (this.f35475f != null) {
                    this.f35475f.a(new com.mbridge.msdk.foundation.error.b(880029), i10);
                    return;
                }
                return;
            }
            this.f35478i.clearResStateAndRemoveClose();
            l lVarA = h.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35470a);
            this.f35481l = lVarA;
            if (lVarA == null) {
                this.f35481l = l.k(this.f35470a);
            }
            if (this.f35473d == null) {
                this.f35473d = new com.mbridge.msdk.advanced.manager.b(this.f35471b, this.f35470a, 0L);
            }
            b bVar = this.f35475f;
            if (bVar != null) {
                bVar.a(str);
                this.f35473d.a(this.f35475f);
            }
            this.f35478i.resetLoadState();
            this.f35473d.a(this.f35478i);
            this.f35473d.a(this.f35481l);
            this.f35473d.a(this.f35490u, this.f35491v);
            this.f35473d.a(this.f35484o);
            this.f35473d.b(str, i10);
        }
    }

    private void a(JSONObject jSONObject) {
        if (this.f35494y) {
            this.f35493x = jSONObject;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f35479j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f35479j, "setStyleList", "", jSONObject);
        }
    }

    private void c(int i10) {
        if (this.f35487r) {
            this.f35486q = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f35479j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f35479j, "setVolume", CampaignEx.JSON_NATIVE_VIDEO_MUTE, Integer.valueOf(i10));
        }
    }

    private void e(int i10) {
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f35479j;
        if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
            return;
        }
        try {
            if (this.f35479j != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", i10);
                f.a().a((WebView) this.f35479j, "onNetstatChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th2) {
            q0.a(G, th2.getMessage());
        }
    }

    private void g(int i10) {
        if (this.f35489t) {
            this.f35488s = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f35479j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f35479j, "setVideoPlayMode", "autoPlay", Integer.valueOf(i10));
        }
    }

    private void h() {
        com.mbridge.msdk.advanced.manager.c cVar = this.f35474e;
        if (cVar != null) {
            cVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.A && this.B && this.C) {
            CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f35478i, this.f35471b, this.f35470a, "", this.f35484o, true, true);
            com.mbridge.msdk.advanced.manager.c cVar = this.f35474e;
            if (cVar != null) {
                cVar.f();
            }
            b(campaignExA);
        }
    }

    private void j() {
        a(this.f35484o);
        c(this.f35486q);
        g(this.f35488s);
        a(this.f35493x);
        e(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
    }

    public String a(String str) {
        com.mbridge.msdk.advanced.manager.b bVar = this.f35473d;
        return bVar != null ? bVar.a(str) : "";
    }

    public void a(CampaignEx campaignEx, boolean z10) {
        j();
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f35495z;
        if (mBOutNativeAdvancedViewGroup == null || mBOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (campaignEx != null && z10) {
            if (this.f35481l == null) {
                this.f35481l = h.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35470a);
            }
            this.f35477h = new d(this, this.f35476g, campaignEx);
        }
        if (this.f35474e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35471b, this.f35470a);
            this.f35474e = cVar;
            cVar.a(this);
        }
        a(campaignEx);
    }

    public void a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f35476g = nativeAdvancedAdListener;
    }

    public void a(boolean z10) {
        this.f35482m = z10;
    }

    public void b() {
        if (this.f35476g != null) {
            this.f35476g = null;
        }
        if (this.f35475f != null) {
            this.f35475f = null;
        }
        if (this.f35477h != null) {
            this.f35477h = null;
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f35473d;
        if (bVar != null) {
            bVar.a((MBNativeAdvancedView) null);
            this.f35473d.e();
        }
        com.mbridge.msdk.advanced.manager.c cVar = this.f35474e;
        if (cVar != null) {
            cVar.g();
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f35478i;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.destroy();
        }
        com.mbridge.msdk.advanced.common.c.b(this.f35471b + this.f35470a + e());
        com.mbridge.msdk.advanced.view.a aVar = this.f35480k;
        if (aVar != null) {
            aVar.b();
        }
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f35495z;
        if (mBOutNativeAdvancedViewGroup != null) {
            mBOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.F);
            this.f35495z.removeAllViews();
            this.f35495z = null;
        }
    }

    public void b(int i10) {
        this.f35485p = true;
        a(i10);
    }

    public void b(int i10, int i11) {
        a(i10, i11);
    }

    public void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (this.f35481l == null) {
                this.f35481l = h.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35470a);
            }
            this.f35477h = new d(this, this.f35476g, campaignEx);
            q0.a(G, "show start");
            if (this.f35490u != 0 && this.f35491v != 0) {
                a(campaignEx, false);
                return;
            }
            d dVar = this.f35477h;
            if (dVar != null) {
                dVar.a(this.f35472c, "width or height is 0  or width or height is too small");
            }
        }
    }

    public void b(JSONObject jSONObject) {
        this.f35494y = true;
        a(jSONObject);
    }

    public boolean b(String str) {
        return (this.f35495z == null || com.mbridge.msdk.advanced.manager.d.a(this.f35478i, this.f35471b, this.f35470a, str, this.f35484o, false, true) == null) ? false : true;
    }

    public String c() {
        if (this.E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f35474e;
            return cVar != null ? cVar.a() : "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f35473d;
        return bVar != null ? bVar.c() : "";
    }

    public void c(String str) {
        b bVar = new b(this, this.f35472c);
        this.f35475f = bVar;
        bVar.a(this.f35476g);
        this.f35475f.a(str);
        a(str, 2);
    }

    public MBOutNativeAdvancedViewGroup d() {
        return this.f35495z;
    }

    public void d(int i10) {
        this.f35487r = true;
        c(i10);
    }

    public void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            c(str);
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f35476g;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f35472c, "bid  token is null or empty");
        }
    }

    public String e() {
        if (this.E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f35474e;
            return cVar != null ? cVar.c() : "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f35473d;
        return bVar != null ? bVar.d() : "";
    }

    public int f() {
        return this.f35484o;
    }

    public void f(int i10) {
        if (i10 == 1) {
            this.A = false;
        } else if (i10 == 2) {
            this.B = false;
        } else if (i10 == 3) {
            this.C = false;
        }
        h();
    }

    public boolean g() {
        return this.f35482m;
    }

    public void h(int i10) {
        this.f35489t = true;
        g(i10);
    }

    public void i(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    if (this.C) {
                        return;
                    } else {
                        this.C = true;
                    }
                }
            } else if (this.B) {
                return;
            } else {
                this.B = true;
            }
        } else if (this.A) {
            return;
        } else {
            this.A = true;
        }
        try {
            i();
        } catch (Exception e10) {
            q0.b(G, e10.getMessage());
        }
    }
}
