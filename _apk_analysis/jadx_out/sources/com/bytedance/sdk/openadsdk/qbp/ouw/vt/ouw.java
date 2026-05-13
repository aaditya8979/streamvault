package com.bytedance.sdk.openadsdk.qbp.ouw.vt;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.rn.ouw.lh;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import com.bytedance.sdk.openadsdk.rn.vt;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.ironsource.Q6;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ouw {

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static volatile ouw f14227ra;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private AtomicLong f14229lh = new AtomicLong(0);
    public int ouw = 0;
    public String vt = "";
    private final AtomicBoolean yu = new AtomicBoolean(false);
    private volatile Boolean fkw = null;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private String f14228le = "";

    private ouw() {
    }

    public static boolean lh() {
        return cf.vt().zin(Q6.V0);
    }

    public static ouw ouw() {
        if (f14227ra == null) {
            synchronized (ouw.class) {
                if (f14227ra == null) {
                    f14227ra = new ouw();
                }
            }
        }
        return f14227ra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String vt(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(th2.toString());
            for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                sb2.append("\n\tat ");
                sb2.append(stackTraceElement.toString());
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final void ouw(int i10, String str) {
        ouw(false, i10, str, null);
    }

    public final void ouw(JSONObject jSONObject) {
        if (lh()) {
            try {
                jSONObject.put(Q6.V0, this.vt);
            } catch (JSONException unused) {
            }
        }
    }

    public final void ouw(boolean z10) {
        if (!lh()) {
            if (this.yu.getAndSet(true)) {
                return;
            }
            ouw().ouw(1, "not in privacy fields allowed");
        } else {
            if (this.ouw == 1 || !TextUtils.isEmpty(this.vt)) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (z10 || this.f14229lh.get() <= jElapsedRealtime) {
                this.f14229lh.set(jElapsedRealtime + 300000);
                bs.ouw((pno) new DeviceUtils.lh());
            }
        }
    }

    public final void ouw(final boolean z10, final int i10, final String str, final Throwable th2) {
        if (this.fkw == null) {
            synchronized (this) {
                if (this.fkw == null) {
                    this.fkw = Boolean.valueOf(((int) ((Math.random() * 100.0d) + 1.0d)) <= cf.vt().ouw("gid_status", 100));
                    if (this.fkw.booleanValue()) {
                        try {
                            this.f14228le = ex.ouw();
                        } catch (Throwable unused) {
                            this.f14228le = "default";
                        }
                    }
                }
            }
        }
        if (!this.fkw.booleanValue() || zih.ouw() == null) {
            return;
        }
        zih.fkw().ouw(new vt() { // from class: com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.1
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            @Nullable
            public final lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("session_id", ouw.this.f14228le);
                jSONObject.put("is_success", z10);
                jSONObject.put("error_code", i10);
                jSONObject.put("error_msg", TextUtils.isEmpty(str) ? ouw.vt(th2) : str);
                jSONObject.put("has_setting", cf.vt().fak() > 0);
                yu yuVar = new yu();
                yuVar.ouw = "gid_status";
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        }, false);
    }

    public final String vt() {
        return lh() ? this.vt : "";
    }
}
