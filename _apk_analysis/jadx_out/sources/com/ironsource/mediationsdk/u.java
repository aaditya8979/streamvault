package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import com.ironsource.A1;
import com.ironsource.Be;
import com.ironsource.C4228r4;
import com.ironsource.C5;
import com.ironsource.Cc;
import com.ironsource.Ce;
import com.ironsource.D5;
import com.ironsource.InterfaceC4180o7;
import com.ironsource.K1;
import com.ironsource.Lb;
import com.ironsource.Lc;
import com.ironsource.Ne;
import com.ironsource.Re;
import com.ironsource.X9;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.r;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
class u implements Cc {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static u f32834z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Re f32835a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private NetworkStateReceiver f32850p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CountDownTimer f32851q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f32854t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Ne f32855u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f32857w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32836b = e.f32874f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC4180o7 f32837c = Lb.U().k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32838d = "appKey";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f32839e = getClass().getSimpleName();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f32846l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f32848n = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<Lc> f32852r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f32853s = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private f f32859y = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Handler f32847m = IronSourceThreadManager.INSTANCE.getInitHandler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32840f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32841g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32842h = 62;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f32843i = 12;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32844j = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AtomicBoolean f32849o = new AtomicBoolean(true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f32845k = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f32856v = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private X9 f32858x = new X9();

    public class a extends f {
        public a() {
            super();
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x02a3 A[Catch: Exception -> 0x02f8, TryCatch #0 {Exception -> 0x02f8, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x001f, B:7:0x002b, B:8:0x003a, B:10:0x007e, B:12:0x0091, B:14:0x00ce, B:15:0x00f7, B:17:0x0127, B:19:0x012d, B:20:0x0154, B:22:0x017f, B:24:0x0189, B:25:0x0196, B:26:0x01aa, B:28:0x01b0, B:29:0x01ca, B:31:0x01ea, B:66:0x02f2, B:32:0x020f, B:34:0x0217, B:35:0x0229, B:37:0x022f, B:38:0x023b, B:40:0x0242, B:41:0x024d, B:43:0x0253, B:44:0x025d, B:46:0x0261, B:48:0x026d, B:50:0x028a, B:51:0x0293, B:53:0x0297, B:65:0x02e8, B:55:0x02a3, B:57:0x02ab, B:59:0x02b6, B:60:0x02ba, B:61:0x02c4, B:63:0x02ca, B:64:0x02d6), top: B:71:0x0000 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 778
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.u.a.run():void");
        }
    }

    public class b implements Runnable {

        public class a extends CountDownTimer {
            public a(long j10, long j11) {
                super(j10, j11);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                u uVar = u.this;
                if (uVar.f32846l) {
                    return;
                }
                uVar.f32846l = true;
                Iterator it = uVar.f32852r.iterator();
                while (it.hasNext()) {
                    ((Lc) it.next()).h("noInternetConnection");
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
                if (j10 <= 45000) {
                    u uVar = u.this;
                    uVar.f32856v = true;
                    Iterator it = uVar.f32852r.iterator();
                    while (it.hasNext()) {
                        ((Lc) it.next()).a();
                    }
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u.this.f32851q = new a(60000L, 15000L).start();
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32863a;

        static {
            int[] iArr = new int[d.values().length];
            f32863a = iArr;
            try {
                iArr[d.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32863a[d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32863a[d.INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum d {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f32869a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f32870b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f32871c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f32872d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f32873e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f32874f = 5;
    }

    public abstract class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f32876b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f32875a = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r.b f32877c = new a();

        public class a implements r.b {
            public a() {
            }

            @Override // com.ironsource.mediationsdk.r.b
            public void a(String str) {
                f fVar = f.this;
                fVar.f32875a = false;
                fVar.f32876b = str;
            }
        }

        public f() {
        }
    }

    private u() {
    }

    private static int a(d dVar) {
        int i10 = c.f32863a[dVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? e.f32869a : e.f32870b : e.f32873e : e.f32872d;
    }

    public static synchronized u c() {
        if (f32834z == null) {
            f32834z = new u();
        }
        return f32834z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (Lb.U().g().h()) {
            Lb.U().q().a(new C5(D5.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return this.f32845k;
    }

    public synchronized d a() {
        return d.values()[Ce.f28890a.a().ordinal()];
    }

    public void a(Context context, Ne ne2) {
        this.f32858x.i(ne2.g().h());
        this.f32858x.c(ne2.g().d());
        A1 a1B = ne2.c().b();
        this.f32858x.a(a1B.a());
        this.f32858x.d(a1B.c().b());
        this.f32858x.b(a1B.k().b());
        this.f32858x.a(Boolean.valueOf(IronSourceUtils.c(context)));
        K1 k1F = ne2.c().b().f();
        this.f32858x.b(k1F.b());
        Lb.O().o().a(k1F.c());
    }

    public synchronized void a(Context context, String str, String str2, IronSource.a... aVarArr) {
        try {
            AtomicBoolean atomicBoolean = this.f32849o;
            if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, this.f32839e + ": Multiple calls to init are not allowed", 2);
            } else {
                b(d.INIT_IN_PROGRESS);
                this.f32853s = str2;
                this.f32854t = str;
                if (IronSourceUtils.g(context)) {
                    this.f32847m.post(this.f32859y);
                } else {
                    this.f32848n = true;
                    if (this.f32850p == null) {
                        this.f32850p = new NetworkStateReceiver(context, this);
                    }
                    context.registerReceiver(this.f32850p, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b());
                }
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.Cc
    public void a(boolean z10) {
        if (this.f32848n && z10) {
            CountDownTimer countDownTimer = this.f32851q;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f32848n = false;
            this.f32845k = true;
            Lb.U().q().a(new C5(D5.INIT_AFTER_REACHABILITY_CHANGE, IronSourceUtils.b(false)));
            this.f32847m.post(this.f32859y);
        }
    }

    public int b() {
        return this.f32836b;
    }

    public synchronized void b(d dVar) {
        IronLog.INTERNAL.verbose("old status: " + a() + ", new status: " + dVar + ")");
        Ce.f28890a.a(Be.values()[dVar.ordinal()]);
    }

    public synchronized boolean d() {
        return this.f32856v;
    }

    public void f() {
        b(d.INIT_FAILED);
    }

    public synchronized void g() {
        int iA = a(a());
        this.f32836b = iA;
        this.f32858x.c(iA);
    }
}
