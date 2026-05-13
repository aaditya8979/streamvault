package io.bidmachine.iab.vast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class VastHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f69453a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BroadcastReceiver f69454b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final IntentFilter f69455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f69456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f69457e;

    public interface OnScreenStateChangeListener {
        void onScreenStateChange(boolean z10);
    }

    public class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (VastHelper.class) {
                boolean unused = VastHelper.f69457e = "android.intent.action.SCREEN_ON".equals(intent.getAction());
            }
            WeakHashMap weakHashMap = VastHelper.f69453a;
            synchronized (weakHashMap) {
                Iterator it = weakHashMap.values().iterator();
                while (it.hasNext()) {
                    ((OnScreenStateChangeListener) it.next()).onScreenStateChange(VastHelper.f69457e);
                }
            }
        }
    }

    static {
        IntentFilter intentFilter = new IntentFilter();
        f69455c = intentFilter;
        f69456d = false;
        f69457e = false;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
    }

    private static synchronized void a(Context context) {
        if (!f69456d) {
            synchronized (VastHelper.class) {
                if (!f69456d) {
                    f69457e = ((PowerManager) context.getSystemService("power")).isScreenOn();
                    context.getApplicationContext().registerReceiver(f69454b, f69455c);
                    f69456d = true;
                }
            }
        }
    }

    public static void addScreenStateChangeListener(@NonNull View view, @NonNull OnScreenStateChangeListener onScreenStateChangeListener) {
        a(view.getContext());
        WeakHashMap weakHashMap = f69453a;
        synchronized (weakHashMap) {
            weakHashMap.put(view, onScreenStateChangeListener);
        }
    }

    public static boolean isScreenOn(Context context) {
        a(context);
        return f69457e;
    }

    public static void removeScreenStateChangeListener(@NonNull View view) {
        if (f69456d) {
            WeakHashMap weakHashMap = f69453a;
            synchronized (weakHashMap) {
                weakHashMap.remove(view);
            }
        }
    }
}
