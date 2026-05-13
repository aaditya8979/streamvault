package com.bytedance.adsdk.vt.lh.vt;

/* JADX INFO: loaded from: classes5.dex */
public final class bly implements lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final boolean f12048lh;
    public final String ouw;
    public final ouw vt;

    public enum ouw {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static ouw ouw(int i10) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public bly(String str, ouw ouwVar, boolean z10) {
        this.ouw = str;
        this.vt = ouwVar;
        this.f12048lh = z10;
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.ryl(this);
    }

    public final String toString() {
        return "MergePaths{mode=" + this.vt + '}';
    }
}
