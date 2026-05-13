package sg.bigo.ads.controller.b;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.k;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.f;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes12.dex */
class i implements l, sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f83064a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f83065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f83069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f83070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f83071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f83072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f83073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f83074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f83075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f83076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f83077n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f83078o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<sg.bigo.ads.api.a.a> f83079p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f83080q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f83081r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m f83082s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f83083t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f83084u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f83085v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f83086w;

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f83066c == 4 && !jSONObject.has("interstitial_video_style")) {
                jSONObject = new JSONObject().put("interstitial_video_style", jSONObject);
            }
            this.f83082s = new j(jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.api.a.l
    public String a() {
        return this.f83065b;
    }

    public void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f83065b);
        parcel.writeInt(this.f83066c);
        parcel.writeInt(this.f83067d);
        parcel.writeInt(this.f83068e);
        parcel.writeInt(this.f83069f);
        parcel.writeInt(this.f83070g);
        parcel.writeInt(this.f83071h);
        parcel.writeInt(this.f83072i ? 1 : 0);
        parcel.writeInt(this.f83073j ? 1 : 0);
        parcel.writeInt(this.f83074k ? 1 : 0);
        parcel.writeInt(this.f83075l);
        parcel.writeString(this.f83076m);
        parcel.writeInt(this.f83077n ? 1 : 0);
        parcel.writeString(this.f83078o);
        n.a(parcel, this.f83079p);
        parcel.writeInt(this.f83083t);
        parcel.writeString(this.f83081r);
        m mVar = this.f83082s;
        parcel.writeString(mVar == null ? null : mVar.toString());
        parcel.writeInt(this.f83085v ? 1 : 0);
        parcel.writeInt(this.f83084u);
        parcel.writeInt(this.f83086w);
        n.a(parcel, this.f83064a);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0145 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(org.json.JSONObject r14) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.b.i.a(org.json.JSONObject):boolean");
    }

    @Override // sg.bigo.ads.api.a.l
    public int b() {
        return this.f83066c;
    }

    public void b(@NonNull Parcel parcel) {
        this.f83065b = parcel.readString();
        this.f83066c = parcel.readInt();
        this.f83067d = parcel.readInt();
        this.f83068e = parcel.readInt();
        this.f83069f = parcel.readInt();
        this.f83070g = parcel.readInt();
        this.f83071h = parcel.readInt();
        this.f83072i = parcel.readInt() != 0;
        this.f83073j = parcel.readInt() != 0;
        this.f83074k = parcel.readInt() != 0;
        this.f83075l = parcel.readInt();
        this.f83076m = parcel.readString();
        this.f83077n = parcel.readInt() != 0;
        this.f83078o = parcel.readString();
        this.f83079p = n.a(parcel, new f.a<sg.bigo.ads.api.a.a>() { // from class: sg.bigo.ads.controller.b.i.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new a();
            }
        });
        this.f83083t = n.a(parcel, 0);
        this.f83081r = n.a(parcel, "");
        a(n.a(parcel, ""));
        this.f83085v = n.b(parcel, true);
        this.f83084u = n.a(parcel, 0);
        this.f83086w = n.a(parcel, 0);
        n.b(parcel, this.f83064a);
    }

    @Override // sg.bigo.ads.api.a.l
    public int c() {
        return this.f83067d;
    }

    @Override // sg.bigo.ads.api.a.l
    public int d() {
        return this.f83068e;
    }

    @Override // sg.bigo.ads.api.a.l
    public int e() {
        return this.f83069f;
    }

    @Override // sg.bigo.ads.api.a.l
    public int f() {
        return this.f83070g;
    }

    @Override // sg.bigo.ads.api.a.l
    public int g() {
        return this.f83071h;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean h() {
        return this.f83072i;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean i() {
        return this.f83073j;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean j() {
        return this.f83074k;
    }

    @Override // sg.bigo.ads.api.a.l
    public int k() {
        return this.f83075l;
    }

    @Override // sg.bigo.ads.api.a.l
    public String l() {
        return this.f83076m;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean m() {
        return this.f83077n;
    }

    @Override // sg.bigo.ads.api.a.l
    public String n() {
        return this.f83078o;
    }

    @Override // sg.bigo.ads.api.a.l
    public String o() {
        return this.f83080q;
    }

    @Override // sg.bigo.ads.api.a.l
    public String p() {
        return this.f83081r;
    }

    @Override // sg.bigo.ads.api.a.l
    @NonNull
    public m q() {
        if (this.f83082s == null) {
            this.f83082s = new j(new JSONObject());
        }
        return this.f83082s;
    }

    @Override // sg.bigo.ads.api.a.l
    public int r() {
        return this.f83083t;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean s() {
        return this.f83083t == 1;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean t() {
        return this.f83084u == 1;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        List<sg.bigo.ads.api.a.a> list = this.f83079p;
        if (list != null) {
            for (sg.bigo.ads.api.a.a aVar : list) {
                if (sb2.length() > 0) {
                    sb2.append(StringUtils.COMMA);
                }
                sb2.append(aVar);
            }
        }
        return "{strategyId=" + this.f83065b + ", adType=" + this.f83066c + ", countdown=" + this.f83067d + ", reqTimeout=" + this.f83068e + ", mediaStrategy=" + this.f83069f + ", webViewEnforceDuration=" + this.f83070g + ", videoDirection=" + this.f83071h + ", videoReplay=" + this.f83072i + ", videoMute=" + this.f83073j + ", bannerAutoRefresh=" + this.f83074k + ", bannerRefreshInterval=" + this.f83075l + ", slotId='" + this.f83076m + "', state=" + this.f83077n + ", placementId='" + this.f83078o + "', express=[" + sb2.toString() + "], styleId=" + this.f83081r + ", playable=" + this.f83083t + ", isCompanionRenderSupport=" + this.f83084u + ", aucMode=" + this.f83086w + ", nativeAdClickConfig=" + this.f83064a + '}';
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean u() {
        return this.f83085v;
    }

    @Override // sg.bigo.ads.api.a.l
    public int v() {
        return this.f83086w;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean w() {
        return this.f83086w == 3;
    }

    @Override // sg.bigo.ads.api.a.l
    @NonNull
    public k x() {
        return this.f83064a;
    }
}
