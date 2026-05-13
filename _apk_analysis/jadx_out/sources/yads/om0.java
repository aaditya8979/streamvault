package yads;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import com.ironsource.Q6;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class om0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw2 f93281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ox2 f93282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jg0 f93283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bh1 f93284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sd f93285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pm0 f93286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rd f93287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jm0 f93288h;

    public /* synthetic */ om0(Context context, d4 d4Var) {
        lw2 lw2Var = new lw2();
        ox2 ox2Var = new ox2();
        jg0 jg0Var = new jg0();
        Object obj = bh1.f88003f;
        this(d4Var, lw2Var, ox2Var, jg0Var, ah1.a(context), new sd(), new qm0());
    }

    public om0(d4 d4Var, lw2 lw2Var, ox2 ox2Var, jg0 jg0Var, bh1 bh1Var, sd sdVar, pm0 pm0Var) {
        this.f93281a = lw2Var;
        this.f93282b = ox2Var;
        this.f93283c = jg0Var;
        this.f93284d = bh1Var;
        this.f93285e = sdVar;
        this.f93286f = pm0Var;
        this.f93287g = d4Var.b();
        this.f93288h = d4Var.c();
    }

    public final void a(Context context, sn.p pVar) {
        Location locationA;
        pVar.mo2invoke("app_id", context.getPackageName());
        pVar.mo2invoke("app_version_code", og.a(context));
        pVar.mo2invoke(CommonUrlParts.APP_VERSION, og.b(context));
        pVar.mo2invoke("vast-integration-type", "inapp_sdk");
        pVar.mo2invoke("sdk_version", this.f93281a.a("%d.%d%d"));
        pVar.mo2invoke("sdk_version_name", this.f93281a.a("%d.%d.%d"));
        pVar.mo2invoke("sdk_vendor", "yandex");
        pVar.mo2invoke(((qm0) this.f93286f).b(), this.f93283c.a(context));
        yg1 yg1Var = this.f93283c.f91222b;
        yg1Var.getClass();
        Locale locale = context.getResources().getConfiguration().locale;
        yg1Var.f97131a.getClass();
        pVar.mo2invoke(CommonUrlParts.LOCALE, wg1.a(locale));
        pVar.mo2invoke("content_language", this.f93283c.f91222b.a(context));
        List listB = this.f93283c.f91222b.b(context);
        pVar.mo2invoke("device_languages", listB != null ? cn.f0.D0(listB, StringUtils.COMMA, null, null, 0, null, null, 62, null) : null);
        String strC = ((qm0) this.f93286f).c();
        this.f93283c.getClass();
        pVar.mo2invoke(strC, jg0.a());
        String strD = ((qm0) this.f93286f).d();
        this.f93283c.getClass();
        pVar.mo2invoke(strD, Build.MODEL);
        String strE = ((qm0) this.f93286f).e();
        this.f93283c.getClass();
        pVar.mo2invoke(strE, "android");
        String strF = ((qm0) this.f93286f).f();
        this.f93283c.getClass();
        pVar.mo2invoke(strF, Build.VERSION.RELEASE);
        Boolean boolC = yc2.c(context);
        if (boolC != null) {
            pVar.mo2invoke("vpn_enabled", boolC.booleanValue() ? "1" : "0");
        }
        if ((!this.f93282b.b(context)) && (locationA = this.f93284d.a()) != null) {
            pVar.mo2invoke("location_timestamp", String.valueOf(locationA.getTime()));
            pVar.mo2invoke(Q6.f30262s, String.valueOf(locationA.getLatitude()));
            pVar.mo2invoke("lon", String.valueOf(locationA.getLongitude()));
            pVar.mo2invoke("precision", String.valueOf(Math.round(locationA.getAccuracy())));
        }
        if (!this.f93282b.b(context)) {
            pVar.mo2invoke(((qm0) this.f93286f).a(), this.f93288h.f91277a);
            pVar.mo2invoke(CommonUrlParts.APP_SET_ID, this.f93287g.f94379d);
            td tdVar = this.f93287g.f94376a;
            if (tdVar != null) {
                boolean z10 = tdVar.f95148b;
                String str = tdVar.f95147a;
                this.f93285e.getClass();
                boolean z11 = (str == null || str.length() == 0 || tn.p.f("00000000-0000-0000-0000-000000000000", str)) ? false : true;
                if (!z10 && z11) {
                    pVar.mo2invoke("google_aid", str);
                }
            }
            td tdVar2 = this.f93287g.f94377b;
            if (tdVar2 != null) {
                boolean z12 = tdVar2.f95148b;
                String str2 = tdVar2.f95147a;
                this.f93285e.getClass();
                boolean z13 = (str2 == null || str2.length() == 0 || tn.p.f("00000000-0000-0000-0000-000000000000", str2)) ? false : true;
                if (!z12 && z13) {
                    pVar.mo2invoke("huawei_oaid", str2);
                }
            }
        }
        pVar.mo2invoke(CommonUrlParts.SCREEN_WIDTH, String.valueOf(kl3.d(context)));
        pVar.mo2invoke(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(kl3.b(context)));
        pVar.mo2invoke(CommonUrlParts.SCALE_FACTOR, String.valueOf(context.getResources().getDisplayMetrics().density));
        pVar.mo2invoke(CommonUrlParts.SCREEN_DPI, String.valueOf(kl3.a(context)));
    }
}
