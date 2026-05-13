package com.inmobi.media;

import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.inmobi.media.Gh;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Gh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Cb f25536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Gi f25537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f25538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f25539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f25540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f25541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f25542k;

    public Gh(Context context, double d10, Ab ab2, long j10, int i10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(ab2, "logLevel");
        this.f25532a = context;
        this.f25533b = j10;
        this.f25534c = i10;
        this.f25535d = false;
        this.f25536e = new Cb(ab2);
        this.f25537f = new Gi(d10);
        this.f25538g = Collections.synchronizedList(new ArrayList());
        this.f25539h = new ConcurrentHashMap();
        this.f25540i = new AtomicBoolean(false);
        this.f25541j = "";
        this.f25542k = new AtomicInteger(0);
    }

    public static final bn.r a(Gh gh2, boolean z10) throws InterruptedException {
        if (gh2.e()) {
            return bn.r.f5635a;
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (gh2.f25541j.length() == 0) {
            p000do.l0 l0Var = Sb.f26292a;
            gh2.f25541j = Rb.a(gh2.f25532a, timeInMillis);
        }
        if (gh2.a(gh2.f25541j)) {
            p000do.h.b(null, new Fh(gh2, timeInMillis, z10, null), 1, null);
        }
        return bn.r.f5635a;
    }

    public final void a() {
        Objects.toString(this.f25540i);
        if ((this.f25535d || this.f25537f.a()) && !this.f25540i.get()) {
            p000do.l0 l0Var = Sb.f26292a;
            Rb.a(new Ch(this, null));
        }
    }

    public final void a(Ab ab2, String str, String str2) throws JSONException {
        tn.p.k(ab2, "logLevel");
        tn.p.k(str, "tag");
        tn.p.k(str2, "message");
        if (this.f25540i.get()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = Db.f25312a;
        tn.p.k(ab2, "logLevel");
        tn.p.k(str, "tag");
        tn.p.k(str2, "message");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", ab2.name());
        jSONObject.put("timestamp", Db.f25312a.format(new Date()));
        jSONObject.put("tag", str);
        jSONObject.put("data", str2);
        p000do.l0 l0Var = Sb.f26292a;
        Rb.a(new Eh(this, ab2, jSONObject, null));
    }

    public final void a(String str, String str2) {
        tn.p.k(str, "key");
        tn.p.k(str2, "value");
        Objects.toString(this.f25540i);
        if (this.f25540i.get()) {
            return;
        }
        this.f25539h.put(str, str2);
    }

    public final void a(final boolean z10) {
        Objects.toString(this.f25540i);
        p000do.l0 l0Var = Sb.f26292a;
        if (Result.m7537exceptionOrNullimpl(Rb.a(new sn.a() { // from class: n9.w0
            @Override // sn.a
            public final Object invoke() {
                return Gh.a(this.f75663b, z10);
            }
        })) != null) {
            try {
                Result.m7534constructorimpl(bn.r.f5635a);
            } catch (Throwable th2) {
                Result.a aVar = Result.Companion;
                Result.m7534constructorimpl(kotlin.c.a(th2));
            }
        }
    }

    public final boolean a(String str) {
        return Tb.a("RemoteLogger", c(), str);
    }

    public final void b() {
        Objects.toString(this.f25540i);
        if ((this.f25535d || this.f25537f.a()) && !this.f25540i.getAndSet(true)) {
            p000do.l0 l0Var = Sb.f26292a;
            Rb.a(new Dh(this, null));
        }
    }

    public final void b(boolean z10) {
        Objects.toString(this.f25540i);
        if (this.f25540i.get()) {
            return;
        }
        this.f25535d = z10;
    }

    public final String c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (this.f25539h) {
            for (Map.Entry entry : this.f25539h.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            bn.r rVar = bn.r.f5635a;
        }
        jSONObject.put("vitals", jSONObject2);
        jSONObject.put(CreativeInfo.f52469an, d());
        String string = jSONObject.toString();
        tn.p.j(string, "toString(...)");
        return string;
    }

    public final JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        List list = this.f25538g;
        tn.p.j(list, "logData");
        synchronized (list) {
            List list2 = this.f25538g;
            tn.p.j(list2, "logData");
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                jSONArray.put((JSONObject) it.next());
            }
            bn.r rVar = bn.r.f5635a;
        }
        return jSONArray;
    }

    public final boolean e() throws JSONException {
        if (this.f25538g.isEmpty() || this.f25539h.isEmpty()) {
            return true;
        }
        String strC = c();
        tn.p.k(strC, "<this>");
        return tn.p.f(strC, JsonUtils.EMPTY_JSON);
    }
}
