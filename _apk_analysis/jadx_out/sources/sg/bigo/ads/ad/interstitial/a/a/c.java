package sg.bigo.ads.ad.interstitial.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.ad.interstitial.a.b.c;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.n.d;
import sg.bigo.ads.common.p.e;
import sg.bigo.ads.common.p.f;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.core.f.a.a;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements sg.bigo.ads.ad.interstitial.a.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.core.b f80305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final c.b f80306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f80307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebView f80308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f80309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.a f80310f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f80312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f80313i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a.C1046a f80315k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f80316l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private final sg.bigo.ads.core.player.c f80318n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private final p f80319o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    private final Ad f80320p;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f80311g = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f80314j = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    private final List<a.C1046a> f80317m = new ArrayList();

    public class a extends FrameLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i f80331b;

        public a(Context context) {
            super(context);
            this.f80331b = new i();
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 1) {
                this.f80331b.f82224b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (motionEvent.getActionMasked() == 0) {
                this.f80331b.f82223a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public class b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.C1046a f80332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ViewConfiguration f80333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f80334c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f80336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f80337f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f80335d = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public i f80338g = new i();

        public b(Context context, a.C1046a c1046a) {
            this.f80332a = c1046a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f80333b = viewConfiguration;
            this.f80334c = viewConfiguration.getScaledTouchSlop();
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                this.f80335d = true;
                this.f80336e = motionEvent.getX();
                this.f80337f = motionEvent.getY();
                this.f80338g.f82223a = new Point((int) this.f80336e, (int) this.f80337f);
            } else if (motionEvent.getActionMasked() == 1) {
                if (this.f80335d) {
                    this.f80335d = false;
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    this.f80338g.f82224b = new Point((int) x10, (int) y10);
                    if (Math.abs(this.f80336e - x10) < this.f80334c && Math.abs(this.f80337f - y10) < this.f80334c) {
                        c cVar = c.this;
                        cVar.a(cVar.g().f80021b.f81864e, this.f80338g);
                    }
                }
            } else if (motionEvent.getAction() == 3) {
                this.f80335d = false;
            }
            return true;
        }
    }

    public c(@NonNull Ad ad2, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.core.player.c cVar, @Nullable p pVar, @Nullable c.b bVar2) {
        this.f80318n = cVar;
        this.f80319o = pVar;
        this.f80320p = ad2;
        this.f80305a = bVar;
        this.f80306b = bVar2;
        if (pVar != null) {
            Iterator<sg.bigo.ads.core.f.a.a> it = pVar.A.iterator();
            while (it.hasNext()) {
                List<a.C1046a> list = it.next().f83874b;
                if (list != null) {
                    for (a.C1046a c1046a : list) {
                        if (c1046a.a() && c1046a.b()) {
                            this.f80317m.add(c1046a);
                        }
                    }
                    for (a.C1046a c1046a2 : list) {
                        if (c1046a2.a() && c1046a2.c()) {
                            this.f80317m.add(c1046a2);
                        }
                    }
                }
            }
        }
        this.f80316l = !this.f80317m.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context, final List<a.C1046a> list, @Nullable final a.C1046a c1046a, final int i10) {
        d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                if (c.this.f80311g) {
                    sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "static vast companion destroyed, stop preload.");
                    return;
                }
                if (list.isEmpty()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "image list empty, stop preload.");
                    c cVar = c.this;
                    c.b bVar = cVar.f80306b;
                    if (bVar != null) {
                        sg.bigo.ads.api.core.b bVar2 = cVar.f80305a;
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - c.this.f80312h;
                        a.C1046a c1046a2 = c1046a;
                        bVar.a(bVar2, jElapsedRealtime, c1046a2 == null ? null : c1046a2.f83876b, i10 - 1, c1046a2 == null ? null : c1046a2.f83879e, "load failed");
                        return;
                    }
                    return;
                }
                c.this.f80315k = (a.C1046a) list.remove(0);
                String str = c.this.f80315k.f83876b;
                sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "try to preload image: ".concat(String.valueOf(str)));
                if (URLUtil.isNetworkUrl(str)) {
                    e.a(context, str, c.this.f80305a.al(), new g() { // from class: sg.bigo.ads.ad.interstitial.a.a.c.1.1
                        @Override // sg.bigo.ads.common.p.g
                        public final void a(int i11, @NonNull String str2, String str3) {
                            sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "image load failed: " + str2 + ", try to preload next image.");
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            c cVar2 = c.this;
                            cVar2.a(context, list, cVar2.f80315k, i10 + 1);
                        }

                        @Override // sg.bigo.ads.common.p.g
                        public final void a(@NonNull Bitmap bitmap, @NonNull f fVar) {
                            String string;
                            sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "image load success.");
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            final c cVar2 = c.this;
                            final Context context2 = context;
                            a.C1046a c1046a3 = cVar2.f80315k;
                            int i11 = i10;
                            sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "try to handle image.");
                            View view = null;
                            if (c1046a3.b()) {
                                sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "handle jpg/png image.");
                                AdImageView adImageView = new AdImageView(context2);
                                adImageView.setImageBitmap(bitmap);
                                adImageView.setOnTouchListener(cVar2.new b(context2, c1046a3));
                                string = null;
                                view = adImageView;
                            } else if (c1046a3.c()) {
                                sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "handle gif image.");
                                try {
                                    File file = new File(fVar.f82368d);
                                    if (file.exists()) {
                                        URI uri = file.toURI();
                                        WebView webView = new WebView(context2);
                                        webView.getSettings().setAllowFileAccess(true);
                                        webView.getSettings().setAllowFileAccessFromFileURLs(false);
                                        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
                                        if (uri.toString().startsWith(AdPayload.FILE_SCHEME)) {
                                            webView.getSettings().setJavaScriptEnabled(false);
                                        } else {
                                            webView.getSettings().setJavaScriptEnabled(true);
                                        }
                                        webView.loadUrl(uri.toString());
                                        webView.getSettings().setLoadWithOverviewMode(true);
                                        webView.getSettings().setUseWideViewPort(true);
                                        webView.setOnTouchListener(cVar2.new b(context2, c1046a3));
                                        cVar2.f80308d = webView;
                                        string = null;
                                        view = webView;
                                    } else {
                                        sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "gif image file is not exists.");
                                        string = "git file not exists";
                                    }
                                } catch (Exception e10) {
                                    string = e10.toString();
                                }
                            } else {
                                string = null;
                            }
                            if (view == null) {
                                c.b bVar3 = cVar2.f80306b;
                                if (bVar3 != null) {
                                    cVar2.f80314j = true;
                                    bVar3.a(cVar2.f80305a, SystemClock.elapsedRealtime() - cVar2.f80312h, c1046a3.f83876b, i11, c1046a3.f83879e, string);
                                    return;
                                }
                                return;
                            }
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            if (width <= 0 || height <= 0) {
                                width = sg.bigo.ads.common.utils.e.a(context2, c1046a3.f83877c);
                                height = sg.bigo.ads.common.utils.e.a(context2, c1046a3.f83878d);
                            }
                            float f10 = context2.getResources().getDisplayMetrics().widthPixels;
                            float fC = sg.bigo.ads.common.utils.e.c(context2);
                            if (f10 > 0.0f && fC > 0.0f) {
                                float f11 = height;
                                float f12 = width;
                                float f13 = (f11 * f10) / f12;
                                if (f13 > fC) {
                                    f10 = (f12 * fC) / f11;
                                } else {
                                    fC = f13;
                                }
                                width = (int) f10;
                                height = (int) fC;
                            }
                            FrameLayout.LayoutParams layoutParams = (width <= 0 || height <= 0) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(width, height, 17);
                            final a aVar = cVar2.new a(context2);
                            aVar.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.a.a.c.2
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    c.this.a(context2, aVar.f80331b);
                                }
                            });
                            cVar2.f80309e = view;
                            aVar.addView(view, layoutParams);
                            cVar2.f80307c = aVar;
                            c.b bVar4 = cVar2.f80306b;
                            if (bVar4 != null) {
                                cVar2.f80313i = true;
                                bVar4.a(cVar2.f80305a, SystemClock.elapsedRealtime() - cVar2.f80312h, c1046a3.f83876b, i11, c1046a3.f83879e);
                            }
                        }
                    });
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "image url is invalid: " + str + ", try to preload next image.");
                c cVar2 = c.this;
                cVar2.a(context, list, cVar2.f80315k, i10 + 1);
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    @Nullable
    public final View a() {
        return this.f80307c;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10) {
        sg.bigo.ads.core.player.c cVar;
        if (i10 != 1 || (cVar = this.f80318n) == null) {
            return;
        }
        cVar.a();
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams;
        int i12;
        int i13;
        View view = this.f80309e;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || (i12 = layoutParams.width) == -1 || (i13 = layoutParams.height) == 0 || i12 == 0) {
            return;
        }
        if (i10 > 0 && i11 > 0) {
            float f10 = i10;
            float f11 = i13;
            float f12 = i12;
            float f13 = (f11 * f10) / f12;
            float f14 = i11;
            if (f13 > f14) {
                f10 = (f12 * f14) / f11;
                f13 = f14;
            }
            i12 = (int) f10;
            i13 = (int) f13;
        }
        layoutParams.width = i12;
        layoutParams.height = i13;
        this.f80309e = null;
    }

    public final void a(Context context, i iVar) {
        sg.bigo.ads.api.core.d dVarA;
        int i10 = 0;
        sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "handle ad click.");
        Ad ad2 = this.f80320p;
        if (ad2 instanceof sg.bigo.ads.api.b.f) {
            ((sg.bigo.ads.api.b.f) ad2).L();
        }
        if (this.f80305a.f().c() == 0 || !(this.f80320p instanceof sg.bigo.ads.ad.c)) {
            boolean zA = this.f80305a.a(16);
            dVarA = sg.bigo.ads.ad.interstitial.a.a.a.a(context, zA ? sg.bigo.ads.common.utils.c.a(this.f80307c) : null, this.f80320p, this.f80305a, null, this.f80319o, this.f80315k, zA);
        } else {
            sg.bigo.ads.controller.landing.e.a(this.f80307c.getContext(), g());
            dVarA = new sg.bigo.ads.api.core.d();
            i10 = 1;
        }
        dVarA.f81853k = i10;
        sg.bigo.ads.core.player.c cVar = this.f80318n;
        if (cVar != null && !cVar.b(this.f80305a)) {
            this.f80318n.a(this.f80305a);
        }
        c.a aVar = this.f80310f;
        if (aVar != null) {
            aVar.a(iVar, dVarA);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean a(Context context) {
        String str;
        if (!this.f80316l) {
            str = "image resource is disable.";
        } else if (this.f80311g) {
            str = "static vast companion destroyed, stop preload.";
        } else {
            if (!this.f80317m.isEmpty()) {
                this.f80312h = SystemClock.elapsedRealtime();
                c.b bVar = this.f80306b;
                if (bVar != null) {
                    bVar.a(this.f80305a);
                }
                a(context, this.f80317m, null, 0);
                return true;
            }
            str = "image list empty, stop preload.";
        }
        sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", str);
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean b() {
        return (this.f80311g || this.f80307c == null) ? false : true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void c() {
        View view = this.f80307c;
        if (view instanceof WebView) {
            ((WebView) view).onResume();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void d() {
        View view = this.f80307c;
        if (view instanceof WebView) {
            ((WebView) view).onPause();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    @SuppressLint({"ClickableViewAccessibility"})
    public final void e() {
        sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "release");
        WebView webView = this.f80308d;
        if (webView != null) {
            webView.setOnTouchListener(null);
            this.f80308d.destroy();
            this.f80308d = null;
        }
        View view = this.f80307c;
        if (view != null) {
            u.b(view);
            this.f80307c = null;
        }
        this.f80311g = true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void f() {
        c.b bVar;
        if (this.f80314j || this.f80313i || (bVar = this.f80306b) == null || this.f80312h <= 0) {
            return;
        }
        bVar.a(this.f80305a, SystemClock.elapsedRealtime() - this.f80312h);
    }

    public final sg.bigo.ads.ad.c<?, ?> g() {
        Ad ad2 = this.f80320p;
        return ad2 instanceof sg.bigo.ads.ad.b.a.a.c ? (sg.bigo.ads.ad.b.a.a.c) ad2 : ad2 instanceof sg.bigo.ads.ad.b.a.a.d ? (sg.bigo.ads.ad.b.a.a.d) ad2 : ad2 instanceof s ? ((s) ad2).H() : (sg.bigo.ads.ad.c) ad2;
    }
}
