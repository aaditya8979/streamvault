package com.bytedance.sdk.component.adexpress.vt;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.vt.tlj;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class rn implements tlj {
    private ScheduledFuture<?> fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private AtomicBoolean f12478le = new AtomicBoolean(false);

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private pno f12479lh;
    public com.bytedance.sdk.component.adexpress.fkw.ouw ouw;
    private Context vt;
    private mwh yu;

    public class ouw implements Runnable {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private int f12480lh = 1;
        public tlj.ouw ouw;

        public ouw(tlj.ouw ouwVar) {
            this.ouw = ouwVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f12480lh == 1) {
                com.bytedance.sdk.component.utils.ko.vt("RenderInterceptor", "WebView Render timeout");
                rn rnVar = rn.this;
                rnVar.ouw.f12350ra = true;
                rnVar.ouw(this.ouw, 107, null);
            }
        }
    }

    public rn(Context context, mwh mwhVar, com.bytedance.sdk.component.adexpress.fkw.ouw ouwVar, pno pnoVar) {
        this.vt = context;
        this.yu = mwhVar;
        this.f12479lh = pnoVar;
        this.ouw = ouwVar;
        ouwVar.yu = this.f12479lh;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj
    public final void ouw() {
        this.ouw.yu();
        vt();
    }

    public final void ouw(tlj.ouw ouwVar, int i10, String str) {
        ko koVarVt;
        if (ouwVar.yu() || this.f12478le.get()) {
            return;
        }
        vt();
        this.yu.vt.ouw(i10, str);
        if (ouwVar.vt(this)) {
            ouwVar.ouw(this);
        } else {
            if (ouwVar.yu() || (koVarVt = ouwVar.vt()) == null) {
                return;
            }
            ouwVar.lh();
            koVarVt.a_(i10);
        }
        this.f12478le.getAndSet(true);
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj
    public final boolean ouw(final tlj.ouw ouwVar) {
        int i10 = this.yu.f12454lh;
        if (i10 < 0) {
            ouw(ouwVar, 107, "time is ".concat(String.valueOf(i10)));
            return true;
        }
        this.fkw = com.bytedance.sdk.component.adexpress.yu.yu.ouw(new ouw(ouwVar), i10, TimeUnit.MILLISECONDS);
        this.ouw.ouw(new ra() { // from class: com.bytedance.sdk.component.adexpress.vt.rn.1
            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(int i11, String str) {
                rn.this.ouw(ouwVar, i11, str);
            }

            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(View view, jg jgVar) {
                ko koVarVt;
                rn.this.vt();
                if (ouwVar.yu() || (koVarVt = ouwVar.vt()) == null) {
                    return;
                }
                koVarVt.ouw(rn.this.ouw, jgVar);
                ouwVar.lh();
            }
        });
        return true;
    }

    public final void vt() {
        try {
            ScheduledFuture<?> scheduledFuture = this.fkw;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.fkw.cancel(false);
                this.fkw = null;
            }
            com.bytedance.sdk.component.utils.ko.vt("RenderInterceptor", "WebView Render cancel timeout timer");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
