package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.view.WindowManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f18882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18883k;

    public h() {
        double refreshRate = ((WindowManager) IAConfigManager.O.f15976v.a().getSystemService("window")).getDefaultDisplay().getRefreshRate();
        this.f18874b = true;
        this.f18873a = g.f18868e;
        long j10 = (long) (1.0E9d / refreshRate);
        this.f18875c = j10;
        this.f18876d = (j10 * 80) / 100;
    }
}
