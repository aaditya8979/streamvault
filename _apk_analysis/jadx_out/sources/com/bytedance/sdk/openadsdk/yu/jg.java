package com.bytedance.sdk.openadsdk.yu;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Window;
import com.bytedance.sdk.openadsdk.core.ko;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class jg {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static volatile jg f14428lh;
    private final Executor fkw = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private vt f14429le = new vt();
    public final Handler ouw;
    public Map<String, Object> vt;
    private HandlerThread yu;

    public static class ouw implements Serializable, Runnable {
        public Map<String, Object> fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public vpp f14431lh;
        public String yu;
        public final AtomicInteger ouw = new AtomicInteger(0);
        public final AtomicBoolean vt = new AtomicBoolean(false);

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        private final long f14430le = SystemClock.elapsedRealtime();

        private ouw(vpp vppVar, String str, Map<String, Object> map) {
            this.f14431lh = vppVar;
            this.yu = str;
            this.fkw = map;
        }

        public static ouw ouw(vpp vppVar, String str, Map<String, Object> map) {
            return new ouw(vppVar, str, map);
        }

        public final ouw ouw(boolean z10) {
            this.vt.set(z10);
            return this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f14431lh == null || TextUtils.isEmpty(this.yu)) {
                com.bytedance.sdk.component.utils.ko.vt("materialMeta or eventTag is null, pls check");
                return;
            }
            String str = this.vt.get() ? "dpl_success" : "dpl_failed";
            if (this.fkw == null) {
                this.fkw = new HashMap();
            }
            vpp vppVar = this.f14431lh;
            if (vppVar != null && vppVar.cy == 0) {
                this.fkw.put("auto_click", Boolean.valueOf((vppVar == null || vppVar.f13776mq) ? false : true));
            }
            this.fkw.put("lifeCycleInit", Boolean.valueOf(ko.ouw.ouw.vt));
            this.fkw.put("duration", Long.valueOf(SystemClock.elapsedRealtime() - this.f14430le));
            lh.ouw(this.f14431lh, this.yu, str, this.fkw);
        }
    }

    public static class vt {
        public int ouw = 300;
        public int vt = 6000;
    }

    private jg() {
        if (this.yu == null) {
            this.yu = com.bytedance.sdk.component.utils.pno.ouw("OpenAppSuccEvent_HandlerThread", 10);
        }
        this.ouw = new Handler(this.yu.getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.yu.jg.1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what != 100) {
                    return true;
                }
                ouw ouwVar = null;
                Object obj = message.obj;
                if (obj != null && (obj instanceof ouw)) {
                    ouwVar = (ouw) obj;
                }
                if (ouwVar == null) {
                    return true;
                }
                jg.ouw(jg.this, ouwVar);
                return true;
            }
        });
    }

    public static jg ouw() {
        if (f14428lh == null) {
            synchronized (jg.class) {
                if (f14428lh == null) {
                    f14428lh = new jg();
                }
            }
        }
        return f14428lh;
    }

    private void ouw(ouw ouwVar) {
        if (ouwVar == null) {
            return;
        }
        this.fkw.execute(ouwVar);
    }

    public static /* synthetic */ void ouw(jg jgVar, ouw ouwVar) {
        Activity activity;
        Window window;
        if (ouwVar != null) {
            boolean z10 = ko.ouw.ouw.ouw.ouw.get();
            com.bytedance.sdk.openadsdk.utils.ouw ouwVar2 = ko.ouw.ouw.ouw;
            boolean zHasWindowFocus = (ouwVar2.f14330le == null || (activity = ouwVar2.f14330le.get()) == null || (window = activity.getWindow()) == null) ? true : window.getDecorView().hasWindowFocus();
            if (z10 || !zHasWindowFocus) {
                if (ouwVar.fkw == null) {
                    ouwVar.fkw = new HashMap();
                }
                ouwVar.fkw.put("is_background", Boolean.valueOf(z10));
                ouwVar.fkw.put("has_focus", Boolean.valueOf(zHasWindowFocus));
                jgVar.ouw(ouwVar.ouw(true));
                return;
            }
            ouwVar.ouw.incrementAndGet();
            int i10 = ouwVar.ouw.get();
            vt vtVar = jgVar.f14429le;
            if (i10 * vtVar.ouw > vtVar.vt) {
                jgVar.ouw(ouwVar.ouw(false));
                return;
            }
            Message messageObtainMessage = jgVar.ouw.obtainMessage();
            messageObtainMessage.what = 100;
            messageObtainMessage.obj = ouwVar;
            jgVar.ouw.sendMessageDelayed(messageObtainMessage, jgVar.f14429le.ouw);
        }
    }
}
