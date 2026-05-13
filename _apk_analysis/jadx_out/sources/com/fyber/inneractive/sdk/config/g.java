package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f16012a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f16013b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f16014c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16015d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16016e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InneractiveAdManager.GdprConsentSource f16017f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f16018g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f16019h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f16020i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f16021j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SharedPreferences f16022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences f16023l;

    public final void a() {
        IAlog.a("Clearing GDPR Consent String and status", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f19548a == null) {
            IAlog.f("ClearGdprConsent was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        f();
        this.f16012a = null;
        this.f16015d = null;
        SharedPreferences sharedPreferences = this.f16022k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IAGdprConsentData").remove("IAGDPRBool").remove("IAGdprSource").apply();
        }
    }

    public final void a(String str) {
        if (com.fyber.inneractive.sdk.util.o.f19548a != null) {
            f();
            if (TextUtils.isEmpty(str)) {
                this.f16018g = str;
                SharedPreferences sharedPreferences = this.f16022k;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().remove("keyUserID").apply();
                    return;
                }
                return;
            }
            if (str.length() > 512) {
                str = str.substring(0, 512);
            }
            SharedPreferences sharedPreferences2 = this.f16022k;
            if (sharedPreferences2 != null) {
                this.f16018g = str;
                sharedPreferences2.edit().putString("keyUserID", str).apply();
            }
        }
    }

    public final boolean a(String str, String str2) {
        if (com.fyber.inneractive.sdk.util.o.f19548a == null) {
            return false;
        }
        f();
        if (this.f16022k == null) {
            return false;
        }
        IAlog.a("Saving %s value = %s to sharedPrefs", str, str2);
        this.f16022k.edit().putString(str, str2).apply();
        return true;
    }

    public final boolean a(boolean z10, String str) {
        if (com.fyber.inneractive.sdk.util.o.f19548a == null) {
            return false;
        }
        f();
        SharedPreferences sharedPreferences = this.f16022k;
        if (sharedPreferences == null) {
            return false;
        }
        sharedPreferences.edit().putBoolean(str, z10).apply();
        return true;
    }

    public final void b() {
        IAlog.a("Clearing LGPD consent status", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f19548a == null) {
            IAlog.f("clearLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        f();
        this.f16020i = null;
        SharedPreferences sharedPreferences = this.f16022k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IALgpdConsentStatus").apply();
        }
    }

    public final void c() {
        IAlog.a("Clearing CCPA Consent String", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f19548a == null) {
            IAlog.f("clearUSPrivacyString was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        f();
        this.f16019h = null;
        SharedPreferences sharedPreferences = this.f16022k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IACCPAConsentData").apply();
        }
    }

    public final Boolean d() {
        if (this.f16012a == null) {
            this.f16013b = g();
        }
        if (com.fyber.inneractive.sdk.util.o.f19548a == null) {
            return null;
        }
        Boolean bool = this.f16012a;
        return bool == null ? this.f16013b : bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r5 = this;
            java.lang.Boolean r0 = r5.f16014c
            if (r0 != 0) goto L4d
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.O
            com.fyber.inneractive.sdk.config.s r0 = r0.f15975u
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L46
            com.fyber.inneractive.sdk.config.o r0 = r0.f16144b
            if (r0 != 0) goto L11
            goto L46
        L11:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r4 = "TcfPurpose1"
            int r0 = r0.a(r4, r1, r3)
            if (r0 != r1) goto L46
            android.content.SharedPreferences r0 = r5.f16023l
            if (r0 != 0) goto L20
            goto L46
        L20:
            java.lang.String r3 = "IABTCF_PurposeConsents"
            r4 = 0
            java.lang.String r0 = r0.getString(r3, r4)     // Catch: java.lang.Exception -> L39
            if (r0 == 0) goto L46
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L30
            goto L46
        L30:
            char r0 = r0.charAt(r2)
            r3 = 48
            if (r0 != r3) goto L46
            goto L47
        L39:
            java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.a(r5)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r0
            java.lang.String r0 = "%sException caught when trying to resolveIsIabGdprPurpose1Disabled from prefs"
            com.fyber.inneractive.sdk.util.IAlog.b(r0, r1)
        L46:
            r1 = r2
        L47:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.f16014c = r0
        L4d:
            java.lang.Boolean r0 = r5.f16014c
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.g.e():boolean");
    }

    public final void f() {
        Application application = com.fyber.inneractive.sdk.util.o.f19548a;
        if (application != null) {
            if (this.f16023l == null) {
                this.f16023l = application.getSharedPreferences(application.getPackageName() + "_preferences", 0);
            }
            if (this.f16022k == null) {
                SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigurationPreferences", 0);
                this.f16022k = sharedPreferences;
                if (sharedPreferences != null) {
                    if (sharedPreferences.contains("IAGDPRBool")) {
                        this.f16012a = Boolean.valueOf(sharedPreferences.getBoolean("IAGDPRBool", false));
                    } else {
                        this.f16013b = g();
                    }
                    if (sharedPreferences.contains("IAGdprConsentData")) {
                        this.f16015d = sharedPreferences.getString("IAGdprConsentData", null);
                    } else {
                        this.f16016e = h();
                    }
                    if (sharedPreferences.contains("IACCPAConsentData")) {
                        this.f16019h = sharedPreferences.getString("IACCPAConsentData", null);
                    }
                    if (sharedPreferences.contains("IAGdprSource")) {
                        try {
                            this.f16017f = InneractiveAdManager.GdprConsentSource.valueOf(sharedPreferences.getString("IAGdprSource", InneractiveAdManager.GdprConsentSource.Internal.toString()));
                        } catch (Exception unused) {
                            this.f16017f = InneractiveAdManager.GdprConsentSource.Internal;
                        }
                    }
                    if (sharedPreferences.contains("IALgpdConsentStatus")) {
                        this.f16020i = Boolean.valueOf(sharedPreferences.getBoolean("IALgpdConsentStatus", false));
                    }
                    if (sharedPreferences.contains("keyUserID")) {
                        this.f16018g = sharedPreferences.getString("keyUserID", null);
                    }
                }
            }
        }
    }

    public final Boolean g() {
        o oVar;
        SharedPreferences sharedPreferences;
        s sVar = IAConfigManager.O.f15975u;
        if (sVar != null && (oVar = sVar.f16144b) != null) {
            int iA = oVar.a("TcfVendorId", 262, Integer.MIN_VALUE);
            if (iA != 0 && (sharedPreferences = this.f16023l) != null) {
                try {
                    String string = sharedPreferences.getString("IABTCF_VendorConsents", null);
                    if (string == null) {
                        return null;
                    }
                    int i10 = (iA >= 0 ? iA : 262) - 1;
                    return Boolean.valueOf(string.length() > i10 && string.charAt(i10) == '1');
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public final String h() {
        SharedPreferences sharedPreferences;
        if (IAConfigManager.O.f15975u.f16144b.a("TcfVendorId", 262, Integer.MIN_VALUE) != 0 && (sharedPreferences = this.f16023l) != null && sharedPreferences.contains("IABTCF_TCString")) {
            try {
                return this.f16023l.getString("IABTCF_TCString", null);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
