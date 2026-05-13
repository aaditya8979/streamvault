package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import com.bytedance.adsdk.ugeno.yu.le;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lh {
    public String bly;
    public Map<String, String> fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f11914le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.yu.le f11915lh;
    public com.bytedance.adsdk.ugeno.yu.cf ouw;
    public String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public String f11916ra;
    public Context tlj;
    public com.bytedance.adsdk.ugeno.vt.lh vt;
    public le.ouw yu;

    public lh(Context context) {
        this.tlj = context;
    }

    public final void lh() {
        com.bytedance.adsdk.ugeno.yu.le leVar = this.f11915lh;
        le.ouw ouwVar = leVar.ouw;
        this.yu = ouwVar;
        if (leVar == null) {
            return;
        }
        this.yu = ouwVar;
        if (ouwVar == null) {
            return;
        }
        this.fkw = ouwVar.fkw;
        this.f11914le = ouwVar.yu;
        this.f11916ra = ouwVar.f11902lh;
        this.pno = ouwVar.ouw;
        this.bly = ouwVar.vt;
    }

    public abstract boolean ouw(Object... objArr);

    public final String yu() {
        return this.pno;
    }
}
