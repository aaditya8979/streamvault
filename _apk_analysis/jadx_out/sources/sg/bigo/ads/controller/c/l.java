package sg.bigo.ads.controller.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3978d4;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.h;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.api.core.t;
import sg.bigo.ads.core.f.a.a;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends b implements sg.bigo.ads.core.a.a {
    private static final AtomicInteger K = new AtomicInteger();
    public String A;

    @Nullable
    public n.a B;

    @Nullable
    public n.a[] C;

    @Nullable
    public n.c D;
    public int E;
    public int F;

    @Nullable
    public n.b G;

    @Nullable
    public n.d H;
    public int I;

    @Nullable
    public h.b J;

    @Nullable
    private sg.bigo.ads.core.f.a.p L;

    @Nullable
    private sg.bigo.ads.api.core.m M;
    private boolean N;
    private String O;

    @NonNull
    private int P;
    private int Q;

    @NonNull
    private long R;
    private a.C1046a S;
    private a.C1046a T;
    private boolean U;
    private boolean V;
    private int W;
    private int X;
    private int Y;
    private int Z;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private Pair<Bitmap, String> f83162aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private boolean f83163ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private final String f83164ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private String f83165ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private boolean f83166ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private t f83167af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private int f83168ag;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private AtomicInteger f83169ah;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private AtomicInteger f83170ai;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private int f83171aj;

    public l(long j10, @NonNull sg.bigo.ads.api.core.g gVar, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull JSONObject jSONObject) {
        super(j10, gVar, lVar, jSONObject);
        this.F = 0;
        this.I = 0;
        this.N = false;
        this.P = 0;
        this.Q = 0;
        this.U = false;
        this.V = false;
        this.W = 4;
        this.X = 6;
        this.Y = 4;
        this.Z = 0;
        this.f83163ab = false;
        this.f83169ah = new AtomicInteger(0);
        this.f83170ai = new AtomicInteger(0);
        this.A = jSONObject.optString("iurl");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("icon");
        if (jSONObjectOptJSONObject != null) {
            this.B = new i(jSONObjectOptJSONObject);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject2 != null) {
                    arrayList.add(new i(jSONObjectOptJSONObject2));
                }
            }
            i[] iVarArr = new i[arrayList.size()];
            this.C = iVarArr;
            this.C = (n.a[]) arrayList.toArray(iVarArr);
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject3 != null) {
            this.D = new r(jSONObjectOptJSONObject3);
        }
        this.G = new j(jSONObject);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_play_cfg");
        if (jSONObjectOptJSONObject4 != null) {
            this.H = new s(jSONObjectOptJSONObject4);
        }
        this.E = jSONObject.optInt("immersive_ad_type", 0);
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("display");
        if (jSONObjectOptJSONObject5 != null) {
            this.J = new h(jSONObjectOptJSONObject5);
        }
        this.f83164ac = this.f83117k + "_" + this.f83108b + "_" + K.addAndGet(1);
    }

    @Nullable
    private sg.bigo.ads.core.f.a.b bu() {
        sg.bigo.ads.core.f.a.p pVar = this.L;
        if (pVar != null) {
            return pVar.f83959n;
        }
        return null;
    }

    @Override // sg.bigo.ads.api.core.n
    @NonNull
    public final String a(Context context) {
        return aS() ? sg.bigo.ads.common.o.c(context) : sg.bigo.ads.common.o.b(context);
    }

    @Override // sg.bigo.ads.api.core.n
    public final void a(Pair<Bitmap, String> pair) {
        this.f83162aa = pair;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void a(sg.bigo.ads.api.core.m mVar) {
        sg.bigo.ads.api.core.m mVar2 = this.M;
        if (mVar2 == null || mVar2.f81895c <= 0 || mVar.f81895c != 0) {
            this.M = mVar;
        }
    }

    @Override // sg.bigo.ads.core.a.a
    public final void a(a.C1046a c1046a) {
        this.S = c1046a;
    }

    @Override // sg.bigo.ads.core.a.a
    public final void a(sg.bigo.ads.core.f.a.p pVar) {
        this.L = pVar;
        if (pVar != null && sg.bigo.ads.common.utils.q.b((CharSequence) pVar.f83958m)) {
            N().a(this.L.f83958m);
        }
        n.d dVar = this.H;
        if (dVar != null) {
            dVar.a(aU());
        }
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final n.b aA() {
        return this.G;
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final n.d aB() {
        return this.H;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int aC() {
        return this.P;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int aD() {
        return this.Q;
    }

    @Override // sg.bigo.ads.api.core.n
    public final long aE() {
        return this.R;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean aF() {
        a.C1046a c1046a = this.T;
        return c1046a != null && c1046a.a();
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean aG() {
        a.C1046a c1046a = this.S;
        return c1046a != null && c1046a.a();
    }

    @Override // sg.bigo.ads.api.core.n
    public final int aH() {
        return this.F;
    }

    @Override // sg.bigo.ads.api.core.n
    public final String aI() {
        return this.f83165ad;
    }

    @Override // sg.bigo.ads.api.core.n
    public final String aJ() {
        return !TextUtils.isEmpty(this.f83164ac) ? this.f83164ac : String.valueOf(this.f83115i);
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final String aK() {
        sg.bigo.ads.core.f.a.b bVarBu = bu();
        if (bVarBu != null) {
            return bVarBu.f83902c;
        }
        return null;
    }

    @Override // sg.bigo.ads.api.core.n
    public final long aL() {
        n.d dVar = this.H;
        if (dVar != null) {
            return dVar.a();
        }
        return 0L;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int aM() {
        return this.I;
    }

    @Override // sg.bigo.ads.api.core.n
    public final String aN() {
        sg.bigo.ads.core.f.a.b bVarBu = bu();
        String str = bVarBu != null ? bVarBu.f83904e : null;
        if (sg.bigo.ads.common.utils.q.b((CharSequence) str)) {
            return str;
        }
        sg.bigo.ads.core.f.a.p pVar = this.L;
        if (pVar != null) {
            return pVar.f83960o;
        }
        return null;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean aO() {
        n.d dVar;
        if (!aS() && (dVar = this.H) != null && dVar.b() && dVar.c() < 100) {
            sg.bigo.ads.core.f.a.b bVarBu = bu();
            if (bVarBu != null ? "video/mp4".equals(bVarBu.f83903d) : false) {
                return true;
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final String aP() {
        return aK();
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final String aQ() {
        String strAN = aN();
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) strAN)) {
            return strAN;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hashCode());
        return sb2.toString();
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean aR() {
        return this.f83113g == 2;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean aS() {
        sg.bigo.ads.core.f.a.b bVarBu = bu();
        return bVarBu != null && bVarBu.a();
    }

    @Override // sg.bigo.ads.api.core.n
    public final String aT() {
        n.a aVar;
        n.a[] aVarArr = this.C;
        if (aVarArr == null || aVarArr.length <= 0 || (aVar = aVarArr[0]) == null) {
            return null;
        }
        return aVar.c();
    }

    @Override // sg.bigo.ads.api.core.n
    public final long aU() {
        sg.bigo.ads.core.f.a.p pVar = this.L;
        if (pVar != null) {
            return pVar.f83964s;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final sg.bigo.ads.api.core.m aV() {
        return this.M;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean aW() {
        return this.N;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void aX() {
        this.N = true;
    }

    @Override // sg.bigo.ads.api.core.n
    public final String aY() {
        String strAT;
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) this.O)) {
            return this.O;
        }
        if (aR()) {
            sg.bigo.ads.core.f.a.b bVarBu = bu();
            if (bVarBu != null) {
                this.O = bVarBu.f83903d;
            }
            if (!sg.bigo.ads.common.utils.q.a((CharSequence) this.O)) {
                return this.O;
            }
            strAT = aK();
        } else {
            strAT = aT();
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(strAT));
        this.O = mimeTypeFromExtension;
        return mimeTypeFromExtension;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean aZ() {
        return this.f83163ab;
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final n.a av() {
        return this.B;
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final h.b aw() {
        return this.J;
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final n.a[] ax() {
        return this.C;
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final n.c ay() {
        return this.D;
    }

    @Override // sg.bigo.ads.api.core.n
    @Nullable
    public final String az() {
        return this.A;
    }

    @Override // sg.bigo.ads.api.core.n
    @NonNull
    public final String b(Context context) {
        return a(context) + File.separator + aQ();
    }

    @Override // sg.bigo.ads.api.core.n
    public final void b(long j10) {
        this.R = j10;
    }

    @Override // sg.bigo.ads.core.a.a
    public final void b(a.C1046a c1046a) {
        this.T = c1046a;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void ba() {
        this.f83163ab = true;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean bb() {
        return this.U;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void bc() {
        this.U = true;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int bd() {
        return this.W;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int be() {
        return this.X;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int bf() {
        return this.Y;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int bg() {
        return this.Z;
    }

    @Override // sg.bigo.ads.api.core.n
    public final Pair<Bitmap, String> bh() {
        return this.f83162aa;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean bi() {
        return this.V;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void bj() {
        this.V = true;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void bk() {
        this.f83166ae = true;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean bl() {
        return this.f83166ae;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int bm() {
        return this.f83168ag;
    }

    @Override // sg.bigo.ads.api.core.n
    public final int bn() {
        return this.f83169ah.get();
    }

    @Override // sg.bigo.ads.api.core.n
    public final int bo() {
        return this.f83170ai.get();
    }

    @Override // sg.bigo.ads.api.core.n
    public final int bp() {
        return this.f83171aj;
    }

    @Override // sg.bigo.ads.core.a.a
    public final a.C1046a bq() {
        return this.S;
    }

    @Override // sg.bigo.ads.core.a.a
    public final a.C1046a br() {
        return this.T;
    }

    @Override // sg.bigo.ads.core.a.a
    @NonNull
    public final t bs() {
        if (this.f83167af == null) {
            this.f83167af = new t(this.f83132z);
        }
        return this.f83167af;
    }

    @Override // sg.bigo.ads.core.a.a
    public final sg.bigo.ads.core.f.a.p bt() {
        return this.L;
    }

    @Override // sg.bigo.ads.api.core.n
    public final String c(Context context) {
        Pair pair;
        if (!aO()) {
            this.I = 0;
            return b(context);
        }
        sg.bigo.ads.core.player.a.d dVarB = sg.bigo.ads.core.player.b.a().b();
        String strAK = aK();
        String strA = a(context);
        String strAQ = aQ();
        File file = new File(strA, strAQ);
        if (file.exists()) {
            pair = new Pair(Uri.fromFile(file).toString(), 1);
        } else if (dVarB.a()) {
            StringBuilder sb2 = new StringBuilder(strAK);
            if (strAK.contains("?")) {
                sb2.append(C3978d4.j.f31381c);
            } else {
                sb2.append("?");
            }
            sb2.append("path=");
            sb2.append(strA);
            sb2.append(C3978d4.j.f31381c);
            sb2.append("name=");
            sb2.append(strAQ);
            pair = new Pair(String.format(Locale.US, "http://%s:%d/%s", "127.0.0.1", Integer.valueOf(dVarB.f84250c), sg.bigo.ads.common.utils.q.e(sb2.toString())), 2);
        } else {
            pair = new Pair(strAK, 3);
        }
        this.I = ((Integer) pair.second).intValue();
        return (String) pair.first;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void c(String str) {
        if ("video/mp4".equals(this.O) || sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        this.O = str;
    }

    @Override // sg.bigo.ads.api.core.n
    public final boolean c(@IntRange(from = 1, to = 100) long j10) {
        n.d dVar = this.H;
        return j10 >= ((long) (dVar != null ? dVar.c() : 50));
    }

    @Override // sg.bigo.ads.api.core.n
    public final void f(int i10) {
        this.P = i10;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void g(int i10) {
        this.Q = i10;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void h(int i10) {
        this.W = i10;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void i(int i10) {
        this.X = i10;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void j(int i10) {
        this.Y = i10;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void k(int i10) {
        this.Z = i10;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void l(int i10) {
        this.f83168ag = i10;
    }

    @Override // sg.bigo.ads.api.core.n
    public final void m(int i10) {
        this.f83169ah.set(i10);
    }

    @Override // sg.bigo.ads.api.core.n
    public final void n(int i10) {
        this.f83170ai.set(i10);
    }

    @Override // sg.bigo.ads.api.core.n
    public final void o(int i10) {
        this.f83171aj = i10;
    }

    @Override // sg.bigo.ads.controller.c.b, sg.bigo.ads.api.core.b
    public final String s() {
        sg.bigo.ads.core.f.a.p pVar = this.L;
        return (pVar == null || !sg.bigo.ads.common.utils.q.b((CharSequence) pVar.f83961p)) ? super.s() : this.L.f83961p;
    }

    @Override // sg.bigo.ads.controller.c.b, sg.bigo.ads.api.core.b
    public final String t() {
        sg.bigo.ads.core.f.a.p pVar = this.L;
        return (pVar == null || !sg.bigo.ads.common.utils.q.b((CharSequence) pVar.f83962q)) ? super.t() : this.L.f83962q;
    }
}
