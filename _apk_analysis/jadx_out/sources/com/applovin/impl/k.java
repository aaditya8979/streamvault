package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import com.safedk.android.internal.partials.AppLovinVideoBridge;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8588b;

    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8593a;

        a(String str) {
            this.f8593a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f8593a;
        }
    }

    public k(String str, com.applovin.impl.sdk.k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f8588b = str;
        this.f8587a = kVar;
    }

    private String a(x4 x4Var) {
        for (String str : this.f8587a.c(x4Var)) {
            if (this.f8588b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }

    public JSONObject a() {
        if (c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(AppLovinVideoBridge.stringInit(Base64.decode(this.f8588b.substring(d().length()), 0), "UTF-8"));
                this.f8587a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8587a.O().a("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (JSONException e10) {
                this.f8587a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8587a.O().a("AdToken", "Unable to decode token '" + this.f8588b + "' into JSON", e10);
                }
                this.f8587a.D().a("AdToken", "decodeFullAdResponseStr", e10);
                return null;
            }
        } catch (UnsupportedEncodingException e11) {
            this.f8587a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8587a.O().a("AdToken", "Unable to process ad response from token '" + this.f8588b + "'", e11);
            }
            this.f8587a.D().a("AdToken", "decodeFullAdResponse", e11);
            return null;
        }
    }

    public String b() {
        return this.f8588b;
    }

    public a c() {
        return a(x4.f10870x0) != null ? a.REGULAR : a(x4.f10878y0) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String d() {
        String strA = a(x4.f10870x0);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a(x4.f10878y0);
        if (TextUtils.isEmpty(strA2)) {
            return null;
        }
        return strA2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        String str = this.f8588b;
        String str2 = ((k) obj).f8588b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f8588b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AdToken{id=" + StringUtils.prefixToIndex(32, this.f8588b) + ", type=" + c() + '}';
    }
}
