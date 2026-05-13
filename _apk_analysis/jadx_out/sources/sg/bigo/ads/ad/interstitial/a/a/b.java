package sg.bigo.ads.ad.interstitial.a.a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import sg.bigo.ads.ad.banner.b;
import sg.bigo.ads.ad.banner.h;
import sg.bigo.ads.ad.interstitial.a.b.b;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.b.f;
import sg.bigo.ads.api.core.d;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.utils.t;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.c.c;
import sg.bigo.ads.core.f.a.a;
import sg.bigo.ads.core.f.a.p;
import sg.bigo.ads.core.mraid.c;
import sg.bigo.ads.core.mraid.e;
import sg.bigo.ads.core.mraid.n;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements b.InterfaceC0966b, sg.bigo.ads.ad.interstitial.a.b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.core.b f80277a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f80281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sg.bigo.ads.core.c.b f80282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f80283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WebView f80284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f80285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f80286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f80287k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final b.a f80290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f80291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f80292p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final a.C1046a f80293q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private final sg.bigo.ads.core.player.c f80294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final p f80295s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    private final Ad f80296t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private e f80297u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f80278b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f80279c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f80280d = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f80288l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0975b f80289m = new C0975b(0);

    public final class a {
        private a() {
        }

        public /* synthetic */ a(b bVar, byte b10) {
            this();
        }

        @JavascriptInterface
        public final void gameEnd(String str) {
            b.a aVar = b.this.f80290n;
            if (aVar != null) {
                aVar.b();
            }
        }

        @JavascriptInterface
        public final void onBGNDomContentLoaded() {
            b bVar = b.this;
            bVar.f80287k = true;
            b.a aVar = bVar.f80290n;
            if (aVar != null) {
                aVar.c(bVar.f80277a, SystemClock.elapsedRealtime() - b.this.f80281e);
            }
        }

        @JavascriptInterface
        public final void onBGNLoaded() {
            b bVar = b.this;
            bVar.f80286j = true;
            b.a aVar = bVar.f80290n;
            if (aVar != null) {
                aVar.b(bVar.f80277a, SystemClock.elapsedRealtime() - b.this.f80281e);
            }
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.a.a.b$b, reason: collision with other inner class name */
    public static final class C0975b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f80302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f80303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<Activity> f80304c;

        private C0975b() {
            this.f80302a = false;
            this.f80303b = -1;
        }

        public /* synthetic */ C0975b(byte b10) {
            this();
        }

        private void b() {
            if (this.f80302a) {
                int i10 = this.f80303b;
                this.f80303b = -1;
                if (i10 == 0 || i10 == 1) {
                    WeakReference<Activity> weakReference = this.f80304c;
                    Activity activity = weakReference == null ? null : weakReference.get();
                    if (activity == null) {
                        return;
                    }
                    activity.setRequestedOrientation(i10);
                }
            }
        }

        public final void a() {
            this.f80302a = true;
            b();
        }

        public final void a(Activity activity, int i10) {
            this.f80303b = i10;
            this.f80304c = new WeakReference<>(activity);
            b();
        }
    }

    public b(@NonNull Ad ad2, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.core.player.c cVar, @Nullable p pVar, @Nullable a.C1046a c1046a, @Nullable b.a aVar) {
        this.f80293q = c1046a;
        this.f80292p = c1046a == null ? null : c1046a.f83876b;
        this.f80294r = cVar;
        this.f80295s = pVar;
        this.f80296t = ad2;
        this.f80277a = bVar;
        this.f80290n = aVar;
        this.f80291o = !TextUtils.isEmpty(r7);
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    @Nullable
    public final View a() {
        return this.f80285i;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10) {
        if (i10 == 1) {
            this.f80289m.a();
            sg.bigo.ads.core.player.c cVar = this.f80294r;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10, int i11) {
        int i12;
        int i13;
        WebView webView = this.f80284h;
        if (webView == null) {
            return;
        }
        Context context = webView.getContext();
        a.C1046a c1046a = this.f80293q;
        int i14 = 0;
        if (c1046a != null) {
            i13 = c1046a.f83877c;
            i12 = c1046a.f83878d;
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (sg.bigo.ads.common.utils.e.a(context, i13) <= i10 && sg.bigo.ads.common.utils.e.a(context, i12) <= i11) {
            i14 = i13;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f80284h.getLayoutParams();
        if (i14 <= 0 || i12 <= 0) {
            layoutParams.width = i10;
            layoutParams.height = i11;
        } else {
            layoutParams.gravity = 17;
            layoutParams.width = sg.bigo.ads.common.utils.e.a(context, i14);
            layoutParams.height = sg.bigo.ads.common.utils.e.a(context, i12);
        }
    }

    public final void a(Context context, String str, i iVar) {
        d dVarA;
        sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "handle ad click.");
        Ad ad2 = this.f80296t;
        if (ad2 instanceof f) {
            ((f) ad2).L();
        }
        b.a aVar = this.f80290n;
        String str2 = (aVar == null || !aVar.c()) ? null : str;
        if (this.f80277a.f().c() == 0 || !(this.f80296t instanceof sg.bigo.ads.ad.c)) {
            boolean zA = this.f80277a.a(16);
            dVarA = sg.bigo.ads.ad.interstitial.a.a.a.a(context, zA ? sg.bigo.ads.common.utils.c.a(this.f80285i) : null, this.f80296t, this.f80277a, str2, this.f80295s, this.f80293q, zA);
            dVarA.f81853k = 0;
        } else {
            Context context2 = this.f80285i.getContext();
            Ad ad3 = this.f80296t;
            sg.bigo.ads.controller.landing.e.a(context2, (sg.bigo.ads.ad.c<?, ?>) (ad3 instanceof sg.bigo.ads.ad.b.a.a.c ? (sg.bigo.ads.ad.b.a.a.c) ad3 : ad3 instanceof sg.bigo.ads.ad.b.a.a.d ? (sg.bigo.ads.ad.b.a.a.d) ad3 : ad3 instanceof s ? ((s) ad3).H() : (sg.bigo.ads.ad.c) ad3));
            dVarA = new d();
            dVarA.f81853k = 1;
        }
        sg.bigo.ads.core.player.c cVar = this.f80294r;
        if (cVar != null && !cVar.b(this.f80277a)) {
            this.f80294r.a(this.f80277a);
        }
        h hVar = this.f80283g;
        if (hVar != null) {
            hVar.a(iVar, dVarA);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    @SuppressLint({"AddJavascriptInterface"})
    public final boolean a(final Context context) {
        int i10;
        int i11;
        byte b10 = 0;
        if (!this.f80291o) {
            return false;
        }
        if (this.f80297u == null) {
            try {
                this.f80297u = new e(context, n.INTERSTITIAL);
            } catch (NoClassDefFoundError unused) {
                sg.bigo.ads.common.t.a.a(0, "HtmlVastCompanion", "Banner webview is not support");
            }
            e eVar = this.f80297u;
            if (eVar == null) {
                return false;
            }
            eVar.f84119g = new e.b() { // from class: sg.bigo.ads.ad.interstitial.a.a.b.1
                @Override // sg.bigo.ads.core.mraid.e.b
                public final void a() {
                    b bVar = b.this;
                    bVar.f80279c = true;
                    bVar.f80280d = false;
                    bVar.f80282f = c.a.f83703a.a(b.this.f80284h, new View[0]);
                    b bVar2 = b.this;
                    if (bVar2.f80278b) {
                        if (bVar2.f80284h != null) {
                            sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "javascript:onViewImpression()");
                            bVar2.f80284h.loadUrl("javascript:onViewImpression()");
                        }
                        sg.bigo.ads.core.c.b bVar3 = b.this.f80282f;
                        if (bVar3 != null) {
                            bVar3.a();
                        }
                    }
                    sg.bigo.ads.ad.banner.b.b(b.this);
                    b.a aVar = b.this.f80290n;
                    if (aVar != null) {
                        aVar.a();
                    }
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void a(@NonNull String str, @Nullable i iVar) {
                    b.this.a(context, str, iVar);
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final boolean a(Activity activity, int i12) {
                    b.this.f80289m.a(activity, i12);
                    return true;
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void b() {
                    b bVar = b.this;
                    bVar.f80280d = false;
                    bVar.f80288l = true;
                    sg.bigo.ads.ad.banner.b.c(bVar);
                    b bVar2 = b.this;
                    b.a aVar = bVar2.f80290n;
                    if (aVar != null) {
                        aVar.a(bVar2.f80277a, SystemClock.elapsedRealtime() - b.this.f80281e);
                    }
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final boolean b(Activity activity, int i12) {
                    b.this.f80289m.a(activity, i12);
                    return true;
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void c() {
                    sg.bigo.ads.common.t.a.a(0, "HtmlVastCompanion", "onRenderProcessGone");
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void d() {
                    sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "onExpand");
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void e() {
                    sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "onResize");
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void f() {
                    h hVar = b.this.f80283g;
                    if (hVar != null) {
                        hVar.a();
                    }
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void g() {
                    h hVar = b.this.f80283g;
                    if (hVar != null) {
                        hVar.a();
                    }
                }
            };
            String str = (c.a.f83703a.c(this.f80292p) + "\n<script>document.addEventListener('DOMContentLoaded',function(){BGN_PLAYABLE.onBGNDomContentLoaded()});\nwindow.addEventListener('load',function(){BGN_PLAYABLE.onBGNLoaded()});</script>") + "\n<script type=\"text/javascript\">\n    document.body.style.margin = '0px';\n</script>";
            this.f80281e = SystemClock.elapsedRealtime();
            b.a aVar = this.f80290n;
            if (aVar != null) {
                aVar.a(this.f80277a);
            }
            this.f80297u.a(str, new e.d() { // from class: sg.bigo.ads.ad.interstitial.a.a.b.2
                @Override // sg.bigo.ads.core.mraid.e.d
                public final void a() {
                    sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "onReady");
                }
            });
            this.f80280d = true;
            t.a();
        }
        c.C1051c c1051cB = this.f80297u.b();
        this.f80284h = c1051cB;
        if (c1051cB != null) {
            c1051cB.setOverScrollMode(2);
            this.f80284h.setHorizontalScrollBarEnabled(false);
            this.f80284h.setHorizontalScrollbarOverlay(false);
            this.f80284h.setVerticalScrollBarEnabled(false);
            this.f80284h.setVerticalScrollbarOverlay(false);
            this.f80284h.getSettings().setSupportZoom(false);
            this.f80284h.setBackgroundColor(-1);
            a.C1046a c1046a = this.f80293q;
            if (c1046a != null) {
                i11 = c1046a.f83877c;
                i10 = c1046a.f83878d;
            } else {
                i10 = 0;
                i11 = 0;
            }
            WebView webView = this.f80284h;
            if (webView != null) {
                Object parent = webView.getParent();
                if (parent instanceof FrameLayout) {
                    this.f80285i = (View) parent;
                    sg.bigo.ads.ad.banner.b.a(this);
                    Context context2 = webView.getContext();
                    int i12 = context2.getResources().getDisplayMetrics().widthPixels;
                    int iC = sg.bigo.ads.common.utils.e.c(context2);
                    if (sg.bigo.ads.common.utils.e.a(context2, i11) > i12 || sg.bigo.ads.common.utils.e.a(context2, i10) > iC) {
                        i11 = 0;
                    }
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) webView.getLayoutParams();
                    if (i11 <= 0 || i10 <= 0) {
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                    } else {
                        layoutParams.gravity = 17;
                        layoutParams.width = sg.bigo.ads.common.utils.e.a(context2, i11);
                        layoutParams.height = sg.bigo.ads.common.utils.e.a(context2, i10);
                    }
                }
            }
            this.f80284h.addJavascriptInterface(new a(this, b10), "BGN_PLAYABLE");
        }
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean b() {
        if (this.f80291o) {
            return this.f80279c;
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void c() {
        sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        e eVar = this.f80297u;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        e eVar = this.f80297u;
        if (eVar != null) {
            eVar.a(false);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void e() {
        sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "release");
        sg.bigo.ads.ad.banner.b.h(this);
        sg.bigo.ads.core.c.b bVar = this.f80282f;
        if (bVar != null) {
            bVar.b();
        }
        e eVar = this.f80297u;
        if (eVar != null) {
            eVar.e();
            this.f80297u = null;
        }
        WebView webView = this.f80284h;
        if (webView != null) {
            u.b(webView);
            this.f80284h = null;
        }
        this.f80283g = null;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void f() {
        b.a aVar;
        if (this.f80286j || this.f80287k || this.f80288l || (aVar = this.f80290n) == null || this.f80281e <= 0) {
            return;
        }
        aVar.d(this.f80277a, SystemClock.elapsedRealtime() - this.f80281e);
    }
}
