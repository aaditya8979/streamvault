package com.mbridge.msdk.splash.middle;

import android.R;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.ZoomOutTypeEnum;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.splash.manager.e;
import com.mbridge.msdk.splash.manager.f;
import com.mbridge.msdk.splash.view.BaseSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashView;

/* JADX INFO: compiled from: SplashProvider.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {
    private static String D = "SplashProvider";
    private CampaignEx A;
    private MBSplashPopView B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f39925c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f39927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f39928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f39929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f39930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBSplashShowListener f39931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f39932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MBSplashView f39933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ViewGroup f39934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f39935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f39936n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f39937o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ViewGroup f39938p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private j f39939q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f39940r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Activity f39947y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f39948z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39926d = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f39941s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f39942t = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f39943u = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f39944v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f39945w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f39946x = false;
    private boolean C = false;

    /* JADX INFO: compiled from: SplashProvider.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f39950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f39951c;

        public a(CampaignEx campaignEx, int i10, boolean z10) {
            this.f39949a = campaignEx;
            this.f39950b = i10;
            this.f39951c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.f39949a, this.f39950b - 1, this.f39951c);
        }
    }

    public c(Activity activity, String str, String str2) {
        this.f39924b = TextUtils.isEmpty(str) ? "" : str;
        this.f39923a = str2;
        this.f39925c = new MBridgeIds(str, str2);
        this.f39947y = activity;
        b(activity);
    }

    private ViewGroup a(Activity activity) {
        Throwable th2;
        ViewGroup viewGroup;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (activity == null) {
            q0.d(D, "splash can't show because, activity is null or activity is finishing");
            return null;
        }
        try {
            viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
        } catch (Throwable th3) {
            th2 = th3;
            viewGroup = null;
        }
        try {
            try {
                return (ViewGroup) viewGroup.getChildAt(0);
            } catch (Exception e10) {
                e10.printStackTrace();
                return viewGroup;
            }
        } catch (Throwable th4) {
            th2 = th4;
            th2.printStackTrace();
            return viewGroup;
        }
    }

    private void a(int i10, int i11) {
        int iN = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
        int iM = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
        int i12 = this.f39941s;
        if (i12 == 1) {
            if (iM >= i11 * 4) {
                this.f39943u = iM - i11;
                this.f39942t = iN;
                return;
            } else {
                this.f39943u = 0;
                this.f39942t = 0;
                return;
            }
        }
        if (i12 == 2) {
            if (iN >= i10 * 4) {
                this.f39942t = iN - i10;
                this.f39943u = iM;
            } else {
                this.f39943u = 0;
                this.f39942t = 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, int i10, boolean z10) {
        if (!com.mbridge.msdk.splash.manager.d.a(this.f39933k, campaignEx)) {
            if (i10 > 0) {
                this.f39929g.f39824y.postDelayed(new a(campaignEx, i10, z10), 1L);
                return;
            }
            d dVar = this.f39932j;
            if (dVar != null) {
                dVar.a(this.f39925c, "campaignEx is not ready");
                return;
            }
            return;
        }
        a(true);
        ViewGroup.LayoutParams layoutParams = this.f39934l.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
        this.f39934l.setLayoutParams(layoutParams);
        this.f39934l.removeAllViews();
        this.f39929g.c(this.f39926d);
        this.f39929g.a(this.f39938p);
        this.f39929g.a(this.f39932j);
        q0.b(D, "start show process");
        ViewGroup viewGroup = this.f39934l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            f1.a(this.f39933k);
            this.f39934l.addView(this.f39933k);
        }
        this.f39929g.a(this.f39940r);
        this.f39929g.a(campaignEx, this.f39933k);
    }

    private void a(String str, int i10) {
        synchronized (this.f39944v) {
            if (this.f39937o) {
                if (this.f39930h != null) {
                    this.f39930h.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i10);
                    this.f39937o = true;
                }
                return;
            }
            this.f39937o = true;
            int i11 = this.f39926d;
            if (i11 < 2 || i11 > 10) {
                if (this.f39930h != null) {
                    com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880037);
                    bVar.c("countDownTime must in 2 - 10");
                    this.f39930h.a(bVar, i10);
                    return;
                }
                return;
            }
            if (this.f39942t == 0 || this.f39943u == 0) {
                if (this.f39930h != null) {
                    this.f39930h.a(new com.mbridge.msdk.foundation.error.b(880028), i10);
                    return;
                }
                return;
            }
            boolean zB = false;
            try {
                zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception unused) {
            }
            if (!zB) {
                if (this.f39930h != null) {
                    this.f39930h.a(new com.mbridge.msdk.foundation.error.b(880029), i10);
                    return;
                }
                return;
            }
            this.f39933k.clearResState();
            this.f39936n = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39923a);
            if (this.f39928f == null) {
                this.f39928f = new e(this.f39924b, this.f39923a, this.f39927e * 1000);
            }
            b bVar2 = this.f39930h;
            if (bVar2 != null) {
                bVar2.a(str);
                this.f39928f.a(this.f39930h);
            }
            this.f39933k.resetLoadState();
            this.f39928f.a(this.f39926d);
            this.f39928f.a(this.f39933k);
            this.f39928f.a(this.f39936n);
            this.f39928f.a(this.f39942t, this.f39943u);
            this.f39928f.a(this.f39940r);
            this.f39928f.b(this.f39941s);
            this.f39928f.a(str, i10);
        }
    }

    private void b(Activity activity) {
        if (this.f39929g == null) {
            if (activity != null) {
                this.f39929g = new f(activity, this.f39924b, this.f39923a);
            } else {
                this.f39929g = new f(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39924b, this.f39923a);
            }
        }
        if (this.f39933k == null) {
            if (activity != null) {
                this.f39933k = new MBSplashView(activity);
            } else {
                this.f39933k = new MBSplashView(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        }
        if (this.f39939q == null) {
            this.f39939q = new j();
        }
        this.f39939q.a(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c(), this.f39923a);
    }

    public ViewGroup a(ZoomOutTypeEnum zoomOutTypeEnum) {
        MBSplashPopView mBSplashPopView = new MBSplashPopView(com.mbridge.msdk.foundation.controller.c.n().d(), new BaseSplashPopView.i(this.f39924b, this.f39923a, zoomOutTypeEnum.getIndex(), this.A), this.f39932j);
        this.B = mBSplashPopView;
        return mBSplashPopView;
    }

    public void a() {
        this.A = null;
        if (this.f39931i != null) {
            this.f39931i = null;
        }
        if (this.f39930h != null) {
            this.f39930h = null;
        }
        if (this.f39932j != null) {
            this.f39932j = null;
        }
        e eVar = this.f39928f;
        if (eVar != null) {
            eVar.e();
        }
        f fVar = this.f39929g;
        if (fVar != null) {
            fVar.h();
        }
        if (this.f39947y != null) {
            this.f39947y = null;
        }
    }

    public void a(int i10) {
        this.f39941s = i10;
    }

    public void a(int i10, int i11, int i12, int i13) {
        try {
            MBSplashView mBSplashView = this.f39933k;
            if (mBSplashView != null) {
                mBSplashView.setNotchPadding(i10, i11, i12, i13);
            }
        } catch (Throwable th2) {
            q0.b(D, th2.getMessage());
        }
    }

    public void a(long j10) {
        this.f39927e = j10;
    }

    public void a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f39935m = view;
        if (view != null) {
            a(layoutParams.width, layoutParams.height);
            MBSplashView mBSplashView = this.f39933k;
            if (mBSplashView != null) {
                mBSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    public void a(ViewGroup viewGroup) {
        this.f39938p = viewGroup;
    }

    public void a(MBSplashLoadListener mBSplashLoadListener) {
        if (this.f39930h == null) {
            this.f39930h = new b(this, this.f39925c);
        }
        this.f39930h.a(mBSplashLoadListener);
    }

    public void a(MBSplashShowListener mBSplashShowListener) {
        this.f39931i = mBSplashShowListener;
    }

    public void a(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA != null) {
            a(str, viewGroupA);
        } else if (this.f39930h != null) {
            this.f39930h.a(new com.mbridge.msdk.foundation.error.b(880036), 1);
        }
    }

    public void a(String str, ViewGroup viewGroup) {
        this.f39934l = viewGroup;
        MBSplashView mBSplashView = this.f39933k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        a(str, 2);
    }

    public void a(boolean z10) {
        MBSplashView mBSplashView = this.f39933k;
        if (mBSplashView != null) {
            mBSplashView.setAllowClickSplash(z10);
        }
    }

    public boolean a(String str) {
        return com.mbridge.msdk.splash.manager.d.a(this.f39933k, this.f39924b, this.f39923a, str, this.f39940r, this.f39926d, false, true) != null;
    }

    public String b() {
        if (this.f39946x) {
            f fVar = this.f39929g;
            return fVar != null ? fVar.c() : "";
        }
        e eVar = this.f39928f;
        return eVar != null ? eVar.c() : "";
    }

    public void b(int i10) {
        this.f39926d = i10;
    }

    public void b(int i10, int i11) {
        a(i11, i10);
    }

    public void b(CampaignEx campaignEx, int i10, boolean z10) {
        if (campaignEx != null && z10) {
            if (this.f39936n == null) {
                this.f39936n = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39923a);
            }
            this.f39932j = new d(this, this.f39931i, campaignEx);
        }
        ViewGroup viewGroup = this.f39934l;
        if (viewGroup == null) {
            d dVar = this.f39932j;
            if (dVar != null) {
                dVar.a(this.f39925c, "container is null");
                return;
            }
            return;
        }
        if (this.f39929g == null) {
            this.f39929g = new f(viewGroup.getContext(), this.f39924b, this.f39923a);
        }
        this.A = campaignEx;
        a(campaignEx, i10, z10);
    }

    public void b(String str) {
        a(str, 1);
    }

    public void b(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA != null) {
            b(str, viewGroupA);
        } else if (this.f39930h != null) {
            this.f39930h.a(new com.mbridge.msdk.foundation.error.b(880036), 1);
        }
    }

    public void b(String str, ViewGroup viewGroup) {
        if (!TextUtils.isEmpty(str)) {
            a(str, viewGroup);
        } else if (this.f39930h != null) {
            this.f39930h.a(new com.mbridge.msdk.foundation.error.b(880035), 1);
        }
    }

    public void b(boolean z10) {
        this.f39937o = z10;
    }

    public String c() {
        if (this.f39946x) {
            f fVar = this.f39929g;
            return fVar != null ? fVar.d() : "";
        }
        e eVar = this.f39928f;
        return eVar != null ? eVar.d() : "";
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        } else if (this.f39930h != null) {
            this.f39930h.a(new com.mbridge.msdk.foundation.error.b(880035), 1);
        }
    }

    public void c(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA != null) {
            c(str, viewGroupA);
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f39931i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f39925c, "activity is except,please check it");
        }
    }

    public void c(String str, ViewGroup viewGroup) {
        this.f39934l = viewGroup;
        MBSplashView mBSplashView = this.f39933k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f39933k, this.f39924b, this.f39923a, str, this.f39940r, this.f39926d, true, false);
        if (campaignExA == null) {
            MBSplashShowListener mBSplashShowListener = this.f39931i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f39925c, "campaignEx is vali");
                return;
            }
            return;
        }
        if (this.f39936n == null) {
            this.f39936n = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39923a);
        }
        d dVar = new d(this, this.f39931i, campaignExA);
        this.f39932j = dVar;
        if (this.f39942t == 0 || this.f39943u == 0) {
            dVar.a(this.f39925c, "width or height is 0  or width or height is too small");
            return;
        }
        int i10 = this.f39926d;
        if (i10 >= 2 && i10 <= 10) {
            b(campaignExA, this.f39936n.E(), false);
            return;
        }
        dVar.a(this.f39925c, "countDownTime must in 2 - 10 ,but now is " + this.f39926d);
    }

    public void c(boolean z10) {
        this.f39940r = z10;
    }

    public int d() {
        return this.f39926d;
    }

    public void d(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA != null) {
            d(str, viewGroupA);
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f39931i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f39925c, "activity is except,please check it");
        }
    }

    public void d(String str, ViewGroup viewGroup) {
        if (!TextUtils.isEmpty(str)) {
            c(str, viewGroup);
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f39931i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f39925c, "token is null or empty");
        }
    }

    public void d(boolean z10) {
        this.f39948z = z10;
    }

    public long e() {
        return this.f39927e;
    }

    public boolean f() {
        return this.f39940r;
    }

    public boolean g() {
        return this.f39937o;
    }

    public void h() {
        f fVar = this.f39929g;
        if (fVar != null) {
            fVar.f();
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView == null || !this.C) {
            return;
        }
        mBSplashPopView.pauseCountDown();
    }

    public void i() {
        f fVar = this.f39929g;
        if (fVar != null) {
            fVar.g();
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView == null || !this.C) {
            return;
        }
        mBSplashPopView.reStartCountDown();
    }

    public void j() {
        this.C = true;
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView != null) {
            mBSplashPopView.startCountDown();
        }
    }

    public void k() {
        this.C = false;
        MBSplashShowListener mBSplashShowListener = this.f39931i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayFinish(new MBridgeIds(this.f39924b, this.f39923a));
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView != null) {
            mBSplashPopView.release();
        }
    }
}
