package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8781c = a(z4.f11047l);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8782d = a(z4.f11048m);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8783e = (String) a5.a(z4.f11049n, (Object) null, com.applovin.impl.sdk.k.o());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f8784f = (String) a5.a(z4.f11050o, (Object) null, com.applovin.impl.sdk.k.o());

    public m7(com.applovin.impl.sdk.k kVar) {
        this.f8779a = kVar;
        a(f());
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        z4 z4Var = z4.f11051p;
        String str = (String) kVar.a(z4Var);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        kVar.b(z4Var, strValueOf);
        return strValueOf;
    }

    private String a(z4 z4Var) {
        String str = (String) a5.a(z4Var, (Object) null, com.applovin.impl.sdk.k.o());
        if (StringUtils.isValidString(str)) {
            return str;
        }
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a5.b(z4Var, lowerCase, com.applovin.impl.sdk.k.o());
        return lowerCase;
    }

    private String f() {
        if (!((Boolean) this.f8779a.a(x4.K3)).booleanValue()) {
            this.f8779a.c(z4.f11046k);
        }
        String str = (String) this.f8779a.a(z4.f11046k);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f8779a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8779a.O().a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public String a() {
        return this.f8782d;
    }

    public void a(String str) {
        if (((Boolean) this.f8779a.a(x4.K3)).booleanValue()) {
            this.f8779a.b(z4.f11046k, str);
        }
        this.f8780b = str;
        this.f8779a.t().b(str, a());
    }

    public String b() {
        return this.f8783e;
    }

    public void b(String str) {
        this.f8783e = str;
        a5.b(z4.f11049n, str, com.applovin.impl.sdk.k.o());
    }

    public String c() {
        return this.f8781c;
    }

    public void c(String str) {
        this.f8784f = str;
        a5.b(z4.f11050o, str, com.applovin.impl.sdk.k.o());
    }

    public String d() {
        return this.f8784f;
    }

    public String e() {
        return this.f8780b;
    }
}
