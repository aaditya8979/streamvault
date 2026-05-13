package sg.bigo.ads.controller.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.common.u.a;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T extends sg.bigo.ads.common.u.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.common.g f83380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.b f83381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f83382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f83383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f83384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f83385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f83386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f83387i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.b, sg.bigo.ads.common.u.c.d> f83388j;

    /* JADX INFO: renamed from: sg.bigo.ads.controller.g.a$a, reason: collision with other inner class name */
    public static class C1037a extends sg.bigo.ads.common.u.b.b<sg.bigo.ads.controller.a.f> {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final long f83398p;

        public C1037a(Context context, int i10, @NonNull sg.bigo.ads.controller.a.f fVar, long j10) {
            super(i10, fVar, context);
            this.f83398p = j10;
        }

        @Override // sg.bigo.ads.common.u.b.c
        public final void h() {
            super.h();
            sg.bigo.ads.controller.a.f fVar = (sg.bigo.ads.controller.a.f) this.f82434k;
            HashMap map = new HashMap();
            map.put("pre_host", fVar.f());
            map.put("host_cfg_clear", Integer.valueOf(fVar.h() ? 1 : 0));
            map.put("host_src", fVar.i());
            sg.bigo.ads.controller.a.j jVarG = fVar.g();
            if (jVarG != null) {
                map.put("host_type", Integer.valueOf(jVarG.d()));
            }
            a(map);
            long j10 = this.f83398p;
            if (j10 > 0) {
                fVar.a(j10);
            }
        }
    }

    public interface b {
        void a(String str, Object obj);
    }

    public a(@NonNull sg.bigo.ads.common.g gVar, @Nullable sg.bigo.ads.controller.a.b bVar) {
        this(gVar, bVar, 15000L);
    }

    public a(@NonNull sg.bigo.ads.common.g gVar, @Nullable sg.bigo.ads.controller.a.b bVar, long j10) {
        this.f83386h = new p();
        this.f83387i = null;
        this.f83388j = new sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.b, sg.bigo.ads.common.u.c.d>() { // from class: sg.bigo.ads.controller.g.a.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f83390b = -1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f83391c = false;

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ sg.bigo.ads.common.u.c.c a(@NonNull sg.bigo.ads.common.u.c.a aVar) {
                return new sg.bigo.ads.common.u.c.d(aVar);
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar) {
                super.a((sg.bigo.ads.common.u.b.b) cVar);
                this.f83390b = SystemClock.elapsedRealtime();
                this.f83391c = sg.bigo.ads.common.f.b.d();
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.c.c cVar2) {
                sg.bigo.ads.common.u.b.b bVar2 = (sg.bigo.ads.common.u.b.b) cVar;
                sg.bigo.ads.common.u.c.d dVar = (sg.bigo.ads.common.u.c.d) cVar2;
                String strA = dVar.a();
                if (bVar2.f82428f) {
                    try {
                        if (TextUtils.isEmpty(strA) || !strA.trim().startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52301d)) {
                            String strA2 = sg.bigo.ads.common.j.a.a(strA, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F", null);
                            if (TextUtils.isEmpty(strA2)) {
                                bVar2.f82429g = 0;
                            } else {
                                try {
                                    bVar2.f82429g = 1;
                                    strA = strA2;
                                } catch (Exception unused) {
                                    strA = strA2;
                                    bVar2.f82429g = 2;
                                    try {
                                        bVar2.f82430h = dVar.a("logid");
                                    } catch (Exception unused2) {
                                    }
                                }
                            }
                        } else {
                            bVar2.f82429g = 3;
                        }
                        bVar2.f82430h = dVar.a("logid");
                    } catch (Exception unused3) {
                    }
                }
                a aVar = a.this;
                p pVar = aVar.f83386h;
                boolean z10 = bVar2.f82427e;
                boolean z11 = bVar2.f82428f;
                int i10 = bVar2.f82429g;
                String str = bVar2.f82430h;
                pVar.f81899a = z10;
                pVar.f81900b = z11;
                pVar.f81901c = i10;
                pVar.f81902d = str;
                if (z10 && (!z11 || i10 != 1)) {
                    if (z11) {
                        aVar.i();
                    } else {
                        sg.bigo.ads.common.x.a.u();
                    }
                }
                sg.bigo.ads.controller.h.a aVar2 = new sg.bigo.ads.controller.h.a(strA);
                if (aVar2.a()) {
                    a.this.a(bVar2.g(), aVar2.f83415c, aVar2.f83416d);
                } else {
                    if (aVar2.b()) {
                        sg.bigo.ads.common.x.a.e(System.currentTimeMillis());
                    }
                    a.this.a(bVar2.g(), 1005, aVar2.f83413a, aVar2.f83414b, aVar2.f83416d);
                }
                a.a(a.this, sg.bigo.ads.common.utils.l.a(aVar2.f83416d, "host_cfg"), bVar2.g(), this.f83390b);
                if (a.this.g() && a.this.f83387i == null) {
                    long jElapsedRealtime = this.f83390b > 0 ? SystemClock.elapsedRealtime() - this.f83390b : 0L;
                    T t10 = bVar2.f82434k;
                    String strD = t10.e() ? t10.d() : "";
                    String strG = bVar2.g();
                    int i11 = dVar.f82450a.f82442a;
                    boolean z12 = this.f83391c;
                    int iE = bVar2.e();
                    a aVar3 = a.this;
                    String str2 = aVar3.f83383e;
                    String str3 = aVar3.f83384f;
                    String str4 = aVar3.f83385g;
                    sg.bigo.ads.common.g gVar2 = aVar3.f83380b;
                    sg.bigo.ads.core.d.b.a(strG, strD, true, jElapsedRealtime, i11, "", z12, iE, str2, str3, str4, gVar2 != null ? gVar2.X() : null, bVar2.f82427e, bVar2.f82428f, bVar2.f82429g, bVar2.f82430h);
                }
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.h hVar) {
                String str;
                sg.bigo.ads.common.u.b.b bVar2 = (sg.bigo.ads.common.u.b.b) cVar;
                if (a.this.g() && a.this.f83387i == null) {
                    long jElapsedRealtime = this.f83390b > 0 ? SystemClock.elapsedRealtime() - this.f83390b : 0L;
                    String strG = bVar2.g();
                    if (hVar.f82459a == 900) {
                        strG = "https://invalid.url";
                    }
                    String str2 = strG;
                    T t10 = bVar2.f82434k;
                    String strD = t10.e() ? t10.d() : "";
                    int i10 = hVar.f82459a;
                    String message = hVar.getMessage();
                    boolean z10 = this.f83391c;
                    int iE = bVar2.e();
                    a aVar = a.this;
                    String str3 = aVar.f83383e;
                    String str4 = aVar.f83384f;
                    String str5 = aVar.f83385g;
                    sg.bigo.ads.common.g gVar2 = aVar.f83380b;
                    sg.bigo.ads.core.d.b.a(str2, strD, false, jElapsedRealtime, i10, message, z10, iE, str3, str4, str5, gVar2 == null ? null : gVar2.X(), bVar2.f82427e, bVar2.f82428f, bVar2.f82429g, bVar2.f82430h);
                }
                int i11 = 1025;
                int i12 = hVar.f82459a;
                if (i12 == 701 || i12 == 702) {
                    str = "Request timeout.";
                } else {
                    str = "(" + hVar.f82459a + ") " + hVar.getMessage();
                    i11 = 1026;
                }
                a.this.a(bVar2.g(), i11, hVar.f82459a, str, null);
                a.this.a(bVar2.g());
            }
        };
        this.f83379a = sg.bigo.ads.common.y.a.a();
        this.f83380b = gVar;
        this.f83381c = bVar;
        this.f83382d = j10;
        this.f83383e = gVar.Q();
        this.f83384f = gVar.R();
        this.f83385g = gVar.S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f83381c != null && h() && this.f83387i == null) {
            this.f83381c.a(100L, str);
        }
    }

    public static /* synthetic */ void a(a aVar, final String str, final String str2, final long j10) {
        if (aVar.f83381c != null) {
            if (TextUtils.isEmpty(str)) {
                aVar.a(str2);
            } else {
                sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.g.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a aVar2 = a.this;
                        sg.bigo.ads.controller.a.b bVar = aVar2.f83381c;
                        if (bVar == null || bVar.a(str, str2, j10, aVar2.g()).f82983d == 0) {
                            return;
                        }
                        a.this.a(str2);
                    }
                });
            }
        }
    }

    public final int a() {
        return this.f83379a;
    }

    @NonNull
    @CallSuper
    public StringBuilder a(long j10, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(q.a(this.f83380b.a()));
        sb2.append(StringUtils.COMMA);
        sb2.append(q.a(this.f83380b.b()));
        sb2.append(StringUtils.COMMA);
        sb2.append(q.a(this.f83380b.c()));
        sb2.append(StringUtils.COMMA);
        sb2.append(this.f83380b.d());
        sb2.append(StringUtils.COMMA);
        sb2.append(q.a(this.f83380b.i()));
        sb2.append(StringUtils.COMMA);
        sb2.append(q.a(this.f83380b.j()));
        sb2.append(StringUtils.COMMA);
        sb2.append(q.a(this.f83380b.y()));
        sb2.append(",50602");
        sb2.append(StringUtils.COMMA);
        sb2.append(j10);
        boolean zQ = sg.bigo.ads.common.x.a.q();
        sb2.append(StringUtils.COMMA);
        if (zQ) {
            sb2.append(StringUtils.COMMA);
            sb2.append(StringUtils.COMMA);
            sb2.append(q.a(this.f83380b.C()));
            sb2.append(StringUtils.COMMA);
        } else {
            sb2.append(q.a(this.f83380b.A()));
            sb2.append(StringUtils.COMMA);
            sb2.append(q.a(this.f83380b.B()));
            sb2.append(StringUtils.COMMA);
            sb2.append(q.a(this.f83380b.C()));
            sb2.append(StringUtils.COMMA);
            sb2.append(q.a(this.f83380b.G()));
        }
        sb2.append(StringUtils.COMMA);
        sb2.append(q.a(str));
        return sb2;
    }

    public abstract void a(int i10, int i11, String str);

    @CallSuper
    public void a(String str, int i10, int i11, String str2, @Nullable Map<String, Object> map) {
        a(i10, i11, str2);
    }

    @CallSuper
    public void a(String str, @NonNull String str2, @NonNull Map<String, Object> map) {
        a(str2, map);
    }

    public abstract void a(@NonNull String str, @NonNull Map<String, Object> map);

    public abstract void a(@NonNull b bVar);

    public final void b() {
        final JSONObject jSONObject;
        String str;
        Object objA;
        String str2;
        sg.bigo.ads.common.u.a aVarF = f();
        sg.bigo.ads.common.u.b.b c1037a = aVarF instanceof sg.bigo.ads.controller.a.f ? new C1037a(this.f83380b.af(), this.f83379a, (sg.bigo.ads.controller.a.f) aVarF, e()) : new sg.bigo.ads.common.u.b.b(this.f83379a, aVarF, this.f83380b.af());
        boolean z10 = false;
        int i10 = 0;
        z10 = false;
        if (sg.bigo.ads.common.x.a.q() && !(this instanceof m)) {
            String str3 = "Missing CCPA consent";
            if (sg.bigo.ads.common.x.a.m() == 2) {
                str2 = "Missing GDPR consent";
                i10 = 1;
            } else {
                str2 = "Missing CCPA consent";
            }
            if (sg.bigo.ads.common.x.a.o() == 2) {
                i10++;
                str2 = "Missing LGPD consent";
            }
            if (sg.bigo.ads.common.x.a.n() == 2) {
                i10++;
            } else {
                str3 = str2;
            }
            if (sg.bigo.ads.common.x.a.p() == 2) {
                i10++;
                str3 = "Missing COPPA consent";
            }
            if (i10 > 1) {
                str3 = "Missing user consent";
            }
            this.f83388j.a(c1037a, new sg.bigo.ads.common.u.h(800, str3));
            return;
        }
        try {
            jSONObject = new JSONObject();
            jSONObject.putOpt(MBridgeConstans.APP_KEY, q.a(this.f83380b.a()));
            jSONObject.putOpt("pkg_name", q.a(this.f83380b.b()));
            jSONObject.putOpt("pkg_ver", q.a(this.f83380b.c()));
            jSONObject.putOpt("pkg_vc", Integer.valueOf(this.f83380b.d()));
            jSONObject.putOpt("pkg_ch", this.f83380b.e());
            jSONObject.putOpt(Q6.F, q.a(this.f83380b.i()));
            jSONObject.putOpt("os_ver", q.a(this.f83380b.j()));
            jSONObject.putOpt("os_lang", this.f83380b.k());
            jSONObject.putOpt("vendor", this.f83380b.l());
            jSONObject.putOpt("model", this.f83380b.m());
            jSONObject.putOpt("resolution", this.f83380b.o());
            jSONObject.putOpt("dpi", Integer.valueOf(this.f83380b.p()));
            jSONObject.putOpt("dpi_f", this.f83380b.q());
            jSONObject.putOpt("net", this.f83380b.r());
            jSONObject.putOpt("timezone", this.f83380b.s());
            jSONObject.putOpt("country", this.f83380b.t());
            jSONObject.putOpt("sdk_ver", q.a(this.f83380b.y()));
            jSONObject.putOpt("sdk_vc", 50602);
            if (sg.bigo.ads.common.x.a.q()) {
                str = "consent_status";
                objA = Integer.valueOf(sg.bigo.ads.core.d.b.b());
            } else {
                jSONObject.putOpt(Q6.V0, q.a(this.f83380b.A()));
                jSONObject.putOpt("hw_id", q.a(this.f83380b.G()));
                jSONObject.putOpt("fire_id", q.a(this.f83380b.ae()));
                str = "af_id";
                objA = q.a(this.f83380b.B());
            }
            jSONObject.putOpt(str, objA);
            jSONObject.putOpt("uid", q.a(this.f83380b.C()));
            long jD = this.f83380b.D();
            jSONObject.putOpt("timestamp", Long.valueOf(jD));
            jSONObject.putOpt("abflags", this.f83380b.E());
            jSONObject.putOpt("batsa", Integer.valueOf(this.f83380b.ag() ? 1 : 0));
            jSONObject.putOpt("datasa", Integer.valueOf(this.f83380b.ah()));
            jSONObject.putOpt("root", Integer.valueOf(this.f83380b.ai() ? 1 : 0));
            String string = UUID.randomUUID().toString();
            jSONObject.putOpt(CommonUrlParts.REQUEST_ID, q.a(string));
            jSONObject.putOpt("sdk_channel", this.f83380b.aa());
            jSONObject.putOpt("simulator_file", Integer.valueOf(this.f83380b.ab()));
            jSONObject.putOpt("sim_country", this.f83384f);
            jSONObject.putOpt("system_country", this.f83385g);
            jSONObject.putOpt("inst_src", this.f83380b.T());
            a(new b() { // from class: sg.bigo.ads.controller.g.a.3
                @Override // sg.bigo.ads.controller.g.a.b
                public final void a(String str4, Object obj) {
                    if (TextUtils.isEmpty(str4)) {
                        return;
                    }
                    try {
                        jSONObject.putOpt(str4, obj);
                    } catch (JSONException unused) {
                    }
                }
            });
            jSONObject.putOpt("sign", sg.bigo.ads.common.utils.m.a(a(jD, string).toString()));
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (sg.bigo.ads.common.x.a.t() && j()) {
            z10 = true;
        }
        sg.bigo.ads.common.u.f fVarD = d();
        c1037a.f82424b = jSONObject;
        c1037a.f82425c = null;
        c1037a.f82426d = fVarD;
        c1037a.f82427e = z10;
        c1037a.f82436m = this.f83382d;
        c1037a.a("SDK-Version-Code", BigoAdSdk.getSDKVersion());
        c1037a.f82435l = c();
        sg.bigo.ads.common.u.b bVar = this.f83388j;
        if (bVar == null) {
            bVar = sg.bigo.ads.common.u.b.f82419d;
        }
        sg.bigo.ads.common.u.g.f82458a.a(c1037a, bVar);
    }

    @Nullable
    public abstract sg.bigo.ads.common.n.e c();

    public sg.bigo.ads.common.u.f d() {
        return sg.bigo.ads.common.u.b.b.f82423a;
    }

    public long e() {
        return 0L;
    }

    @NonNull
    public abstract T f();

    public boolean g() {
        return true;
    }

    public boolean h() {
        return true;
    }

    public abstract void i();

    public abstract boolean j();
}
