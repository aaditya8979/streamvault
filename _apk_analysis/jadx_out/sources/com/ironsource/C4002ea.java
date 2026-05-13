package com.ironsource;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C4002ea {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f31566m = "age";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f31567n = "gen";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f31568o = "lvl";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f31569p = "pay";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f31570q = "iapt";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f31571r = "ucd";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f31572s = "segName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31573a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f31579g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31574b = 999999;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f31575c = 999999.99d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31576d = "custom";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f31577e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31578f = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f31580h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AtomicBoolean f31581i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f31582j = -1.0d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f31583k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList<Pair<String, String>> f31584l = new ArrayList<>();

    private boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }

    private boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    @Deprecated
    public int a() {
        return this.f31578f;
    }

    public void a(double d10) {
        if (d10 > 0.0d && d10 < this.f31575c) {
            this.f31582j = Math.floor(d10 * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setIAPTotal( " + d10 + " ) iapt must be between 0-" + this.f31575c, 2);
    }

    public void a(int i10) {
        if (i10 > 0 && i10 < this.f31574b) {
            this.f31580h = i10;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setLevel( " + i10 + " ) level must be between 1-" + this.f31574b, 2);
    }

    public void a(long j10) {
        if (j10 > 0) {
            this.f31583k = j10;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setUserCreationDate( " + j10 + " ) is an invalid timestamp", 2);
    }

    public void a(String str) {
        if (b(str) && a(str, 1, 32)) {
            this.f31573a = str;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
    }

    public void a(String str, String str2) {
        try {
            if (b(str) && b(str2) && a(str, 1, 32) && a(str2, 1, 32)) {
                String str3 = "custom_" + str;
                if (this.f31584l.size() >= 5) {
                    this.f31584l.remove(0);
                }
                this.f31584l.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void a(boolean z10) {
        if (this.f31581i == null) {
            this.f31581i = new AtomicBoolean();
        }
        this.f31581i.set(z10);
    }

    @Deprecated
    public String b() {
        return this.f31579g;
    }

    public double c() {
        return this.f31582j;
    }

    public AtomicBoolean d() {
        return this.f31581i;
    }

    public int e() {
        return this.f31580h;
    }

    public ArrayList<Pair<String, String>> f() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.f31578f != -1) {
            arrayList.add(new Pair<>("age", this.f31578f + ""));
        }
        if (!TextUtils.isEmpty(this.f31579g)) {
            arrayList.add(new Pair<>(f31567n, this.f31579g));
        }
        if (this.f31580h != -1) {
            arrayList.add(new Pair<>("lvl", this.f31580h + ""));
        }
        if (this.f31581i != null) {
            arrayList.add(new Pair<>("pay", this.f31581i + ""));
        }
        if (this.f31582j != -1.0d) {
            arrayList.add(new Pair<>("iapt", this.f31582j + ""));
        }
        if (this.f31583k != 0) {
            arrayList.add(new Pair<>("ucd", this.f31583k + ""));
        }
        if (!TextUtils.isEmpty(this.f31573a)) {
            arrayList.add(new Pair<>("segName", this.f31573a));
        }
        arrayList.addAll(this.f31584l);
        return arrayList;
    }

    public String g() {
        return this.f31573a;
    }

    public long h() {
        return this.f31583k;
    }

    public JSONObject i() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        for (Pair<String, String> pair : f()) {
            try {
                jSONObjectJsonObjectInit.put((String) pair.first, pair.second);
            } catch (JSONException e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error("exception " + e10.getMessage());
            }
        }
        return jSONObjectJsonObjectInit;
    }
}
