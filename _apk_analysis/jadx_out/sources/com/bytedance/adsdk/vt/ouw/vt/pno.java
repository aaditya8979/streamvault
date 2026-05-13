package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pno {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final List<com.bytedance.adsdk.vt.lh.vt.pno> f12154lh;
    public final List<ouw<com.bytedance.adsdk.vt.lh.vt.jg, Path>> ouw;
    public final List<ouw<Integer, Integer>> vt;

    public pno(List<com.bytedance.adsdk.vt.lh.vt.pno> list) {
        this.f12154lh = list;
        this.ouw = new ArrayList(list.size());
        this.vt = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.ouw.add(list.get(i10).vt.ouw());
            this.vt.add(list.get(i10).f12062lh.ouw());
        }
    }
}
