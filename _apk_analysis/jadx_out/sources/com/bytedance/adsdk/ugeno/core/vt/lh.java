package com.bytedance.adsdk.ugeno.core.vt;

import android.content.Context;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.core.mwh;

/* JADX INFO: loaded from: classes3.dex */
public final class lh {
    public final int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private Context f11673le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public mwh f11674lh;
    public float ouw;
    public float vt;
    public boolean yu;

    public lh(Context context, mwh mwhVar) {
        this.f11673le = context;
        this.f11674lh = mwhVar;
        this.fkw = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
