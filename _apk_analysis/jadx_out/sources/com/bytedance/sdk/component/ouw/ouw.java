package com.bytedance.sdk.component.ouw;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.ouw.jg;
import com.bytedance.sdk.component.ouw.le;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ouw {
    public String fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ra f12748lh;
    public Context ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public le f12749ra;
    public cf vt;
    public Handler yu = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public volatile boolean f12747le = false;
    private final Map<String, le> pno = new HashMap();

    public void invokeMethod(final String str) {
        if (this.f12747le) {
            return;
        }
        pno.ouw("Received call: ".concat(String.valueOf(str)));
        this.yu.post(new Runnable() { // from class: com.bytedance.sdk.component.ouw.ouw.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ouw.this.f12747le) {
                    return;
                }
                jg jgVarOuw = null;
                try {
                    jgVarOuw = ouw.this.ouw(PangleVideoBridge.jsonObjectInit(str));
                } catch (Exception e10) {
                    pno.vt("Exception thrown while parsing function.", e10);
                }
                boolean z10 = true;
                if (jgVarOuw != null && jgVarOuw.ouw == 1 && !TextUtils.isEmpty(jgVarOuw.yu) && !TextUtils.isEmpty(jgVarOuw.fkw)) {
                    z10 = false;
                }
                if (!z10) {
                    ouw.this.ouw(jgVarOuw);
                    return;
                }
                pno.ouw("By pass invalid call: ".concat(String.valueOf(jgVarOuw)));
                if (jgVarOuw != null) {
                    ouw.this.vt(th.ouw(new rn(jgVarOuw.ouw, "Failed to parse invocation.")), jgVarOuw);
                }
            }
        });
    }

    public final void lh(bly blyVar) {
        this.ouw = ouw(blyVar);
        this.f12748lh = blyVar.yu;
        this.vt = blyVar.pno;
        this.f12749ra = new le(blyVar, this);
        this.fkw = blyVar.tlj;
        vt(blyVar);
    }

    public abstract Context ouw(bly blyVar);

    public final jg ouw(JSONObject jSONObject) {
        String strOptString;
        if (this.f12747le) {
            return null;
        }
        String strOptString2 = jSONObject.optString("__callback_id");
        String strOptString3 = jSONObject.optString("func");
        if (ouw() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String strValueOf = "";
            try {
                Object objOpt = jSONObject.opt("params");
                if (objOpt == null) {
                    strOptString = strValueOf;
                } else if (objOpt instanceof JSONObject) {
                    strOptString = String.valueOf((JSONObject) objOpt);
                } else {
                    strValueOf = objOpt instanceof String ? (String) objOpt : String.valueOf(objOpt);
                    strOptString = strValueOf;
                }
            } catch (Throwable unused) {
                strOptString = jSONObject.optString("params");
            }
            String string2 = jSONObject.getString("JSSDK");
            String strOptString4 = jSONObject.optString("namespace");
            String strOptString5 = jSONObject.optString("__iframe_url");
            jg.ouw ouwVar = new jg.ouw((byte) 0);
            ouwVar.ouw = string2;
            ouwVar.vt = string;
            ouwVar.f12739lh = strOptString3;
            ouwVar.yu = strOptString;
            ouwVar.fkw = strOptString2;
            ouwVar.f12738le = strOptString4;
            ouwVar.f12740ra = strOptString5;
            return new jg(ouwVar, (byte) 0);
        } catch (JSONException e10) {
            pno.vt("Failed to create call.", e10);
            return new jg(strOptString2);
        }
    }

    public abstract String ouw();

    public final void ouw(jg jgVar) {
        String strOuw;
        if (this.f12747le || (strOuw = ouw()) == null) {
            return;
        }
        String str = jgVar.f12737ra;
        le leVar = (TextUtils.equals(str, this.fkw) || TextUtils.isEmpty(str)) ? this.f12749ra : this.pno.get(str);
        if (leVar == null) {
            pno.vt("Received call with unknown namespace, ".concat(String.valueOf(jgVar)));
            if (this.vt != null) {
                ouw();
            }
            vt(th.ouw(new rn(-4, "Namespace " + jgVar.f12737ra + " unknown.")), jgVar);
            return;
        }
        fkw fkwVar = new fkw();
        fkwVar.vt = strOuw;
        fkwVar.ouw = this.ouw;
        fkwVar.f12734lh = leVar;
        try {
            le.ouw ouwVarOuw = leVar.ouw(jgVar, fkwVar);
            if (ouwVarOuw != null) {
                if (ouwVarOuw.ouw) {
                    vt(ouwVarOuw.vt, jgVar);
                }
                if (this.vt != null) {
                    ouw();
                    return;
                }
                return;
            }
            pno.vt("Received call but not registered, ".concat(String.valueOf(jgVar)));
            if (this.vt != null) {
                ouw();
            }
            vt(th.ouw(new rn(-2, "Function " + jgVar.yu + " is not registered.")), jgVar);
        } catch (Exception e10) {
            pno.ouw("call finished with error, ".concat(String.valueOf(jgVar)), e10);
            vt(th.ouw(e10), jgVar);
        }
    }

    public abstract void ouw(String str);

    public void ouw(String str, jg jgVar) {
        ouw(str);
    }

    public void vt() {
        this.f12749ra.ouw();
        Iterator<le> it = this.pno.values().iterator();
        while (it.hasNext()) {
            it.next().ouw();
        }
        this.yu.removeCallbacksAndMessages(null);
        this.f12747le = true;
    }

    public abstract void vt(bly blyVar);

    public final void vt(String str, jg jgVar) {
        JSONObject jSONObject;
        if (this.f12747le) {
            return;
        }
        if (TextUtils.isEmpty(jgVar.f12735le)) {
            pno.ouw("By passing js callback due to empty callback: ".concat(String.valueOf(str)));
            return;
        }
        if (!str.startsWith(h.f52301d) || !str.endsWith(h.f52302e)) {
            pno.ouw(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        pno.ouw("Invoking js callback: " + jgVar.f12735le);
        try {
            jSONObject = PangleVideoBridge.jsonObjectInit(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        ouw(new mwh().ouw("__msg_type", "callback").ouw("__callback_id", jgVar.f12735le).ouw("__params", jSONObject).ouw(), jgVar);
    }
}
