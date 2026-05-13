package com.ironsource;

import com.ironsource.D7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4246s5 implements D7, D7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private JSONObject f33517a = IronSourceVideoBridge.jsonObjectInit();

    private final JSONObject k() {
        JSONObject jSONObjectOptJSONObject = this.f33517a.optJSONObject(C4263t5.f34061a);
        return jSONObjectOptJSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject;
    }

    @Override // com.ironsource.D7.a
    public void a(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.f33517a;
        }
        this.f33517a = jSONObject;
        IronLog.INTERNAL.verbose("setEpConfig: " + jSONObject);
    }

    @Override // com.ironsource.InterfaceC4280u5
    public boolean a() {
        return k().optBoolean(C4297v5.f34247e, true);
    }

    @Override // com.ironsource.InterfaceC4280u5
    public long b() {
        String strOptString = k().optString(C4297v5.f34245c);
        tn.p.j(strOptString, "traits.optString(LPM_BN_…FRESH_ANIMATION_DURATION)");
        Long lT = bo.z.t(strOptString);
        if (lT != null) {
            return lT.longValue();
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC4280u5
    public boolean c() {
        return k().optBoolean(C4297v5.f34248f, true);
    }

    @Override // com.ironsource.D7
    @NotNull
    public JSONObject config() {
        return this.f33517a;
    }

    @Override // com.ironsource.InterfaceC4280u5
    public long d() {
        String strOptString = k().optString(C4297v5.f34246d);
        tn.p.j(strOptString, "traits.optString(LPM_DEL…_TIME_AFTER_INIT_PROCESS)");
        Long lT = bo.z.t(strOptString);
        if (lT != null) {
            return lT.longValue();
        }
        return 2000L;
    }

    @Override // com.ironsource.InterfaceC4280u5
    public boolean e() {
        return k().optBoolean(C4297v5.f34251i, false);
    }

    @Override // com.ironsource.InterfaceC4280u5
    public boolean f() {
        return k().optBoolean(C4297v5.f34252j, false);
    }

    @Override // com.ironsource.InterfaceC4280u5
    public boolean g() {
        return k().optBoolean(C4297v5.f34249g, false);
    }

    @Override // com.ironsource.InterfaceC4280u5
    public boolean h() {
        String strOptString = k().optString(C4297v5.f34243a);
        tn.p.j(strOptString, "traits.optString(IS_EP_CONFIG_ENABLED)");
        String lowerCase = strOptString.toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return tn.p.f(lowerCase, "true");
    }

    @Override // com.ironsource.InterfaceC4280u5
    public int i() {
        String strOptString = k().optString(C4297v5.f34244b);
        tn.p.j(strOptString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        Integer numR = bo.z.r(strOptString);
        if (numR != null) {
            return numR.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.InterfaceC4280u5
    public boolean j() {
        return k().optBoolean(C4297v5.f34250h, false);
    }
}
