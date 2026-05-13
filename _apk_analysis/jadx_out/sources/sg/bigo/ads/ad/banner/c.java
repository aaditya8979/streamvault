package sg.bigo.ads.ad.banner;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.banner.b;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.AdSize;
import sg.bigo.ads.api.BannerAdRequest;
import sg.bigo.ads.api.b.a;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.h.b;
import sg.bigo.ads.core.mraid.n;

/* JADX INFO: loaded from: classes8.dex */
public final class c<T extends Ad> implements b.InterfaceC0966b {
    private AdSize A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebView f79941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f79942b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f79944d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Runnable f79948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public sg.bigo.ads.core.c.b f79949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f79950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f79951k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final T f79952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sg.bigo.ads.api.core.h f79953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f79954n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WeakReference<Activity> f79956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a f79957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f79958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public AdOptionsView f79959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public LinearLayout f79960t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f79961u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.common.view.c f79962v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private sg.bigo.ads.core.mraid.e f79963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    private final n f79964x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private BannerAdRequest f79966z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f79943c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f79945e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79946f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f79947g = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f79965y = false;
    private final View.OnAttachStateChangeListener B = new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.ad.banner.c.1
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            sg.bigo.ads.ad.banner.b.e(c.this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            sg.bigo.ads.ad.banner.b.f(c.this);
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f79955o = new AtomicBoolean(false);

    public interface a {
        void a(int i10, int i11);
    }

    public static class b implements a.InterfaceC1007a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a.InterfaceC1007a f79993c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f79992b = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Handler f79991a = new Handler();

        public b(a.InterfaceC1007a interfaceC1007a) {
            this.f79993c = interfaceC1007a;
        }

        private boolean c() {
            if (this.f79992b) {
                return true;
            }
            this.f79991a.removeCallbacks(null);
            this.f79992b = true;
            return false;
        }

        public final void a() {
            a(new sg.bigo.ads.api.core.c(3001, 10102, "Adx media load error because of destroying before loaded"));
        }

        @Override // sg.bigo.ads.api.b.a.InterfaceC1007a
        public final void a(sg.bigo.ads.api.core.c cVar) {
            a.InterfaceC1007a interfaceC1007a;
            if (c() || (interfaceC1007a = this.f79993c) == null) {
                return;
            }
            interfaceC1007a.a(cVar);
        }

        @Override // sg.bigo.ads.api.b.a.InterfaceC1007a
        public final void b() {
            a.InterfaceC1007a interfaceC1007a;
            if (c() || (interfaceC1007a = this.f79993c) == null) {
                return;
            }
            interfaceC1007a.b();
        }
    }

    public c(Context context, sg.bigo.ads.api.core.f fVar, T t10, sg.bigo.ads.api.core.h hVar, @NonNull n nVar, h hVar2, boolean z10) {
        this.f79951k = context;
        this.f79952l = t10;
        this.f79953m = hVar;
        this.f79964x = nVar;
        this.f79950j = hVar2;
        this.f79954n = z10;
        if (fVar != null) {
            sg.bigo.ads.api.b bVar = fVar.f81862c;
            if (bVar instanceof BannerAdRequest) {
                this.f79966z = (BannerAdRequest) bVar;
            }
        }
        if (fVar == null || !q.b((CharSequence) fVar.f81862c.f81809g)) {
            return;
        }
        this.f79962v = new sg.bigo.ads.common.view.c(context, fVar.f81862c.f81809g);
    }

