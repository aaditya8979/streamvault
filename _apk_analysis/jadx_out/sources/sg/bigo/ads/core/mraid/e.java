package sg.bigo.ads.core.mraid;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.mraid.a;
import sg.bigo.ads.core.mraid.a.a;
import sg.bigo.ads.core.mraid.c;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements sg.bigo.ads.common.d.d {
    private final c.b A;
    private final c.b B;
    private int C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Context f84113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final n f84114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f84115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.core.mraid.a.a f84116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final j f84117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public o f84118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public b f84119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public c.C1051c f84120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.core.mraid.c f84121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.core.mraid.c f84122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final c f84123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    private WeakReference<Activity> f84124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private ViewGroup f84125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    private final C1052e f84126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private l f84127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private c.C1051c f84128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private Integer f84129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f84130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f84131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f84132t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private i f84133u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final h f84134v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f84135w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f84136x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private sg.bigo.ads.core.mraid.a f84137y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Handler f84138z;

    public interface a extends b {
        void a(String str, String str2);
    }

    public interface b {
        void a();

        void a(@NonNull String str, @Nullable sg.bigo.ads.common.i iVar);

        boolean a(Activity activity, int i10);

        void b();

        boolean b(Activity activity, int i10);

        void c();

        void d();

        void e();

        void f();

        void g();
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f84148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f84149b;

        private c() {
            this.f84148a = -1;
            this.f84149b = -1;
        }

        public /* synthetic */ c(e eVar, byte b10) {
            this();
        }

        public final void a() {
            int measuredWidth = e.this.f84120h.getMeasuredWidth();
            int measuredHeight = e.this.f84120h.getMeasuredHeight();
            this.f84148a = measuredWidth;
            this.f84149b = measuredHeight;
        }
    }

    public interface d {
        void a();
    }

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.e$e, reason: collision with other inner class name */
    @VisibleForTesting
    public static class C1052e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Handler f84151a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public a f84152b;

        /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.e$e$a */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NonNull
            public final View[] f84153a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NonNull
            public final Handler f84154b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public Runnable f84155c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f84156d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Runnable f84157e;

            private a(@NonNull Handler handler, @NonNull View[] viewArr) {
                this.f84157e = new Runnable() { // from class: sg.bigo.ads.core.mraid.e.e.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (final View view : a.this.f84153a) {
                            if (view.getHeight() > 0 || view.getWidth() > 0) {
                                a.a(a.this);
                            } else {
                                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.core.mraid.e.e.a.1.1
                                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                                    public final boolean onPreDraw() {
                                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                                        a.a(a.this);
                                        return true;
                                    }
                                });
                            }
                        }
                    }
                };
                this.f84154b = handler;
                this.f84153a = viewArr;
            }

            public /* synthetic */ a(Handler handler, View[] viewArr, byte b10) {
                this(handler, viewArr);
            }

            public static /* synthetic */ void a(a aVar) {
                Runnable runnable;
                int i10 = aVar.f84156d - 1;
                aVar.f84156d = i10;
                if (i10 != 0 || (runnable = aVar.f84155c) == null) {
                    return;
                }
                runnable.run();
                aVar.f84155c = null;
            }

            public final void a() {
                this.f84154b.removeCallbacks(this.f84157e);
                this.f84155c = null;
            }
        }

        public final void a() {
            a aVar = this.f84152b;
            if (aVar != null) {
                aVar.a();
                this.f84152b = null;
            }
        }
    }

    public e(@NonNull Context context, @NonNull n nVar) {
        this(context, nVar, new sg.bigo.ads.core.mraid.c(nVar), new sg.bigo.ads.core.mraid.c(n.INTERSTITIAL), new C1052e());
    }

    @VisibleForTesting
    private e(@NonNull Context context, @NonNull n nVar, @NonNull sg.bigo.ads.core.mraid.c cVar, @NonNull sg.bigo.ads.core.mraid.c cVar2, @NonNull C1052e c1052e) {
        o oVar = o.LOADING;
        this.f84118f = oVar;
        this.f84132t = true;
        this.f84133u = i.NONE;
        this.f84135w = true;
        byte b10 = 0;
        this.f84136x = false;
        c.a aVar = new c.a() { // from class: sg.bigo.ads.core.mraid.e.3
            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a() {
                e eVar = e.this;
                eVar.f84121i.a(h.b(eVar.f84113a), h.a(eVar.f84113a), h.d(eVar.f84113a), h.c(eVar.f84113a), eVar.c());
                eVar.f84121i.a(eVar.f84114b);
                sg.bigo.ads.core.mraid.c cVar3 = eVar.f84121i;
                cVar3.a(cVar3.b());
                eVar.f84121i.a(eVar.f84117e);
                eVar.k();
                eVar.a(o.DEFAULT);
                eVar.f84121i.c("mraidbridge.notifyReadyEvent();");
                b bVar = e.this.f84119g;
                if (bVar != null) {
                    bVar.a();
                }
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(int i10, int i11, int i12, int i13, @NonNull a.EnumC1050a enumC1050a, boolean z10) throws sg.bigo.ads.core.mraid.d {
                e eVar = e.this;
                if (eVar.f84120h == null) {
                    throw new sg.bigo.ads.core.mraid.d("Unable to resize after the WebView is destroyed");
                }
                o oVar2 = eVar.f84118f;
                if (oVar2 == o.LOADING || oVar2 == o.HIDDEN) {
                    return;
                }
                if (oVar2 == o.EXPANDED) {
                    throw new sg.bigo.ads.core.mraid.d("Not allowed to resize from an already expanded ad");
                }
                if (eVar.f84114b == n.INTERSTITIAL) {
                    throw new sg.bigo.ads.core.mraid.d("Not allowed to resize from an interstitial ad");
                }
                eVar.f84123k.a();
                Context context2 = eVar.f84113a;
                int iA = sg.bigo.ads.common.utils.e.a(context2, i10);
                int iA2 = sg.bigo.ads.common.utils.e.a(context2, i11);
                int iA3 = sg.bigo.ads.common.utils.e.a(context2, i12);
                int iA4 = sg.bigo.ads.common.utils.e.a(context2, i13);
                Rect rect = eVar.f84117e.f84202g;
                int i14 = rect.left + iA3;
                int i15 = rect.top + iA4;
                Rect rect2 = new Rect(i14, i15, iA + i14, i15 + iA2);
                if (!z10) {
                    Rect rect3 = eVar.f84117e.f84198c;
                    if (rect2.width() > rect3.width() || rect2.height() > rect3.height()) {
                        throw new sg.bigo.ads.core.mraid.d("resizeProperties specified a size (" + i10 + ", " + i11 + ") and offset (" + i12 + ", " + i13 + ") that doesn't allow the ad to appear within the max allowed size (" + eVar.f84117e.f84199d.width() + ", " + eVar.f84117e.f84199d.height() + ")");
                    }
                    rect2.offsetTo(e.a(rect3.left, rect2.left, rect3.right - rect2.width()), e.a(rect3.top, rect2.top, rect3.bottom - rect2.height()));
                }
                Rect rect4 = new Rect();
                eVar.f84116d.a(enumC1050a, rect2, rect4);
                if (!eVar.f84117e.f84198c.contains(rect4)) {
                    throw new sg.bigo.ads.core.mraid.d("resizeProperties specified a size (" + i10 + ", " + i11 + ") and offset (" + i12 + ", " + i13 + ") that doesn't allow the close region to appear within the max allowed size (" + eVar.f84117e.f84199d.width() + ", " + eVar.f84117e.f84199d.height() + ")");
                }
                if (!rect2.contains(rect4)) {
                    throw new sg.bigo.ads.core.mraid.d("resizeProperties specified a size (" + i10 + ", " + iA2 + ") and offset (" + i12 + ", " + i13 + ") that don't allow the close region to appear within the resized ad.");
                }
                eVar.f84116d.setCloseVisible(false);
                eVar.f84116d.setClosePosition(enumC1050a);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect2.width(), rect2.height());
                int i16 = rect2.left;
                Rect rect5 = eVar.f84117e.f84198c;
                layoutParams.leftMargin = i16 - rect5.left;
                layoutParams.topMargin = rect2.top - rect5.top;
                o oVar3 = eVar.f84118f;
                if (oVar3 == o.DEFAULT) {
                    eVar.f84115c.removeView(eVar.f84120h);
                    eVar.f84115c.setVisibility(4);
                    eVar.f84116d.addView(eVar.f84120h, new FrameLayout.LayoutParams(-1, -1));
                    eVar.j().addView(eVar.f84116d, layoutParams);
                } else if (oVar3 == o.RESIZED) {
                    eVar.f84116d.setLayoutParams(layoutParams);
                }
                eVar.f84116d.setClosePosition(enumC1050a);
                eVar.a(o.RESIZED);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(@NonNull String str) {
                e.this.a(str);
            }

            @Override // sg.bigo.ads.core.mraid.c.a
            public final void a(String str, String str2) {
                b bVar = e.this.f84119g;
                if (bVar == null || !(bVar instanceof a)) {
                    return;
                }
                ((a) bVar).a(str, str2);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(String str, sg.bigo.ads.common.i iVar) {
                e.this.a(str, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(@Nullable String str, boolean z10) throws sg.bigo.ads.core.mraid.d {
                e.this.a(str, z10);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(sg.bigo.ads.core.mraid.b bVar) {
                if (e.this.f84122j.c()) {
                    return;
                }
                e.this.f84121i.a(bVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z10) {
                if (e.this.f84122j.c()) {
                    return;
                }
                e.this.f84121i.a(z10);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z10, i iVar) throws sg.bigo.ads.core.mraid.d {
                e.this.a(z10, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean a(@NonNull JsResult jsResult) {
                return e.this.a(jsResult);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b() {
                b bVar = e.this.f84119g;
                if (bVar != null) {
                    bVar.b();
                }
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b(boolean z10) {
                e.this.b(z10);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void c() {
                e.this.h();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean d() {
                return e.this.a();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void e() {
                e.this.f();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void f() {
                e.this.g();
            }
        };
        this.A = aVar;
        c.b bVar = new c.b() { // from class: sg.bigo.ads.core.mraid.e.4
            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a() {
                final e eVar = e.this;
                eVar.a(new Runnable() { // from class: sg.bigo.ads.core.mraid.e.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        e eVar2 = e.this;
                        eVar2.f84122j.a(h.b(eVar2.f84113a), h.a(e.this.f84113a), h.d(e.this.f84113a), h.c(e.this.f84113a), e.this.c());
                        e eVar3 = e.this;
                        eVar3.f84122j.a(eVar3.f84118f);
                        e eVar4 = e.this;
                        eVar4.f84122j.a(eVar4.f84114b);
                        sg.bigo.ads.core.mraid.c cVar3 = e.this.f84122j;
                        cVar3.a(cVar3.b());
                        e.this.f84122j.c("mraidbridge.notifyReadyEvent();");
                    }
                });
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(int i10, int i11, int i12, int i13, @NonNull a.EnumC1050a enumC1050a, boolean z10) throws sg.bigo.ads.core.mraid.d {
                throw new sg.bigo.ads.core.mraid.d("Not allowed to resize from an expanded state");
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(@NonNull String str) {
                e.this.a(str);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(String str, @Nullable sg.bigo.ads.common.i iVar) {
                e.this.a(str, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(@Nullable String str, boolean z10) {
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(sg.bigo.ads.core.mraid.b bVar2) {
                e.this.f84121i.a(bVar2);
                e.this.f84122j.a(bVar2);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z10) {
                e.this.f84121i.a(z10);
                e.this.f84122j.a(z10);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z10, i iVar) throws sg.bigo.ads.core.mraid.d {
                e.this.a(z10, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean a(@NonNull JsResult jsResult) {
                return e.this.a(jsResult);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b() {
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b(boolean z10) {
                e.this.b(z10);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void c() {
                e.this.h();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean d() {
                return e.this.a();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void e() {
                e.this.f();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void f() {
                e.this.g();
            }
        };
        this.B = bVar;
        this.C = -1;
        this.f84138z = new Handler(Looper.getMainLooper());
        this.f84113a = context;
        this.f84124l = context instanceof Activity ? new WeakReference<>((Activity) context) : new WeakReference<>(null);
        this.f84114b = nVar;
        this.f84121i = cVar;
        this.f84122j = cVar2;
        this.f84126n = c1052e;
        this.f84123k = new c(this, b10);
        this.f84118f = oVar;
        this.f84117e = new j(context, context.getResources().getDisplayMetrics().density);
        this.f84115c = new FrameLayout(context);
        sg.bigo.ads.core.mraid.a.a aVar2 = new sg.bigo.ads.core.mraid.a.a(context);
        this.f84116d = aVar2;
        aVar2.setOnCloseListener(new a.b() { // from class: sg.bigo.ads.core.mraid.e.1
            @Override // sg.bigo.ads.core.mraid.a.a.b
            public final void a() {
                e.this.g();
            }
        });
        View view = new View(context);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.core.mraid.e.2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        aVar2.addView(view, new FrameLayout.LayoutParams(-1, -1));
        sg.bigo.ads.common.d.a.a().a(context, this);
        cVar.f84093a = aVar;
        cVar2.f84093a = bVar;
        this.f84134v = new h();
        this.f84130r = 4871;
    }

    public static int a(int i10, int i11, int i12) {
        return Math.max(i10, Math.min(i11, i12));
    }

    @VisibleForTesting
    private void a(int i10) throws sg.bigo.ads.core.mraid.d {
        Activity activity = this.f84124l.get();
        if (activity == null || !a(this.f84133u)) {
            throw new sg.bigo.ads.core.mraid.d("Attempted to lock orientation to unsupported value: " + this.f84133u.name());
        }
        if (this.f84129q == null) {
            this.f84129q = Integer.valueOf(activity.getRequestedOrientation());
        }
        b bVar = this.f84119g;
        if (bVar == null || !bVar.a(activity, i10)) {
            activity.setRequestedOrientation(i10);
        }
    }

    private static void a(@NonNull WebView webView, boolean z10) {
        if (z10) {
            webView.stopLoading();
            webView.loadUrl("");
        }
        webView.onPause();
    }

    private static boolean a(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    @VisibleForTesting
    private boolean a(i iVar) {
        ActivityInfo activityInfo;
        if (iVar == i.NONE) {
            return true;
        }
        Activity activity = this.f84124l.get();
        if (activity == null) {
            return false;
        }
        try {
            activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return a(activityInfo.configChanges, 128) && a(activityInfo.configChanges, 1024);
    }

    private void l() {
        this.f84121i.a();
        this.f84120h = null;
    }

    private void m() {
        this.f84122j.a();
        this.f84128p = null;
    }

    @VisibleForTesting
    private void n() throws sg.bigo.ads.core.mraid.d {
        int iA;
        i iVar = this.f84133u;
        if (iVar != i.NONE) {
            iA = iVar.f84195d;
        } else {
            if (this.f84132t) {
                o();
                return;
            }
            Activity activity = this.f84124l.get();
            if (activity == null) {
                throw new sg.bigo.ads.core.mraid.d("Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
            }
            iA = sg.bigo.ads.common.aa.b.a(activity);
        }
        a(iA);
    }

    @VisibleForTesting
    private void o() {
        Integer num;
        j().setSystemUiVisibility(this.f84131s);
        Activity activity = this.f84124l.get();
        if (activity != null && (num = this.f84129q) != null) {
            b bVar = this.f84119g;
            if (bVar != null && bVar.b(activity, num.intValue())) {
                return;
            } else {
                activity.setRequestedOrientation(this.f84129q.intValue());
            }
        }
        this.f84129q = null;
    }

    private boolean p() {
        return !this.f84116d.f84066a.isVisible();
    }

    private void q() {
        if (this.f84137y != null) {
            this.f84113a.getContentResolver().unregisterContentObserver(this.f84137y);
            this.f84137y = null;
        }
    }

    @Override // sg.bigo.ads.common.d.b
    public final void a(Context context, Intent intent) {
        int rotation;
        if (!"android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) || (rotation = ((WindowManager) this.f84113a.getSystemService("window")).getDefaultDisplay().getRotation()) == this.C) {
            return;
        }
        this.C = rotation;
        a((Runnable) null);
    }

    public final void a(@Nullable final Runnable runnable) {
        this.f84126n.a();
        final c.C1051c c1051cB = b();
        if (c1051cB == null) {
            return;
        }
        C1052e c1052e = this.f84126n;
        C1052e.a aVar = new C1052e.a(c1052e.f84151a, new View[]{this.f84115c, c1051cB}, (byte) 0);
        c1052e.f84152b = aVar;
        aVar.f84155c = new Runnable() { // from class: sg.bigo.ads.core.mraid.e.6
            @Override // java.lang.Runnable
            public final void run() {
                DisplayMetrics displayMetrics = e.this.f84113a.getResources().getDisplayMetrics();
                j jVar = e.this.f84117e;
                jVar.f84196a.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                jVar.a(jVar.f84196a, jVar.f84197b);
                int[] iArr = new int[2];
                ViewGroup viewGroupI = e.this.i();
                viewGroupI.getLocationOnScreen(iArr);
                j jVar2 = e.this.f84117e;
                int i10 = iArr[0];
                int i11 = iArr[1];
                jVar2.f84198c.set(i10, i11, viewGroupI.getWidth() + i10, viewGroupI.getHeight() + i11);
                jVar2.a(jVar2.f84198c, jVar2.f84199d);
                e.this.f84115c.getLocationOnScreen(iArr);
                e eVar = e.this;
                j jVar3 = eVar.f84117e;
                int i12 = iArr[0];
                int i13 = iArr[1];
                jVar3.f84202g.set(i12, i13, eVar.f84115c.getWidth() + i12, e.this.f84115c.getHeight() + i13);
                jVar3.a(jVar3.f84202g, jVar3.f84203h);
                c1051cB.getLocationOnScreen(iArr);
                j jVar4 = e.this.f84117e;
                int i14 = iArr[0];
                int i15 = iArr[1];
                jVar4.f84200e.set(i14, i15, c1051cB.getWidth() + i14, c1051cB.getHeight() + i15);
                jVar4.a(jVar4.f84200e, jVar4.f84201f);
                e eVar2 = e.this;
                eVar2.f84121i.a(eVar2.f84117e);
                if (e.this.f84122j.c()) {
                    e eVar3 = e.this;
                    eVar3.f84122j.a(eVar3.f84117e);
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        aVar.f84156d = aVar.f84153a.length;
        aVar.f84154b.post(aVar.f84157e);
    }

    @VisibleForTesting
    public final void a(@NonNull String str) {
        MraidVideoActivity.a(this.f84113a, str);
    }

    @VisibleForTesting
    public final void a(@NonNull String str, @Nullable sg.bigo.ads.common.i iVar) {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if ("tel".equalsIgnoreCase(scheme) || "voicemail".equalsIgnoreCase(scheme) || "sms".equalsIgnoreCase(scheme) || "mailto".equalsIgnoreCase(scheme) || "geo".equalsIgnoreCase(scheme) || "google.streetview".equalsIgnoreCase(scheme)) {
            sg.bigo.ads.common.t.a.a(2, "MraidController", String.format("Uri scheme %s is not allowed.", uri.getScheme()));
            return;
        }
        b bVar = this.f84119g;
        if (bVar != null) {
            bVar.a(str, iVar);
        }
    }

    public final void a(@NonNull String str, @Nullable d dVar) {
        a(dVar);
        this.f84121i.a(str);
    }

    public final void a(@Nullable String str, boolean z10) throws sg.bigo.ads.core.mraid.d {
        sg.bigo.ads.core.mraid.a.a aVar;
        c.C1051c c1051c;
        if (this.f84120h == null) {
            throw new sg.bigo.ads.core.mraid.d("Unable to expand after the WebView is destroyed");
        }
        if (this.f84114b == n.INTERSTITIAL) {
            return;
        }
        o oVar = this.f84118f;
        o oVar2 = o.DEFAULT;
        if (oVar == oVar2 || oVar == o.RESIZED) {
            n();
            boolean z11 = str != null;
            if (z11) {
                c.C1051c c1051cA = sg.bigo.ads.core.mraid.c.a(this.f84113a);
                this.f84128p = c1051cA;
                if (c1051cA == null) {
                    return;
                }
                this.f84122j.a(c1051cA);
                this.f84122j.b(str);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            o oVar3 = this.f84118f;
            if (oVar3 == oVar2) {
                this.f84131s = j().getSystemUiVisibility();
                j().setSystemUiVisibility(this.f84130r);
                if (z11) {
                    aVar = this.f84116d;
                    c1051c = this.f84128p;
                } else {
                    this.f84123k.a();
                    this.f84115c.removeView(this.f84120h);
                    this.f84115c.setVisibility(4);
                    aVar = this.f84116d;
                    c1051c = this.f84120h;
                }
                aVar.addView(c1051c, layoutParams);
                j().addView(this.f84116d, new FrameLayout.LayoutParams(-1, -1));
            } else if (oVar3 == o.RESIZED && z11) {
                this.f84116d.removeView(this.f84120h);
                this.f84115c.addView(this.f84120h, layoutParams);
                this.f84115c.setVisibility(4);
                this.f84116d.addView(this.f84128p, layoutParams);
            }
            this.f84116d.setLayoutParams(layoutParams);
            b(z10);
            a(o.EXPANDED);
        }
    }

    public final void a(@Nullable d dVar) {
        c.C1051c c1051cA = sg.bigo.ads.core.mraid.c.a(this.f84113a);
        this.f84120h = c1051cA;
        if (c1051cA == null) {
            return;
        }
        if (dVar != null) {
            dVar.a();
        }
        this.f84121i.a(this.f84120h);
        this.f84115c.addView(this.f84120h, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(@NonNull o oVar) {
        sg.bigo.ads.common.t.a.a(0, 3, "MraidController", "MRAID state set to ".concat(String.valueOf(oVar)));
        o oVar2 = this.f84118f;
        this.f84118f = oVar;
        this.f84121i.a(oVar);
        sg.bigo.ads.core.mraid.c cVar = this.f84122j;
        if (cVar.f84096d) {
            cVar.a(oVar);
        }
        b bVar = this.f84119g;
        if (bVar != null) {
            o oVar3 = o.EXPANDED;
            if (oVar == oVar3) {
                bVar.d();
            } else if ((oVar2 == oVar3 && oVar == o.DEFAULT) || oVar == o.HIDDEN) {
                bVar.f();
            } else {
                o oVar4 = o.RESIZED;
                if ((oVar2 == oVar4 && oVar == o.DEFAULT) || oVar == oVar4) {
                    bVar.e();
                }
            }
        }
        a((Runnable) null);
    }

    public final void a(boolean z10) {
        this.f84135w = true;
        q();
        c.C1051c c1051c = this.f84120h;
        if (c1051c != null) {
            a(c1051c, z10);
        }
        c.C1051c c1051c2 = this.f84128p;
        if (c1051c2 != null) {
            a(c1051c2, z10);
        }
    }

    @VisibleForTesting
    public final void a(boolean z10, i iVar) throws sg.bigo.ads.core.mraid.d {
        if (!a(iVar)) {
            throw new sg.bigo.ads.core.mraid.d("Unable to force orientation to ".concat(String.valueOf(iVar)));
        }
        this.f84132t = z10;
        this.f84133u = iVar;
        if (this.f84118f == o.EXPANDED || (this.f84114b == n.INTERSTITIAL && !this.f84135w)) {
            n();
        }
    }

    @VisibleForTesting
    public final boolean a() {
        l lVar = this.f84127o;
        if (lVar != null) {
            return lVar.b();
        }
        return true;
    }

    @VisibleForTesting
    public final boolean a(@NonNull JsResult jsResult) {
        l lVar = this.f84127o;
        if (lVar != null) {
            return lVar.a();
        }
        jsResult.confirm();
        return true;
    }

    @Nullable
    public final c.C1051c b() {
        return this.f84122j.c() ? this.f84128p : this.f84120h;
    }

    @VisibleForTesting
    public final void b(boolean z10) {
        if (z10 == p()) {
            return;
        }
        this.f84116d.setCloseVisible(!z10);
    }

    @VisibleForTesting
    public final boolean c() {
        Activity activity = this.f84124l.get();
        if (activity == null || b() == null) {
            return false;
        }
        if (this.f84114b != n.INLINE) {
            return true;
        }
        return h.a(activity);
    }

    public final void d() {
        this.f84135w = false;
        k();
        c.C1051c c1051c = this.f84120h;
        if (c1051c != null) {
            c1051c.onResume();
        }
        c.C1051c c1051c2 = this.f84128p;
        if (c1051c2 != null) {
            c1051c2.onResume();
        }
    }

    public final void e() {
        this.f84126n.a();
        try {
            sg.bigo.ads.common.d.a.a().a(this);
        } catch (IllegalArgumentException e10) {
            if (!e10.getMessage().contains("Receiver not registered")) {
                throw e10;
            }
        }
        if (!this.f84135w) {
            a(true);
        }
        u.b(this.f84116d);
        l();
        m();
        o();
        q();
        this.f84125m = null;
        u.b(this.f84115c);
        u.b(this.f84116d);
        this.f84136x = true;
    }

    public final void f() {
        b bVar;
        if (this.f84114b != n.INTERSTITIAL || (bVar = this.f84119g) == null) {
            return;
        }
        bVar.g();
    }

    @VisibleForTesting
    public final void g() {
        o oVar;
        o oVar2;
        ViewGroup.LayoutParams layoutParams;
        c.C1051c c1051c;
        if (this.f84120h == null || (oVar = this.f84118f) == o.LOADING || oVar == (oVar2 = o.HIDDEN)) {
            return;
        }
        o oVar3 = o.EXPANDED;
        if (oVar == oVar3 || this.f84114b == n.INTERSTITIAL) {
            o();
        }
        o oVar4 = this.f84118f;
        if (oVar4 != o.RESIZED && oVar4 != oVar3) {
            if (oVar4 == o.DEFAULT) {
                this.f84115c.setVisibility(4);
                a(oVar2);
                return;
            }
            return;
        }
        if (!this.f84122j.c() || (c1051c = this.f84128p) == null) {
            this.f84116d.removeView(this.f84120h);
            this.f84115c.addView(this.f84120h, new FrameLayout.LayoutParams(-1, -1));
            this.f84115c.setVisibility(0);
        } else {
            m();
            this.f84116d.removeView(c1051c);
        }
        c cVar = this.f84123k;
        c.C1051c c1051c2 = e.this.f84120h;
        if (c1051c2 != null && cVar.f84148a > 0 && cVar.f84149b > 0 && (layoutParams = c1051c2.getLayoutParams()) != null) {
            layoutParams.width = cVar.f84148a;
            layoutParams.height = cVar.f84149b;
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            }
            e.this.f84120h.setLayoutParams(layoutParams);
        }
        u.b(this.f84116d);
        a(o.DEFAULT);
    }

    @VisibleForTesting
    public final void h() {
        b bVar = this.f84119g;
        if (bVar != null) {
            bVar.c();
        }
    }

    @NonNull
    public final ViewGroup i() {
        ViewGroup viewGroup = this.f84125m;
        if (viewGroup != null) {
            return viewGroup;
        }
        View viewA = u.a(this.f84124l.get(), this.f84115c);
        return viewA instanceof ViewGroup ? (ViewGroup) viewA : this.f84115c;
    }

    @NonNull
    public final ViewGroup j() {
        if (this.f84125m == null) {
            this.f84125m = i();
        }
        return this.f84125m;
    }

    public final void k() {
        o oVar;
        if (this.f84136x || (oVar = this.f84118f) == o.LOADING || oVar == o.HIDDEN || this.f84120h == null) {
            return;
        }
        Context context = this.f84113a;
        if (this.f84137y != null) {
            q();
        }
        this.f84137y = new sg.bigo.ads.core.mraid.a(this.f84138z, context.getApplicationContext(), new a.InterfaceC1049a() { // from class: sg.bigo.ads.core.mraid.e.7
            @Override // sg.bigo.ads.core.mraid.a.InterfaceC1049a
            public final void a(float f10) {
                e.this.f84121i.c("mraidbridge.notifyAudioVolumeChangeEvent(" + f10 + ");");
            }
        });
        context.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f84137y);
    }
}
