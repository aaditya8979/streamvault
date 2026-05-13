package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f17075h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f17076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f17077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f17078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONArray f17079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f17080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONArray f17081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17082g;

    public w(t tVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.f17077b = tVar;
        this.f17076a = null;
        this.f17079d = null;
    }

    public w(t tVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.f17077b = tVar;
        this.f17076a = inneractiveAdRequest;
        this.f17079d = null;
    }

    public w(u uVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.f17078c = uVar;
        this.f17076a = null;
        this.f17079d = null;
    }

    public w(u uVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.f17078c = uVar;
        this.f17076a = inneractiveAdRequest;
        this.f17079d = null;
    }

    public w(com.fyber.inneractive.sdk.response.e eVar) {
        this.f17082g = false;
        this.f17080e = eVar;
        this.f17081f = new JSONArray();
    }

    public final w a(Object... objArr) {
        if (objArr.length > 0) {
            JSONObject jSONObject = new JSONObject();
            for (int i10 = 0; i10 < objArr.length - 1; i10 += 2) {
                String string = objArr[i10].toString();
                Object obj = objArr[i10 + 1];
                try {
                    jSONObject.put(string, obj);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", string, obj);
                }
            }
            this.f17081f.put(jSONObject);
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.w.a(java.lang.String):void");
    }
}