    public static /* synthetic */ View a(c cVar, View view) {
        LinearLayout linearLayout = new LinearLayout(cVar.f79951k);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        if (view != null) {
            linearLayout.addView(view);
        }
        if (cVar.f79959s == null) {
            cVar.f79959s = new AdOptionsView(cVar.f79951k);
        }
        AdOptionsView adOptionsView = cVar.f79959s;
        sg.bigo.ads.api.core.h hVar = cVar.f79953m;
        adOptionsView.a(hVar, hVar.l());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(cVar.f79951k, 16), sg.bigo.ads.common.utils.e.a(cVar.f79951k, 16), BadgeDrawable.TOP_START);
        layoutParams.leftMargin = sg.bigo.ads.common.utils.e.a(cVar.f79951k, 10);
        cVar.f79959s.setLayoutParams(layoutParams);
        linearLayout.addView(cVar.f79959s);
        return linearLayout;
    }

    public static /* synthetic */ TextView a(Context context, boolean z10) {
        if (!z10) {
            return null;
        }
        TextView textView = new TextView(context);
        textView.setText(sg.bigo.ads.common.utils.a.a(context, R.string.bigo_ad_tag, new Object[0]));
        textView.setBackgroundResource(R.drawable.bigo_ad_bg_ad_tag_white_border);
        textView.setTextColor(q.b("#B2FFFFFF", -1));
        textView.setTextSize(9.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(sg.bigo.ads.common.utils.e.a(context, 3), sg.bigo.ads.common.utils.e.a(context, 1), sg.bigo.ads.common.utils.e.a(context, 3), sg.bigo.ads.common.utils.e.a(context, 1));
        return textView;
    }

    public static /* synthetic */ TextView a(Context context, boolean z10, String str) {
        if (!z10 || q.a((CharSequence) str)) {
            return null;
        }
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setBackgroundResource(R.drawable.bigo_ad_banner_advertiser_background);
        textView.setTextColor(-1);
        textView.setTextSize(9.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxWidth(sg.bigo.ads.common.utils.e.a(context, 240));
        textView.setBackgroundColor(q.b("#FFD6D9DB", -7829368));
        textView.setPadding(sg.bigo.ads.common.utils.e.a(context, 4), sg.bigo.ads.common.utils.e.a(context, 1), sg.bigo.ads.common.utils.e.a(context, 4), sg.bigo.ads.common.utils.e.a(context, 1));
        return textView;
    }

    private void a(FrameLayout.LayoutParams layoutParams, int i10, int i11) {
        layoutParams.width = i10;
        layoutParams.height = i11;
        layoutParams.gravity = 17;
        this.f79942b.setMinimumHeight(i11);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: sg.bigo.ads.core.h.a.1.<init>(sg.bigo.ads.core.h.a, android.content.Context):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:298)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:197)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @androidx.annotation.UiThread
    private boolean c(@androidx.annotation.Nullable final sg.bigo.ads.api.b.a.InterfaceC1007a r14) {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.banner.c.c(sg.bigo.ads.api.b.a$a):boolean");
    }

    public final void a() {
        if (sg.bigo.ads.common.n.d.b()) {
            b();
        } else {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.banner.c.4
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.b();
                }
            });
        }
    }

    public final void a(final a.InterfaceC1007a interfaceC1007a) {
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.banner.c.3
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                if (cVar.f79943c != 0) {
                    if (cVar.b(interfaceC1007a)) {
                        return;
                    }
                    interfaceC1007a.a(new sg.bigo.ads.api.core.c(3001, 10102, "Adx media load error when preload"));
                    return;
                }
                b bVar = cVar.f79944d;
                if (bVar != null) {
                    bVar.a();
                }
                c.this.f79944d = new b(interfaceC1007a);
                final b bVar2 = c.this.f79944d;
                bVar2.f79991a.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.banner.c.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.b();
                    }
                }, 15000L);
                c cVar2 = c.this;
                if (cVar2.b(cVar2.f79944d)) {
                    return;
                }
                c.this.f79944d.a(new sg.bigo.ads.api.core.c(3001, 10102, "Adx media load error when preload"));
            }
        });
    }

    public final void b() {
        try {
            sg.bigo.ads.ad.banner.b.h(this);
            sg.bigo.ads.core.c.b bVar = this.f79949i;
            if (bVar != null) {
                bVar.b();
            }
            b bVar2 = this.f79944d;
            if (bVar2 != null) {
                bVar2.a();
            }
            if (this.f79948h != null) {
                this.f79948h = null;
            }
            sg.bigo.ads.core.mraid.e eVar = this.f79963w;
            if (eVar != null) {
                eVar.e();
                this.f79963w = null;
            }
            View view = this.f79942b;
            if (view != null) {
                view.removeOnAttachStateChangeListener(this.B);
                this.f79942b = null;
            }
            WebView webView = this.f79941a;
            if (webView != null) {
                u.b(webView);
                this.f79941a = null;
            }
        } catch (Throwable unused) {
        }
    }

    @UiThread
    public final boolean b(@Nullable a.InterfaceC1007a interfaceC1007a) {
        if (this.f79961u) {
            return true;
        }
        boolean zC = c(interfaceC1007a);
        this.f79961u = zC;
        return zC;
    }

    @NonNull
    public final View c() {
        if (this.f79942b == null) {
            sg.bigo.ads.common.t.a.a(2, "BannerAd", "The banner ad is not ready, an empty view will be retrieved.");
            this.f79942b = new FrameLayout(this.f79951k);
        }
        sg.bigo.ads.ad.banner.b.d(this);
        this.f79942b.addOnAttachStateChangeListener(this.B);
        return this.f79942b;
    }

    public final String d() {
        sg.bigo.ads.api.core.h hVar = this.f79953m;
        return hVar != null ? hVar.z() : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[PHI: r0 r1
      0x0053: PHI (r0v11 android.app.Activity) = (r0v6 android.app.Activity), (r0v13 android.app.Activity) binds: [B:37:0x0094, B:21:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r1v3 T extends sg.bigo.ads.api.Ad) = (r1v1 T extends sg.bigo.ads.api.Ad), (r1v6 T extends sg.bigo.ads.api.Ad) binds: [B:37:0x0094, B:21:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Context e() {
        /*
            r8 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r8.f79956p
            r1 = 3
            r2 = 0
            java.lang.String r3 = "BannerAd"
            if (r0 == 0) goto L22
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L22
            java.lang.String r4 = "Interstitial/Reward Video banner ad get activity context from show(Activity activity)."
            sg.bigo.ads.common.t.a.a(r2, r1, r3, r4)
            T extends sg.bigo.ads.api.Ad r4 = r8.f79952l
            boolean r5 = r4 instanceof sg.bigo.ads.ad.c
            if (r5 == 0) goto L23
            sg.bigo.ads.ad.c r4 = (sg.bigo.ads.ad.c) r4
            r5 = 1
            r4.b(r5)
            goto L23
        L22:
            r0 = 0
        L23:
            if (r0 != 0) goto L97
            sg.bigo.ads.api.a.h r4 = sg.bigo.ads.api.a.i.f81802a
            sg.bigo.ads.core.mraid.n r5 = r8.f79964x
            sg.bigo.ads.core.mraid.n r6 = sg.bigo.ads.core.mraid.n.INTERSTITIAL
            r7 = 2
            if (r5 != r6) goto L59
            if (r4 == 0) goto L97
            sg.bigo.ads.api.a.j r4 = r4.n()
            r5 = 16
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto L97
            android.app.Activity r0 = sg.bigo.ads.common.f.b.b()
            if (r0 != 0) goto L48
            java.lang.String r1 = "Interstitial/Reward Video banner ad failed to get activity context."
        L44:
            sg.bigo.ads.common.t.a.a(r2, r3, r1)
            goto L97
        L48:
            java.lang.String r4 = "Interstitial/Reward Video banner ad get activity context from current activity."
            sg.bigo.ads.common.t.a.a(r2, r1, r3, r4)
            T extends sg.bigo.ads.api.Ad r1 = r8.f79952l
            boolean r2 = r1 instanceof sg.bigo.ads.ad.c
            if (r2 == 0) goto L97
        L53:
            sg.bigo.ads.ad.c r1 = (sg.bigo.ads.ad.c) r1
            r1.b(r7)
            goto L97
        L59:
            if (r4 == 0) goto L97
            sg.bigo.ads.api.a.j r4 = r4.n()
            r5 = 17
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto L97
            android.view.View r4 = r8.f79942b     // Catch: java.lang.Exception -> L80
            android.app.Activity r4 = sg.bigo.ads.common.utils.c.a(r4)     // Catch: java.lang.Exception -> L80
            if (r4 == 0) goto L80
            java.lang.String r0 = "Banner ad get activity context from view."
            sg.bigo.ads.common.t.a.a(r2, r1, r3, r0)     // Catch: java.lang.Exception -> L7f
            T extends sg.bigo.ads.api.Ad r0 = r8.f79952l     // Catch: java.lang.Exception -> L7f
            boolean r5 = r0 instanceof sg.bigo.ads.ad.c     // Catch: java.lang.Exception -> L7f
            if (r5 == 0) goto L7f
            sg.bigo.ads.ad.c r0 = (sg.bigo.ads.ad.c) r0     // Catch: java.lang.Exception -> L7f
            r0.b(r1)     // Catch: java.lang.Exception -> L7f
        L7f:
            r0 = r4
        L80:
            if (r0 != 0) goto L97
            android.app.Activity r0 = sg.bigo.ads.common.f.b.b()
            if (r0 != 0) goto L8b
            java.lang.String r1 = "Banner ad failed to get activity context."
            goto L44
        L8b:
            java.lang.String r4 = "Banner ad get activity context from current activity."
            sg.bigo.ads.common.t.a.a(r2, r1, r3, r4)
            T extends sg.bigo.ads.api.Ad r1 = r8.f79952l
            boolean r2 = r1 instanceof sg.bigo.ads.ad.c
            if (r2 == 0) goto L97
            goto L53
        L97:
            if (r0 != 0) goto L9b
            android.content.Context r0 = r8.f79951k
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.banner.c.e():android.content.Context");
    }

    public final void f() {
        sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "performImpression");
        sg.bigo.ads.ad.banner.b.g(this);
        T t10 = this.f79952l;
        if (t10 instanceof e) {
            ((e) t10).a(sg.bigo.ads.ad.banner.b.i(this));
        }
        if (this.f79945e) {
            return;
        }
        this.f79945e = true;
        if (this.f79946f) {
            h();
            g();
            sg.bigo.ads.core.c.b bVar = this.f79949i;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public final void g() {
        if (this.f79941a != null) {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "javascript:onViewImpression()");
            this.f79941a.loadUrl("javascript:onViewImpression()");
        }
    }

    public final void h() {
        final WebView webView = this.f79941a;
        if (this.f79965y || !(webView instanceof sg.bigo.ads.core.h.b)) {
            return;
        }
        this.f79965y = true;
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.banner.c.2
            @Override // java.lang.Runnable
            public final void run() {
                b.C1048b c1048b;
                long j10;
                long jA;
                long j11;
                long jA2;
                long j12;
                sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Notify webView performance stat.");
                sg.bigo.ads.core.h.b bVar = (sg.bigo.ads.core.h.b) webView;
                if (sg.bigo.ads.api.a.i.f81802a.n().a(0) || sg.bigo.ads.api.a.i.f81802a.n().a(1)) {
                    b.C1048b c1048b2 = bVar.f84024h;
                    sg.bigo.ads.core.h.b.a(c1048b2);
                    if (sg.bigo.ads.api.a.i.f81802a.n().a(1)) {
                        if (bVar.f84025i == null) {
                            bVar.f84025i = new b.c(bVar, (byte) 0);
                        }
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        c1048b2.f84031d = bVar.f84025i.a();
                        c1048b2.f84034g = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        c1048b2.f84033f = SystemClock.elapsedRealtime();
                    }
                    c1048b = c1048b2;
                } else {
                    c1048b = null;
                }
                if (c1048b != null) {
                    Boolean bool = c1048b.f84030c;
                    if (bool == null && c1048b.f84031d == null) {
                        return;
                    }
                    Boolean bool2 = c1048b.f84031d;
                    if (bool != null) {
                        long j13 = bool.booleanValue() ? 1L : 0L;
                        jA = sg.bigo.ads.ad.banner.b.a(c.this, c1048b.f84032e);
                        j10 = j13;
                    } else {
                        j10 = -1;
                        jA = -1;
                    }
                    if (bool2 != null) {
                        long j14 = bool2.booleanValue() ? 1L : 0L;
                        long j15 = c1048b.f84034g;
                        jA2 = sg.bigo.ads.ad.banner.b.a(c.this, c1048b.f84033f);
                        j11 = j14;
                        j12 = j15;
                    } else {
                        j11 = -1;
                        jA2 = -1;
                        j12 = -1;
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Stat check blank resutl.");
                    sg.bigo.ads.core.d.b.a(c.this.f79953m, j10, jA, j11, jA2, j12);
                }
            }
        });
    }

    public final AdSize i() {
        List<AdSize> list;
        if (this.A == null) {
            BannerAdRequest bannerAdRequest = this.f79966z;
            if (bannerAdRequest != null && (list = bannerAdRequest.f81768i) != null) {
                Iterator<AdSize> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AdSize next = it.next();
                    if (!next.f81767a.equals(AdSize.ADAPTIVE)) {
                        this.A = next;
                        break;
                    }
                }
            }
            if (this.A == null) {
                Context context = this.f79951k;
                this.A = sg.bigo.ads.common.utils.e.c(context, context.getResources().getDisplayMetrics().widthPixels) > 720 ? AdSize.LEADERBOARD : AdSize.BANNER;
            }
        }
        return this.A;
    }
}
