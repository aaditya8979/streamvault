package com.fyber.inneractive.sdk.util;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f19513a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f19515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f19516d;

    public static void a(b0 b0Var, Context context, Intent intent) {
        boolean zIsKeyguardLocked;
        synchronized (b0Var) {
            try {
                zIsKeyguardLocked = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
            } catch (Exception unused) {
                IAlog.a("%sFailed to get lock screen status", IAlog.a(b0Var));
                zIsKeyguardLocked = false;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                b0Var.f19514b = true;
            } else if (("android.intent.action.SCREEN_ON".equals(intent.getAction()) && !zIsKeyguardLocked) || "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                b0Var.f19514b = false;
            }
            IAlog.a("%sNew screen state is locked: %s. number of listeners: %d", IAlog.a(b0Var), Boolean.valueOf(b0Var.f19514b), Integer.valueOf(b0Var.f19513a.size()));
            for (a0 a0Var : b0Var.f19513a) {
                boolean z10 = b0Var.f19514b;
                com.fyber.inneractive.sdk.renderers.l lVar = (com.fyber.inneractive.sdk.renderers.l) a0Var;
                lVar.getClass();
                IAlog.a("%sgot onLockScreenStateChanged with: %s", IAlog.a(lVar), Boolean.valueOf(z10));
                if (z10) {
                    lVar.c(false);
                    com.fyber.inneractive.sdk.renderers.d dVar = lVar.f19341y;
                    if (dVar != null && dVar.f19315g) {
                        dVar.f19315g = false;
                        r.f19556b.removeCallbacks(dVar.f19318j);
                    }
                } else {
                    lVar.O();
                    com.fyber.inneractive.sdk.renderers.d dVar2 = lVar.f19341y;
                    if (dVar2 != null && !dVar2.f19316h && !dVar2.f19315g && dVar2.f19314f != 0) {
                        dVar2.f19314f = 0L;
                        dVar2.f19315g = true;
                        dVar2.a();
                    }
                }
            }
        }
    }
}
