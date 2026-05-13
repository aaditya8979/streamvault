package com.inmobi.media;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.inmobi.media.C3329ca;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3329ca implements Z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W9 f26924a;

    public C3329ca(W9 w92) {
        tn.p.k(w92, "incompleteLogData");
        this.f26924a = w92;
    }

    public static final bn.r a(C3329ca c3329ca) throws InterruptedException {
        Tb.a(c3329ca.f26924a.f26530c.f27957a);
        p000do.h.b(null, new C3277aa(c3329ca, null), 1, null);
        return bn.r.f5635a;
    }

    public static final bn.r a(C3329ca c3329ca, String str) throws JSONException, InterruptedException {
        W9 w92 = c3329ca.f26924a;
        JSONObject jSONObject = w92.f26528a;
        JSONArray jSONArray = w92.f26529b;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("vitals", jSONObject);
        jSONObject2.put(CreativeInfo.f52469an, jSONArray);
        String string = jSONObject2.toString();
        tn.p.j(string, "toString(...)");
        Tb.a(str, string, c3329ca.f26924a.f26530c.f27957a);
        String str2 = c3329ca.f26924a.f26530c.f27957a;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        C3682qb c3682qb = c3329ca.f26924a.f26530c;
        p000do.h.b(null, new C3303ba(new C3682qb(str2, timeInMillis, 0, c3682qb.f27960d, true, c3682qb.f27962f), null), 1, null);
        return bn.r.f5635a;
    }

    public final Object a() {
        try {
            Result.a aVar = Result.Companion;
            p000do.l0 l0Var = Sb.f26292a;
            return Result.m7534constructorimpl(Result.m7533boximpl(Rb.a(new sn.a() { // from class: n9.v5
                @Override // sn.a
                public final Object invoke() {
                    return C3329ca.a(this.f75655b);
                }
            })));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(th2));
        }
    }

    public final void a(String str) {
        tn.p.k("IncompleteLogFinalizer", "tag");
        tn.p.k(str, "message");
        try {
            JSONArray jSONArray = this.f26924a.f26529b;
            Ab ab2 = Ab.f25153c;
            SimpleDateFormat simpleDateFormat = Db.f25312a;
            tn.p.k(ab2, "logLevel");
            tn.p.k("IncompleteLogFinalizer", "tag");
            tn.p.k(str, "message");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scope", "ERROR");
            jSONObject.put("timestamp", Db.f25312a.format(new Date()));
            jSONObject.put("tag", "IncompleteLogFinalizer");
            jSONObject.put("data", str);
            jSONArray.put(jSONObject);
        } catch (Exception unused) {
        }
    }

    public final Object b() {
        final String str = "IncompleteLogFinalizer";
        tn.p.k("IncompleteLogFinalizer", "tag");
        try {
            Result.a aVar = Result.Companion;
            JSONObject jSONObject = this.f26924a.f26528a;
            tn.p.k(jSONObject, "<this>");
            if (!tn.p.f(jSONObject.toString(), JsonUtils.EMPTY_JSON)) {
                JSONArray jSONArray = this.f26924a.f26529b;
                tn.p.k(jSONArray, "<this>");
                if (jSONArray.length() != 0) {
                    p000do.l0 l0Var = Sb.f26292a;
                    Rb.a(new sn.a() { // from class: n9.w5
                        @Override // sn.a
                        public final Object invoke() {
                            return C3329ca.a(this.f75670b, str);
                        }
                    });
                }
            }
            return Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(th2));
        }
    }

    public final void b(String str) {
        tn.p.k("IncompleteLogFinalizer", "tag");
        tn.p.k("exitReason", "key");
        tn.p.k(str, "value");
        try {
            this.f26924a.f26528a.put("exitReason", str);
        } catch (Exception unused) {
        }
    }
}
