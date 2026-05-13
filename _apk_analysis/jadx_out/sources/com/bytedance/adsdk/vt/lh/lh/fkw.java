package com.bytedance.adsdk.vt.lh.lh;

import com.bytedance.adsdk.vt.lh.ouw.cf;
import com.bytedance.adsdk.vt.lh.ouw.ryl;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class fkw {
    public final ryl bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public final int f11990cf;
    public final com.bytedance.adsdk.vt.fkw.tlj ex;
    public final ouw fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public final float f11991jg;
    public final com.bytedance.adsdk.vt.lh.vt.ouw jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public final float f11992ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final long f11993le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final String f11994lh;
    public final float mwh;
    public final List<com.bytedance.adsdk.vt.lh.vt.lh> ouw;
    public final List<com.bytedance.adsdk.vt.lh.vt.pno> pno;
    public final List<com.bytedance.adsdk.vt.ra.ouw<Float>> qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final String f11995ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public final float f11996rn;
    public final int ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.vt f11997th;
    public final int tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public final cf f11998vm;
    public final boolean vpp;
    public final com.bytedance.adsdk.vt.ra vt;
    public final long yu;
    public final com.bytedance.adsdk.vt.lh.ouw.tlj zih;
    public final vt zin;

    public enum ouw {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum vt {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public fkw(List<com.bytedance.adsdk.vt.lh.vt.lh> list, com.bytedance.adsdk.vt.ra raVar, String str, long j10, ouw ouwVar, long j11, String str2, List<com.bytedance.adsdk.vt.lh.vt.pno> list2, ryl rylVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, com.bytedance.adsdk.vt.lh.ouw.tlj tljVar, cf cfVar, List<com.bytedance.adsdk.vt.ra.ouw<Float>> list3, vt vtVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar2, boolean z10, com.bytedance.adsdk.vt.lh.vt.ouw ouwVar2, com.bytedance.adsdk.vt.fkw.tlj tljVar2) {
        this.ouw = list;
        this.vt = raVar;
        this.f11994lh = str;
        this.yu = j10;
        this.fkw = ouwVar;
        this.f11993le = j11;
        this.f11995ra = str2;
        this.pno = list2;
        this.bly = rylVar;
        this.tlj = i10;
        this.f11990cf = i11;
        this.ryl = i12;
        this.mwh = f10;
        this.f11991jg = f11;
        this.f11992ko = f12;
        this.f11996rn = f13;
        this.zih = tljVar;
        this.f11998vm = cfVar;
        this.qbp = list3;
        this.zin = vtVar;
        this.f11997th = vtVar2;
        this.vpp = z10;
        this.jqy = ouwVar2;
        this.ex = tljVar2;
    }

    public final String ouw(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f11994lh);
        sb2.append("\n");
        fkw fkwVarOuw = this.vt.ouw(this.f11993le);
        if (fkwVarOuw != null) {
            sb2.append("\t\tParents: ");
            sb2.append(fkwVarOuw.f11994lh);
            fkw fkwVarOuw2 = this.vt.ouw(fkwVarOuw.f11993le);
            while (fkwVarOuw2 != null) {
                sb2.append("->");
                sb2.append(fkwVarOuw2.f11994lh);
                fkwVarOuw2 = this.vt.ouw(fkwVarOuw2.f11993le);
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!this.pno.isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(this.pno.size());
            sb2.append("\n");
        }
        if (this.tlj != 0 && this.f11990cf != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.tlj), Integer.valueOf(this.f11990cf), Integer.valueOf(this.ryl)));
        }
        if (!this.ouw.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (com.bytedance.adsdk.vt.lh.vt.lh lhVar : this.ouw) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(lhVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }

    public final String toString() {
        return ouw("");
    }
}
