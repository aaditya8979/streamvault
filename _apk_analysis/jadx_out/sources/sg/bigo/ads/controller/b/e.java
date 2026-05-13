package sg.bigo.ads.controller.b;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.n;
import sg.bigo.ads.api.a.o;
import sg.bigo.ads.api.core.k;
import sg.bigo.ads.api.core.l;
import sg.bigo.ads.api.core.r;
import sg.bigo.ads.api.core.s;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e extends sg.bigo.ads.common.e implements sg.bigo.ads.api.a.h {
    public int A;
    public boolean B;
    public String C;
    public String D;
    public l E;
    public sg.bigo.ads.api.a.g F;
    public n G;
    public o H;

    @Deprecated
    public String I;
    public Map<String, sg.bigo.ads.api.a.c> J;

    @Deprecated
    public String K;
    public String L;
    public c M;
    public int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg.bigo.ads.api.a.b f83032a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f83033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f83034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f83035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public sg.bigo.ads.common.a f83036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public sg.bigo.ads.common.a f83037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public sg.bigo.ads.common.s.a f83038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public sg.bigo.ads.common.a f83039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f83040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f83041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f83042n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f83043o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f83044p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f83045q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f83046r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f83047s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f83048t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f83049u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f83050v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f83051w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f83052x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    public String f83053y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f83054z;

    public e(@NonNull Context context) {
        super(context);
        this.f83046r = 1;
        this.E = new l();
        this.F = new k();
        this.G = new r();
        this.H = new s();
        this.J = new HashMap();
        this.M = new c();
        this.f83032a = new b();
        this.S = 0;
        this.T = 0;
    }

    public static long E() {
        return sg.bigo.ads.common.utils.r.f82514a.a(30);
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.O = jSONObject.optInt("host_retry", 0);
            this.P = jSONObject.optInt("retry_times", 3);
            this.Q = jSONObject.optInt("retry_interval", 60);
            this.R = jSONObject.optInt("next_retry_interval", 7);
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.api.a.h
    public final int A() {
        return this.R;
    }

    public final void B() {
        L();
        K();
        M();
    }

    public final int C() {
        boolean z10 = Math.abs((sg.bigo.ads.common.utils.r.b() / 1000) - this.f83040l) > ((long) this.f83043o);
        return this.f83046r == 0 ? z10 ? 4 : 5 : z10 ? 3 : 2;
    }

    public final int D() {
        return this.A;
    }

    public final String F() {
        return this.f83054z;
    }

    public final String G() {
        return this.L;
    }

    public final boolean H() {
        return this.f83041m;
    }

    public final String I() {
        return this.C;
    }

    @NonNull
    public final n J() {
        return this.G;
    }

    public final sg.bigo.ads.common.a K() {
        if (this.f83036h == null) {
            this.f83036h = sg.bigo.ads.common.a.f81938a;
        }
        if (this.f83036h.a()) {
            sg.bigo.ads.common.n.d.a(0, new Runnable() { // from class: sg.bigo.ads.controller.b.e.1
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = e.this;
                    eVar.f83036h = sg.bigo.ads.common.o.c.a(eVar.f81994b);
                    e.this.a(0L);
                }
            });
        }
        return this.f83036h;
    }

    public final sg.bigo.ads.common.a L() {
        if (this.f83037i == null) {
            this.f83037i = sg.bigo.ads.common.a.f81938a;
        }
        if (this.f83037i.a()) {
            sg.bigo.ads.common.n.d.a(0, new Runnable() { // from class: sg.bigo.ads.controller.b.e.2
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = e.this;
                    eVar.f83037i = sg.bigo.ads.common.l.b.a(eVar.f81994b);
                    e.this.a(0L);
                }
            });
        }
        return this.f83037i;
    }

    public final sg.bigo.ads.common.a M() {
        if (this.f83039k == null) {
            this.f83039k = sg.bigo.ads.common.a.f81938a;
        }
        if (this.f83039k.a()) {
            sg.bigo.ads.common.n.d.a(0, new Runnable() { // from class: sg.bigo.ads.controller.b.e.3
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = e.this;
                    eVar.f83039k = sg.bigo.ads.common.k.a.a(eVar.f81994b);
                    e.this.a(0L);
                }
            });
        }
        return this.f83039k;
    }

    public final boolean N() {
        return this.f83040l != 0;
    }

    @Override // sg.bigo.ads.common.e
    public final String a() {
        return "bigoad_config.dat";
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        if (this.f83036h == null) {
            this.f83036h = sg.bigo.ads.common.a.f81938a;
        }
        this.f83036h.a(parcel);
        if (this.f83037i == null) {
            this.f83037i = sg.bigo.ads.common.a.f81938a;
        }
        this.f83037i.a(parcel);
        if (this.f83038j == null) {
            this.f83038j = new sg.bigo.ads.common.s.a(this.f81994b);
        }
        this.f83038j.a(parcel);
        parcel.writeInt(this.f83041m ? 1 : 0);
        parcel.writeLong(this.f83042n);
        parcel.writeInt(this.f83043o);
        parcel.writeString(this.f83044p);
        parcel.writeString(this.f83045q);
        parcel.writeInt(this.f83046r);
        parcel.writeString(this.f83047s);
        parcel.writeString(this.f83048t);
        parcel.writeString(this.f83049u);
        parcel.writeString(this.f83050v);
        parcel.writeString(this.f83051w);
        parcel.writeString(this.f83052x);
        parcel.writeString(this.f83053y);
        parcel.writeString(this.f83054z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeString(this.C);
        parcel.writeLong(this.f83040l);
        this.E.a(parcel);
        parcel.writeString(this.D);
        this.F.a(parcel);
        parcel.writeString(this.I);
        Map<String, sg.bigo.ads.api.a.c> map = this.J;
        int size = map == null ? 0 : map.size();
        parcel.writeInt(size);
        if (size != 0) {
            for (Map.Entry<String, sg.bigo.ads.api.a.c> entry : map.entrySet()) {
                String key = entry.getKey();
                sg.bigo.ads.api.a.c value = entry.getValue();
                if (key == null || value == null) {
                    parcel.writeInt(0);
                } else {
                    sg.bigo.ads.common.n.a(parcel, value);
                    parcel.writeString(key);
                }
            }
        }
        parcel.writeString(this.K);
        this.G.a(parcel);
        this.H.a(parcel);
        parcel.writeString(this.L);
        sg.bigo.ads.common.n.a(parcel, this.M);
        parcel.writeInt(this.N);
        sg.bigo.ads.common.n.a(parcel, this.f83032a);
        parcel.writeInt(this.f83033e);
        parcel.writeInt(this.f83034f);
        if (this.f83039k == null) {
            this.f83039k = sg.bigo.ads.common.a.f81938a;
        }
        this.f83039k.a(parcel);
        parcel.writeInt(this.S);
        parcel.writeInt(this.T);
        parcel.writeString(this.f83035g);
    }

    public abstract void a(JSONObject jSONObject);

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f83036h = new sg.bigo.ads.common.a(parcel);
        this.f83037i = new sg.bigo.ads.common.a(parcel);
        this.f83038j = new sg.bigo.ads.common.s.a(this.f81994b, parcel);
        this.f83041m = parcel.readInt() != 0;
        this.f83042n = parcel.readLong();
        this.f83043o = parcel.readInt();
        this.f83044p = parcel.readString();
        this.f83045q = parcel.readString();
        this.f83046r = parcel.readInt();
        this.f83047s = parcel.readString();
        this.f83048t = parcel.readString();
        this.f83049u = parcel.readString();
        this.f83050v = parcel.readString();
        this.f83051w = parcel.readString();
        this.f83052x = parcel.readString();
        this.f83053y = parcel.readString();
        this.f83054z = parcel.readString();
        this.A = parcel.readInt();
        this.B = parcel.readInt() != 0;
        this.C = parcel.readString();
        this.f83040l = parcel.readLong();
        if (parcel.dataAvail() > 0) {
            this.E.b(parcel);
        }
        if (parcel.dataAvail() > 0) {
            this.D = parcel.readString();
        }
        if (parcel.dataAvail() > 0) {
            this.F.b(parcel);
        }
        this.I = sg.bigo.ads.common.n.a(parcel, "");
        this.J = sg.bigo.ads.common.n.a(parcel, sg.bigo.ads.api.a.c.f81790b, new HashMap());
        this.K = sg.bigo.ads.common.n.a(parcel, "");
        if (parcel.dataAvail() > 0) {
            this.G.b(parcel);
        }
        if (parcel.dataAvail() > 0) {
            this.H.b(parcel);
        }
        this.L = sg.bigo.ads.common.n.a(parcel, "");
        sg.bigo.ads.common.n.b(parcel, this.M);
        this.N = sg.bigo.ads.common.n.a(parcel, 0);
        sg.bigo.ads.common.n.b(parcel, this.f83032a);
        this.f83033e = sg.bigo.ads.common.n.a(parcel, 0);
        this.f83034f = sg.bigo.ads.common.n.a(parcel, 0);
        this.f83039k = new sg.bigo.ads.common.a(parcel);
        this.S = sg.bigo.ads.common.n.a(parcel, 0);
        this.T = sg.bigo.ads.common.n.a(parcel, 0);
        String strA = sg.bigo.ads.common.n.a(parcel, "");
        this.f83035g = strA;
        a(strA);
    }

    public abstract void b(JSONObject jSONObject);

    public abstract void c(JSONObject jSONObject);

    @Override // sg.bigo.ads.api.a.h
    public final boolean c() {
        return this.E.a(6);
    }

    public abstract void d(JSONObject jSONObject);

    @Override // sg.bigo.ads.api.a.h
    public final boolean d() {
        return this.E.a(7);
    }

    @CallSuper
    public final int e(@NonNull JSONObject jSONObject) {
        this.f83041m = jSONObject.optInt("state", 1) == 1;
        this.f83042n = jSONObject.optLong("config_id", 0L);
        this.f83043o = jSONObject.optInt("conf_interval", 3600);
        this.f83044p = jSONObject.optString("token", "");
        this.f83045q = jSONObject.optString("anti_ban", "");
        this.f83046r = jSONObject.optInt("config_strategy", 1);
        this.f83047s = jSONObject.optString("abflags", "");
        this.f83048t = jSONObject.optString("country", "");
        this.L = jSONObject.optString("req_country", "");
        int iOptInt = jSONObject.optInt("app_flag", 0);
        int i10 = iOptInt != this.N ? 1 : 0;
        this.N = iOptInt;
        this.f83033e = jSONObject.optInt("ad_net", 0);
        this.f83034f = jSONObject.optInt("orientation", 0);
        this.S = jSONObject.optInt("token_v", 0);
        this.T = jSONObject.optInt("token_exp", 0);
        String strOptString = jSONObject.optString("host_retry_cfg", "");
        this.f83035g = strOptString;
        a(strOptString);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("creatives");
        if (jSONObjectOptJSONObject != null) {
            this.f83049u = jSONObjectOptJSONObject.toString();
        } else {
            this.f83049u = "";
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("track");
        if (jSONObjectOptJSONObject2 != null) {
            this.f83050v = jSONObjectOptJSONObject2.toString();
        } else {
            this.f83050v = "";
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("cb");
        if (jSONObjectOptJSONObject3 != null) {
            this.f83051w = jSONObjectOptJSONObject3.toString();
        } else {
            this.f83051w = "";
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject(CrashEvent.f52788e);
        if (jSONObjectOptJSONObject4 != null) {
            this.f83052x = jSONObjectOptJSONObject4.toString();
        } else {
            this.f83052x = "";
        }
        this.f83053y = "";
        this.K = "";
        String strOptString2 = jSONObject.optString("uid", "");
        if (!TextUtils.isEmpty(strOptString2)) {
            this.f83054z = strOptString2;
        }
        int iOptInt2 = jSONObject.optInt("concurrent_req_num", 3);
        this.A = iOptInt2;
        if (iOptInt2 <= 0) {
            this.A = Integer.MAX_VALUE;
        }
        this.B = jSONObject.optInt("neg_feedback", 1) == 1;
        this.C = jSONObject.optString("om_js_url", "");
        this.D = jSONObject.optString("banner_js_url", "");
        this.F.a(jSONObject.optJSONObject("free_material"));
        this.G.a(jSONObject.optJSONObject("u_running_conf"));
        this.H.a(jSONObject.optJSONObject("u_running_inf"));
        this.E.f81892a = jSONObject.optLong("global_switch", 0L);
        this.I = "";
        c cVar = this.M;
        String strOptString3 = jSONObject.optString("ad_fill_strategy");
        if (!TextUtils.isEmpty(strOptString3)) {
            try {
                JSONObject jSONObject2 = new JSONObject(strOptString3);
                cVar.f83010a = jSONObject2.optInt(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, 0);
                cVar.f83011b = jSONObject2.optString("white_dsp", "");
                cVar.f83012c = jSONObject2.optString("black_dsp", "");
                cVar.f83013d = jSONObject2.optInt("int_time", 0);
                cVar.f83014e = jSONObject2.optInt("rew_time", 0);
                cVar.f83015f = jSONObject2.optInt("spl_time", 0);
                cVar.f83016g = jSONObject2.optInt("nat_time", 0);
                cVar.f83017h = jSONObject2.optInt("pop_time", 0);
                cVar.f83018i.a(jSONObject2);
                cVar.f83019j.a(jSONObject2);
                cVar.f83020k.a(jSONObject2);
                cVar.f83021l.a(jSONObject2);
                cVar.f83022m.a(jSONObject2);
            } catch (JSONException unused) {
            }
        }
        this.f83032a.a(jSONObject.optString("ad_fill_cost_optimize_strategy"));
        String strOptString4 = jSONObject.optString("global_conf");
        JSONArray jSONArray = null;
        try {
            if (!q.a((CharSequence) strOptString4)) {
                jSONArray = new JSONArray(strOptString4);
            }
        } catch (JSONException unused2) {
        }
        HashMap map = new HashMap();
        for (int i11 = 0; jSONArray != null && i11 < jSONArray.length(); i11++) {
            JSONObject jSONObjectOptJSONObject5 = jSONArray.optJSONObject(i11);
            if (jSONObjectOptJSONObject5 != null) {
                String strOptString5 = jSONObjectOptJSONObject5.optString("key");
                if (!q.a((CharSequence) strOptString5)) {
                    map.put(strOptString5, new sg.bigo.ads.api.a.c(jSONObjectOptJSONObject5.optString("value", "")));
                }
            }
        }
        this.J = map;
        a(jSONObjectOptJSONObject2);
        b(jSONObjectOptJSONObject);
        c(jSONObjectOptJSONObject4);
        d(jSONObjectOptJSONObject3);
        this.f83040l = sg.bigo.ads.common.utils.r.b() / 1000;
        return i10;
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean e() {
        return d();
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean f() {
        return this.E.a(5);
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean g() {
        return this.E.a(4);
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean h() {
        return this.E.a(22);
    }

    @Override // sg.bigo.ads.api.a.h
    public final long i() {
        return this.f83042n;
    }

    @Override // sg.bigo.ads.api.a.h
    public final String j() {
        return this.f83047s;
    }

    @Override // sg.bigo.ads.api.a.h
    public final String k() {
        return this.f83048t;
    }

    @Override // sg.bigo.ads.api.a.h
    public final String l() {
        return this.f83044p;
    }

    @Override // sg.bigo.ads.api.a.h
    @NonNull
    public final sg.bigo.ads.api.a.j n() {
        return this.E;
    }

    @Override // sg.bigo.ads.api.a.h
    public final String o() {
        return this.D;
    }

    @Override // sg.bigo.ads.api.a.h
    @NonNull
    public final sg.bigo.ads.api.a.g p() {
        return this.F;
    }

    @Override // sg.bigo.ads.api.a.h
    @NonNull
    public final sg.bigo.ads.api.a.b q() {
        return this.f83032a;
    }

    @Override // sg.bigo.ads.api.a.h
    public final sg.bigo.ads.api.a.d r() {
        return this.M;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int s() {
        return this.N;
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean t() {
        return this.f83033e == 1;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int u() {
        return this.f83034f;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int v() {
        return this.S;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int w() {
        return this.T;
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean x() {
        return 1 == this.O;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int y() {
        return this.P;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int z() {
        return this.Q;
    }
}
