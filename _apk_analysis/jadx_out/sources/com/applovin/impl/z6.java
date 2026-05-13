package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.InterfaceC3934ae;

/* JADX INFO: loaded from: classes4.dex */
public class z6 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f11065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f11066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f11067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f11068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f11069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f11070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f11071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f11072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f11073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f11074j;

    public z6(com.applovin.impl.sdk.k kVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.o());
        this.f11066b = defaultSharedPreferences;
        this.f11065a = kVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f11067c = a(z4.f11056u.a());
        this.f11068d = a(z4.f11057v.a());
        this.f11069e = h();
        this.f11070f = (String) a5.a(z4.f11059x, (Object) null, defaultSharedPreferences, false);
        this.f11071g = (String) a5.a(z4.f11060y, (Object) null, defaultSharedPreferences, false);
        this.f11072h = (String) a5.a(z4.f11061z, (Object) null, defaultSharedPreferences, false);
        this.f11073i = (String) a5.a(z4.B, (Object) null, defaultSharedPreferences, false);
        this.f11074j = (String) a5.a(z4.D, (Object) null, defaultSharedPreferences, false);
        b(this.f11071g);
    }

    private Integer a(String str) {
        if (this.f11066b.contains(str)) {
            Integer num = (Integer) a5.a(str, null, Integer.class, this.f11066b, false);
            if (num != null) {
                return num;
            }
            Long l10 = (Long) a5.a(str, null, Long.class, this.f11066b, false);
            if (l10 != null && l10.longValue() >= -2147483648L && l10.longValue() <= 2147483647L) {
                return Integer.valueOf(l10.intValue());
            }
            String str2 = (String) a5.a(str, null, String.class, this.f11066b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f11065a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f11065a.O().b("TcfManager", "String value (" + str2 + ") for " + str + " is not numeric - storing value as null");
                }
            }
        }
        return null;
    }

    private String a(String str, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n");
        sb2.append(str);
        sb2.append(" - ");
        sb2.append(obj != null ? obj.toString() : "No value set");
        return sb2.toString();
    }

    private void a() {
        this.f11067c = null;
        this.f11069e = null;
        this.f11070f = null;
        this.f11071g = null;
        this.f11072h = null;
    }

    private void b(String str) {
        this.f11065a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f11065a.O().a("TcfManager", "Attempting to update consent from Additional Consent string: " + str);
        }
        Boolean boolA = c7.a(InterfaceC3934ae.c.f30980e, str);
        if (boolA == null) {
            this.f11065a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11065a.O().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
                return;
            }
            return;
        }
        if (boolA.booleanValue()) {
            this.f11065a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11065a.O().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
            }
            p0.b(true, com.applovin.impl.sdk.k.o());
        } else {
            this.f11065a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11065a.O().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
            }
            p0.b(false, com.applovin.impl.sdk.k.o());
        }
        this.f11065a.Q0();
    }

    private Integer h() {
        String strA = z4.f11058w.a();
        if (this.f11066b.contains(strA)) {
            Integer num = (Integer) a5.a(strA, null, Integer.class, this.f11066b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f11065a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f11065a.O().b("TcfManager", "Integer value (" + num + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l10 = (Long) a5.a(strA, null, Long.class, this.f11066b, false);
            if (l10 != null) {
                if (l10.longValue() == 1 || l10.longValue() == 0) {
                    return Integer.valueOf(l10.intValue());
                }
                this.f11065a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f11065a.O().b("TcfManager", "Long value (" + l10 + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Boolean bool = (Boolean) a5.a(strA, null, Boolean.class, this.f11066b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) a5.a(strA, null, String.class, this.f11066b, false);
            if (str != null) {
                if ("1".equals(str) || "true".equals(str)) {
                    return 1;
                }
                if ("0".equals(str) || com.ironsource.mediationsdk.metadata.a.f32683h.equals(str)) {
                    return 0;
                }
                this.f11065a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f11065a.O().b("TcfManager", "String value (" + str + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
        }
        return null;
    }

    public Boolean a(int i10) {
        return c7.a(i10, this.f11071g);
    }

    public Boolean b(int i10) {
        String str = this.f11073i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i10 - 1));
    }

    public boolean b() {
        return c7.a(this.f11071g);
    }

    public Boolean c(int i10) {
        String str = this.f11074j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i10 - 1));
    }

    public String c() {
        return this.f11071g;
    }

    public Boolean d(int i10) {
        String str = this.f11072h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i10 - 1));
    }

    public String d() {
        return x6.a(this.f11067c);
    }

    public Integer e() {
        return this.f11067c;
    }

    public Integer f() {
        return this.f11068d;
    }

    public Integer g() {
        return this.f11069e;
    }

    public String i() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.f11067c) + a("CMP SDK Version", this.f11068d) + a(z4.f11058w.a(), this.f11069e) + a(z4.f11059x.a(), this.f11070f) + a(z4.f11060y.a(), this.f11071g);
    }

    public String j() {
        return this.f11070f;
    }

    public String k() {
        return this.f11072h;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f11065a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11065a.O().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(z4.f11056u.a())) {
            this.f11067c = a(str);
            this.f11065a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11065a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11067c);
            }
            this.f11065a.Q0();
            return;
        }
        if (str.equals(z4.f11057v.a())) {
            this.f11068d = a(str);
            this.f11065a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11065a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11068d);
                return;
            }
            return;
        }
        if (str.equals(z4.f11058w.a())) {
            this.f11069e = h();
            this.f11065a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11065a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11069e);
                return;
            }
            return;
        }
        if (str.equals(z4.f11059x.a())) {
            this.f11070f = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f11065a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11065a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11070f);
            }
            this.f11065a.Q0();
            return;
        }
        if (str.equals(z4.f11060y.a())) {
            this.f11071g = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f11065a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11065a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11071g);
            }
            b(this.f11071g);
            return;
        }
        if (str.equals(z4.f11061z.a())) {
            this.f11072h = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f11065a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11065a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11072h);
                return;
            }
            return;
        }
        if (str.equals(z4.A.a())) {
            String str2 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f11065a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11065a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str2);
                return;
            }
            return;
        }
        if (str.equals(z4.B.a())) {
            this.f11073i = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f11065a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11065a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11073i);
                return;
            }
            return;
        }
        if (str.equals(z4.C.a())) {
            String str3 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f11065a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11065a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str3);
                return;
            }
            return;
        }
        if (str.equals(z4.D.a())) {
            this.f11074j = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f11065a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11065a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11074j);
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f11065a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11065a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str4);
            }
        }
    }
}
