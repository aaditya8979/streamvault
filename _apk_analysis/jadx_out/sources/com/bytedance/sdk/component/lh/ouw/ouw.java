package com.bytedance.sdk.component.lh.ouw;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class ouw {
    public long fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public long f12727le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public long f12728lh;
    public long ouw = SystemClock.elapsedRealtime();
    public long pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public long f12729ra;
    public long vt;
    public long yu;

    public final String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.ouw + ", asyncCallExecTs=" + this.vt + ", requestStartExecTs=" + this.f12728lh + ", requestConnectStartTs=" + this.yu + ", requestConnectFinishTs=" + this.fkw + ", reqCallServerStartTs=" + this.f12729ra + ", reqCallServerFinishTs=" + this.pno + '}';
    }
}
