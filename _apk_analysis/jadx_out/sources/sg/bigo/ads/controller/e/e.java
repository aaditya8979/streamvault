package sg.bigo.ads.controller.e;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.a.b.d;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends sg.bigo.ads.controller.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.common.g f83313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.controller.b.d f83314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg.bigo.ads.controller.b.h f83315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.b f83316d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f83320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f83321i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f83324l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f83317e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f83318f = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<b> f83322j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicReference<sg.bigo.ads.controller.g.h> f83323k = new AtomicReference<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f83319g = new AtomicInteger(0);

    public interface a {
        void a(int i10);

        void a(int i10, int i11, String str);
    }

    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f83334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f83335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.common.g f83336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final sg.bigo.ads.controller.b.d f83337d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final sg.bigo.ads.controller.b.h f83338e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final sg.bigo.ads.controller.a.b f83339f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final e f83340g;

        public b(String str, a aVar, @NonNull sg.bigo.ads.controller.b.d dVar, @NonNull sg.bigo.ads.controller.b.h hVar, @NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.controller.a.b bVar, @NonNull e eVar) {
            this.f83334a = str;
            this.f83335b = aVar;
            this.f83336c = gVar;
            this.f83337d = dVar;
            this.f83338e = hVar;
            this.f83339f = bVar;
            this.f83340g = eVar;
            if (c.a().f83289b.compareAndSet(-1, 0)) {
                sg.bigo.ads.common.t.a.a(0, 3, "ConfigInitProcessor", "reinit config and set status.");
            }
        }

        @Override // sg.bigo.ads.controller.e.e.a
        public final void a(int i10) {
            c.a().b();
            a aVar = this.f83335b;
            if (aVar != null) {
                aVar.a(i10);
            }
            if (sg.bigo.ads.api.a.i.f81802a.x()) {
                d.a.f82955a.a(this.f83339f, this.f83336c, this.f83337d, this.f83338e, this.f83340g);
            }
        }

        @Override // sg.bigo.ads.controller.e.e.a
        public final void a(int i10, int i11, String str) {
            c cVarA = c.a();
            String str2 = this.f83334a;
            if (1101 == i11 || 1105 == i11) {
                Map concurrentHashMap = cVarA.f83288a;
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                    cVarA.f83288a = concurrentHashMap;
                }
                if (str2 != null && c.a(concurrentHashMap, str2)) {
                    concurrentHashMap.put(str2, Long.valueOf(SystemClock.elapsedRealtime()));
                }
                if (cVarA.f83289b.compareAndSet(0, -1)) {
                    sg.bigo.ads.common.t.a.a(0, "ConfigInitProcessor", "Failed to init config and set status.");
                }
            }
            a aVar = this.f83335b;
            if (aVar != null) {
                aVar.a(i10, i11, str);
            }
        }
    }

    public e(@NonNull Context context, @NonNull sg.bigo.ads.controller.b.d dVar, @NonNull sg.bigo.ads.controller.b.h hVar, @NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.controller.a.b bVar) {
        this.f83321i = context;
        this.f83313a = gVar;
        this.f83314b = dVar;
        this.f83315c = hVar;
        this.f83316d = bVar;
    }

    private void a(int i10, int i11) {
        if (this.f83323k.get() != null) {
            return;
        }
        this.f83323k.set(new sg.bigo.ads.controller.g.h(this.f83313a, this.f83316d, sg.bigo.ads.controller.b.e.E(), this));
        this.f83320h = i10;
        this.f83317e = SystemClock.elapsedRealtime();
        this.f83318f = sg.bigo.ads.common.f.b.d();
        this.f83319g.incrementAndGet();
        this.f83324l = i11;
        String strA = this.f83313a.a();
        if (q.a((CharSequence) strA)) {
            b(1100, "App id cannot be empty, please pass the id when initializing bigo sdk");
        } else if (c.a().a(strA)) {
            this.f83323k.get().b();
        } else {
            b(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE, "The slot id is invalid, please make sure the id is aligned with app id.");
        }
    }

    public static /* synthetic */ void a(e eVar) {
        eVar.f83323k.set(null);
        Iterator<b> it = eVar.f83322j.iterator();
        while (it.hasNext()) {
            it.next().a(eVar.f83324l);
        }
        eVar.f83322j.clear();
    }

    @Override // sg.bigo.ads.controller.e
    public final void a(final int i10, final int i11, final int i12, @NonNull final String str, @Nullable Object obj) {
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.e.2
            @Override // java.lang.Runnable
            public final void run() {
                e eVar;
                int i13;
                sg.bigo.ads.common.t.a.a(0, "GlobalConfig", "request error, seq=" + i10 + ", error=" + i11 + ", message=" + str);
                StringBuilder sb2 = new StringBuilder("Error from server: ");
                sb2.append(str);
                String string = sb2.toString();
                if (i12 == -9) {
                    eVar = e.this;
                    i13 = 1105;
                } else {
                    eVar = e.this;
                    i13 = 1104;
                }
                eVar.b(i13, string);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                e eVar2 = e.this;
                long j10 = jElapsedRealtime - eVar2.f83317e;
                int i14 = i11;
                int i15 = i12;
                String str2 = str;
                int i16 = eVar2.f83320h;
                boolean z10 = eVar2.f83318f;
                int i17 = eVar2.f83319g.get();
                sg.bigo.ads.common.g gVar = e.this.f83313a;
                sg.bigo.ads.core.d.b.a(j10, i14, i15, str2, i16, z10, i17, gVar == null ? null : gVar.X());
            }
        });
    }

    @Override // sg.bigo.ads.controller.b
    public final void a(int i10, @NonNull String str) {
        a(i10, str, false);
    }

    public final void a(final int i10, @NonNull final String str, final boolean z10) {
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.e.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.controller.a.a aVar;
                int andSet = 0;
                sg.bigo.ads.common.t.a.a(0, 3, "GlobalConfig", "request success, seq=" + i10 + ", result=" + str);
                e eVar = e.this;
                int i11 = eVar.f83320h;
                if (z10) {
                    i11 = 2;
                }
                try {
                    boolean zN = eVar.f83314b.N();
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("global");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("slots");
                    if (jSONObjectOptJSONObject != null && jSONArrayOptJSONArray != null) {
                        if (((((long) e.this.f83314b.e(jSONObjectOptJSONObject)) & 1) != 0) && (aVar = e.this.f83316d.f82891a) != null) {
                            aVar.c();
                        }
                        e eVar2 = e.this;
                        eVar2.f83314b.c(eVar2.f83321i);
                        e.this.f83315c.a(jSONArrayOptJSONArray);
                        e eVar3 = e.this;
                        eVar3.f83315c.c(eVar3.f83321i);
                        sg.bigo.ads.a aVarA = BigoAdSdk.a(e.this.f83321i);
                        aVarA.f79744a = e.this.f83313a.a();
                        aVarA.c(e.this.f83321i);
                        if (!z10) {
                            e.a(e.this);
                            andSet = e.this.f83319g.getAndSet(0);
                        }
                        int i12 = andSet;
                        long jI = e.this.f83314b.i();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        e eVar4 = e.this;
                        long j10 = jElapsedRealtime - eVar4.f83317e;
                        boolean z11 = eVar4.f83318f;
                        sg.bigo.ads.common.g gVar = eVar4.f83313a;
                        sg.bigo.ads.core.d.b.a(jI, j10, zN, i11, z11, i12, gVar == null ? null : gVar.X());
                        h.a().a(e.this.f83314b.J());
                        return;
                    }
                    if (!z10) {
                        e.this.b(1102, "Missing `global` or `slots` params.");
                    }
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    e eVar5 = e.this;
                    long j11 = jElapsedRealtime2 - eVar5.f83317e;
                    boolean z12 = eVar5.f83318f;
                    int i13 = eVar5.f83319g.get();
                    sg.bigo.ads.common.g gVar2 = e.this.f83313a;
                    sg.bigo.ads.core.d.b.a(j11, 1102, Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, "Missing `global` or `slots` params.", i11, z12, i13, gVar2 == null ? null : gVar2.X());
                } catch (JSONException unused) {
                    if (!z10) {
                        e.this.b(1103, "Failed to parse global config.");
                    }
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    e eVar6 = e.this;
                    long j12 = jElapsedRealtime3 - eVar6.f83317e;
                    boolean z13 = eVar6.f83318f;
                    int i14 = eVar6.f83319g.get();
                    sg.bigo.ads.common.g gVar3 = e.this.f83313a;
                    sg.bigo.ads.core.d.b.a(j12, 1103, Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, "Failed to parse global config.", i11, z13, i14, gVar3 == null ? null : gVar3.X());
                }
            }
        });
    }

    @WorkerThread
    public final void a(@Nullable a aVar, int i10) {
        b bVar = new b(this.f83313a.a(), aVar, this.f83314b, this.f83315c, this.f83313a, this.f83316d, this);
        int iC = this.f83314b.C();
        if (iC != 2) {
            if (iC == 3) {
                this.f83322j.add(bVar);
                a(i10, iC);
                return;
            } else if (iC == 4) {
                bVar.a(iC);
                a(i10, iC);
                return;
            } else if (iC != 5) {
                return;
            }
        }
        bVar.a(iC);
    }

    public final void b(int i10, String str) {
        this.f83323k.set(null);
        if (this.f83322j.isEmpty()) {
            return;
        }
        this.f83322j.remove(0).a(this.f83324l, i10, str);
        if (this.f83322j.isEmpty()) {
            return;
        }
        a(this.f83320h, this.f83324l);
    }
}
