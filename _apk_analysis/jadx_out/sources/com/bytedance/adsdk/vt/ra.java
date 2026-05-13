package com.bytedance.adsdk.vt;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public class ra {
    public Rect bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public float f12167cf;
    public List<com.bytedance.adsdk.vt.lh.le> fkw;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public lh f12169ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public SparseArray<com.bytedance.adsdk.vt.lh.yu> f12170le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public Map<String, tlj> f12171lh;
    public boolean mwh;
    public List<com.bytedance.adsdk.vt.lh.lh.fkw> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public LongSparseArray<com.bytedance.adsdk.vt.lh.lh.fkw> f12172ra;
    public float ryl;
    public float tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public vt f12175vm;
    public Map<String, List<com.bytedance.adsdk.vt.lh.lh.fkw>> vt;
    public Map<String, com.bytedance.adsdk.vt.lh.lh> yu;
    public ouw zih;
    public final th ouw = new th();

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private final HashSet<String> f12174th = new HashSet<>();

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public int f12168jg = 0;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public String f12173rn = "";

    public static class lh {
        public int[] fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public String f12176le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f12177lh;
        public int ouw;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public JSONArray f12178ra;
        public String vt;
        public String yu;
    }

    public static class ouw {
        public int fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public String f12179le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public Map<String, Object> f12180lh;
        public int ouw;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public JSONArray f12181ra;
        public Map<String, Object> vt;
        public int yu;
    }

    public static class vt {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public JSONArray f12182lh;
        public String ouw;
        public int[][] vt;
    }

    public final float ouw() {
        return (long) ((vt() / this.ryl) * 1000.0f);
    }

    public final float ouw(float f10) {
        return com.bytedance.adsdk.vt.le.ra.ouw(this.tlj, this.f12167cf, f10);
    }

    public final com.bytedance.adsdk.vt.lh.lh.fkw ouw(long j10) {
        return this.f12172ra.get(j10);
    }

    public final void ouw(int i10) {
        this.f12168jg += i10;
    }

    public final void ouw(String str) {
        com.bytedance.adsdk.vt.le.yu.vt(str);
        this.f12174th.add(str);
    }

    public final void ouw(boolean z10) {
        this.ouw.ouw = z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.vt.lh.lh.fkw> it = this.pno.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().ouw("\t"));
        }
        return sb2.toString();
    }

    public final float vt() {
        return this.f12167cf - this.tlj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.adsdk.vt.lh.le vt(java.lang.String r8) {
        /*
            r7 = this;
            java.util.List<com.bytedance.adsdk.vt.lh.le> r0 = r7.fkw
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L3f
            java.util.List<com.bytedance.adsdk.vt.lh.le> r3 = r7.fkw
            java.lang.Object r3 = r3.get(r2)
            com.bytedance.adsdk.vt.lh.le r3 = (com.bytedance.adsdk.vt.lh.le) r3
            java.lang.String r4 = r3.ouw
            boolean r4 = r4.equalsIgnoreCase(r8)
            r5 = 1
            if (r4 == 0) goto L1c
            goto L39
        L1c:
            java.lang.String r4 = r3.ouw
            java.lang.String r6 = "\r"
            boolean r4 = r4.endsWith(r6)
            if (r4 == 0) goto L38
            java.lang.String r4 = r3.ouw
            int r6 = r4.length()
            int r6 = r6 - r5
            java.lang.String r4 = r4.substring(r1, r6)
            boolean r4 = r4.equalsIgnoreCase(r8)
            if (r4 == 0) goto L38
            goto L39
        L38:
            r5 = r1
        L39:
            if (r5 == 0) goto L3c
            return r3
        L3c:
            int r2 = r2 + 1
            goto L8
        L3f:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.ra.vt(java.lang.String):com.bytedance.adsdk.vt.lh.le");
    }
}
