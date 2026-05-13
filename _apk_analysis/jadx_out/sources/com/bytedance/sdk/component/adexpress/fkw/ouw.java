package com.bytedance.sdk.component.adexpress.fkw;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.vt.cf;
import com.bytedance.sdk.component.adexpress.vt.jg;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.bytedance.sdk.component.adexpress.vt.pno;
import com.bytedance.sdk.component.adexpress.vt.ra;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.ko;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ouw implements com.bytedance.sdk.component.adexpress.ouw, com.bytedance.sdk.component.adexpress.theme.ouw, cf, com.bytedance.sdk.component.adexpress.vt.yu<le> {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private String f12346cf;
    public mwh fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int f12347jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public le f12348le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f12349lh;
    private volatile ra mwh;
    public JSONObject ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f12350ra;
    private String ryl;
    private Context tlj;
    public boolean vt;
    public pno yu;
    public int pno = 8;
    public AtomicBoolean bly = new AtomicBoolean(false);

    public ouw(Context context, mwh mwhVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.vt = false;
        this.tlj = context;
        this.fkw = mwhVar;
        this.f12346cf = mwhVar.ouw;
        themeStatusBroadcastReceiver.ouw(this);
        if (!com.bytedance.sdk.component.adexpress.yu.vt()) {
            le leVarBly = bly();
            this.f12348le = leVarBly;
            if (leVarBly != null) {
                this.vt = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
                return;
            } else {
                Log.d("WebViewRender", "initWebView: create WebView");
                if (com.bytedance.sdk.component.adexpress.yu.ouw() != null) {
                    this.f12348le = new le(com.bytedance.sdk.component.adexpress.yu.ouw(), le.lh.ADS);
                    return;
                }
                return;
            }
        }
        if (this.tlj == null && com.bytedance.sdk.component.adexpress.yu.ouw() != null) {
            this.tlj = com.bytedance.sdk.component.adexpress.yu.ouw();
        }
        if (this.tlj != null) {
            le leVarBly2 = bly();
            this.f12348le = leVarBly2;
            if (leVarBly2 == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.f12348le = new le(new MutableContextWrapper(this.tlj.getApplicationContext()), this.fkw.vpp ? le.lh.ADS_V3 : le.lh.ADS);
            } else {
                this.vt = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    private le bly() {
        return this.fkw.vpp ? fkw.ouw().ouw(this.tlj, this.f12346cf) : fkw.ouw().vt(this.tlj, this.f12346cf);
    }

    @UiThread
    private void ouw(float f10, float f11) {
        this.fkw.vt.le();
        if (vt() == 9) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lh().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            lh().setLayoutParams(layoutParams);
            return;
        }
        int iOuw = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.tlj, f10);
        int iOuw2 = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.tlj, f11);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) lh().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iOuw, iOuw2);
        }
        layoutParams2.width = iOuw;
        layoutParams2.height = iOuw2;
        lh().setLayoutParams(layoutParams2);
    }

    private void ouw(int i10, String str) {
        if (this.mwh != null) {
            this.mwh.ouw(i10, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(jg jgVar, float f10, float f11) {
        boolean z10 = this.f12349lh;
        if (!z10 || this.f12350ra) {
            if (!z10) {
                fkw.ouw();
                fkw.lh(this.f12348le);
            }
            ouw(jgVar.f12441jg, jgVar.mwh);
            return;
        }
        ouw(f10, f11);
        ouw(this.pno);
        if (this.mwh != null) {
            this.mwh.ouw(lh(), jgVar);
        }
    }

    public abstract void fkw();

    public void le() {
        ra();
        Activity activityOuw = com.bytedance.sdk.component.utils.vt.ouw(this.f12348le);
        if (activityOuw != null) {
            this.f12347jg = activityOuw.hashCode();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
    public le lh() {
        return this.f12348le;
    }

    public abstract void ouw(int i10);

    @Override // com.bytedance.sdk.component.adexpress.ouw
    public final void ouw(Activity activity) {
        if (this.f12347jg == 0 || activity == null || activity.hashCode() != this.f12347jg) {
            return;
        }
        ko.vt("WebViewRender", "release from activity onDestroy");
        yu();
        pno();
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.cf
    public final void ouw(View view, int i10, com.bytedance.sdk.component.adexpress.lh lhVar) {
        pno pnoVar = this.yu;
        if (pnoVar != null) {
            pnoVar.ouw(view, i10, lhVar);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.cf
    public void ouw(final jg jgVar) {
        if (jgVar == null) {
            if (this.mwh != null) {
                this.mwh.ouw(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean z10 = jgVar.vt;
        final float f10 = (float) jgVar.f12444lh;
        final float f11 = (float) jgVar.yu;
        if (vt() != 0 || (f10 > 0.0f && f11 > 0.0f)) {
            this.f12349lh = z10;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ouw(jgVar, f10, f11);
                return;
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.fkw.ouw.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ouw.this.ouw(jgVar, f10, f11);
                    }
                });
                return;
            }
        }
        if (this.mwh != null) {
            this.mwh.ouw(105, "width is " + f10 + "height is " + f11);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public void ouw(ra raVar) {
        String str;
        this.mwh = raVar;
        if (lh() == null || lh().getWebView() == null) {
            ra raVar2 = this.mwh;
            StringBuilder sb2 = new StringBuilder("SSWebview null is ");
            sb2.append(lh() == null);
            sb2.append(" or Webview is null");
            raVar2.ouw(102, sb2.toString());
            return;
        }
        if (TextUtils.isEmpty(this.ryl)) {
            this.mwh.ouw(102, "url is empty");
            return;
        }
        if (this.fkw.vpp) {
            if (vt() == 9 && !com.bytedance.sdk.component.adexpress.ouw.vt.vt.vt(this.ouw)) {
                ra raVar3 = this.mwh;
                StringBuilder sb3 = new StringBuilder("data null is ");
                sb3.append(this.ouw == null);
                raVar3.ouw(103, sb3.toString());
                return;
            }
        } else if (!com.bytedance.sdk.component.adexpress.ouw.vt.vt.ouw(this.ouw)) {
            ra raVar4 = this.mwh;
            StringBuilder sb4 = new StringBuilder("data null is ");
            sb4.append(this.ouw == null);
            raVar4.ouw(103, sb4.toString());
            return;
        }
        this.fkw.vt.ouw(this.vt);
        if (!this.vt) {
            le leVarLh = lh();
            leVarLh.tlj();
            this.fkw.vt.fkw();
            leVarLh.a_(this.ryl);
            return;
        }
        try {
            mwh mwhVar = this.fkw;
            int i10 = mwhVar.ex;
            if (mwhVar.vpp && i10 == 1) {
                ko.ouw("Android_jsb", "trigger SDK_INJECT_DATA in reuse, templateInfo is：", mwhVar.ouw());
                str = "javascript:window.SDK_RESET_RENDER();" + ("window.SDK_INJECT_DATA=" + this.fkw.ouw() + ";") + "window.SDK_TRIGGER_RENDER();";
            } else {
                str = "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();";
            }
            this.f12348le.tlj();
            this.fkw.vt.fkw();
            com.bytedance.sdk.component.utils.jg.ouw(this.f12348le.getWebView(), str);
        } catch (Exception e10) {
            ko.vt("WebViewRender", "reuse webview load fail ");
            fkw.ouw();
            fkw.lh(this.f12348le);
            this.mwh.ouw(102, "load exception is " + e10.getMessage());
        }
    }

    public final void ouw(String str) {
        this.ryl = str;
    }

    public final void ouw(JSONObject jSONObject) {
        this.ouw = jSONObject;
    }

    public void pno() {
    }

    public void ra() {
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public int vt() {
        return 0;
    }

    public void yu() {
        if (this.bly.get()) {
            return;
        }
        this.bly.set(true);
        fkw();
        if (this.f12348le.getParent() != null) {
            ((ViewGroup) this.f12348le.getParent()).removeView(this.f12348le);
        }
        if (!this.f12349lh) {
            fkw.ouw();
            fkw.lh(this.f12348le);
        } else if (this.fkw.vpp) {
            fkw.ouw().ouw(this.f12348le);
        } else {
            fkw.ouw().vt(this.f12348le);
        }
    }
}
