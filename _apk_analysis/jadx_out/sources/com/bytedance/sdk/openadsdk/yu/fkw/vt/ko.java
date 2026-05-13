package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.openadsdk.core.model.vpp;

/* JADX INFO: loaded from: classes2.dex */
public final class ko {
    public vpp fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f14412lh;
    public long ouw;
    public String vt;
    public com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh yu;

    public static class ouw {
        public int bly;

        /* JADX INFO: renamed from: cf, reason: collision with root package name */
        public int f14413cf;
        public boolean fkw;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        public com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw f14414jg;
        public int pno;
        public int ryl;
        public int tlj;
        public boolean yu;
        public long ouw = 0;
        public long vt = 0;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public long f14416lh = 0;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public long f14415le = 0;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public boolean f14417ra = false;
        public boolean mwh = false;

        private void vt() {
            long j10 = this.f14416lh;
            if (j10 > 0) {
                long j11 = this.ouw;
                if (j11 > j10) {
                    long j12 = j11 % j10;
                    this.ouw = j12;
                    if (j12 == 0) {
                        this.ouw = j10;
                    }
                }
            }
        }

        public final int ouw() {
            long j10 = this.f14416lh;
            if (j10 <= 0) {
                return 0;
            }
            return Math.min((int) ((this.ouw * 100) / j10), 100);
        }

        public final void ouw(long j10) {
            this.ouw = j10;
            vt();
        }

        public final void vt(long j10) {
            this.f14416lh = j10;
            vt();
        }
    }

    public ko(long j10, String str, int i10, com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, vpp vppVar) {
        this.ouw = j10;
        this.vt = str;
        this.f14412lh = i10;
        this.yu = lhVar;
        this.fkw = vppVar;
    }
}
