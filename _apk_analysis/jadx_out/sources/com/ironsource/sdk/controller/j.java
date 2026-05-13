package com.ironsource.sdk.controller;

import com.ironsource.C3926a6;
import com.ironsource.C4228r4;
import com.ironsource.C4234ra;
import com.ironsource.C4251sa;
import com.ironsource.C4283u8;
import com.ironsource.C8;
import com.ironsource.InterfaceC4218qa;
import com.ironsource.Oc;
import com.ironsource.Y5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3926a6 f33755b;

    public class a implements Oc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C4251sa f33756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4234ra f33757b;

        public a(C4251sa c4251sa, C4234ra c4234ra) {
            this.f33756a = c4251sa;
            this.f33757b = c4234ra;
        }

        @Override // com.ironsource.Oc
        public void a(C8 c82) {
            try {
                C4251sa c4251sa = this.f33756a;
                C4234ra c4234ra = this.f33757b;
                c4251sa.b(c4234ra, j.this.a(c4234ra, c82.a()));
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @Override // com.ironsource.Oc
        public void a(C8 c82, C4283u8 c4283u8) {
            try {
                C4251sa c4251sa = this.f33756a;
                C4234ra c4234ra = this.f33757b;
                c4251sa.a(c4234ra, j.this.a(c4234ra, c4283u8.b()));
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    public j(String str, C3926a6 c3926a6) {
        this.f33754a = str;
        this.f33755b = c3926a6;
    }

    private C8 a(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(Y5.c.f30726d)) {
            return new C8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(Y5.c.f30726d)));
        }
        throw new Exception(Y5.a.f30710b);
    }

    private Oc a(C4234ra c4234ra, C4251sa c4251sa) {
        return new a(c4251sa, c4234ra);
    }

    private JSONObject a(C4234ra c4234ra, long j10) {
        try {
            return c4234ra.e().put("result", j10);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return IronSourceVideoBridge.jsonObjectInit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C4234ra c4234ra, String str) {
        try {
            return c4234ra.e().put("errMsg", str);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return IronSourceVideoBridge.jsonObjectInit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C4234ra c4234ra, JSONObject jSONObject) {
        try {
            return c4234ra.e().put("result", jSONObject);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return IronSourceVideoBridge.jsonObjectInit();
        }
    }

    private C8 b(JSONObject jSONObject, String str) throws Exception {
        if (!jSONObject.has(Y5.c.f30725c) || !jSONObject.has(Y5.c.f30724b)) {
            throw new Exception(Y5.a.f30709a);
        }
        String string = jSONObject.getString(Y5.c.f30725c);
        return new C8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(Y5.c.f30724b));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(JSONObject jSONObject, InterfaceC4218qa interfaceC4218qa) {
        C4234ra c4234ra = new C4234ra(jSONObject);
        C4251sa c4251sa = new C4251sa(interfaceC4218qa);
        try {
            String strB = c4234ra.b();
            JSONObject jSONObjectC = c4234ra.c();
            C8 c8B = b(jSONObjectC, this.f33754a);
            IronSourceStorageUtils.ensurePathSafety(c8B, this.f33754a);
            byte b10 = -1;
            switch (strB.hashCode()) {
                case -2073025383:
                    if (strB.equals(Y5.b.f30717a)) {
                        b10 = 0;
                    }
                    break;
                case -1137024519:
                    if (strB.equals(Y5.b.f30719c)) {
                        b10 = 2;
                    }
                    break;
                case -318115535:
                    if (strB.equals(Y5.b.f30721e)) {
                        b10 = 4;
                    }
                    break;
                case 537556755:
                    if (strB.equals(Y5.b.f30722f)) {
                        b10 = 5;
                    }
                    break;
                case 1764172231:
                    if (strB.equals(Y5.b.f30718b)) {
                        b10 = 1;
                    }
                    break;
                case 1953259713:
                    if (strB.equals(Y5.b.f30720d)) {
                        b10 = 3;
                    }
                    break;
            }
            if (b10 == 0) {
                this.f33755b.a(c8B, jSONObjectC.optString(Y5.c.f30723a), jSONObjectC.optInt("connectionTimeout"), jSONObjectC.optInt("readTimeout"), a(c4234ra, c4251sa));
                return;
            }
            if (b10 == 1) {
                this.f33755b.a(c8B);
                c4251sa.b(c4234ra, a(c4234ra, c8B.a()));
                return;
            }
            if (b10 == 2) {
                this.f33755b.b(c8B);
                c4251sa.b(c4234ra, a(c4234ra, c8B.a()));
                return;
            }
            if (b10 == 3) {
                c4251sa.b(c4234ra, a(c4234ra, this.f33755b.c(c8B)));
                return;
            }
            if (b10 == 4) {
                c4251sa.b(c4234ra, a(c4234ra, this.f33755b.d(c8B)));
            } else {
                if (b10 != 5) {
                    return;
                }
                this.f33755b.a(c8B, jSONObjectC.optJSONObject(Y5.c.f30729g));
                c4251sa.b(c4234ra, a(c4234ra, c8B.a()));
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            c4251sa.a(c4234ra, a(c4234ra, e10.getMessage()));
        }
    }
}
