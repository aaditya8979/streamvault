package com.bytedance.sdk.component.adexpress.dynamic.ouw;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fak;
import com.bytedance.sdk.component.adexpress.dynamic.fkw.pno;
import com.bytedance.sdk.component.adexpress.dynamic.yu.le;
import com.bytedance.sdk.component.adexpress.lh;
import com.bytedance.sdk.component.adexpress.ouw.vt.vt;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.vt.cf;
import com.bytedance.sdk.component.adexpress.vt.jg;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.bytedance.sdk.component.adexpress.vt.ra;
import com.bytedance.sdk.component.adexpress.vt.yu;
import com.bytedance.sdk.component.utils.bly;
import com.bytedance.sdk.component.utils.ko;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ouw implements cf, yu<DynamicRootView> {
    private ra fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private mwh f12278le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private pno f12279lh;
    public DynamicRootView ouw;
    private AtomicBoolean pno = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private ScheduledFuture<?> f12280ra;
    public com.bytedance.sdk.component.adexpress.vt.pno vt;
    private Context yu;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw$ouw, reason: collision with other inner class name */
    public class RunnableC0188ouw implements Runnable {
        private int vt = 2;

        public RunnableC0188ouw() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.vt == 2) {
                ko.vt("DynamicRender", "Dynamic parse time out");
                ouw.this.ouw.callBackRenderFail(ouw.this.f12279lh instanceof com.bytedance.sdk.component.adexpress.dynamic.fkw.ra ? 127 : 117, null);
            }
        }
    }

    public ouw(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, pno pnoVar, mwh mwhVar, com.bytedance.sdk.component.adexpress.dynamic.le.ouw ouwVar) {
        this.yu = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z10, mwhVar, ouwVar);
        this.ouw = dynamicRootView;
        this.f12279lh = pnoVar;
        this.f12278le = mwhVar;
        dynamicRootView.setRenderListener(this);
        this.f12278le = mwhVar;
    }

    public static /* synthetic */ void lh(ouw ouwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        if (pnoVar == null) {
            ouwVar.ouw.callBackRenderFail(ouwVar.f12279lh instanceof com.bytedance.sdk.component.adexpress.dynamic.fkw.ra ? 123 : 113, "layoutUnit is null");
            return;
        }
        ouwVar.f12278le.vt.yu(ouwVar.vt());
        try {
            ouwVar.ouw.render(pnoVar, ouwVar.vt());
        } catch (Exception e10) {
            int i10 = ouwVar.f12279lh instanceof com.bytedance.sdk.component.adexpress.dynamic.fkw.ra ? 128 : 118;
            ouwVar.ouw.callBackRenderFail(i10, "exception is " + e10.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ouw(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                ouw(viewGroup.getChildAt(i10));
                i10++;
            }
        }
        if (view instanceof fak) {
            ((fak) view).a_();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list;
        if (pnoVar == null || (list = pnoVar.tlj) == null || list.size() <= 0) {
            return;
        }
        Collections.sort(list, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw.3
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar3) {
                le leVar = pnoVar2.bly.f12282lh;
                le leVar2 = pnoVar3.bly.f12282lh;
                if (leVar == null || leVar2 == null) {
                    return 0;
                }
                return leVar.lvd >= leVar2.lvd ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2 : list) {
            if (pnoVar2 != null) {
                ouw(pnoVar2);
            }
        }
    }

    public static /* synthetic */ void vt(ouw ouwVar) {
        try {
            ScheduledFuture<?> scheduledFuture = ouwVar.f12280ra;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                ouwVar.f12280ra.cancel(false);
                ouwVar.f12280ra = null;
            }
            ko.vt("DynamicRender", "WebView Render cancel timeout timer");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vt(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        float f10;
        float f11;
        List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list;
        int i10;
        int i11;
        if (pnoVar == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list2 = pnoVar.tlj;
        if (list2 == null || list2.size() <= 0) {
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2 : list2) {
                if (pnoVar2.f12331lh > pnoVar.f12331lh - pnoVar2.f12332ra || (list = pnoVar2.tlj) == null || list.size() <= 0) {
                    f11 = 0.0f;
                } else {
                    f11 = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar3 : list) {
                        if (pnoVar3.bly.ouw.equals("logo-union")) {
                            f11 = pnoVar3.bly.f12282lh.zvq;
                            float f12 = ((-f11) + pnoVar.f12331lh) - pnoVar2.f12331lh;
                            List<com.bytedance.sdk.component.adexpress.dynamic.yu.ouw> list3 = pnoVar2.bly.f12282lh.njr;
                            if (list3 != null) {
                                for (com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar : list3) {
                                    if ("translate".equals(ouwVar.ouw) && (i11 = ouwVar.f12319jg) < 0) {
                                        i10 = -i11;
                                        break;
                                    }
                                }
                                i10 = 0;
                                f10 = f12 + i10;
                            } else {
                                i10 = 0;
                                f10 = f12 + i10;
                            }
                        }
                    }
                }
                vt(pnoVar2);
                if (f11 <= -15.0f) {
                    pnoVar2.f12332ra -= f11;
                    pnoVar2.f12331lh += f11;
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it = pnoVar2.tlj.iterator();
                    while (it.hasNext()) {
                        it.next().f12331lh -= f11;
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar4 = pnoVar.f12327cf;
        if (pnoVar4 == null) {
            return;
        }
        float f13 = pnoVar.vt - pnoVar4.vt;
        float f14 = pnoVar.f12331lh - pnoVar4.f12331lh;
        pnoVar.vt = f13;
        pnoVar.f12331lh = f14;
        if (f10 > 0.0f) {
            pnoVar.f12331lh = f14 - f10;
            pnoVar.f12332ra += f10;
            Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it2 = pnoVar.tlj.iterator();
            while (it2.hasNext()) {
                it2.next().f12331lh += f10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yu() {
        this.f12278le.vt.vt(vt());
        JSONObject jSONObjectOuw = this.f12278le.ouw();
        if (vt.ouw(jSONObjectOuw)) {
            this.f12279lh.ouw(new com.bytedance.sdk.component.adexpress.dynamic.le.vt() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw.2
                @Override // com.bytedance.sdk.component.adexpress.dynamic.le.vt
                public final void ouw(final com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
                    ouw.vt(ouw.this);
                    ouw.this.f12278le.vt.lh(ouw.this.vt());
                    ouw.this.ouw(pnoVar);
                    ouw.this.vt(pnoVar);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        ouw.lh(ouw.this, pnoVar);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ouw.lh(ouw.this, pnoVar);
                            }
                        });
                    }
                    if (ouw.this.ouw == null || pnoVar == null) {
                        return;
                    }
                    ouw.this.ouw.setBgColor(pnoVar.mwh);
                    ouw.this.ouw.setBgMaterialCenterCalcColor(pnoVar.f12333rn);
                }
            });
            this.f12279lh.ouw(this.f12278le);
            return;
        }
        int i10 = this.f12279lh instanceof com.bytedance.sdk.component.adexpress.dynamic.fkw.ra ? 123 : 113;
        DynamicRootView dynamicRootView = this.ouw;
        StringBuilder sb2 = new StringBuilder("data null is ");
        sb2.append(jSONObjectOuw == null);
        dynamicRootView.callBackRenderFail(i10, sb2.toString());
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public final /* bridge */ /* synthetic */ View lh() {
        return this.ouw;
    }

    public void ouw() {
        ouw(this.ouw);
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.cf
    public final void ouw(View view, int i10, lh lhVar) {
        com.bytedance.sdk.component.adexpress.vt.pno pnoVar = this.vt;
        if (pnoVar != null) {
            pnoVar.ouw(view, i10, lhVar);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.cf
    public final void ouw(jg jgVar) {
        if (this.pno.get()) {
            return;
        }
        this.pno.set(true);
        if (jgVar.vt) {
            DynamicRootView dynamicRootView = this.ouw;
            if ((dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true) {
                this.ouw.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.fkw.ouw(this.ouw, jgVar);
                return;
            }
        }
        this.fkw.ouw(jgVar.f12441jg, jgVar.mwh);
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public void ouw(ra raVar) {
        this.fkw = raVar;
        int i10 = this.f12278le.f12454lh;
        if (i10 < 0) {
            this.ouw.callBackRenderFail(this.f12279lh instanceof com.bytedance.sdk.component.adexpress.dynamic.fkw.ra ? 127 : 117, "time is ".concat(String.valueOf(i10)));
            return;
        }
        this.f12280ra = com.bytedance.sdk.component.adexpress.yu.yu.ouw(new RunnableC0188ouw(), i10, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() != Looper.myLooper() || this.f12278le.fkw > 0) {
            bly.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    ouw.this.yu();
                }
            }, this.f12278le.fkw);
        } else {
            yu();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public final int vt() {
        return this.f12279lh instanceof com.bytedance.sdk.component.adexpress.dynamic.fkw.ra ? 3 : 2;
    }
}
