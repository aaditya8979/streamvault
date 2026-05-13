package yads;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import yads.d02;

/* JADX INFO: loaded from: classes3.dex */
public final class d02 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f88678c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile d02 f88679d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f88680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f88681b;

    public d02(Handler handler) {
        this.f88680a = handler;
    }

    public static final void a(d02 d02Var, View view) {
        if (d02Var.f88681b) {
            view.setAlpha(view.getAlpha() * 2);
            d02Var.f88681b = false;
        }
    }

    public final void a(final View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.f88681b) {
                view.setAlpha(view.getAlpha() / 2);
                this.f88681b = true;
            }
            this.f88680a.postDelayed(new Runnable() { // from class: bt.s0
                @Override // java.lang.Runnable
                public final void run() {
                    d02.a(this.f6279b, view);
                }
            }, 100L);
        }
    }
}
