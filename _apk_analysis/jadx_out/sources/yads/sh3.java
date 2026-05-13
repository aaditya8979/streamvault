package yads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes11.dex */
public final class sh3 implements qh3, DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f94833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ph3 f94834b;

    public sh3(DisplayManager displayManager) {
        this.f94833a = displayManager;
    }

    public static sh3 a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new sh3(displayManager);
        }
        return null;
    }

    @Override // yads.qh3
    public final void a() {
        this.f94833a.unregisterDisplayListener(this);
        this.f94834b = null;
    }

    @Override // yads.qh3
    public final void a(ph3 ph3Var) {
        this.f94834b = ph3Var;
        this.f94833a.registerDisplayListener(this, ib3.a((Handler.Callback) null));
        ph3Var.a(this.f94833a.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        ph3 ph3Var = this.f94834b;
        if (ph3Var == null || i10 != 0) {
            return;
        }
        ph3Var.a(this.f94833a.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
