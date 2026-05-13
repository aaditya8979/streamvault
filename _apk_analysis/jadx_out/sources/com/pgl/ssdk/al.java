package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.Y1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes12.dex */
public class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile al f51328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f51329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f51330c = new ArrayList();

    private al(Context context) {
        this.f51329b = null;
        this.f51329b = context;
    }

    public static al a(Context context) {
        if (f51328a == null) {
            synchronized (al.class) {
                if (f51328a == null) {
                    f51328a = new al(context);
                }
            }
        }
        return f51328a;
    }

    public void a() {
        int iF = f();
        if (iF == -1) {
            return;
        }
        this.f51330c.add(Integer.valueOf(iF));
        try {
            int size = this.f51330c.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f51330c.subList(size - 10, size));
                this.f51330c.clear();
                this.f51330c = arrayList;
            }
        } catch (Throwable unused) {
        }
    }

    public int b() {
        Intent intentRegisterReceiver = this.f51329b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return intentRegisterReceiver.getIntExtra("plugged", 0);
    }

    public int c() {
        if (this.f51329b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
            return 0;
        }
        return Math.round(((r0.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0) / r0.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    public synchronized String d() {
        if (this.f51330c.size() <= 0) {
            return Y1.f30690f;
        }
        return String.valueOf(this.f51330c.get(r0.size() - 1).intValue() % 10000);
    }

    public synchronized String e() {
        return new JSONArray((Collection) this.f51330c).toString();
    }

    @SuppressLint({"DefaultLocale"})
    public int f() {
        int iB;
        try {
            synchronized (this) {
                try {
                    iB = b();
                } catch (Throwable th2) {
                    th = th2;
                    iB = 0;
                }
                try {
                    return (iB * 10000) + c();
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Exception unused) {
                        return (iB * 10000) + 0;
                    }
                }
            }
        } catch (Exception unused2) {
            iB = 0;
        }
    }
}
