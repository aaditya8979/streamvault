package sg.bigo.ads.controller.a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.a.f;
import sg.bigo.ads.controller.g.l;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a f82891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.common.g f82892b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.controller.b f82897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sg.bigo.ads.api.a.h f82898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f82899i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f82893c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f82894d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f82895e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f82896f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g f82901k = new g() { // from class: sg.bigo.ads.controller.a.b.1
        @Override // sg.bigo.ads.controller.a.g
        public final void a(String str) {
            b.this.f82891a.a(0L);
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[saveAsync], reSave config, fromUrlPath=".concat(String.valueOf(str)));
        }

        @Override // sg.bigo.ads.controller.a.g
        public final void a(String str, boolean z10) {
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "fetchConfig, country=" + str + ", fromSDKConfigUrl=" + z10);
            if (!z10) {
                b.a(b.this, (l.a) null);
            }
            b.a(b.this, str, true);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f82902l = new Runnable() { // from class: sg.bigo.ads.controller.a.b.2
        @Override // java.lang.Runnable
        public final void run() {
            if (b.a(b.this, new l.a() { // from class: sg.bigo.ads.controller.a.b.2.1
                @Override // sg.bigo.ads.controller.g.l.a
                public final void a(String str, int i10, int i11, int i12, @NonNull String str2, @Nullable Map<String, Object> map) {
                    b bVar = b.this;
                    b.a(bVar, bVar.f82892b.v(), false);
                }

                @Override // sg.bigo.ads.controller.g.l.a
                public final void a(String str, int i10, String str2, @Nullable Map<String, Object> map) {
                }
            })) {
                return;
            }
            b bVar = b.this;
            b.a(bVar, bVar.f82892b.v(), false);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, String> f82900j = new ConcurrentHashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f82929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f82931c;

        private a(k kVar, String str, long j10) {
            this.f82929a = kVar;
            this.f82930b = str;
            this.f82931c = j10;
        }

        public /* synthetic */ a(k kVar, String str, long j10, byte b10) {
            this(kVar, str, j10);
        }
    }

    public b(@NonNull Context context, @NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.api.a.h hVar) {
        this.f82899i = context;
        this.f82891a = new sg.bigo.ads.controller.a.a(context, hVar);
        this.f82892b = gVar;
        this.f82898h = hVar;
    }

    public static /* synthetic */ boolean a(b bVar, final String str, boolean z10) {
        bVar.f82895e.compareAndSet(false, z10);
        if (!bVar.f82894d.compareAndSet(false, true)) {
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] fetch pay svr config return because is fetching, fetch free svr config after fail -> ".concat(String.valueOf(z10)));
            return false;
        }
        sg.bigo.ads.controller.a.a.f fVar = bVar.f82891a.f82821j;
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] fetch pay svr config, canFetch=" + fVar.a() + ", fetch free svr config after fail -> " + z10);
        final ValueCallback<a> valueCallback = new ValueCallback<a>() { // from class: sg.bigo.ads.controller.a.b.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(a aVar) {
                k kVar;
                a aVar2 = aVar;
                b.this.f82894d.set(false);
                b.this.f82895e.set(false);
                b.this.f82896f.set(false);
                if (aVar2 == null || (kVar = aVar2.f82929a) == null) {
                    return;
                }
                b.this.a(aVar2.f82930b, kVar.f82989a, aVar2.f82931c, true);
            }
        };
        final ValueCallback<String> valueCallback2 = new ValueCallback<String>() { // from class: sg.bigo.ads.controller.a.b.6
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(String str2) {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] all svr urls are fail");
                b.this.f82895e.set(false);
                b.this.f82896f.set(false);
            }
        };
        if (fVar.a()) {
            fVar.b();
            bVar.a(str, fVar, valueCallback, new ValueCallback<String>() { // from class: sg.bigo.ads.controller.a.b.7
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str2) {
                    b.this.f82894d.set(false);
                    if (b.this.f82895e.compareAndSet(true, false) && b.this.f82896f.compareAndSet(false, true)) {
                        b.this.a(str, valueCallback, valueCallback2);
                    } else {
                        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] all pay svr urls are fail");
                    }
                }
            });
            return true;
        }
        if (bVar.f82895e.compareAndSet(true, false) && bVar.f82896f.compareAndSet(false, true)) {
            bVar.a(str, valueCallback, valueCallback2);
        }
        bVar.f82894d.set(false);
        return false;
    }

    public static /* synthetic */ boolean a(b bVar, final l.a aVar) {
        final sg.bigo.ads.controller.a.a.c cVar = bVar.f82891a.f82818g;
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[sdk config] fetch sdk config, canFetch=" + cVar.b() + ", ignoreFetchInterval=false");
        if (!bVar.f82893c.compareAndSet(false, true)) {
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[sdk config] fetch sdk config return because it is fetching.");
            return false;
        }
        if (!cVar.b()) {
            bVar.f82893c.set(false);
            return false;
        }
        cVar.f82853g = System.currentTimeMillis();
        bVar.f82891a.a(0L);
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[saveAsync], fetch sdk config");
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        new l(bVar.f82892b, bVar, new l.a() { // from class: sg.bigo.ads.controller.a.b.4
            @Override // sg.bigo.ads.controller.g.l.a
            public final void a(String str, int i10, int i11, int i12, @NonNull String str2, @Nullable Map<String, Object> map) {
                b.this.f82893c.set(false);
                if (TextUtils.isEmpty(sg.bigo.ads.common.utils.l.a(map, "host_cfg"))) {
                    sg.bigo.ads.core.d.b.a(jElapsedRealtime > 0 ? SystemClock.elapsedRealtime() - jElapsedRealtime : 0L, false, str, 4001, "code=" + i11 + ",subCode=" + i12 + ",message=" + str2);
                }
                l.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str, i10, i11, i12, str2, map);
                }
                sg.bigo.ads.controller.b bVar2 = b.this.f82897g;
                if (bVar2 != null) {
                    bVar2.a(i10, i11, i12, str2, map);
                }
            }

            @Override // sg.bigo.ads.controller.g.l.a
            public final void a(String str, int i10, String str2, @Nullable Map<String, Object> map) {
                b.this.f82893c.set(false);
                cVar.f82854h = System.currentTimeMillis();
                b.this.f82891a.a(0L);
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[saveAsync], fetch sdk config, on sdk config fetch success");
                if (TextUtils.isEmpty(sg.bigo.ads.common.utils.l.a(map, "host_cfg"))) {
                    sg.bigo.ads.core.d.b.a(jElapsedRealtime > 0 ? SystemClock.elapsedRealtime() - jElapsedRealtime : 0L, false, str, 4002, "host_cfg is empty.");
                }
                l.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str, i10, str2, map);
                }
                sg.bigo.ads.controller.b bVar2 = b.this.f82897g;
                if (bVar2 != null) {
                    bVar2.a(i10, str2);
                }
            }
        }).b();
        return true;
    }

    @NonNull
    public final h a(String str, String str2, long j10, boolean z10) {
        h hVarA = this.f82891a.a(str, str2, this.f82900j, this.f82892b.v(), this.f82898h.s());
        long jElapsedRealtime = j10 <= 0 ? 0L : SystemClock.elapsedRealtime() - j10;
        if (hVarA.f82981b) {
            this.f82891a.a(0L);
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[saveAsync], update host config, configSource=" + str2 + ", result=" + hVarA);
            if (z10) {
                sg.bigo.ads.core.d.b.a(jElapsedRealtime, hVarA.f82982c, str2, true);
            }
        } else {
            int i10 = hVarA.f82983d;
            if (i10 == 0) {
                if (z10) {
                    sg.bigo.ads.core.d.b.a(jElapsedRealtime, hVarA.f82982c, str2, false);
                }
            } else if (z10) {
                sg.bigo.ads.core.d.b.a(jElapsedRealtime, hVarA.f82982c, str2, i10, hVarA.f82984e);
            }
        }
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "updateHostConfig, configSource=" + str2 + ", update result=" + hVarA);
        return hVarA;
    }

    public final void a(long j10, String str) {
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "fetchAntiBanConfig, delayMillis=" + j10 + ", from=" + str);
        sg.bigo.ads.common.n.d.a(this.f82902l);
        sg.bigo.ads.common.n.d.a(1, this.f82902l, Math.max(j10, 0L));
    }

    public final void a(String str, String str2) {
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "addExtraHost, country=" + str + ", host=" + str2);
        if (d.a(str2)) {
            if (q.a((CharSequence) str)) {
                str = "all";
            }
            this.f82900j.put(str, str2);
            if (this.f82891a.a(str, str2)) {
                this.f82891a.a(10L);
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "saveAsync, addExtraHost, delayMillis=10");
            }
        }
    }

    public final void a(@NonNull final String str, @NonNull final sg.bigo.ads.controller.a.a.g gVar, @Nullable final ValueCallback<a> valueCallback, @Nullable final ValueCallback<String> valueCallback2) {
        final k kVarA = gVar.a(str);
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] [saveAsync] fetch svr config, country=" + str + ", url=" + kVarA);
        this.f82891a.a(0L);
        if (kVarA == null) {
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue("not available url.");
            }
        } else {
            sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(new sg.bigo.ads.common.u.b.d(kVarA.f82989a), this.f82899i);
            aVar.f82435l = sg.bigo.ads.common.u.a.e.b();
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            sg.bigo.ads.common.u.g.a(aVar, new sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.a, sg.bigo.ads.common.u.c.d>() { // from class: sg.bigo.ads.controller.a.b.9
                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ sg.bigo.ads.common.u.c.c a(@NonNull sg.bigo.ads.common.u.c.a aVar2) {
                    return new sg.bigo.ads.common.u.c.d(aVar2);
                }

                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.c.c cVar2) {
                    sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] succeed to fetch net disk url: " + kVarA.f82989a);
                    String strA = ((sg.bigo.ads.common.u.c.d) cVar2).a();
                    if (valueCallback != null) {
                        valueCallback.onReceiveValue(new a(kVarA, strA, jElapsedRealtime, (byte) 0));
                    }
                }

                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.h hVar) {
                    sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] try another net disk url due to failed to fetch net disk url: " + kVarA.f82989a);
                    sg.bigo.ads.core.d.b.a(jElapsedRealtime > 0 ? SystemClock.elapsedRealtime() - jElapsedRealtime : 0L, false, kVarA.f82989a, 4000, "NetError:" + hVar.f82459a + ", " + hVar.getMessage());
                    b.this.a(str, gVar, valueCallback, valueCallback2);
                }
            });
        }
    }

    public final boolean a(String str, final ValueCallback<a> valueCallback, ValueCallback<String> valueCallback2) {
        final sg.bigo.ads.controller.a.a.e eVar = this.f82891a.f82822k;
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] fetch free svr config, canFetch=" + eVar.a());
        if (!eVar.a()) {
            this.f82896f.set(false);
            return false;
        }
        eVar.b();
        a(str, eVar, new ValueCallback<a>() { // from class: sg.bigo.ads.controller.a.b.8
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(a aVar) {
                eVar.a(true);
                b.this.f82891a.a(0L);
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] [saveAsync], fetch third free svr config, onSuccess");
                valueCallback.onReceiveValue(aVar);
            }
        }, valueCallback2);
        return true;
    }

    public final f b(@NonNull String str, String str2) {
        f.a aVar = new f.a(this.f82891a, this.f82892b, this.f82898h, str, str2);
        aVar.a(this.f82901k);
        return aVar;
    }
}
