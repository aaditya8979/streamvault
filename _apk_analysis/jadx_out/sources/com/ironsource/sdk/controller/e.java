package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.A4;
import com.ironsource.A8;
import com.ironsource.B4;
import com.ironsource.B8;
import com.ironsource.C3926a6;
import com.ironsource.C3978d4;
import com.ironsource.C4024fe;
import com.ironsource.C4032g4;
import com.ironsource.C4086j5;
import com.ironsource.C4185oc;
import com.ironsource.C4228r4;
import com.ironsource.C4242s1;
import com.ironsource.C4266t8;
import com.ironsource.C4283u8;
import com.ironsource.C4300v8;
import com.ironsource.EnumC3981d7;
import com.ironsource.G5;
import com.ironsource.InterfaceC3945b7;
import com.ironsource.InterfaceC4313w4;
import com.ironsource.InterfaceC4330x4;
import com.ironsource.InterfaceC4347y4;
import com.ironsource.Lb;
import com.ironsource.M;
import com.ironsource.Mg;
import com.ironsource.Nb;
import com.ironsource.Ob;
import com.ironsource.R3;
import com.ironsource.V7;
import com.ironsource.Y4;
import com.ironsource.Z4;
import com.ironsource.Z5;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class e implements com.ironsource.sdk.controller.c, com.ironsource.sdk.controller.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.ironsource.sdk.controller.l f33646b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CountDownTimer f33648d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V7 f33651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Mg f33652h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C4185oc f33655k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33645a = e.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C4266t8.b f33647c = C4266t8.b.None;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final R3 f33649e = new R3("NativeCommandExecutor");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final R3 f33650f = new R3("ControllerCommandsExecutor");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, l.a> f33653i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, l.b> f33654j = new HashMap();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f33656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4330x4 f33657b;

        public a(JSONObject jSONObject, InterfaceC4330x4 interfaceC4330x4) {
            this.f33656a = jSONObject;
            this.f33657b = interfaceC4330x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f33646b;
            if (lVar != null) {
                lVar.a(this.f33656a, this.f33657b);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y4 f33659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f33660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4330x4 f33661c;

        public b(Y4 y42, Map map, InterfaceC4330x4 interfaceC4330x4) {
            this.f33659a = y42;
            this.f33660b = map;
            this.f33661c = interfaceC4330x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f33646b;
            if (lVar != null) {
                lVar.a(this.f33659a, this.f33660b, this.f33661c);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y4 f33665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4313w4 f33666d;

        public c(String str, String str2, Y4 y42, InterfaceC4313w4 interfaceC4313w4) {
            this.f33663a = str;
            this.f33664b = str2;
            this.f33665c = y42;
            this.f33666d = interfaceC4313w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f33646b;
            if (lVar != null) {
                lVar.a(this.f33663a, this.f33664b, this.f33665c, this.f33666d);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f33668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4313w4 f33669b;

        public d(JSONObject jSONObject, InterfaceC4313w4 interfaceC4313w4) {
            this.f33668a = jSONObject;
            this.f33669b = interfaceC4313w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f33646b;
            if (lVar != null) {
                lVar.a(this.f33668a, this.f33669b);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$e, reason: collision with other inner class name */
    public class RunnableC0400e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y4 f33671a;

        public RunnableC0400e(Y4 y42) {
            this.f33671a = y42;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f33646b;
            if (lVar != null) {
                lVar.a(this.f33671a);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y4 f33673a;

        public f(Y4 y42) {
            this.f33673a = y42;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f33646b;
            if (lVar != null) {
                lVar.b(this.f33673a);
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y4 f33675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f33676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4313w4 f33677c;

        public g(Y4 y42, Map map, InterfaceC4313w4 interfaceC4313w4) {
            this.f33675a = y42;
            this.f33676b = map;
            this.f33677c = interfaceC4313w4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f33646b;
            if (lVar != null) {
                lVar.a(this.f33675a, this.f33676b, this.f33677c);
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l.a f33679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f.c f33680b;

        public h(l.a aVar, f.c cVar) {
            this.f33679a = aVar;
            this.f33680b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if (eVar.f33646b != null) {
                if (this.f33679a != null) {
                    eVar.f33653i.put(this.f33680b.f(), this.f33679a);
                }
                e.this.f33646b.a(this.f33680b, this.f33679a);
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f33682a;

        public i(JSONObject jSONObject) {
            this.f33682a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f33646b;
            if (lVar != null) {
                lVar.b(this.f33682a);
            }
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f33646b;
            if (lVar != null) {
                lVar.a();
                e.this.f33646b = null;
            }
        }
    }

    public class k extends CountDownTimer {
        public k(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f33645a, "Global Controller Timer Finish");
            e.this.d(C3978d4.c.f31243k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            Logger.i(e.this.f33645a, "Global Controller Timer Tick " + j10);
        }
    }

    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d();
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33688b;

        public m(String str, String str2) {
            this.f33687a = str;
            this.f33688b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = e.this;
                eVar.f33646b = eVar.b(eVar.f33652h.b(), e.this.f33652h.d(), e.this.f33652h.f(), e.this.f33652h.e(), e.this.f33652h.g(), e.this.f33652h.c(), this.f33687a, this.f33688b);
                e.this.f33646b.b();
            } catch (Throwable th2) {
                C4228r4.d().a(th2);
                e.this.d(Log.getStackTraceString(th2));
            }
        }
    }

    public class n extends CountDownTimer {
        public n(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.f33645a, "Recovered Controller | Global Controller Timer Finish");
            e.this.d(C3978d4.c.f31243k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            Logger.i(e.this.f33645a, "Recovered Controller | Global Controller Timer Tick " + j10);
        }
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y4 f33693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4347y4 f33694d;

        public o(String str, String str2, Y4 y42, InterfaceC4347y4 interfaceC4347y4) {
            this.f33691a = str;
            this.f33692b = str2;
            this.f33693c = y42;
            this.f33694d = interfaceC4347y4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f33646b;
            if (lVar != null) {
                lVar.a(this.f33691a, this.f33692b, this.f33693c, this.f33694d);
            }
        }
    }

    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f33696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4347y4 f33697b;

        public p(JSONObject jSONObject, InterfaceC4347y4 interfaceC4347y4) {
            this.f33696a = jSONObject;
            this.f33697b = interfaceC4347y4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f33646b;
            if (lVar != null) {
                lVar.a(this.f33696a, this.f33697b);
            }
        }
    }

    public class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y4 f33701c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4330x4 f33702d;

        public q(String str, String str2, Y4 y42, InterfaceC4330x4 interfaceC4330x4) {
            this.f33699a = str;
            this.f33700b = str2;
            this.f33701c = y42;
            this.f33702d = interfaceC4330x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f33646b;
            if (lVar != null) {
                lVar.a(this.f33699a, this.f33700b, this.f33701c, this.f33702d);
            }
        }
    }

    public class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4330x4 f33705b;

        public r(String str, InterfaceC4330x4 interfaceC4330x4) {
            this.f33704a = str;
            this.f33705b = interfaceC4330x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.f33646b;
            if (lVar != null) {
                lVar.a(this.f33704a, this.f33705b);
            }
        }
    }

    public class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y4 f33707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f33708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4330x4 f33709c;

        public s(Y4 y42, Map map, InterfaceC4330x4 interfaceC4330x4) {
            this.f33707a = y42;
            this.f33708b = map;
            this.f33709c = interfaceC4330x4;
        }

        @Override // java.lang.Runnable
        public void run() {
            A8.a(C4024fe.f31715j, new C4300v8().a(G5.f29407v, this.f33707a.f()).a("producttype", B8.a(this.f33707a, C4266t8.e.Interstitial)).a(G5.f29409x, Boolean.valueOf(B8.a(this.f33707a))).a(G5.I, Long.valueOf(M.f29819a.b(this.f33707a.h()))).a());
            com.ironsource.sdk.controller.l lVar = e.this.f33646b;
            if (lVar != null) {
                lVar.b(this.f33707a, this.f33708b, this.f33709c);
            }
        }
    }

    public e(Context context, C4032g4 c4032g4, Z4 z42, V7 v72, int i10, JSONObject jSONObject, String str, String str2, C4185oc c4185oc) {
        this.f33655k = c4185oc;
        this.f33651g = v72;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        C4086j5 c4086j5A = C4086j5.a(networkStorageDir, v72, jSONObject);
        this.f33652h = new Mg(context, c4032g4, z42, i10, c4086j5A, networkStorageDir);
        a(context, c4032g4, z42, i10, c4086j5A, networkStorageDir, str, str2);
    }

    private void a(final Context context, final C4032g4 c4032g4, final Z4 z42, final int i10, final C4086j5 c4086j5, final String str, final String str2, final String str3) {
        int i11 = Lb.U().g().i();
        if (i11 > 0) {
            A8.a(C4024fe.B, new C4300v8().a(G5.f29410y, String.valueOf(i11)).a());
        }
        Runnable runnable = new Runnable() { // from class: com.ironsource.sdk.controller.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f33608b.c(context, c4032g4, z42, i10, c4086j5, str, str2, str3);
            }
        };
        if (Lb.U().g().e()) {
            this.f33651g.b(runnable, i11);
        } else {
            a(runnable, i11);
        }
        this.f33648d = new k(200000L, 1000L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Nb nb2) {
        l.b bVar = this.f33654j.get(nb2.d());
        if (bVar != null) {
            bVar.a(nb2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(f.a aVar) {
        l.a aVarRemove = this.f33653i.remove(aVar.c());
        if (aVarRemove != null) {
            aVarRemove.a(aVar);
        }
    }

    private void a(C4266t8.e eVar, Y4 y42, String str, String str2) {
        Logger.i(this.f33645a, "recoverWebController for product: " + eVar.toString());
        C4300v8 c4300v8 = new C4300v8();
        c4300v8.a("producttype", eVar.toString());
        c4300v8.a(G5.f29407v, y42.f());
        A8.a(C4024fe.f31707b, c4300v8.a());
        this.f33652h.n();
        a();
        m mVar = new m(str, str2);
        if (Lb.U().g().e()) {
            this.f33651g.b(mVar);
        } else {
            b(mVar);
        }
        this.f33648d = new n(200000L, 1000L).start();
    }

    private void a(Runnable runnable, long j10) {
        V7 v72 = this.f33651g;
        if (v72 != null) {
            v72.d(runnable, j10);
        } else {
            Logger.e(this.f33645a, "mThreadManager = null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v b(Context context, C4032g4 c4032g4, Z4 z42, int i10, C4086j5 c4086j5, String str, String str2, String str3) throws Throwable {
        A8.a(C4024fe.f31708c, new C4300v8().a(G5.f29410y, "thread-" + Thread.currentThread().getName()).a());
        v vVar = new v(context, z42, c4032g4, this, this.f33651g, i10, c4086j5, str, i(), j(), str2, str3);
        C3926a6 c3926a6 = new C3926a6(context, c4086j5, new Z5(this.f33651g.a()), new Ob(c4086j5.a()));
        vVar.a(new u(context));
        vVar.a(new com.ironsource.sdk.controller.o(context));
        vVar.a(new com.ironsource.sdk.controller.q(context));
        vVar.a(new com.ironsource.sdk.controller.i(context));
        vVar.a(new com.ironsource.sdk.controller.a(context));
        vVar.a(new com.ironsource.sdk.controller.j(c4086j5.a(), c3926a6));
        vVar.a(new C4242s1());
        vVar.a(new B4(context, new A4()));
        return vVar;
    }

    private void b(Runnable runnable) {
        a(runnable, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, C4032g4 c4032g4, Z4 z42, int i10, C4086j5 c4086j5, String str, String str2, String str3) {
        try {
            v vVarB = b(context, c4032g4, z42, i10, c4086j5, str, str2, str3);
            this.f33646b = vVarB;
            vVarB.b();
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            d(Log.getStackTraceString(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        A8.a(C4024fe.f31709d, new C4300v8().a(G5.A, str).a());
        this.f33647c = C4266t8.b.Loading;
        this.f33646b = new com.ironsource.sdk.controller.n(str, this.f33651g);
        this.f33649e.c();
        this.f33649e.a();
        V7 v72 = this.f33651g;
        if (v72 != null) {
            v72.c(new l());
        }
    }

    private void e(String str) {
        IronSourceNetwork.updateInitFailed(new C4283u8(1001, str));
    }

    private l.a i() {
        return new l.a() { // from class: com.ironsource.sdk.controller.z
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                this.f34004a.a(aVar);
            }
        };
    }

    private l.b j() {
        return new l.b() { // from class: com.ironsource.sdk.controller.b0
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Nb nb2) {
                this.f33619a.a(nb2);
            }
        };
    }

    private void l() {
        Logger.i(this.f33645a, "handleReadyState");
        this.f33647c = C4266t8.b.Ready;
        CountDownTimer countDownTimer = this.f33648d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        n();
        this.f33650f.c();
        this.f33650f.a();
        com.ironsource.sdk.controller.l lVar = this.f33646b;
        if (lVar != null) {
            lVar.f();
        }
    }

    private boolean m() {
        return C4266t8.b.Ready.equals(this.f33647c);
    }

    private void n() {
        this.f33652h.a(true);
        com.ironsource.sdk.controller.l lVar = this.f33646b;
        if (lVar != null) {
            lVar.a(this.f33652h.i());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        Logger.i(this.f33645a, "destroy controller");
        CountDownTimer countDownTimer = this.f33648d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        R3 r32 = this.f33650f;
        if (r32 != null) {
            r32.b();
        }
        this.f33648d = null;
        b(new j());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.f33646b.a(activity);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f33646b) == null) {
            return;
        }
        lVar.a(context);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42) {
        this.f33650f.a(new RunnableC0400e(y42));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42, Map<String, String> map, InterfaceC4313w4 interfaceC4313w4) {
        this.f33650f.a(new g(y42, map, interfaceC4313w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42, Map<String, String> map, InterfaceC4330x4 interfaceC4330x4) {
        this.f33650f.a(new b(y42, map, interfaceC4330x4));
    }

    @Override // com.ironsource.InterfaceC4017f7
    public void a(@NotNull InterfaceC3945b7 interfaceC3945b7) {
        EnumC3981d7 enumC3981d7B = interfaceC3945b7.b();
        if (enumC3981d7B == EnumC3981d7.SendEvent) {
            A8.a(C4024fe.A, new C4300v8().a(G5.f29410y, interfaceC3945b7.a() + " : strategy: " + enumC3981d7B).a());
            return;
        }
        if (enumC3981d7B == EnumC3981d7.NativeController) {
            com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(interfaceC3945b7.a(), this.f33651g);
            this.f33646b = nVar;
            this.f33655k.a(nVar.h());
            A8.a(C4024fe.f31709d, new C4300v8().a(G5.A, interfaceC3945b7.a() + " : strategy: " + enumC3981d7B).a());
            A8.a(C4024fe.A, new C4300v8().a(G5.f29410y, interfaceC3945b7.a() + " : strategy: " + enumC3981d7B).a());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, @Nullable l.a aVar) {
        this.f33650f.a(new h(aVar, cVar));
    }

    public void a(Runnable runnable) {
        this.f33649e.a(runnable);
    }

    public void a(String str, l.b bVar) {
        this.f33654j.put(str, bVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC4330x4 interfaceC4330x4) {
        Logger.i(this.f33645a, "load interstitial");
        this.f33650f.a(new r(str, interfaceC4330x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC4313w4 interfaceC4313w4) {
        if (this.f33652h.a(h(), this.f33647c)) {
            a(C4266t8.e.Banner, y42, str, str2);
        }
        this.f33650f.a(new c(str, str2, y42, interfaceC4313w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC4330x4 interfaceC4330x4) {
        if (this.f33652h.a(h(), this.f33647c)) {
            a(C4266t8.e.Interstitial, y42, str, str2);
        }
        this.f33650f.a(new q(str, str2, y42, interfaceC4330x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC4347y4 interfaceC4347y4) {
        if (this.f33652h.a(h(), this.f33647c)) {
            a(C4266t8.e.RewardedVideo, y42, str, str2);
        }
        this.f33650f.a(new o(str, str2, y42, interfaceC4347y4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4313w4 interfaceC4313w4) {
        this.f33650f.a(new d(jSONObject, interfaceC4313w4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4330x4 interfaceC4330x4) {
        this.f33650f.a(new a(jSONObject, interfaceC4330x4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4347y4 interfaceC4347y4) {
        this.f33650f.a(new p(jSONObject, interfaceC4347y4));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        if (this.f33646b == null || !m()) {
            return false;
        }
        return this.f33646b.a(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f33646b) == null) {
            return;
        }
        lVar.b(context);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y42) {
        this.f33650f.a(new f(y42));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y42, Map<String, String> map, InterfaceC4330x4 interfaceC4330x4) {
        this.f33650f.a(new s(y42, map, interfaceC4330x4));
    }

    @Override // com.ironsource.sdk.controller.c
    public void b(String str) {
        A8.a(C4024fe.f31730y, new C4300v8().a(G5.f29410y, str).a());
        CountDownTimer countDownTimer = this.f33648d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        this.f33650f.a(new i(jSONObject));
    }

    @Override // com.ironsource.sdk.controller.c
    public void c() {
        Logger.i(this.f33645a, "handleControllerLoaded");
        this.f33647c = C4266t8.b.Loaded;
        this.f33649e.c();
        this.f33649e.a();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c(String str) {
        Logger.i(this.f33645a, "handleControllerFailed ");
        C4300v8 c4300v8 = new C4300v8();
        c4300v8.a(G5.A, str);
        c4300v8.a(G5.f29410y, String.valueOf(this.f33652h.l()));
        A8.a(C4024fe.f31720o, c4300v8.a());
        this.f33652h.a(false);
        e(str);
        if (this.f33648d != null) {
            Logger.i(this.f33645a, "cancel timer mControllerReadyTimer");
            this.f33648d.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.c
    public void d() {
        Logger.i(this.f33645a, "handleControllerReady ");
        this.f33655k.a(h());
        if (C4266t8.c.Web.equals(h())) {
            A8.a(C4024fe.f31710e, new C4300v8().a(G5.f29410y, String.valueOf(this.f33652h.l())).a());
            IronSourceNetwork.updateInitSucceeded();
        }
        l();
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f33646b) == null) {
            return;
        }
        lVar.e();
    }

    @Override // com.ironsource.sdk.controller.l
    @Deprecated
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.f33646b) == null) {
            return;
        }
        lVar.g();
    }

    @Override // com.ironsource.sdk.controller.l
    public C4266t8.c h() {
        com.ironsource.sdk.controller.l lVar = this.f33646b;
        return lVar != null ? lVar.h() : C4266t8.c.None;
    }

    public com.ironsource.sdk.controller.l k() {
        return this.f33646b;
    }
}
