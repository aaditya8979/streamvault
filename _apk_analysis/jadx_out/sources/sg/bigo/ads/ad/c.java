package sg.bigo.ads.ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import sg.bigo.ads.ad.a;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.common.f.b;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;
import sg.bigo.ads.controller.landing.a;
import sg.bigo.ads.core.e.a.e;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c<T extends Ad, U extends sg.bigo.ads.api.core.b> extends sg.bigo.ads.api.b.a<T, U> implements b.a {
    private boolean A;
    private long B;
    private AdBid C;
    private final Set<String> D;
    private final Set<String> E;
    private final Map<String, Object> F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public AdInteractionListener f80020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public f f80021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public View f80022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.core.e.a.b f80023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f80024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f80025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f80026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f80027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f80028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f80029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f80030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f80031l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public sg.bigo.ads.controller.landing.a f80032m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f80033n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f80034o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f80035p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f80036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public sg.bigo.ads.controller.landing.c f80037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f80038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f80039t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f80040u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f80041v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public WeakReference<a> f80042w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f80043x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f80044y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f80045z;

    public interface a {
        LandingPageStyleConfig a(Context context, String str, int i10, boolean z10);

        boolean f_();
    }

    public c(@NonNull f fVar) {
        super(fVar.f81862c);
        this.f80024e = false;
        this.f80044y = false;
        this.f80025f = false;
        this.f80045z = false;
        this.f80026g = false;
        this.A = false;
        this.f80027h = false;
        this.f80028i = false;
        this.f80029j = false;
        this.D = new HashSet();
        this.E = new HashSet();
        this.f80036q = false;
        this.f80039t = -1;
        this.f80040u = 0L;
        this.f80041v = 0L;
        this.F = new HashMap();
        this.f80043x = true;
        this.f80021b = fVar;
        A();
        B();
        this.Y = new sg.bigo.ads.common.v.a();
    }

    private void A() {
        sg.bigo.ads.api.core.b bVar = this.f80021b.f81860a;
        q qVarM = i.f81802a.m();
        b.f[] fVarArrC = bVar.C();
        e[] eVarArr = new e[0];
        if (fVarArrC != null && fVarArrC.length > 0) {
            eVarArr = new e[fVarArrC.length];
            for (int i10 = 0; i10 < fVarArrC.length; i10++) {
                eVarArr[i10] = new e(fVarArrC[i10].a(), this.f80021b.f81863d);
            }
        }
        b.f[] fVarArrD = bVar.D();
        e[] eVarArr2 = new e[0];
        if (fVarArrD != null && fVarArrD.length > 0) {
            eVarArr2 = new e[fVarArrD.length];
            for (int i11 = 0; i11 < fVarArrD.length; i11++) {
                eVarArr2[i11] = new e(fVarArrD[i11].a(), this.f80021b.f81863d);
            }
        }
        b.f[] fVarArrE = bVar.E();
        e[] eVarArr3 = new e[0];
        if (fVarArrE != null && fVarArrE.length > 0) {
            eVarArr3 = new e[fVarArrE.length];
            for (int i12 = 0; i12 < fVarArrE.length; i12++) {
                eVarArr3[i12] = new e(fVarArrE[i12].a(), this.f80021b.f81863d);
            }
        }
        b.f[] fVarArrF = bVar.F();
        e[] eVarArr4 = new e[0];
        if (fVarArrF != null && fVarArrF.length > 0) {
            eVarArr4 = new e[fVarArrF.length];
            for (int i13 = 0; i13 < fVarArrF.length; i13++) {
                eVarArr4[i13] = new e(fVarArrF[i13].a(), this.f80021b.f81863d);
            }
        }
        sg.bigo.ads.core.e.a.b bVarA = a(qVarM, eVarArr, eVarArr2, eVarArr3, eVarArr4);
        this.f80023d = bVarA;
        bVarA.b("express_id", bVar.ab());
    }

    private void B() {
        this.f80024e = false;
        this.f80044y = false;
        this.f80025f = false;
        this.f80045z = false;
        this.f80026g = false;
        this.A = false;
        this.f80027h = false;
        this.f80028i = false;
        this.f80030k = 0L;
        this.f80031l = 0L;
        this.C = null;
        this.f80029j = false;
        this.f81825ab = 0;
    }

    private int C() {
        b.a aVarO = this.f80021b.f81860a.O();
        if (aVarO != null) {
            return aVarO.a();
        }
        return 0;
    }

    private long D() {
        if (this.f80021b.f81860a.O() != null) {
            return r0.b();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        try {
            sg.bigo.ads.controller.landing.a aVar = this.f80032m;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(c cVar) {
        return cVar == null || cVar.f80028i;
    }

    private void d(String str) {
        if (this.D.contains(str)) {
            sg.bigo.ads.common.t.a.a(0, 3, VastTagName.AD, "ignore callback action, action = ".concat(String.valueOf(str)));
            return;
        }
        sg.bigo.ads.api.core.b bVarF = f();
        Map<String, Object> mapA = sg.bigo.ads.core.b.a.a(str, this.f80021b.f81861b, this.X, bVarF, Integer.valueOf(bVarF.aj()), null, null, this);
        str.hashCode();
        if (str.equals("impression") || str.equals("clicked")) {
            mapA.put("ad_size", j());
            mapA.put("show_proportion", b("show_proportion", ""));
            mapA.put("render_style", b("render_style", 0));
        }
        sg.bigo.ads.core.b.b.a().a(str, mapA);
    }

    @NonNull
    public sg.bigo.ads.core.e.a.b a(q qVar, e[] eVarArr, e[] eVarArr2, e[] eVarArr3, e[] eVarArr4) {
        return new sg.bigo.ads.core.e.a.b(qVar, eVarArr, eVarArr2, eVarArr3, eVarArr4, sg.bigo.ads.core.d.b.c(this.f80021b.f81860a, this));
    }

    public void a() {
        A();
        B();
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(int i10, int i11, String str) {
        if (this.f80025f) {
            return;
        }
        this.f80025f = true;
        this.f80021b.f81862c.f81810h.b();
        if (!this.f80021b.f81860a.ah() && a("06002008")) {
            sg.bigo.ads.core.d.b.a(this, i10, i11, str);
        }
    }

    public final void a(int i10, int i11, String str, boolean z10) {
        sg.bigo.ads.core.d.b.a(this.f80021b.f81860a, new AdError(i10, i11, str), p(), z10);
    }

    public final void a(int i10, String str) {
        b(i10, 0, str);
    }

    @Override // sg.bigo.ads.common.f.b.a
    public final void a(Activity activity) {
        Intent intent;
        if (activity != null && (activity instanceof AdActivity) && (intent = activity.getIntent()) != null && intent.getIntExtra("ad_identifier", -1) == hashCode() && intent.getBooleanExtra("create_error_flag", false)) {
            String stringExtra = intent.getStringExtra("create_error_msg");
            b(2005, 0, "Activity create error");
            sg.bigo.ads.core.d.b.a(f(), 3000, 10117, stringExtra);
        }
    }

    @CallSuper
    public void a(@Nullable Point point, int i10, int i11, @NonNull sg.bigo.ads.api.core.d dVar) {
        int i12;
        int i13;
        int width;
        int height;
        sg.bigo.ads.api.core.b bVar;
        o();
        this.f80023d.b("action_type", String.valueOf(dVar.f81843a));
        sg.bigo.ads.core.e.a.b bVar2 = this.f80023d;
        boolean zA = false;
        if (point != null) {
            i13 = point.x;
            i12 = point.y;
        } else {
            i12 = 0;
            i13 = 0;
        }
        View view = this.f80022c;
        if (view != null) {
            width = view.getWidth();
            height = this.f80022c.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        bVar2.b("click_prop", sg.bigo.ads.common.utils.q.e(sg.bigo.ads.common.utils.q.a("{'x':%d,'y':%d,'ad_w':%d,'ad_h':%d,'x_r':%s,'y_r':%s,'mode':'%s'}", Integer.valueOf(i13), Integer.valueOf(i12), Integer.valueOf(width), Integer.valueOf(height), Float.valueOf(width > 0 ? new BigDecimal(i13 / width).setScale(3, 4).floatValue() : 0.0f), Float.valueOf(height > 0 ? new BigDecimal(i12 / height).setScale(3, 4).floatValue() : 0.0f), (i11 == 1 || i11 == 2) ? "direct" : i11 == 3 ? "confirm" : "unknown")));
        this.f80023d.b("click_source", String.valueOf(i11));
        this.f80023d.b("click_module", String.valueOf(i10));
        int i14 = dVar.f81843a;
        int i15 = 4;
        if (i14 != 1) {
            if (i14 == 4) {
                bVar = this.f80021b.f81860a;
                i15 = 8;
            }
            final boolean z10 = zA;
            final sg.bigo.ads.core.e.a.b bVar3 = this.f80023d;
            final Context context = this.f80021b.f81864e;
            final int iK = k();
            final int i16 = i();
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f83754a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f83755b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f83756c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f83757d;

                public AnonymousClass1(final Context context2, final boolean z102, final int iK2, final int i162) {
                    context = context2;
                    z = z102;
                    i = iK2;
                    i = i162;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(context, z, i, i);
                }
            });
            sg.bigo.ads.core.d.b.a(this.f80021b.f81860a, 1, dVar, this);
        }
        bVar = this.f80021b.f81860a;
        zA = bVar.a(i15);
        final boolean z102 = zA;
        final sg.bigo.ads.core.e.a.b bVar32 = this.f80023d;
        final Context context2 = this.f80021b.f81864e;
        final int iK2 = k();
        final int i162 = i();
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f83754a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f83755b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f83756c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f83757d;

            public AnonymousClass1(final Context context22, final boolean z1022, final int iK22, final int i1622) {
                context = context22;
                z = z1022;
                i = iK22;
                i = i1622;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.this.a(context, z, i, i);
            }
        });
        sg.bigo.ads.core.d.b.a(this.f80021b.f81860a, 1, dVar, this);
    }

    public final synchronized void a(String str, Object obj) {
        this.F.put(str, obj);
    }

    public void a(sg.bigo.ads.api.b.a aVar) {
        this.f81824aa = aVar;
        if (aVar != null) {
            HashMap map = new HashMap();
            sg.bigo.ads.core.d.b.a((Map<String, String>) map, (sg.bigo.ads.api.b.a) this, false);
            this.f80023d.a(map);
        }
    }

    @CallSuper
    public void a(@NonNull d.a<T> aVar) {
    }

    public final void a(@Nullable sg.bigo.ads.common.i iVar, int i10, int i11, @NonNull sg.bigo.ads.api.core.d dVar) {
        String str;
        if (isExpired()) {
            str = "The ad is expired";
        } else {
            boolean z10 = (i11 == 13 || i11 == 14) && (this instanceof sg.bigo.ads.api.b.f);
            if (!this.f80028i || z10) {
                if (C() != 2 || (p() && SystemClock.elapsedRealtime() - this.f80030k >= D())) {
                    b(iVar, i10, i11, dVar);
                    return;
                }
                return;
            }
            str = "The ad is destroyed";
        }
        a(2000, 3, str, false);
    }

    public final void a(@Nullable sg.bigo.ads.common.i iVar, @NonNull sg.bigo.ads.api.core.d dVar) {
        a(iVar, 0, 1, dVar);
    }

    public void a(sg.bigo.ads.controller.landing.c cVar) {
        this.f80037r = cVar;
    }

    public final boolean a(String str) {
        return !this.E.contains(str);
    }

    public void a_() {
        if (isExpired() || this.f80028i) {
            b(2000, 2, this.f80028i ? "The ad is destroyed" : "The ad is expired");
            return;
        }
        if (this.A) {
            return;
        }
        this.A = true;
        this.f80030k = SystemClock.elapsedRealtime();
        h();
        AdInteractionListener adInteractionListener = this.f80020a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdImpression();
        }
    }

    @NonNull
    public <ValueType> ValueType b(String str, ValueType valuetype) {
        ValueType valuetype2 = (ValueType) this.F.get(str);
        return valuetype2 != null ? valuetype2 : valuetype;
    }

    @Override // sg.bigo.ads.api.b.a
    public final void b() {
        if (this.f80044y) {
            return;
        }
        this.f80044y = true;
        this.f80021b.f81862c.f81810h.b();
        if (a("06002008")) {
            sg.bigo.ads.core.d.b.a(this, ((Boolean) b("is_cache", Boolean.FALSE)).booleanValue());
        }
    }

    public final void b(int i10, int i11, String str) {
        AdError adError = new AdError(i10, i11, str);
        a(i10, i11, str, true);
        AdInteractionListener adInteractionListener = this.f80020a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdError(adError);
        }
    }

    public final void b(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        this.D.add(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(@Nullable sg.bigo.ads.common.i iVar, int i10, int i11, @NonNull sg.bigo.ads.api.core.d dVar) {
        String str;
        this.f80035p = i10;
        boolean z10 = (i11 == 13 || i11 == 14) && (this instanceof sg.bigo.ads.api.b.f);
        if (!this.f80026g) {
            if (!this.f80028i || z10) {
                this.f80026g = true;
                a(iVar != null ? iVar.f82224b : null, i10, i11, dVar);
            }
        }
        long jElapsedRealtime = this.f80030k > 0 ? SystemClock.elapsedRealtime() - this.f80030k : 0L;
        String str2 = "";
        if (iVar == null || iVar.f82224b == null) {
            str = "";
        } else {
            str = iVar.f82224b.x + StringUtils.COMMA + iVar.f82224b.y;
        }
        if (iVar != null && iVar.f82223a != null) {
            str2 = iVar.f82223a.x + StringUtils.COMMA + iVar.f82223a.y;
        }
        if (a("06002011")) {
            String strA = !TextUtils.isEmpty(dVar.f81849g) ? dVar.f81849g : f().N().a();
            f fVar = this.f80021b;
            Context context = fVar.f81864e;
            sg.bigo.ads.api.core.b bVar = fVar.f81860a;
            String strJ = j();
            int i12 = dVar.f81843a;
            int i13 = dVar.f81853k;
            int i14 = this.f80033n + 1;
            this.f80033n = i14;
            int i15 = 1 + this.f80034o;
            this.f80034o = i15;
            sg.bigo.ads.core.d.b.a(context, bVar, strJ, str, str2, i10, i11, i12, i13, jElapsedRealtime, i14, i15, this, strA);
        }
        AdInteractionListener adInteractionListener = this.f80020a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClicked();
        }
        if (z10) {
            ((sg.bigo.ads.api.b.f) this).h_();
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void c() {
        if (this.f80024e) {
            return;
        }
        this.f80024e = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f80031l = jElapsedRealtime;
        sg.bigo.ads.api.b.a aVar = this.f81824aa;
        if (aVar instanceof c) {
            ((c) aVar).f80031l = jElapsedRealtime;
        }
        if (this.f80021b.f81860a.ah()) {
            return;
        }
        d("filled");
        if (this.f80021b.f81860a.N().k() == 1) {
            u();
        }
        if (this.f80021b.f81860a.N().c() == 2) {
            sg.bigo.ads.a.c.a(this.f80021b.f81864e);
        }
        sg.bigo.ads.common.f.b.a(this);
    }

    public final void c(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        this.E.add(str);
    }

    @Override // sg.bigo.ads.api.b.a
    public final String d() {
        return f().H();
    }

    @Override // sg.bigo.ads.api.Ad
    @CallSuper
    public final void destroy() {
        this.f80028i = true;
        if (sg.bigo.ads.common.n.d.b()) {
            F();
            destroyInMainThread();
        } else {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.F();
                    c.this.destroyInMainThread();
                }
            });
        }
        if (this.f80029j) {
            sg.bigo.ads.common.form.a.a(f().hashCode(), 4);
        }
        sg.bigo.ads.common.form.a.b(f().hashCode());
        setAdInteractionListener(null);
        sg.bigo.ads.common.f.b.b(this);
    }

    @MainThread
    public void destroyInMainThread() {
    }

    @Override // sg.bigo.ads.api.b.a
    public final long e() {
        return f().a();
    }

    @Override // sg.bigo.ads.api.b.a
    @NonNull
    public U f() {
        return (U) this.f80021b.f81860a;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public AdBid getBid() {
        if (this.C == null) {
            f fVar = this.f80021b;
            sg.bigo.ads.api.core.b bVar = fVar.f81860a;
            this.C = bVar.ak() ? new a.C0958a(fVar, bVar, this.f80023d) : null;
        }
        return this.C;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public String getExtraInfo(String str) {
        f fVar = this.f80021b;
        sg.bigo.ads.api.core.b bVar = fVar != null ? fVar.f81860a : null;
        return bVar != null ? bVar.b(str) : "";
    }

    public void h() {
        int i10;
        n();
        int i11 = this.Z;
        int i12 = sg.bigo.ads.common.v.a.f82535e;
        if (i11 != i12) {
            sg.bigo.ads.common.v.a aVar = this.Y;
            View view = this.f80022c;
            if (aVar.f82537g == i12) {
                sg.bigo.ads.common.t.a.a(0, 4, "OutAppChecker", "Out app status: 4 - start activity from background");
                i10 = sg.bigo.ads.common.v.a.f82535e;
            } else if (sg.bigo.ads.common.v.a.a(view)) {
                sg.bigo.ads.common.t.a.a(0, 4, "OutAppChecker", "Out app status: 5 - Lock screen");
                i10 = sg.bigo.ads.common.v.a.f82536f;
            } else if (sg.bigo.ads.common.v.a.b(view)) {
                sg.bigo.ads.common.t.a.a(0, 4, "OutAppChecker", "Out app status: 3 - Float window");
                i10 = sg.bigo.ads.common.v.a.f82534d;
            } else {
                sg.bigo.ads.common.t.a.a(0, 4, "OutAppChecker", "Out app status: 1 - not outside app");
                i10 = sg.bigo.ads.common.v.a.f82532b;
            }
            this.Z = i10;
        }
        this.f80023d.a(this.Z);
        this.f80023d.a(this.f80021b.f81864e, i());
        if (a("06002010")) {
            sg.bigo.ads.core.d.b.a(this.f80021b.f81864e, this, (String) b("show_proportion", ""), j(), ((Integer) b("render_style", 0)).intValue(), w(), ((Long) b("attach_render_cost", -1L)).longValue(), SystemClock.elapsedRealtime() - this.f80031l, ((Integer) b("icon_sta", -1)).intValue(), ((Integer) b("img_sta", -1)).intValue(), ((Integer) b("vid_sta", -1)).intValue());
        }
        if (this.f80021b.f81860a.N().k() == 0) {
            u();
        }
    }

    public int i() {
        return 0;
    }

    @Override // sg.bigo.ads.api.Ad
    public boolean isExpired() {
        return this.f80021b.f81860a.J();
    }

    public String j() {
        if (this.f80022c == null) {
            return "";
        }
        return this.f80022c.getWidth() + VastAttributes.HORIZONTAL_POSITION + this.f80022c.getHeight();
    }

    public int k() {
        return 0;
    }

    public final void l() {
        AdInteractionListener adInteractionListener = this.f80020a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdOpened();
        }
    }

    @CallSuper
    public void m() {
        AdInteractionListener adInteractionListener = this.f80020a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClosed();
        }
        this.f80027h = true;
    }

    public void n() {
        d("impression");
    }

    public void o() {
        d("clicked");
    }

    public boolean p() {
        return this.A;
    }

    public final int q() {
        return this.f80021b.f81861b.b();
    }

    public final int r() {
        return this.f80021b.f81860a.w();
    }

    public final int s() {
        if (this.f80041v != f().y()) {
            return -1;
        }
        return this.f80039t;
    }

    @Override // sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    @CallSuper
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        this.f80020a = adInteractionListener;
    }

    public final long t() {
        if (this.f80041v != f().y()) {
            return 0L;
        }
        return this.f80040u;
    }

    public void u() {
        if (this.f80021b.f81860a.N().f() > 0) {
            final sg.bigo.ads.controller.landing.a aVar = new sg.bigo.ads.controller.landing.a(this.f80021b.f81860a);
            this.f80032m = aVar;
            final Context context = this.f80021b.f81864e;
            final String strA = aVar.f83425b.a();
            final String strJ = aVar.f83425b.j();
            final int iC = aVar.f83425b.c();
            int i10 = aVar.f83426c;
            if (((i10 == 4 || i10 == 5) && TextUtils.isEmpty(strJ)) || sg.bigo.ads.core.landing.a.a(strA) || TextUtils.isEmpty(strA) || !strA.startsWith("http")) {
                return;
            }
            if (iC == 0 || iC == 2) {
                final a.InterfaceC1039a interfaceC1039a = new a.InterfaceC1039a() { // from class: sg.bigo.ads.controller.landing.a.3
                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC1039a
                    public final void a(String str) {
                        sg.bigo.ads.common.t.a.a(0, 3, "Preload", "preloadWebView onStart preloadType = " + a.this.f83426c + ", url = " + str);
                    }

                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC1039a
                    public final void a(String str, long j10, boolean z10, int i11) {
                        a.this.f83427d = z10;
                        HashMap map = new HashMap();
                        map.put("land_way", String.valueOf(i11));
                        sg.bigo.ads.core.d.b.a(a.this.f83424a, "preload_cost", j10, z10 ? 1 : 0, map);
                        sg.bigo.ads.common.t.a.a(0, 3, "Preload", "preload landing page onComplete preloadType=" + a.this.f83426c + ", success = " + z10 + ", cost = " + j10 + ", url = " + str);
                        if (z10) {
                            return;
                        }
                        a.this.a();
                    }
                };
                sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.controller.landing.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        a aVar2 = a.this;
                        int i11 = aVar2.f83426c;
                        if (i11 != 1) {
                            if (i11 == 4 || i11 == 5) {
                                a.a(aVar2, context, strJ, iC, interfaceC1039a);
                                return;
                            }
                            return;
                        }
                        Uri uri = Uri.parse(strA);
                        a.a(a.this, context, uri.getScheme() + "://" + uri.getHost(), iC, interfaceC1039a);
                    }
                });
            }
        }
    }

    public final void v() {
        if (this.f80045z) {
            return;
        }
        this.f80045z = true;
        this.B = SystemClock.elapsedRealtime();
    }

    public final long w() {
        if (this.B == 0) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - this.B;
    }

    public final boolean x() {
        WeakReference<a> weakReference = this.f80042w;
        return (weakReference == null || weakReference.get() == null || !this.f80042w.get().f_()) ? false : true;
    }

    public sg.bigo.ads.controller.landing.c y() {
        return this.f80037r;
    }
}
