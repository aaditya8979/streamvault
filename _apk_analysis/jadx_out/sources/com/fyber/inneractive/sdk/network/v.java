package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.material.datepicker.UtcDates;
import com.ironsource.C4306ve;
import com.ironsource.G5;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f17064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f17067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f17068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f17070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w f17071h;

    public v(w wVar, y yVar, String str, String str2, String str3, String str4, Integer num, String str5) {
        this.f17071h = wVar;
        this.f17064a = yVar;
        this.f17065b = str;
        this.f17066c = str2;
        this.f17067d = str3;
        this.f17068e = str4;
        this.f17069f = num;
        this.f17070g = str5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strA;
        HashMap map;
        com.fyber.inneractive.sdk.response.e eVar;
        w wVar = this.f17071h;
        t tVar = wVar.f17077b;
        if (tVar != null) {
            this.f17064a.a(Integer.valueOf(tVar.val), NotificationCompat.CATEGORY_ERROR);
            this.f17071h.f17077b.getClass();
            strA = r1.ERROR_TABLE.a();
            IAlog.a("Event dispatcher - dispatching error: %s", this.f17071h.f17077b);
            IAlog.d("%s %s", "DISPATCHED_SDK_ERROR", Integer.valueOf(this.f17071h.f17077b.val));
        } else {
            u uVar = wVar.f17078c;
            if (uVar != null) {
                this.f17064a.a(Integer.valueOf(uVar.val), "event");
                this.f17071h.f17078c.getClass();
                strA = r1.EVENT_TABLE.a();
                IAlog.a("Event dispatcher - dispatching event: %s", this.f17071h.f17078c);
                IAlog.d("%s %s", "DISPATCHED_SDK_EVENT", Integer.valueOf(this.f17071h.f17078c.val));
            } else {
                strA = null;
            }
        }
        y yVar = this.f17064a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strA);
        w wVar2 = this.f17071h;
        t tVar2 = wVar2.f17077b;
        sb2.append(tVar2 != null ? String.valueOf(tVar2.val) : String.valueOf(wVar2.f17078c.val));
        yVar.a(sb2.toString(), G5.Q);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(UtcDates.UTC));
        this.f17064a.a(Long.valueOf(calendar.getTimeInMillis()), "date_created");
        if (!IAConfigManager.d()) {
            this.f17064a.a(this.f17065b, "contentid");
            this.f17064a.a(this.f17066c, "fairbidv");
            if (!TextUtils.isEmpty(this.f17067d)) {
                this.f17064a.a(this.f17067d, "placement_type");
            }
            if (!TextUtils.isEmpty(this.f17068e)) {
                this.f17064a.a(this.f17068e, "spot_id");
            }
            if (!InneractiveAdManager.isCurrentUserAChild()) {
                String strI = com.fyber.inneractive.sdk.util.k.i();
                if (!TextUtils.isEmpty(strI)) {
                    this.f17064a.a(strI, "ciso");
                }
            }
            this.f17064a.a(this.f17069f, "ad_type");
            if (this.f17071h.f17082g && !TextUtils.isEmpty(this.f17070g)) {
                this.f17064a.f17089c = this.f17070g;
            }
            this.f17064a.a(com.fyber.inneractive.sdk.util.z0.a().b(), "n");
            try {
                this.f17064a.a(w.f17075h.format(calendar.getTime()), "day");
            } catch (Throwable unused) {
            }
            this.f17064a.a(Integer.valueOf(calendar.get(11)), "hour");
            JSONArray jSONArray = this.f17071h.f17079d;
            if (jSONArray != null && jSONArray.length() > 0) {
                this.f17064a.a(this.f17071h.f17079d, C4306ve.f34270d);
            }
            com.fyber.inneractive.sdk.response.e eVar2 = this.f17071h.f17080e;
            if (eVar2 != null && eVar2.D) {
                this.f17064a.a("1", "sdk_bidding");
            }
            if (InneractiveAdManager.isCurrentUserAChild()) {
                this.f17064a.a("1", "child_mode");
            }
            IAConfigManager iAConfigManager = IAConfigManager.O;
            this.f17064a.a(iAConfigManager.E.n() && (eVar = this.f17071h.f17080e) != null && eVar.H != com.fyber.inneractive.sdk.ignite.m.NONE ? "1" : "0", "ignite");
            y yVar2 = this.f17064a;
            com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.E.f16744p;
            yVar2.a(lVar != null ? lVar.f59542a.d() : null, "ignitep");
            y yVar3 = this.f17064a;
            com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.E.f16744p;
            yVar3.a(lVar2 != null ? lVar2.f59542a.i() : null, "ignitev");
            JSONArray jSONArrayB = iAConfigManager.M.b();
            if (jSONArrayB != null && jSONArrayB.length() > 0) {
                this.f17064a.a(jSONArrayB, "s_experiments");
            }
            JSONArray jSONArray2 = this.f17071h.f17081f;
            if (jSONArray2 != null && jSONArray2.length() > 0) {
                int i10 = 0;
                while (true) {
                    if (i10 >= jSONArray2.length()) {
                        break;
                    }
                    if (jSONArray2.optJSONObject(i10).length() >= 1) {
                        this.f17064a.a(this.f17071h.f17081f, "extra");
                        break;
                    }
                    i10++;
                }
            }
            com.fyber.inneractive.sdk.response.e eVar3 = this.f17071h.f17080e;
            if (eVar3 != null && eVar3.L) {
                this.f17064a.a("1", "dynamic_controls");
            }
        }
        y yVar4 = this.f17064a;
        if (TextUtils.isEmpty(yVar4.f17087a) || (map = yVar4.f17088b) == null || map.size() == 0) {
            return;
        }
        f fVar = IAConfigManager.O.I;
        fVar.getClass();
        JSONObject jSONObject = new JSONObject();
        HashMap map2 = yVar4.f17088b;
        for (String str : map2.keySet()) {
            Object obj = map2.get(str);
            if (obj != null) {
                try {
                    jSONObject.put(str, obj);
                } catch (JSONException unused2) {
                }
            }
        }
        String strSubstring = yVar4.f17089c;
        if (strSubstring != null) {
            int length = strSubstring.length();
            if (length > 51200) {
                int iIndexOf = strSubstring.indexOf("iawrapper");
                if (iIndexOf == -1) {
                    iIndexOf = 0;
                }
                strSubstring = strSubstring.substring(iIndexOf, 51199);
                IAlog.a("Sdk event dispatcher: message size %d is too long! trimming message to %d Characters", Integer.valueOf(length), 51200);
            }
            try {
                jSONObject.put("ad", strSubstring);
            } catch (JSONException e10) {
                IAlog.a("Failed inserting ad body to json", e10, new Object[0]);
            }
        }
        if (IAlog.f19500a == 1) {
            try {
                IAlog.d("%s, Event: %s", "SDK_EVENT", jSONObject.toString());
            } catch (Throwable unused3) {
            }
        }
        fVar.f16964a.offer(jSONObject);
        if (fVar.f16964a.size() > 30) {
            com.fyber.inneractive.sdk.util.d1 d1Var = fVar.f16967d;
            if (d1Var != null && d1Var.hasMessages(12312329)) {
                fVar.f16967d.removeMessages(12312329);
            }
            com.fyber.inneractive.sdk.util.d1 d1Var2 = fVar.f16967d;
            if (d1Var2 != null) {
                d1Var2.post(new c(fVar, 12312329, 0L));
            }
        }
    }
}
