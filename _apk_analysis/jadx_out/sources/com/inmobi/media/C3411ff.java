package com.inmobi.media;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.inmobi.media.C3411ff;
import com.inmobi.media.core.config.models.SignalsConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: com.inmobi.media.ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3411ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3605n9 f27170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SignalsConfig.NovatiqConfig f27173e;

    public C3411ff(Context context, C3605n9 c3605n9) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f27169a = context;
        this.f27170b = c3605n9;
        this.f27171c = "";
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(SignalsConfig.class, "clazz");
        this.f27173e = ((SignalsConfig) Y3.f26611a.a(SignalsConfig.class)).getNovatiqConfig();
        b();
    }

    public static final bn.r a(C3411ff c3411ff, Throwable th2) {
        if (th2 == null) {
            C3605n9 c3605n9 = c3411ff.f27170b;
            if (c3605n9 != null) {
                c3605n9.a("NovatiqDataHandler", "Novatiq data sync successful");
            }
        } else {
            C3605n9 c3605n92 = c3411ff.f27170b;
            if (c3605n92 != null) {
                c3605n92.a("NovatiqDataHandler", "Error: " + th2);
            }
        }
        return bn.r.f5635a;
    }

    public static String a(Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        return bo.a0.R(context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString(), ' ', '_', false, 4, null) + "_app";
    }

    public final C3360df a() {
        if (this.f27172d) {
            return new C3360df(kotlin.collections.a.l(bn.h.a("n-h-id", this.f27171c)));
        }
        C3605n9 c3605n9 = this.f27170b;
        if (c3605n9 != null) {
            c3605n9.a("NovatiqDataHandler", "Novatiq disabled. skip");
        }
        return new C3360df(kotlin.collections.a.j());
    }

    public final void b() {
        String networkOperatorName;
        Context context = this.f27169a;
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        if (this.f27173e.isNovatiqEnabled()) {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) {
                networkOperatorName = "";
            }
            List<String> carrierNames = this.f27173e.getCarrierNames();
            if (!(carrierNames instanceof Collection) || !carrierNames.isEmpty()) {
                Iterator<T> it = carrierNames.iterator();
                while (it.hasNext()) {
                    if (bo.d0.a0(networkOperatorName, (String) it.next(), true)) {
                        try {
                            String strA = a(this.f27169a);
                            this.f27172d = true;
                            StringBuilder sb2 = new StringBuilder();
                            Random random = new Random();
                            for (int i10 = 0; i10 < 40; i10++) {
                                char cCharAt = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxxxxxx".charAt(i10);
                                if (cCharAt == 'x') {
                                    sb2.append(Character.forDigit(random.nextInt(16), 16));
                                } else {
                                    sb2.append(cCharAt);
                                }
                            }
                            String string = sb2.toString();
                            tn.p.j(string, "toString(...)");
                            this.f27171c = string;
                            ((C3779u9) He.f25608c.getValue()).a(new C3437gf(this.f27173e, new C3385ef(string, strA), this.f27170b).a()).f(new sn.l() { // from class: n9.v6
                                @Override // sn.l
                                public final Object invoke(Object obj) {
                                    return C3411ff.a(this.f75656b, (Throwable) obj);
                                }
                            });
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
            }
        }
        C3605n9 c3605n9 = this.f27170b;
        if (c3605n9 != null) {
            c3605n9.a("NovatiqDataHandler", "Novatiq disabled.. skipping");
        }
    }
}
