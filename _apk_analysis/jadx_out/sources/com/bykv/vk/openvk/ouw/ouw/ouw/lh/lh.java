package com.bykv.vk.openvk.ouw.ouw.ouw.lh;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class lh implements Serializable {
    public String bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public boolean f11268cf;
    public boolean fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public String f11269jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public int f11270ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f11271le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f11272lh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private int f11273od;
    public vt ouw;
    public int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f11274ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public int f11275rn;
    public boolean ryl;
    public long tlj;
    public int vpp;
    public vt vt;
    public boolean yu;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private int f11276tc = 204800;
    private int ksc = 0;
    private int jae = 0;
    public float mwh = -1.0f;
    public final HashMap<String, Object> zih = new HashMap<>();

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public int f11278vm = 10000;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public int f11277th = 10000;
    public int qbp = 10000;
    public int zin = 0;
    public int jqy = 1;
    public JSONObject ex = new JSONObject();

    public lh(String str, vt vtVar, vt vtVar2, int i10, int i11) {
        this.f11275rn = 0;
        this.f11273od = 0;
        this.f11272lh = str;
        this.ouw = vtVar;
        this.vt = vtVar2;
        this.f11275rn = i10;
        this.f11273od = i11;
    }

    public final String bly() {
        if (le()) {
            return this.vt.ouw();
        }
        vt vtVar = this.ouw;
        if (vtVar != null) {
            return vtVar.ouw();
        }
        return null;
    }

    public final boolean fkw() {
        if (le()) {
            return this.vt.yu();
        }
        vt vtVar = this.ouw;
        if (vtVar != null) {
            return vtVar.yu();
        }
        return true;
    }

    public final boolean le() {
        vt vtVar;
        if (this.f11273od == 1 && (vtVar = this.vt) != null && !TextUtils.isEmpty(vtVar.f11285ra)) {
            if (com.bykv.vk.openvk.ouw.ouw.ouw.lh.ra() == 2) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
            } else if (this.f11275rn == 1) {
                return true;
            }
        }
        return false;
    }

    public final int lh() {
        if (le()) {
            return this.vt.vt();
        }
        vt vtVar = this.ouw;
        if (vtVar != null) {
            return vtVar.vt();
        }
        return 0;
    }

    public final synchronized Object ouw(String str) {
        return this.zih.get(str);
    }

    public final synchronized void ouw(String str, Object obj) {
        this.zih.put(str, obj);
    }

    public final boolean ouw() {
        int i10 = this.vpp;
        return i10 == 1 || i10 == 2;
    }

    public final String pno() {
        if (le()) {
            return this.vt.f11285ra;
        }
        vt vtVar = this.ouw;
        if (vtVar != null) {
            return vtVar.f11285ra;
        }
        return null;
    }

    public final float ra() {
        float f10 = this.mwh;
        if (f10 != -1.0f) {
            return f10;
        }
        if (le()) {
            return this.vt.mwh;
        }
        vt vtVar = this.ouw;
        if (vtVar != null) {
            return vtVar.mwh;
        }
        return -1.0f;
    }

    public final int vt() {
        return this.ex.optInt("pitaya_cache_size", 0);
    }

    public final long yu() {
        if (le()) {
            return this.vt.f11284lh;
        }
        vt vtVar = this.ouw;
        if (vtVar != null) {
            return vtVar.f11284lh;
        }
        return 0L;
    }
}
