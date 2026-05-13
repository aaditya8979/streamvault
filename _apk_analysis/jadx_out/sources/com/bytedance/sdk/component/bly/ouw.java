package com.bytedance.sdk.component.bly;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.bly;
import com.bytedance.sdk.component.utils.cd;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw extends lh implements jae.ouw {
    private volatile float bly;
    private final List<Integer> fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int f12509jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final int f12511le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final int f12512lh;
    private long mwh;
    private volatile float pno;
    private View.OnTouchListener qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final Context f12513ra;
    private long ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private float f12515th;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private float f12516vm;
    public String vt;
    private final int yu;
    private boolean zih;
    private float tlj = -1.0f;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private float f12508cf = -1.0f;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final Handler f12514rn = new jae(bly.ouw().getLooper(), this);
    public InterfaceC0195ouw ouw = new InterfaceC0195ouw() { // from class: com.bytedance.sdk.component.bly.ouw.1
        @Override // com.bytedance.sdk.component.bly.ouw.InterfaceC0195ouw
        public final void ouw() {
            if (ouw.this.tlj == -1.0f && ouw.this.f12508cf == -1.0f && ouw.this.mwh == -1) {
                ko.ouw("arbitrage_click", "first trigger triggerJump()", ", mTriggerX: ", Float.valueOf(ouw.this.tlj), ", mTriggerY: ", Float.valueOf(ouw.this.f12508cf));
                ouw ouwVar = ouw.this;
                ouwVar.tlj = ouwVar.pno;
                ouw ouwVar2 = ouw.this;
                ouwVar2.f12508cf = ouwVar2.bly;
                ouw ouwVar3 = ouw.this;
                ouwVar3.mwh = ouwVar3.ryl;
                ouw.ra(ouw.this);
            }
            ko.ouw("arbitrage_click", "everytime trigger triggerJump()", ", mTriggerX: ", Float.valueOf(ouw.this.tlj), ", mTriggerY: ", Float.valueOf(ouw.this.f12508cf));
        }

        @Override // com.bytedance.sdk.component.bly.ouw.InterfaceC0195ouw
        public final void ouw(int i10) {
            ouw.this.f12509jg = i10;
            ouw.this.ouw();
            ko.vt("arbitrage_click", "trigger onPageStarted() in ArbitrageOnTouchListener");
        }

        @Override // com.bytedance.sdk.component.bly.ouw.InterfaceC0195ouw
        public final void vt() {
            ko.vt("arbitrage_click", "trigger onPageFinished() in ArbitrageOnTouchListener");
        }
    };
    private int zin = -1;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final List<Integer> f12510ko = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.bly.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0195ouw {
        void ouw();

        void ouw(int i10);

        void vt();
    }

    public ouw(Context context, int i10, int i11, List<Integer> list, int i12) {
        this.f12513ra = context;
        if (i10 == -1) {
            this.f12512lh = cd.ouw(context);
        } else {
            this.f12512lh = cd.ouw(context, i10);
        }
        this.yu = cd.ouw(context, i11);
        this.fkw = list;
        this.f12511le = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw() {
        this.tlj = -1.0f;
        this.f12508cf = -1.0f;
        this.mwh = -1L;
    }

    public static /* synthetic */ boolean ra(ouw ouwVar) {
        ouwVar.zih = true;
        return true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        String url;
        int action = motionEvent.getAction();
        int i10 = 1;
        int i11 = 2;
        ko.vt("arbitrage_click", "action: ", Integer.valueOf(action), ", x: ", Float.valueOf(motionEvent.getX()), ",y: ", Float.valueOf(motionEvent.getY()));
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.ryl = SystemClock.elapsedRealtime();
        this.pno = x10;
        this.bly = y10;
        if (action == 0) {
            str = "arbitrage_click";
            this.f12516vm = x10;
            this.f12515th = y10;
            ko.ouw(str, "ACTION_DOWN: ", "downX: ", Float.valueOf(x10), "downY: ", Float.valueOf(this.f12515th));
        } else if (action != 1) {
            str = "arbitrage_click";
        } else {
            ko.ouw("arbitrage_click", "ACTION_UP: ", "upX: ", Float.valueOf(x10), "upY: ", Float.valueOf(y10));
            str = "arbitrage_click";
            if (ouw(x10, y10, this.f12516vm, this.f12515th, this.f12513ra)) {
                float f10 = this.pno;
                float f11 = this.bly;
                long j10 = this.ryl;
                ko.vt(str, "go into need intercept");
                if (this.tlj == -1.0f && this.f12508cf == -1.0f && this.mwh == -1) {
                    ko.vt(str, "return false-->1");
                    i11 = 1;
                } else {
                    ko.ouw(str, "mInterceptorPageList: ", this.fkw, "mPageIndex:", Integer.valueOf(this.f12509jg));
                    if (!this.fkw.contains(Integer.valueOf(this.f12509jg))) {
                        ko.vt(str, "return false-->2");
                    } else if (j10 - this.mwh > this.f12511le) {
                        ouw();
                        ko.vt(str, "return false-->3");
                        i11 = 3;
                    } else {
                        float fAbs = Math.abs(f10 - this.tlj);
                        float fAbs2 = Math.abs(f11 - this.f12508cf);
                        ko.ouw(str, "mTouchX: ", Float.valueOf(f10), ", mTriggerX : ", Float.valueOf(this.tlj), " ,x distance：", Float.valueOf(fAbs));
                        ko.ouw(str, "mTouchY: ", Float.valueOf(f11), ", mTriggerY: ", Float.valueOf(this.f12508cf), " ,y distance：", Float.valueOf(fAbs2));
                        ko.ouw(str, "mInterceptorXPx: ", Integer.valueOf(this.f12512lh), ", mInterceptorYPx: ", Integer.valueOf(this.yu));
                        if (fAbs > this.f12512lh / 2.0f || fAbs2 > this.yu / 2.0f) {
                            ouw();
                            ko.vt(str, "return false-->4");
                            i11 = 4;
                        } else {
                            ko.vt(str, "return true, will intercept this event");
                            i11 = 0;
                        }
                    }
                }
                boolean z10 = !this.f12510ko.contains(Integer.valueOf(this.f12509jg));
                JSONObject jSONObject = new JSONObject();
                WebView webView = view instanceof WebView ? (WebView) view : null;
                if (webView != null) {
                    try {
                        url = webView.getUrl();
                    } catch (Throwable unused) {
                    }
                } else {
                    url = "";
                }
                jSONObject.put("arbi_current_url", url);
                jSONObject.put("click_x", motionEvent.getX());
                jSONObject.put("click_y", motionEvent.getY());
                jSONObject.put("is_interceptor", i11 == 0 ? 1 : 0);
                if (!z10) {
                    i10 = 0;
                }
                jSONObject.put("is_first_click", i10);
                jSONObject.put("click_timestamp", System.currentTimeMillis());
                jSONObject.put("arbi_interceptor_type", i11);
                jSONObject.put("current_url_index", this.f12509jg);
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.obj = jSONObject;
                this.f12514rn.sendMessageDelayed(messageObtain, 200L);
                if (z10) {
                    this.f12510ko.add(Integer.valueOf(this.f12509jg));
                }
                if (i11 == 0) {
                    motionEvent.setAction(3);
                }
            }
        }
        if (this.qbp == null) {
            return false;
        }
        ko.vt(str, "mOuterTouchListener != null, return mOuterTouchListener.onTouch(v, event)");
        return this.qbp.onTouch(view, motionEvent);
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        int i10 = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i10 == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.zih ? 1 : 0);
                    this.zih = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.bly.ouw.ouw.ouw().ouw != null) {
                com.bytedance.sdk.component.bly.ouw.ouw.ouw().ouw.ouw(this.vt, "arbitrage_click_event", jSONObject);
            }
        }
    }

    @Override // com.bytedance.sdk.component.bly.lh
    public final void ouw(View.OnTouchListener onTouchListener) {
        this.qbp = onTouchListener;
    }
}
