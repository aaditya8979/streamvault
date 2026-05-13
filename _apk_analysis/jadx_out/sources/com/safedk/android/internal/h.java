package com.safedk.android.internal;

import android.os.Bundle;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f53012a = "master";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f53013b = "collect_host_urls";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f53014c = "SafeDKToggles";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f53015d = "network";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f53016e = "location";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f53017f = "calllog";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f53018g = "accounts";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f53019h = "contacts";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f53020i = "calendar";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f53021j = "browser";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f53022k = "sms";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f53023l = "files";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f53024m = "camera";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f53025n = "microphone";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f53026o = "accelerometer";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f53027p = "notifications";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f53028q = "packagemanager";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f53029r = "advertising_identifier";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f53030s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f53031t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f53032u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f53033v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f53034w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f53035x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f53036y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f53037z = true;
    private boolean A = true;
    private boolean B = true;
    private boolean C = true;
    private boolean D = true;
    private boolean E = true;
    private boolean F = true;
    private boolean G = true;
    private boolean H = true;
    private boolean I = false;

    public h(String str) {
        a(str);
    }

    public h(JSONObject jSONObject) {
        a(jSONObject);
    }

    public h(boolean z10) {
        b(z10);
    }

    private void a(String str) {
        try {
            a(new JSONObject(str));
        } catch (JSONException e10) {
            Logger.e(f53014c, "Failed to convert toggles to json", e10);
        }
    }

    private void b(boolean z10) {
        this.H = z10;
        this.G = z10;
        this.F = z10;
        this.E = z10;
        this.D = z10;
        this.C = z10;
        this.B = z10;
        this.A = z10;
        this.f53037z = z10;
        this.f53036y = z10;
        this.f53035x = z10;
        this.f53034w = z10;
        this.f53033v = z10;
        this.f53032u = z10;
        this.f53031t = z10;
        this.f53030s = z10;
        this.I = false;
    }

    private Bundle s() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(f53012a, this.f53030s);
        bundle.putBoolean("network", this.f53031t);
        bundle.putBoolean(f53016e, this.f53032u);
        bundle.putBoolean(f53018g, this.f53034w);
        bundle.putBoolean(f53017f, this.f53033v);
        bundle.putBoolean(f53019h, this.f53035x);
        bundle.putBoolean("calendar", this.f53036y);
        bundle.putBoolean(f53021j, this.f53037z);
        bundle.putBoolean("sms", this.A);
        bundle.putBoolean(f53023l, this.B);
        bundle.putBoolean(f53024m, this.C);
        bundle.putBoolean(f53025n, this.D);
        bundle.putBoolean(f53026o, this.E);
        bundle.putBoolean("notifications", this.F);
        bundle.putBoolean(f53028q, this.G);
        bundle.putBoolean(f53029r, this.H);
        bundle.putBoolean(f53013b, this.I);
        return bundle;
    }

    public ArrayList<String> a() {
        return a(true);
    }

    public ArrayList<String> a(boolean z10) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Bundle bundleS = s();
            for (String str : bundleS.keySet()) {
                if (!str.equals(f53013b) && !bundleS.getBoolean(str)) {
                    arrayList.add(str);
                }
            }
        } catch (Throwable th2) {
            Logger.e(f53014c, "caught exception", th2);
            if (z10) {
                new CrashReporter().caughtException(th2);
            }
        }
        return arrayList;
    }

    public void a(JSONObject jSONObject) {
        try {
            if (jSONObject.has(f53012a)) {
                this.f53030s = jSONObject.getBoolean(f53012a);
            }
            if (jSONObject.has("network")) {
                this.f53031t = jSONObject.getBoolean("network");
            }
            if (jSONObject.has(f53016e)) {
                this.f53032u = jSONObject.getBoolean(f53016e);
            }
            if (jSONObject.has(f53018g)) {
                this.f53034w = jSONObject.getBoolean(f53018g);
            }
            if (jSONObject.has(f53017f)) {
                this.f53033v = jSONObject.getBoolean(f53017f);
            }
            if (jSONObject.has(f53019h)) {
                this.f53035x = jSONObject.getBoolean(f53019h);
            }
            if (jSONObject.has("calendar")) {
                this.f53036y = jSONObject.getBoolean("calendar");
            }
            if (jSONObject.has(f53021j)) {
                this.f53037z = jSONObject.getBoolean(f53021j);
            }
            if (jSONObject.has("sms")) {
                this.A = jSONObject.getBoolean("sms");
            }
            if (jSONObject.has(f53023l)) {
                this.B = jSONObject.getBoolean(f53023l);
            }
            if (jSONObject.has(f53024m)) {
                this.C = jSONObject.getBoolean(f53024m);
            }
            if (jSONObject.has(f53025n)) {
                this.D = jSONObject.getBoolean(f53025n);
            }
            if (jSONObject.has(f53026o)) {
                this.E = jSONObject.getBoolean(f53026o);
            }
            if (jSONObject.has("notifications")) {
                this.F = jSONObject.getBoolean("notifications");
            }
            if (jSONObject.has(f53028q)) {
                this.G = jSONObject.getBoolean(f53028q);
            }
            if (jSONObject.has(f53029r)) {
                this.H = jSONObject.getBoolean(f53029r);
            }
            if (jSONObject.has(f53013b)) {
                this.I = jSONObject.getBoolean(f53013b);
            }
        } catch (Throwable th2) {
            Logger.e(f53014c, "Failed to parse toggles: " + (jSONObject == null ? "null" : jSONObject.toString()), th2);
            new CrashReporter().caughtException(th2);
            b(true);
        }
    }

    public boolean b() {
        return this.f53030s;
    }

    public boolean c() {
        return this.f53031t;
    }

    public boolean d() {
        return this.f53032u;
    }

    public boolean e() {
        return this.f53034w;
    }

    public boolean f() {
        return this.f53033v;
    }

    public boolean g() {
        return this.f53035x;
    }

    public boolean h() {
        return this.f53036y;
    }

    public boolean i() {
        return this.f53037z;
    }

    public boolean j() {
        return this.A;
    }

    public boolean k() {
        return this.B;
    }

    public boolean l() {
        return this.C;
    }

    public boolean m() {
        return this.D;
    }

    public boolean n() {
        return this.E;
    }

    public boolean o() {
        return this.F;
    }

    public boolean p() {
        return this.G;
    }

    public boolean q() {
        return this.H;
    }

    public boolean r() {
        return this.I;
    }

    public String toString() {
        return "SafeDKToggles: master=" + this.f53030s + "; network=" + this.f53031t + "; location=" + this.f53032u + "; ; accounts=" + this.f53034w + "; call_log=" + this.f53033v + "; contacts=" + this.f53035x + "; calendar=" + this.f53036y + "; browser=" + this.f53037z + "; sms_mms=" + this.A + "; files=" + this.B + "; camera=" + this.C + "; microphone=" + this.D + "; accelerometer=" + this.E + "; notifications=" + this.F + "; packageManager=" + this.G + "; advertisingId=" + this.H;
    }
}
