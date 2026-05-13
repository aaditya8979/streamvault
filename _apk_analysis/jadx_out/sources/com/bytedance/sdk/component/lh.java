package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import com.bytedance.sdk.component.vt;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes5.dex */
public final class lh {

    @GuardedBy("sLock")
    private static volatile Handler vt;
    private static final Object ouw = new Object();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    @GuardedBy("sLock")
    private static final LinkedList<Runnable> f12726lh = new LinkedList<>();
    private static Object yu = new Object();

    public static class ouw extends Handler {
        public ouw(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    lh.ouw();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    public static /* synthetic */ void ouw() {
        LinkedList linkedList;
        synchronized (yu) {
            synchronized (ouw) {
                LinkedList<Runnable> linkedList2 = f12726lh;
                linkedList = (LinkedList) linkedList2.clone();
                linkedList2.clear();
                vt().removeMessages(1);
            }
            if (linkedList.size() > 0) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
    }

    public static void ouw(Runnable runnable, boolean z10) {
        try {
            Handler handlerVt = vt();
            synchronized (ouw) {
                f12726lh.add(runnable);
                if (z10) {
                    handlerVt.sendEmptyMessageDelayed(1, 100L);
                } else {
                    handlerVt.sendEmptyMessage(1);
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }

    private static Handler vt() {
        Handler handler;
        if (vt != null) {
            return vt;
        }
        synchronized (ouw) {
            if (vt == null) {
                vt.ouw ouwVar = vt.ouw;
                HandlerThread handlerThreadOuw = ouwVar != null ? ouwVar.ouw("queued-work-looper") : null;
                if (handlerThreadOuw == null) {
                    handlerThreadOuw = new HandlerThread("queued-work-looper", -2);
                    handlerThreadOuw.start();
                }
                vt = new ouw(handlerThreadOuw.getLooper());
            }
            handler = vt;
        }
        return handler;
    }
}
