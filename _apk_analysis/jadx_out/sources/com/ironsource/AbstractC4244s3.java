package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.G7;
import com.ironsource.H5;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC4244s3 implements F7 {
    public static boolean O;
    private int[] A;
    private int[] B;
    private int[] C;
    public int G;
    public String H;
    public String I;
    public Set<Integer> J;
    private F5 K;
    private C4002ea L;
    private Oe M;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f33488l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private G4 f33492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AbstractC3991e f33493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList<C5> f33494r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f33496t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private M8 f33497u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Context f33498v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int[] f33502z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33477a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33478b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33479c = 5000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33480d = 90000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33481e = 1024;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33482f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f33483g = "supersonic_sdk.db";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f33484h = IronSourceConstants.EVENTS_PROVIDER;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f33485i = "placement";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f33486j = "abt";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f33487k = Q6.f30210a1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f33489m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f33490n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f33491o = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f33495s = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f33499w = 100;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f33500x = 5000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f33501y = 1;
    private Map<String, String> D = new HashMap();
    private Map<String, String> E = new HashMap();
    private String F = "";
    private final Object N = new Object();

    /* JADX INFO: renamed from: com.ironsource.s3$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4244s3.this.a();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s3$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C5 f33504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IronSource.a f33505b;

        public b(C5 c52, IronSource.a aVar) {
            this.f33504a = c52;
            this.f33505b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33504a.a("eventSessionId", AbstractC4244s3.this.f33497u.b());
            this.f33504a.a("essn", Integer.valueOf(AbstractC4244s3.this.f33497u.c()));
            String strA = IronSourceUtils.a(AbstractC4244s3.this.f33498v);
            if (AbstractC4244s3.this.g(this.f33504a)) {
                this.f33504a.a("connectionType", strA);
            }
            if (AbstractC4244s3.this.a(strA, this.f33504a)) {
                C5 c52 = this.f33504a;
                c52.a(AbstractC4244s3.this.b(c52));
            }
            String strD = C3924a4.d(AbstractC4244s3.this.f33498v);
            if (strD != null) {
                this.f33504a.a("rawConnectionType", strD);
            }
            int iA = AbstractC4244s3.this.a(this.f33504a.c(), this.f33505b);
            if (iA != e.NOT_SUPPORTED.b()) {
                this.f33504a.a("adUnit", Integer.valueOf(iA));
            }
            AbstractC4244s3.this.a(this.f33504a, "reason");
            AbstractC4244s3.this.a(this.f33504a, IronSourceConstants.EVENTS_EXT1);
            if (!AbstractC4244s3.this.E.isEmpty()) {
                for (Map.Entry entry : AbstractC4244s3.this.E.entrySet()) {
                    if (!this.f33504a.b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                        this.f33504a.a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (AbstractC4244s3.this.i(this.f33504a)) {
                if (AbstractC4244s3.this.h(this.f33504a) && !AbstractC4244s3.this.e(this.f33504a)) {
                    this.f33504a.a("sessionDepth", Integer.valueOf(AbstractC4244s3.this.c(this.f33504a)));
                }
                if (AbstractC4244s3.this.j(this.f33504a)) {
                    AbstractC4244s3.this.f(this.f33504a);
                }
                long jA = AbstractC4244s3.this.f33497u.a();
                if (jA > 0) {
                    this.f33504a.a("firstSessionTimestamp", Long.valueOf(jA));
                }
                IronLog.EVENT.verbose(this.f33504a.toString());
                AbstractC4244s3.this.f33494r.add(this.f33504a);
                AbstractC4244s3.this.f33496t++;
            }
            AbstractC4244s3 abstractC4244s3 = AbstractC4244s3.this;
            boolean zA = abstractC4244s3.a(abstractC4244s3.B) ? AbstractC4244s3.this.a(this.f33504a.c(), AbstractC4244s3.this.B) : AbstractC4244s3.this.d(this.f33504a);
            AbstractC4244s3 abstractC4244s32 = AbstractC4244s3.this;
            if (!abstractC4244s32.f33489m && zA) {
                abstractC4244s32.f33489m = true;
            }
            if (abstractC4244s32.f33492p != null) {
                if (abstractC4244s32.g()) {
                    AbstractC4244s3.this.f();
                    return;
                }
                AbstractC4244s3 abstractC4244s33 = AbstractC4244s3.this;
                if (abstractC4244s33.b((ArrayList<C5>) abstractC4244s33.f33494r) || zA) {
                    AbstractC4244s3.this.a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s3$c */
    public class c implements G7 {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(G7.a aVar) {
            try {
                if (aVar.c()) {
                    AbstractC4244s3 abstractC4244s3 = AbstractC4244s3.this;
                    ArrayList<C5> arrayListA = abstractC4244s3.f33492p.a(abstractC4244s3.I);
                    AbstractC4244s3.this.f33496t = arrayListA.size() + AbstractC4244s3.this.f33494r.size();
                } else {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    AbstractC4244s3.this.a(AbstractC4244s3.this.a(aVar.b(), aVar.a()));
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
            }
            a(aVar.b());
        }

        @Override // com.ironsource.G7
        public synchronized void a(final G7.a aVar) {
            AbstractC4244s3.this.K.a(new Runnable() { // from class: com.ironsource.wl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34361b.b(aVar);
                }
            });
        }

        public void a(ArrayList<C5> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e10) {
                    C4228r4.d().a(e10);
                    IronLog.INTERNAL.error("clearData exception: " + e10.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s3$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4244s3.this.f();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s3$e */
    public enum e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f33515a;

        e(int i10) {
            this.f33515a = i10;
        }

        public int b() {
            return this.f33515a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, @Nullable IronSource.a aVar) {
        int iB = e.NOT_SUPPORTED.b();
        return (aVar == IronSource.a.REWARDED_VIDEO || (i10 >= 1000 && i10 < 2000) || (i10 >= 91000 && i10 < 92000)) ? e.REWARDED_VIDEO.b() : (aVar == IronSource.a.INTERSTITIAL || (i10 >= 2000 && i10 < 3000) || (i10 >= 92000 && i10 < 93000)) ? e.INTERSTITIAL.b() : (aVar == IronSource.a.BANNER || (i10 >= 3000 && i10 < 4000) || (i10 >= 93000 && i10 < 94000)) ? e.BANNER.b() : (aVar == IronSource.a.NATIVE_AD || (i10 >= 4000 && i10 < 5000) || (i10 >= 94000 && i10 < 95000)) ? e.NATIVE_AD.b() : iB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<C5> a(ArrayList<C5> arrayList, String str) {
        String strA = a(str, 1024);
        Iterator<C5> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(strA);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.N) {
            this.f33492p.a(this.f33494r, this.I);
            this.f33494r.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C5 c52, String str) {
        a(c52, str, 1024);
    }

    private void a(C5 c52, String str, int i10) {
        JSONObject jSONObjectB = c52.b();
        if (jSONObjectB == null || !jSONObjectB.has(str)) {
            return;
        }
        try {
            c52.a(str, a(jSONObjectB.optString(str, null), i10));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void a(JSONObject jSONObject) {
        try {
            C4002ea c4002ea = this.L;
            if (c4002ea != null) {
                if (c4002ea.a() > 0) {
                    jSONObject.put("age", this.L.a());
                }
                if (!TextUtils.isEmpty(this.L.b())) {
                    jSONObject.put(C4002ea.f31567n, this.L.b());
                }
                if (this.L.e() > 0) {
                    jSONObject.put("lvl", this.L.e());
                }
                if (this.L.d() != null) {
                    jSONObject.put("pay", this.L.d().get());
                }
                if (this.L.c() > 0.0d) {
                    jSONObject.put("iapt", this.L.c());
                }
                if (this.L.h() > 0) {
                    jSONObject.put("ucd", this.L.h());
                }
            }
            Oe oe2 = this.M;
            if (oe2 != null) {
                String strB = oe2.b();
                if (!TextUtils.isEmpty(strB)) {
                    jSONObject.put("segmentId", strB);
                }
                JSONObject jSONObjectA = this.M.a();
                Iterator<String> itKeys = jSONObjectA.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectA.get(next));
                }
            }
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i10, int[] iArr) {
        if (!a(iArr)) {
            return false;
        }
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(String str, C5 c52) {
        if (str.equalsIgnoreCase("none")) {
            return a(this.C) ? a(c52.c(), this.C) : this.J.contains(Integer.valueOf(c52.c()));
        }
        return false;
    }

    private boolean a(ArrayList<C5> arrayList, int i10) {
        Iterator<C5> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().c() == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int b(C5 c52) {
        return c52.c() + 90000;
    }

    private void b(String str) {
        AbstractC3991e abstractC3991e = this.f33493q;
        if (abstractC3991e == null || !abstractC3991e.c().equals(str)) {
            this.f33493q = K5.a(str, this.G);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<C5> arrayList) {
        return arrayList != null && arrayList.size() >= this.f33501y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(C5 c52) {
        JSONObject jSONObjectB = c52.b();
        if (jSONObjectB == null) {
            return false;
        }
        return jSONObjectB.has("sessionDepth");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void f() {
        ArrayList<C5> arrayListA;
        try {
            this.f33489m = false;
            ArrayList<C5> arrayList = new ArrayList<>();
            try {
                synchronized (this.N) {
                    arrayListA = this.f33492p.a(this.I);
                    this.f33492p.b(this.I);
                }
                H5.c cVar = new H5.c(new H5.a(arrayListA, this.f33494r), this.f33500x);
                this.f33492p.a(cVar.a(), this.I);
                arrayList.addAll(cVar.b());
            } catch (Throwable th2) {
                C4228r4.d().a(th2);
                IronLog.INTERNAL.error("CombinedEventList exception: " + th2.getMessage());
                arrayList.clear();
                arrayList.addAll(this.f33494r);
            }
            if (arrayList.size() > 0) {
                this.f33494r.clear();
                this.f33496t = 0;
                JSONObject jSONObjectB = N6.a().b();
                try {
                    a(jSONObjectB);
                    String strB = b();
                    if (!TextUtils.isEmpty(strB)) {
                        jSONObjectB.put("abt", strB);
                    }
                    String strP = com.ironsource.mediationsdk.r.m().p();
                    if (!TextUtils.isEmpty(strP)) {
                        jSONObjectB.put(Q6.f30210a1, strP);
                    }
                    Map<String, String> mapC = c();
                    if (!mapC.isEmpty()) {
                        for (Map.Entry<String, String> entry : mapC.entrySet()) {
                            if (!jSONObjectB.has(entry.getKey())) {
                                jSONObjectB.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    JSONObject jSONObjectA = new M5().a();
                    Iterator<String> itKeys = jSONObjectA.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObjectB.put(next, jSONObjectA.get(next));
                    }
                } catch (Throwable th3) {
                    C4228r4.d().a(th3);
                    IronLog.INTERNAL.error("Exception while building the event general properties: " + th3.getMessage());
                }
                String strA = this.f33493q.a(arrayList, jSONObjectB);
                if (TextUtils.isEmpty(strA)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    return;
                }
                if (!O && this.f33488l && a(arrayList, D5.FIRST_INSTANCE.b())) {
                    IronLog.INTERNAL.verbose("events data: " + strA);
                    O = true;
                }
                if (this.f33490n) {
                    try {
                        strA = Base64.encodeToString(U9.a(strA, this.f33491o), 0);
                    } catch (Exception e10) {
                        C4228r4.d().a(e10);
                    }
                }
                C4341xf.f34397a.a(new N5(new c(), strA, this.f33493q.b(), arrayList));
            }
        } catch (Throwable th4) {
            C4228r4.d().a(th4);
            IronLog.INTERNAL.error("Send event exception: " + th4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.f33496t >= this.f33499w || this.f33489m) && this.f33488l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(C5 c52) {
        if (c52 == null) {
            return false;
        }
        if (a(this.f33502z)) {
            return true ^ a(c52.c(), this.f33502z);
        }
        if (a(this.A)) {
            return a(c52.c(), this.A);
        }
        return true;
    }

    public String a(String str, int i10) {
        return (TextUtils.isEmpty(str) || str.length() <= i10) ? str : str.substring(0, i10);
    }

    @Override // com.ironsource.F7
    public void a(int i10) {
        if (i10 > 0) {
            this.f33499w = i10;
        }
    }

    public synchronized void a(Context context, C4002ea c4002ea) {
        String strA = IronSourceUtils.a(context, this.I, this.H);
        this.H = strA;
        b(strA);
        this.f33493q.a(IronSourceUtils.b(context, this.I, (String) null));
        this.f33492p = G4.a(context, "supersonic_sdk.db", 5);
        this.K.a(new a());
        this.f33502z = IronSourceUtils.c(context, this.I);
        this.A = IronSourceUtils.b(context, this.I);
        this.B = IronSourceUtils.d(context, this.I);
        this.C = IronSourceUtils.a(context, this.I);
        this.L = c4002ea;
        this.f33498v = context;
    }

    @Override // com.ironsource.F7
    public synchronized void a(C5 c52) {
        a(c52, (IronSource.a) null);
    }

    public synchronized void a(C5 c52, @Nullable IronSource.a aVar) {
        if (c52 != null) {
            if (this.f33495s) {
                this.K.a(new b(c52, aVar));
            }
        }
    }

    public synchronized void a(Oe oe2) {
        this.M = oe2;
    }

    public void a(C4002ea c4002ea) {
        this.L = c4002ea;
    }

    public void a(Runnable runnable) {
        this.K.a(runnable);
    }

    public void a(String str) {
        this.F = str;
    }

    @Override // com.ironsource.F7
    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.H = str;
        IronSourceUtils.d(context, this.I, str);
        b(str);
    }

    public void a(ArrayList<C5> arrayList) {
        if (arrayList != null) {
            synchronized (this.N) {
                this.f33492p.a(arrayList, this.I);
                this.f33496t = this.f33492p.a(this.I).size() + this.f33494r.size();
            }
        }
    }

    public void a(Map<String, String> map) {
        this.D.putAll(map);
    }

    public void a(Map<String, Object> map, int i10, String str) {
        map.put("auctionTrials", Integer.valueOf(i10));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    @Override // com.ironsource.F7
    public void a(boolean z10) {
        this.f33495s = z10;
    }

    @Override // com.ironsource.F7
    public void a(int[] iArr, Context context) {
        this.B = iArr;
        IronSourceUtils.d(context, this.I, iArr);
    }

    public String b() {
        return this.F;
    }

    @Override // com.ironsource.F7
    public void b(int i10) {
        if (i10 > 0) {
            this.f33501y = i10;
        }
    }

    @Override // com.ironsource.F7
    public void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC3991e abstractC3991e = this.f33493q;
        if (abstractC3991e != null) {
            abstractC3991e.a(str);
        }
        IronSourceUtils.e(context, this.I, str);
    }

    public void b(Map<String, String> map) {
        this.E.putAll(map);
    }

    @Override // com.ironsource.F7
    public void b(boolean z10) {
        this.f33490n = z10;
    }

    @Override // com.ironsource.F7
    public void b(int[] iArr, Context context) {
        this.f33502z = iArr;
        IronSourceUtils.c(context, this.I, iArr);
    }

    public abstract int c(C5 c52);

    public Map<String, String> c() {
        return this.D;
    }

    @Override // com.ironsource.F7
    public void c(int i10) {
        this.f33491o = i10;
    }

    public void c(boolean z10) {
        this.f33488l = z10;
    }

    @Override // com.ironsource.F7
    public void c(int[] iArr, Context context) {
        this.A = iArr;
        IronSourceUtils.b(context, this.I, iArr);
    }

    public abstract void d();

    @Override // com.ironsource.F7
    public void d(int i10) {
        if (i10 > 0) {
            this.f33500x = i10;
        }
    }

    @Override // com.ironsource.F7
    public void d(int[] iArr, Context context) {
        this.C = iArr;
        IronSourceUtils.a(context, this.I, iArr);
    }

    public abstract boolean d(C5 c52);

    public abstract String e(int i10);

    public void e() {
        this.f33494r = new ArrayList<>();
        this.f33496t = 0;
        this.f33493q = K5.a(this.H, this.G);
        F5 f52 = new F5(this.I + "EventThread");
        this.K = f52;
        f52.start();
        this.K.a();
        this.f33497u = Lb.U().m();
        this.J = new HashSet();
        d();
    }

    public int f(int i10) {
        return a(i10, (IronSource.a) null);
    }

    public abstract void f(C5 c52);

    public boolean g(C5 c52) {
        return (c52.c() == D5.CONSENT_TRUE_CODE.b() || c52.c() == D5.CONSENT_FALSE_CODE.b() || c52.c() == D5.SET_META_DATA.b() || c52.c() == D5.SET_META_DATA_AFTER_INIT.b() || c52.c() == D5.SET_USER_ID.b()) ? false : true;
    }

    public void h() {
        this.K.a(new d());
    }

    public boolean h(C5 c52) {
        return (c52.c() == D5.FIRST_INSTANCE.b() || c52.c() == D5.FIRST_INSTANCE_RESULT.b() || c52.c() == D5.INIT_COMPLETE.b() || c52.c() == D5.SDK_INIT_FAILED.b() || c52.c() == D5.SDK_INIT_SUCCESS.b() || c52.c() == D5.USING_CACHE_FOR_INIT_EVENT.b() || c52.c() == D5.CONSENT_TRUE_CODE.b() || c52.c() == D5.CONSENT_FALSE_CODE.b() || c52.c() == D5.SET_META_DATA.b() || c52.c() == D5.SET_META_DATA_AFTER_INIT.b() || c52.c() == D5.SET_USER_ID.b()) ? false : true;
    }

    public abstract boolean j(C5 c52);
}
