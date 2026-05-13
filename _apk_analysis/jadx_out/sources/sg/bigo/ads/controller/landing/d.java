package sg.bigo.ads.controller.landing;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.api.b.h;
import sg.bigo.ads.common.u.g;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.landing.WebViewActivityImpl;

/* JADX INFO: loaded from: classes12.dex */
public class d extends WebViewActivityImpl implements h {
    private final ValueCallback<Boolean> F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f83468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f83469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f83470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f83471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f83472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f83473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f83474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f83475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private sg.bigo.ads.controller.landing.a f83476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f83477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f83478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<h.a> f83479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f83480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @IntRange(from = 0, to = 100)
    private int f83481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f83482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f83483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private WebHistoryItem f83484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f83485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.ad.c<?, ?> f83486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.api.core.b f83487t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f83488u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f83489v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f83490w;

    public static class a implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f83493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f83494b;

        private a(int i10, long j10) {
            this.f83493a = i10;
            this.f83494b = System.currentTimeMillis() - j10;
        }

        public /* synthetic */ a(int i10, long j10, byte b10) {
            this(i10, j10);
        }

        @Override // sg.bigo.ads.api.b.h.a
        public final int a() {
            return this.f83493a;
        }

        @Override // sg.bigo.ads.api.b.h.a
        public final long b() {
            return this.f83494b;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x008f. Please report as an issue. */
    public d(@NonNull Activity activity) {
        int intExtra;
        int i10;
        super(activity);
        this.f83468a = 300;
        this.f83470c = -1L;
        this.f83471d = 0;
        this.f83473f = false;
        this.f83479l = new ArrayList();
        this.f83480m = 0;
        this.f83481n = 0;
        this.f83482o = 0;
        this.f83490w = false;
        this.F = new ValueCallback<Boolean>() { // from class: sg.bigo.ads.controller.landing.d.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Boolean bool) {
                Boolean bool2 = bool;
                if (d.this.f84053z != null) {
                    if (bool2 == null || !bool2.booleanValue()) {
                        ViewParent parent = d.this.f84053z.getParent();
                        if (parent instanceof ViewGroup) {
                            TransitionSet transitionSet = new TransitionSet();
                            transitionSet.addTransition(new Fade(1));
                            transitionSet.setDuration(300L);
                            TransitionManager.beginDelayedTransition((ViewGroup) parent, transitionSet);
                        }
                    }
                    d.this.f84053z.setEnabled(true);
                    d.this.f84053z.setVisibility(0);
                }
            }
        };
        Intent intent = this.L.getIntent();
        int i11 = -1;
        if (intent != null) {
            int intExtra2 = intent.getIntExtra("ad_identifier", -1);
            this.f83478k = intent.getIntExtra("land_way", -1);
            intExtra = intent.getIntExtra("webview_force_time", -1);
            i11 = intExtra2;
        } else {
            this.f83478k = -1;
            intExtra = -1;
        }
        sg.bigo.ads.ad.c<?, ?> cVarB = e.b(i11);
        this.f83486s = cVarB;
        if (cVarB != null) {
            this.f83487t = cVarB.f();
            this.f83474g = this.f83486s.s();
            this.f83475h = this.f83486s.t();
            this.f83476i = this.f83486s.f80032m;
            this.f83469b = this.f83487t.N().e();
            this.f83472e = this.f83487t.d().f();
        } else {
            this.f83474g = 0;
            this.f83475h = System.currentTimeMillis();
        }
        switch (intExtra) {
            case -1:
                this.f83485r = false;
                this.f83488u = false;
                this.f83489v = 0;
                break;
            case 0:
            default:
                this.f83485r = true;
                this.f83488u = false;
                this.f83489v = 0;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                this.f83485r = false;
                this.f83488u = true;
                i10 = intExtra + 1;
                this.f83489v = i10;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                this.f83485r = true;
                this.f83488u = false;
                i10 = intExtra - 3;
                this.f83489v = i10;
                break;
        }
        this.f83483p = a(activity);
    }

    private static String a(Activity activity) {
        String packageName;
        String str;
        try {
            packageName = activity.getPackageName();
            str = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).taskAffinity;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        if (TextUtils.equals(packageName, str)) {
            return null;
        }
        return str;
    }

