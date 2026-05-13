package yads;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.G5;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class yc3 extends Lambda implements sn.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc3 f97064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rc3 f97065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d4 f97066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f97067e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc3(zc3 zc3Var, rc3 rc3Var, d4 d4Var, Context context) {
        super(1);
        this.f97064b = zc3Var;
        this.f97065c = rc3Var;
        this.f97066d = d4Var;
        this.f97067e = context;
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        nl2 nl2Var = (nl2) obj;
        zc3 zc3Var = this.f97064b;
        rc3 rc3Var = this.f97065c;
        d4 d4Var = this.f97066d;
        Context context = this.f97067e;
        nl2Var.a(G5.M, "UTF-8");
        zc3Var.f97523a.getClass();
        nl2Var.a("rnd", String.valueOf(new Random().nextInt(89999999) + 10000000));
        Map mapA = rc3Var.a();
        if (mapA != null) {
            for (Map.Entry entry : mapA.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!bo.d0.u0(str)) {
                    nl2Var.a(str, str2);
                }
            }
        }
        jm0 jm0Var = d4Var.f88741b.f94197a;
        zc3Var.f97525c.getClass();
        if (!ox2.a(context)) {
            nl2Var.a(CommonUrlParts.UUID, jm0Var.b());
            nl2Var.a("mauid", jm0Var.f91280d);
        }
        zc3Var.f97524b.getClass();
        uw uwVar = new uw(nl2Var);
        xw.f96901a.getClass();
        zw zwVar = (zw) ww.a(context);
        uwVar.mo2invoke(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, zwVar.c());
        uwVar.mo2invoke(InMobiSdk.IM_GDPR_CONSENT_IAB, zwVar.b());
        uwVar.mo2invoke("parsed_purpose_consents", zwVar.d());
        uwVar.mo2invoke("parsed_vendor_consents", zwVar.e());
        uwVar.mo2invoke("cmp_present", Integer.valueOf(zwVar.a() ? 1 : 0).toString());
        new om0(context, d4Var).a(context, new nm0(nl2Var));
        return nl2Var;
    }
}
