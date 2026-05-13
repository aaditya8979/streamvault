package com.bytedance.sdk.openadsdk.core.cf.le;

import com.bytedance.adsdk.ugeno.core.vm;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ouw extends mwh {

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public vm f13507cd;
    public boolean fvf;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public JSONObject f13508od;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public float f13509pd;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    public float f13510uq;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.cf.le.ouw$ouw, reason: collision with other inner class name */
    public static class C0222ouw extends mwh.ouw {
        public vm ey;
        public boolean fqk;
        public float jvy;
        public JSONObject osn;
        public float rrs;

        @Override // com.bytedance.sdk.component.adexpress.vt.mwh.ouw
        public final /* synthetic */ mwh ouw() {
            return new ouw(this);
        }
    }

    public ouw(C0222ouw c0222ouw) {
        super(c0222ouw);
        this.f13508od = c0222ouw.osn;
        this.f13507cd = c0222ouw.ey;
        this.f13510uq = c0222ouw.rrs;
        this.f13509pd = c0222ouw.jvy;
        this.fvf = c0222ouw.fqk;
    }
}
