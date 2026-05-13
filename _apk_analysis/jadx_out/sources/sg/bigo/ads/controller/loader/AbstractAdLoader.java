package sg.bigo.ads.controller.loader;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CallSuper;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.ad.b;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.core.e;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.controller.e.a;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractAdLoader<U extends Ad, T extends sg.bigo.ads.api.b> implements AdLoader<T>, d.a<U> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Long> f83507a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, List<a>> f83508b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final e<U> f83509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f83510d;

    public abstract class a implements sg.bigo.ads.controller.d<U> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public sg.bigo.ads.api.core.b[] f83556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public sg.bigo.ads.api.core.b[] f83557f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f83559h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public a.C1035a<sg.bigo.ads.api.b> f83561j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public sg.bigo.ads.api.b f83562k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AbstractAdLoader f83563l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f83554c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f83555d = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f83558g = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f83553a = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Runnable f83564m = new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.a.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The request is timeout.");
                a aVar = a.this;
                a.C1035a<sg.bigo.ads.api.b> c1035a = aVar.f83561j;
                if (c1035a == null || aVar.f83558g) {
                    return;
                }
                aVar.f83554c = true;
                c1035a.f83278c = true;
                if (c1035a.f83281f == 0) {
                    c1035a.f83281f = c1035a.f83280e;
                }
                if (k.a(aVar.f83556e)) {
                    a aVar2 = a.this;
                    sg.bigo.ads.controller.loader.a.a(aVar2.f83556e, aVar2.f83561j.f83281f);
                    a aVar3 = a.this;
                    int i10 = aVar3.f83554c ? 2 : aVar3.f83555d ? 4 : 1;
                    a.C1035a<sg.bigo.ads.api.b> c1035a2 = aVar3.f83561j;
                    sg.bigo.ads.controller.loader.a.a(aVar3.f83556e, i10, c1035a2 == null ? 1 : c1035a2.f83281f, true);
                }
                AbstractAdLoader<U, T>.a aVar4 = a.this;
                AbstractAdLoader.this.a(aVar4, 1011, 10206, "Ad request is timeout due to bad network.", new Pair<>(aVar4.f83561j.f83276a, null));
            }
        };

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f83560i = SystemClock.elapsedRealtime();

        public a(AbstractAdLoader abstractAdLoader, sg.bigo.ads.api.b bVar, String str) {
            this.f83559h = str;
            this.f83563l = abstractAdLoader;
            this.f83562k = bVar;
        }

        public final void a() {
            sg.bigo.ads.common.n.d.a(this.f83564m);
            if (this.f83553a) {
                return;
            }
            this.f83553a = true;
            StringBuilder sb2 = new StringBuilder("Remove timeout task for session id: ");
            a.C1035a<sg.bigo.ads.api.b> c1035a = this.f83561j;
            sb2.append(c1035a == null ? "unknown" : c1035a.f83276a.f81810h.f81812b);
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", sb2.toString());
        }

        public final String b() {
            a.C1035a<sg.bigo.ads.api.b> c1035a = this.f83561j;
            String str = c1035a == null ? null : c1035a.f83276a.f81803a;
            return TextUtils.isEmpty(str) ? this.f83559h : str;
        }
    }

    public interface b<U extends Ad, T extends sg.bigo.ads.api.b> extends d.a<U> {
        AbstractAdLoader<U, T> a();
    }

    public AbstractAdLoader(AdLoadListener<U> adLoadListener, String str) {
        if (adLoadListener == null) {
            this.f83509c = new e<>();
        } else {
            this.f83509c = new e<>(adLoadListener);
        }
        this.f83510d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, AbstractAdLoader<U, T>.a aVar, U u10, int i10, int i11, String str2) {
        if (!TextUtils.isEmpty(str)) {
            f83507a.remove(str);
        }
        aVar.a();
        aVar.f83558g = true;
        b(aVar.b(), aVar);
        if (aVar.f83554c || aVar.f83555d) {
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The error ad has been timeout or assign");
        } else {
            a(str, aVar, sg.bigo.ads.controller.loader.a.a(u10), 0, i10, i11, str2, false, u10);
            a(u10, i10, i11, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final AbstractAdLoader<U, T>.a aVar, final sg.bigo.ads.api.core.b[] bVarArr, final int i10, final int i11, final int i12, final String str2, final boolean z10, final Ad ad2) {
        final boolean z11;
        final String strD;
        h hVar;
        final String strB = TextUtils.isEmpty(str) ? aVar.b() : str;
        if (TextUtils.isEmpty(strB) || (hVar = i.f81802a) == null) {
            z11 = false;
            strD = null;
        } else {
            sg.bigo.ads.api.a.b bVarQ = hVar.q();
            boolean zC = bVarQ.c(strB);
            strD = bVarQ.d(strB);
            z11 = zC;
        }
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.7
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:100:0x013c  */
            /* JADX WARN: Removed duplicated region for block: B:103:0x014a  */
            /* JADX WARN: Removed duplicated region for block: B:106:0x014e  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x016b  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x0175  */
            /* JADX WARN: Removed duplicated region for block: B:119:0x0179  */
            /* JADX WARN: Removed duplicated region for block: B:122:0x017f  */
            /* JADX WARN: Removed duplicated region for block: B:123:0x0184  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x00da  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0115  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x011d  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x012d  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x0136  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 412
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.loader.AbstractAdLoader.AnonymousClass7.run():void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Ad ad2, boolean z10) {
        boolean z11 = ad2 instanceof sg.bigo.ads.api.b.a;
        if (z11) {
            ((sg.bigo.ads.api.b.a) ad2).b();
        }
        if (z10) {
            if (z11) {
                ((sg.bigo.ads.api.b.a) ad2).c();
            }
            this.f83509c.onAdLoaded(ad2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final l lVar, final String str, @NonNull final AbstractAdLoader<U, T>.a aVar, final Ad ad2) {
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.4
            @Override // java.lang.Runnable
            public final void run() {
                if (aVar.f83554c) {
                    b.a.f79836a.a(lVar, ad2);
                    a.C1035a<sg.bigo.ads.api.b> c1035a = aVar.f83561j;
                    sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The request has been timeout before get ad from cache for session id: " + (c1035a == null ? "unknown" : c1035a.f83276a.f81810h.f81812b) + ", ad: " + String.valueOf(ad2));
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    AbstractAdLoader.f83507a.remove(str);
                }
                a.C1035a<sg.bigo.ads.api.b> c1035a2 = aVar.f83561j;
                sg.bigo.ads.controller.loader.a.a(ad2, c1035a2 == null ? "0" : c1035a2.f83276a.f81810h.f81812b);
                a aVar2 = aVar;
                a.C1035a<sg.bigo.ads.api.b> c1035a3 = aVar2.f83561j;
                if (c1035a3 != null) {
                    c1035a3.f83279d = true;
                    if (c1035a3.f83281f == 0) {
                        c1035a3.f83281f = c1035a3.f83280e;
                    }
                }
                aVar2.f83558g = true;
                AbstractAdLoader.b(str, aVar2);
                aVar.a();
                aVar.f83555d = true;
                sg.bigo.ads.api.core.b[] bVarArrA = sg.bigo.ads.controller.loader.a.a(ad2);
                a aVar3 = aVar;
                aVar3.f83557f = bVarArrA;
                a.C1035a<sg.bigo.ads.api.b> c1035a4 = aVar3.f83561j;
                sg.bigo.ads.controller.loader.a.a(bVarArrA, 4, c1035a4 == null ? 1 : c1035a4.f83281f, true);
                AbstractAdLoader.this.a(str, aVar, bVarArrA, 1, 0, 0, null, true, ad2);
                sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        aVar.f83563l.a(ad2, true);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(T r11) {
        /*
            r10 = this;
            r0 = 0
            r11.f81805c = r0
            java.lang.String r1 = r10.f83510d
            r11.a(r1)
            java.lang.String r1 = r11.f81803a
            sg.bigo.ads.controller.loader.AbstractAdLoader$1 r8 = new sg.bigo.ads.controller.loader.AbstractAdLoader$1
            r2 = r8
            r3 = r10
            r4 = r10
            r5 = r11
            r6 = r1
            r7 = r1
            r2.<init>(r4, r5, r6)
            boolean r2 = a(r1)
            if (r2 == 0) goto L2d
            r4 = 1012(0x3f4, float:1.418E-42)
            r5 = 10213(0x27e5, float:1.4311E-41)
            android.util.Pair r7 = new android.util.Pair
            r0 = 0
            r7.<init>(r11, r0)
            java.lang.String r6 = "The ad is loading"
            r2 = r10
            r3 = r8
            r2.a(r3, r4, r5, r6, r7)
            return
        L2d:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L40
            java.util.Map<java.lang.String, java.lang.Long> r2 = sg.bigo.ads.controller.loader.AbstractAdLoader.f83507a
            long r3 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.put(r1, r3)
        L40:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 3
            java.lang.String r4 = "AbstractAdLoader"
            r5 = -1
            if (r2 != 0) goto L78
            sg.bigo.ads.api.a.h r2 = sg.bigo.ads.api.a.i.f81802a
            if (r2 == 0) goto L78
            sg.bigo.ads.api.a.b r2 = r2.q()
            boolean r7 = r2.b(r1)
            if (r7 == 0) goto L78
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<sg.bigo.ads.controller.loader.AbstractAdLoader$a>> r7 = sg.bigo.ads.controller.loader.AbstractAdLoader.f83508b
            java.lang.Object r9 = r7.get(r1)
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L6b
            java.util.concurrent.CopyOnWriteArrayList r9 = new java.util.concurrent.CopyOnWriteArrayList
            r9.<init>()
            r7.put(r1, r9)
        L6b:
            r9.add(r0, r8)
            long r1 = r2.e(r1)
            java.lang.String r7 = "Prepare for ad load, the tmax switch is on."
            sg.bigo.ads.common.t.a.a(r0, r3, r4, r7)
            goto L79
        L78:
            r1 = r5
        L79:
            sg.bigo.ads.controller.e.a$a r11 = sg.bigo.ads.BigoAdSdk.a(r11, r8)
            if (r11 == 0) goto L9e
            r8.f83561j = r11
            int r11 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r11 <= 0) goto L9e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r5 = "Start timeout task for "
            r11.<init>(r5)
            r11.append(r1)
            java.lang.String r5 = "s"
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            sg.bigo.ads.common.t.a.a(r0, r3, r4, r11)
            a(r8, r1)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.loader.AbstractAdLoader.a(sg.bigo.ads.api.b):void");
    }

    private static void a(AbstractAdLoader<U, T>.a aVar, long j10) {
        sg.bigo.ads.common.n.d.a(3, aVar.f83564m, j10 * 1000);
    }

    private static boolean a(String str) {
        h hVar;
        if (!TextUtils.isEmpty(str) && (hVar = i.f81802a) != null && hVar.q().i(str)) {
            long j10 = i.f81802a.q().j(str);
            if (j10 < 0) {
                return false;
            }
            if (j10 == 0 && f83507a.containsKey(str)) {
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The slot request stop due to single ad mode.");
                return true;
            }
            long j11 = j10 * 1000;
            Long l10 = f83507a.get(str);
            if (l10 != null && SystemClock.elapsedRealtime() - l10.longValue() < j11) {
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The slot request stop due to single ad mode.");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, AbstractAdLoader<U, T>.a aVar) {
        List<a> list;
        if (TextUtils.isEmpty(str) || (list = f83508b.get(str)) == null || list.size() <= 0) {
            return;
        }
        list.remove(aVar);
    }

    private boolean b(final T t10) {
        String[] strArrSplit;
        String str;
        boolean z10 = !BigoAdSdk.isInitialized();
        String str2 = "";
        if (z10) {
            Activity activityB = sg.bigo.ads.common.f.b.b();
            applicationContext = activityB != null ? activityB.getApplicationContext() : null;
            if (applicationContext == null) {
                applicationContext = sg.bigo.ads.common.f.b.a();
            }
            z10 = applicationContext != null;
        }
        if (z10) {
            String str3 = t10.f81803a;
            if (str3 != null && !str3.isEmpty() && (strArrSplit = str3.split("-")) != null && strArrSplit.length >= 2 && (str = strArrSplit[0]) != null && !str.isEmpty()) {
                str2 = strArrSplit[0];
            }
            z10 = (str2 == null || str2.isEmpty()) ? false : true;
        }
        if (z10) {
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Initialize bigo sdk before requesting ad.");
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        AbstractAdLoader.this.a(t10);
                    }
                }
            }, 1000L);
            try {
                AdConfig.Builder builder = new AdConfig.Builder();
                builder.setAppId(str2);
                BigoAdSdk.initialize(applicationContext.getApplicationContext(), builder.build(), new BigoAdSdk.InitListener() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.3
                    @Override // sg.bigo.ads.BigoAdSdk.InitListener
                    public final void onInitialized() {
                        sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Bigo ads sdk initialized before ad load.");
                        if (atomicBoolean.compareAndSet(false, true)) {
                            AbstractAdLoader.this.a(t10);
                        }
                    }
                });
            } catch (Exception unused) {
                if (atomicBoolean.compareAndSet(false, true)) {
                    a(t10);
                }
            }
        }
        return z10;
    }

    public U a(@NonNull sg.bigo.ads.api.b bVar, f... fVarArr) {
        return null;
    }

    public U a(f fVar) {
        return null;
    }

    @Override // sg.bigo.ads.api.b.d.a
    public final void a(U u10) {
        a((Ad) u10, true);
    }

    @Override // sg.bigo.ads.api.b.d.a
    public final void a(U u10, int i10, int i11, String str) {
        if (u10 instanceof sg.bigo.ads.api.b.a) {
            ((sg.bigo.ads.api.b.a) u10).a(i10, i11, str);
        }
        sg.bigo.ads.common.t.a.a(2, 5, "", "Failed to load ads: (" + i10 + ") " + str);
        this.f83509c.onError(new AdError(i10, str));
    }

    @Override // sg.bigo.ads.api.b.d.a
    public final void a(U u10, boolean z10, int i10, int i11, String str, boolean z11) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(AbstractAdLoader<U, T>.a aVar, int i10, int i11, @NonNull String str, @Nullable Pair<sg.bigo.ads.api.b, l> pair) {
        l lVar;
        sg.bigo.ads.api.b bVar;
        String str2;
        int i12;
        boolean z10;
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        String str3 = null;
        if (pair != null) {
            bVar = (sg.bigo.ads.api.b) pair.first;
            lVar = (l) pair.second;
        } else {
            lVar = null;
            bVar = null;
        }
        if (bVar != null) {
            bVar.f81810h.a();
        }
        String strL = lVar != null ? lVar.l() : null;
        if (TextUtils.isEmpty(strL) && bVar != null) {
            strL = bVar.f81803a;
        }
        if (TextUtils.isEmpty(strL)) {
            strL = aVar.f83559h;
        }
        boolean z11 = i11 == 10213;
        if (!z11 && !TextUtils.isEmpty(strL)) {
            f83507a.remove(strL);
        }
        boolean z12 = i10 == 1011;
        boolean z13 = i11 == 10206;
        if (z13) {
            str2 = strL;
            i12 = 0;
            z10 = true;
        } else {
            int i13 = 4;
            int i14 = z11 ? 3 : aVar.f83554c ? 2 : aVar.f83555d ? 4 : 1;
            a.C1035a<sg.bigo.ads.api.b> c1035a = aVar.f83561j;
            int i15 = c1035a != null ? c1035a.f83281f : 0;
            int i16 = (c1035a == null || (pVar4 = c1035a.f83282g) == null) ? 3 : pVar4.f81899a ? 1 : 0;
            boolean z14 = (c1035a == null || (pVar3 = c1035a.f83282g) == null || !pVar3.f81900b) ? false : true;
            if (c1035a != null && (pVar2 = c1035a.f83282g) != null) {
                i13 = pVar2.f81901c;
            }
            int i17 = i13;
            if (c1035a != null && (pVar = c1035a.f83282g) != null) {
                str3 = pVar.f81902d;
            }
            str2 = strL;
            i12 = 0;
            z10 = true;
            sg.bigo.ads.core.d.b.a(lVar, bVar, i10, i11, str, i14, i15, i16, z14, i17, str3);
        }
        aVar.a();
        aVar.f83558g = z10;
        b(aVar.b(), aVar);
        if (!z13 && (aVar.f83554c || aVar.f83555d || z12)) {
            sg.bigo.ads.common.t.a.a(i12, 3, "AbstractAdLoader", "The error ad has been timeout or assign");
        } else {
            a(str2, aVar, null, 0, i10, i11, str, false, null);
            this.f83509c.onError(new AdError(i10, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    public final void a(final AbstractAdLoader<U, T>.a aVar, final int i10, final l lVar, @NonNull sg.bigo.ads.api.b bVar, @NonNull f... fVarArr) {
        Ad adA = bVar.e() ? a(bVar, fVarArr) : a((f) k.b(fVarArr));
        if (adA == null) {
            a(aVar.b(), (AbstractAdLoader<U, T>.a) aVar, (Ad) null, 1005, 1009, "Unmatched ad type.");
            return;
        }
        if (!(adA instanceof d)) {
            a(lVar == null ? null : lVar.l(), (AbstractAdLoader<U, T>.a) aVar, adA, 1024, 1010, "Unknown ad.");
            return;
        }
        a.C1035a<sg.bigo.ads.api.b> c1035a = aVar.f83561j;
        if (c1035a != null) {
            c1035a.f83280e = 3;
        }
        sg.bigo.ads.api.core.b[] bVarArrA = sg.bigo.ads.controller.loader.a.a(adA);
        int i11 = aVar.f83554c ? 2 : aVar.f83555d ? 4 : 1;
        a.C1035a<sg.bigo.ads.api.b> c1035a2 = aVar.f83561j;
        sg.bigo.ads.controller.loader.a.a(bVarArrA, i11, c1035a2 == null ? 0 : c1035a2.f83281f, false);
        ((d) adA).a(new b<U, T>() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.5
            @Override // sg.bigo.ads.controller.loader.AbstractAdLoader.b
            public final AbstractAdLoader<U, T> a() {
                return AbstractAdLoader.this;
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final void a(final U u10) {
                final AbstractAdLoader abstractAdLoader = AbstractAdLoader.this;
                final a aVar2 = aVar;
                final int i12 = i10;
                final l lVar2 = lVar;
                sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.6
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        l lVar3 = lVar2;
                        String strL = lVar3 == null ? null : lVar3.l();
                        if (!TextUtils.isEmpty(strL)) {
                            AbstractAdLoader.f83507a.remove(strL);
                        }
                        a aVar3 = aVar2;
                        aVar3.f83558g = true;
                        AbstractAdLoader.b(strL, aVar3);
                        aVar2.a();
                        AbstractAdLoader<U, T>.a aVar4 = aVar2;
                        if (aVar4.f83554c) {
                            AbstractAdLoader.this.a(aVar4, lVar2, u10, 1);
                        } else if (aVar4.f83555d) {
                            AbstractAdLoader.this.a(aVar4, lVar2, u10, 2);
                        } else {
                            AbstractAdLoader.this.a(strL, aVar4, sg.bigo.ads.controller.loader.a.a(u10), 1, 0, 0, null, true, u10);
                            AbstractAdLoader.this.a(u10);
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final void a(U u10, int i12, int i13, String str) {
                AbstractAdLoader abstractAdLoader = AbstractAdLoader.this;
                l lVar2 = lVar;
                abstractAdLoader.a(lVar2 == null ? null : lVar2.l(), aVar, u10, i12, i13, str);
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final void a(U u10, boolean z10, int i12, int i13, String str, boolean z11) {
            }
        });
    }

    @CallSuper
    public final void a(AbstractAdLoader<U, T>.a aVar, l lVar, @NonNull Ad ad2, int i10) {
        List<a> list;
        a.C1035a<sg.bigo.ads.api.b> c1035a = aVar.f83561j;
        String str = c1035a == null ? "unknown" : c1035a.f83276a.f81810h.f81812b;
        sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The ad timeout for session id: ".concat(String.valueOf(str)));
        if (lVar != null) {
            String strL = lVar.l();
            if (TextUtils.isEmpty(strL)) {
                strL = aVar.b();
            }
            if (TextUtils.isEmpty(strL)) {
                return;
            }
            sg.bigo.ads.api.core.b[] bVarArrA = sg.bigo.ads.controller.loader.a.a(ad2);
            for (int i11 = 0; bVarArrA != null && i11 < bVarArrA.length; i11++) {
                sg.bigo.ads.api.core.b bVar = bVarArrA[i11];
                bVar.T();
                bVar.c(i10);
                bVar.S();
            }
            a aVarRemove = (TextUtils.isEmpty(strL) || (list = f83508b.get(strL)) == null || list.size() <= 0) ? null : list.remove(0);
            if (aVarRemove != null) {
                a(lVar, strL, aVarRemove, ad2);
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The timeout ad fill to another request for session id: ".concat(String.valueOf(str)));
                return;
            }
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The timeout ad put in cache for session id: " + str + ", ad: " + String.valueOf(ad2));
            a(ad2, false);
            b.a.f79836a.a(lVar, ad2);
        }
    }

    @Keep
    @CallSuper
    public void loadAd(T t10) {
        if (b(t10)) {
            return;
        }
        a(t10);
    }
}
