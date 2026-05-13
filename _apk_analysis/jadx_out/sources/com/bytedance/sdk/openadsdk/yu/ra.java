package com.bytedance.sdk.openadsdk.yu;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ra {
    private long fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private long f14514lh;
    public long ouw;
    private long vt;
    private long yu;

    private void fkw(long j10) {
        if (this.fkw <= 0) {
            this.fkw = j10;
        }
    }

    private void lh(long j10) {
        if (this.f14514lh <= 0) {
            this.f14514lh = j10;
        }
    }

    private void ouw(long j10) {
        if (this.ouw <= 0) {
            this.ouw = j10;
        }
    }

    private void vt(long j10) {
        if (this.vt <= 0) {
            this.vt = j10;
        }
    }

    private void yu(long j10) {
        if (this.yu <= 0) {
            this.yu = j10;
        }
    }

    public final JSONObject ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j10 = this.ouw;
        if (j10 > 0) {
            jSONObject.put("show_start", j10);
            long j11 = this.vt;
            if (j11 > 0) {
                jSONObject.put("show_firstQuartile", j11);
                long j12 = this.f14514lh;
                if (j12 > 0) {
                    jSONObject.put("show_mid", j12);
                    long j13 = this.yu;
                    if (j13 > 0) {
                        jSONObject.put("show_thirdQuartile", j13);
                        long j14 = this.fkw;
                        if (j14 > 0) {
                            jSONObject.put("show_full", j14);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public final void ouw(long j10, float f10) {
        if (f10 > 0.0f) {
            ouw(j10);
        }
        double d10 = f10;
        if (d10 >= 0.25d) {
            ouw(j10);
            vt(j10);
        }
        if (d10 >= 0.5d) {
            ouw(j10);
            vt(j10);
            lh(j10);
        }
        if (d10 >= 0.75d) {
            ouw(j10);
            vt(j10);
            lh(j10);
            yu(j10);
        }
        if (f10 >= 1.0f) {
            ouw(j10);
            vt(j10);
            lh(j10);
            yu(j10);
            fkw(j10);
        }
    }
}
