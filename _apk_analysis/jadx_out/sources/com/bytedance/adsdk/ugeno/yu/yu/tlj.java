package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.adsdk.ugeno.ra.pno;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class tlj extends lh implements pno.ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f11919cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int f11920jg;
    private Handler mwh;
    private int ryl;

    public tlj(Context context) {
        super(context);
        this.ryl = 0;
        this.mwh = new com.bytedance.adsdk.ugeno.ra.pno(Looper.getMainLooper(), this);
        this.f11920jg = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.ra.pno.ouw
    public final void ouw(Message message) {
        int i10;
        int i11;
        if (message.what != 1001) {
            return;
        }
        Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.f11920jg);
        this.ouw.ouw(this.f11914le, this.f11915lh.vt);
        int i12 = this.f11920jg + (-1);
        this.f11920jg = i12;
        if (i12 < 0 && (i11 = this.ryl) != 0) {
            this.mwh.sendEmptyMessageDelayed(1001, i11);
        } else if (i12 <= 0 || (i10 = this.ryl) == 0) {
            this.mwh.removeMessages(1001);
        } else {
            this.mwh.sendEmptyMessageDelayed(1001, i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        Map<String, String> map = this.fkw;
        if (map != null) {
            int iOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(map.get("loop"), 0);
            this.f11919cf = iOuw;
            if (iOuw <= 0) {
                this.f11920jg = -1;
            } else {
                this.f11920jg = iOuw;
            }
            this.ryl = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("duration"), 0);
        }
        this.mwh.sendEmptyMessageDelayed(1001, this.ryl);
        return true;
    }
}