    private void c(int i10) {
        a aVar = new a(i10, this.f83475h, (byte) 0);
        this.f83479l.add(0, aVar);
        sg.bigo.ads.api.core.b bVar = this.f83487t;
        if (bVar != null) {
            sg.bigo.ads.core.d.b.a(this, aVar, bVar, this.f83486s, this.f83483p);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void F() {
        super.F();
        sg.bigo.ads.controller.landing.a aVar = this.f83476i;
        if (aVar != null) {
            aVar.f83427d = false;
            this.f83476i = null;
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void T() {
        this.f83470c = SystemClock.elapsedRealtime();
        c(1);
        super.T();
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(int i10) {
        super.a(i10);
        this.f83481n = Math.max(this.f83481n, i10);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(int i10, String str, String str2) {
        super.a(i10, str, str2);
        if (this.f83473f) {
            return;
        }
        c(6);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str) {
        super.a(str);
        if (!this.f83473f) {
            this.f83481n = 100;
            c(5);
            if (this.f83488u) {
                w();
            }
        }
        this.f83473f = true;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str, boolean z10) {
        super.a(str, z10);
        if (z10) {
            c(4);
        }
        int i10 = this.f83471d;
        if (i10 == 0) {
            this.C = str;
        }
        this.f83471d = i10 + 1;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(@NonNull sg.bigo.ads.api.core.d dVar) {
        sg.bigo.ads.ad.c<?, ?> cVar;
        int i10;
        sg.bigo.ads.api.core.b bVar = this.f83487t;
        if (bVar != null) {
            sg.bigo.ads.core.d.b.a(bVar, 2, dVar, this.f83486s);
            sg.bigo.ads.api.core.d dVar2 = this.E;
            if (dVar2 == null || (cVar = this.f83486s) == null || (i10 = dVar2.f81846d) < 0) {
                return;
            }
            if (!dVar2.f81848f && i10 == 1) {
                dVar2.f81846d = 4;
                cVar.a(new c(4, dVar2.f81847e));
            }
            if (!(i10 == 1 || i10 == 4) || this.E.f81848f) {
                if (i10 == 1) {
                    this.E.f81846d = 4;
                }
                sg.bigo.ads.api.core.b bVarF = this.f83486s.f();
                sg.bigo.ads.api.core.d dVar3 = this.E;
                sg.bigo.ads.core.d.b.b(bVarF, dVar3.f81846d, 2, dVar3.f81847e);
            }
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    @CallSuper
    public void ah() {
        super.ah();
        if (this.f83486s != null) {
            e.a();
            this.f83486s = null;
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void b() {
        super.b();
        if (this.f83485r || this.f83488u) {
            q();
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void c(String str) {
        super.c(str);
        this.f83482o++;
        this.f83480m = !URLUtil.isNetworkUrl(str) ? 1 : 0;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final String d(String str) {
        sg.bigo.ads.api.core.b bVar = this.f83487t;
        return bVar != null ? sg.bigo.ads.core.landing.a.a(bVar.N().h(), this.f83487t.N().i(), str) : super.d(str);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void d() {
        super.d();
        if (this.f83485r) {
            w();
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void d(int i10) {
        if (u()) {
            return;
        }
        super.d(i10);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void e(int i10) {
        super.e(i10);
        String str = this.f83469b;
        if (!TextUtils.isEmpty(str)) {
            sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(sg.bigo.ads.common.y.a.a(), new sg.bigo.ads.common.u.b.d(str), this.L);
            aVar.f82435l = sg.bigo.ads.common.u.a.e.a();
            g.a(aVar, null);
        }
        if (this.f83487t != null) {
            sg.bigo.ads.core.d.b.a(this, this.f83479l.isEmpty() ? null : this.f83479l.get(0), System.currentTimeMillis() - this.f83475h, this.f83471d, this.f83487t, this.f83486s, this.f83483p);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void g(boolean z10) {
        if (z10) {
            aF();
        }
    }

    public int h() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.h
    public final String i() {
        return this.C;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int j() {
        return this.f83480m;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int k() {
        return this.f83482o;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int l() {
        return this.f83481n;
    }

    @Override // sg.bigo.ads.api.b.h
    public final boolean m() {
        sg.bigo.ads.controller.landing.a aVar = this.f83476i;
        return aVar != null && aVar.f83427d;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int n() {
        return this.f83474g;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int o() {
        return this.f83478k;
    }

    @Override // sg.bigo.ads.api.b.h
    @Nullable
    public final Map<String, String> p() {
        return null;
    }

    public final void q() {
        ImageView imageView = this.f84053z;
        if (imageView != null) {
            imageView.setVisibility(4);
            this.f84053z.setEnabled(false);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    @Nullable
    public final WebView r() {
        sg.bigo.ads.core.h.e eVar;
        sg.bigo.ads.controller.landing.a aVar = this.f83476i;
        sg.bigo.ads.core.h.e eVar2 = null;
        if (aVar != null && aVar.b() && (eVar = aVar.f83429f) != null) {
            u.b(eVar);
            sg.bigo.ads.core.h.e eVar3 = aVar.f83429f;
            aVar.f83429f = null;
            eVar2 = eVar3;
        }
        if (eVar2 == null) {
            return super.r();
        }
        this.f83477j = true;
        return eVar2;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void s() {
        c(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            r8 = this;
            android.webkit.WebView r0 = r8.B
            if (r0 != 0) goto L5
            return
        L5:
            sg.bigo.ads.controller.landing.a r0 = r8.f83476i
            r1 = 3
            if (r0 == 0) goto L6b
            int r2 = r0.f83426c
            r3 = 2
            if (r2 != r3) goto L2b
            java.lang.String r0 = r0.f83428e
            boolean r0 = sg.bigo.ads.common.utils.q.a(r0)
            if (r0 != 0) goto L2b
            android.webkit.WebView r2 = r8.B
            java.lang.String r3 = r8.C
            sg.bigo.ads.controller.landing.a r0 = r8.f83476i
            java.lang.String r4 = r0.f83428e
            r7 = 0
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "UTF-8"
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)
        L27:
            r8.c(r1)
            return
        L2b:
            sg.bigo.ads.controller.landing.a r0 = r8.f83476i
            int r0 = r0.f83426c
            if (r0 != r1) goto L58
            boolean r2 = r8.f83477j
            if (r2 == 0) goto L58
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.D = r0
            android.webkit.WebView r0 = r8.B
            java.lang.String r0 = r0.getTitle()
            r8.b(r0)
            sg.bigo.ads.controller.landing.a r0 = r8.f83476i
            boolean r0 = r0.f83427d
            if (r0 == 0) goto L57
            android.widget.ProgressBar r0 = r8.f84052y
            if (r0 == 0) goto L52
            r1 = 0
            r0.setAlpha(r1)
        L52:
            java.lang.String r0 = r8.C
            r8.a(r0)
        L57:
            return
        L58:
            r2 = 4
            if (r0 != r2) goto L6b
            boolean r0 = r8.f83477j
            if (r0 == 0) goto L6b
            android.webkit.WebView r0 = r8.B
            android.webkit.WebBackForwardList r0 = r0.copyBackForwardList()
            android.webkit.WebHistoryItem r0 = r0.getCurrentItem()
            r8.f83484q = r0
        L6b:
            sg.bigo.ads.api.core.b r0 = r8.f83487t
            if (r0 == 0) goto L89
            sg.bigo.ads.api.core.b$b r0 = r0.N()
            java.lang.String r0 = r0.h()
            sg.bigo.ads.api.core.b r2 = r8.f83487t
            sg.bigo.ads.api.core.b$b r2 = r2.N()
            java.util.Map r2 = r2.i()
            java.lang.String r3 = r8.C
            java.lang.String r0 = sg.bigo.ads.core.landing.a.a(r0, r2, r3)
            r8.C = r0
        L89:
            super.t()
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.landing.d.t():void");
    }

    public final boolean u() {
        int i10;
        if (this.f83485r || this.f83488u) {
            ImageView imageView = this.f84053z;
            return (imageView == null || imageView.isEnabled()) ? false : true;
        }
        if (!this.f83473f && (i10 = this.f83472e) > 0 && i10 <= 10000) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f83470c;
            if (jElapsedRealtime > 0 && jElapsedRealtime < i10) {
                return true;
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final boolean v() {
        WebView webView = this.B;
        if (webView == null) {
            return false;
        }
        if (this.f83484q != null) {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            if (currentIndex <= 0) {
                return super.v();
            }
            WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex - 1);
            if (itemAtIndex != null) {
                return (TextUtils.equals(this.f83484q.getOriginalUrl(), itemAtIndex.getOriginalUrl()) || TextUtils.equals(this.f83484q.getUrl(), itemAtIndex.getUrl())) ? false : true;
            }
        }
        return super.v();
    }

    public final void w() {
        if (this.f83489v <= 0) {
            this.F.onReceiveValue(Boolean.TRUE);
            return;
        }
        WebView webView = this.B;
        if (webView != null) {
            webView.postDelayed(new Runnable() { // from class: sg.bigo.ads.controller.landing.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (d.this.F != null) {
                        d.this.F.onReceiveValue(Boolean.FALSE);
                    }
                }
            }, r.f82514a.a(this.f83489v));
        }
    }
}
