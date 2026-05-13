package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.common.ouw;

/* JADX INFO: loaded from: classes12.dex */
public final class ko {
    public boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public zih f13094le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final Runnable f13095lh;
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public ouw.InterfaceC0214ouw f13096ra;
    public final String vt;
    public final ouw.vt yu;

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final Runnable f13098lh;
        public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;
        public final String vt;
        public final ouw.vt yu;
        public boolean fkw = false;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public zih f13097le = null;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public ouw.InterfaceC0214ouw f13099ra = null;

        public ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, String str, Runnable runnable, ouw.vt vtVar) {
            this.ouw = ouwVar;
            this.vt = str;
            this.f13098lh = runnable;
            this.yu = vtVar;
        }

        public final ko ouw() {
            if (this.ouw == null) {
                throw new IllegalArgumentException("RewardFullContext cannot be null");
            }
            if (this.f13098lh == null) {
                throw new IllegalArgumentException("Runnable finishAction cannot be null");
            }
            if (this.yu != null) {
                return new ko(this, (byte) 0);
            }
            throw new IllegalArgumentException("SkipResultHandler cannot be null");
        }
    }

    private ko(ouw ouwVar) {
        this.ouw = ouwVar.ouw;
        this.vt = ouwVar.vt;
        this.f13095lh = ouwVar.f13098lh;
        this.yu = ouwVar.yu;
        this.fkw = ouwVar.fkw;
        this.f13094le = ouwVar.f13097le;
        this.f13096ra = ouwVar.f13099ra;
    }

    public /* synthetic */ ko(ouw ouwVar, byte b10) {
        this(ouwVar);
    }
}
