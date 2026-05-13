package com.bytedance.adsdk.ugeno.core.vt;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.core.mwh;
import com.bytedance.adsdk.ugeno.ra.pno;

/* JADX INFO: loaded from: classes3.dex */
public final class le implements pno.ouw {
    public com.bytedance.adsdk.ugeno.vt.lh fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public Handler f11670le = new pno(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ko f11671lh;
    public boolean ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private Context f11672ra;
    public int vt;
    public mwh yu;

    public le(Context context, mwh mwhVar, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        this.f11672ra = context;
        this.yu = mwhVar;
        this.fkw = lhVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ra.pno.ouw
    public final void ouw(Message message) {
        if (message.what != 1001) {
            return;
        }
        ko koVar = this.f11671lh;
        if (koVar != null) {
            koVar.ouw(this.yu, this.fkw);
        }
        if (this.ouw) {
            this.f11670le.sendEmptyMessageDelayed(1001, this.vt);
        } else {
            this.f11670le.removeMessages(1001);
        }
    }
}
