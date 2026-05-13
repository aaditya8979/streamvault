package io.bidmachine.iab.utils;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class IabTimerHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f69418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimerHelperCallback f69419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f69420c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f69421d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f69422e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f69423f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f69424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f69425h;

    public interface TimerHelperCallback {
        void onTimerFinish();

        void onTimerTick(float f10, long j10, long j11);
    }

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IabTimerHelper.this.a();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jMin = IabTimerHelper.this.f69423f;
            if (IabTimerHelper.this.f69418a.isShown()) {
                jMin = Math.min(IabTimerHelper.this.f69422e, jMin + 16);
                IabTimerHelper.this.a(jMin);
                IabTimerHelper.this.f69419b.onTimerTick((IabTimerHelper.this.f69423f * 100.0f) / IabTimerHelper.this.f69422e, IabTimerHelper.this.f69423f, IabTimerHelper.this.f69422e);
            }
            if (jMin >= IabTimerHelper.this.f69422e) {
                IabTimerHelper.this.f69419b.onTimerFinish();
            } else {
                IabTimerHelper.this.f69418a.postDelayed(this, 16L);
            }
        }
    }

    public IabTimerHelper(@NonNull View view, @NonNull TimerHelperCallback timerHelperCallback) {
        a aVar = new a();
        this.f69424g = aVar;
        this.f69425h = new b();
        this.f69418a = view;
        this.f69419b = timerHelperCallback;
        view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        boolean zIsShown = this.f69418a.isShown();
        if (this.f69420c == zIsShown) {
            return;
        }
        this.f69420c = zIsShown;
        if (!zIsShown) {
            stop();
        } else if (isTicking()) {
            start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        this.f69423f = j10;
    }

    public void detach() {
        stop();
        this.f69418a.getViewTreeObserver().removeGlobalOnLayoutListener(this.f69424g);
    }

    public boolean isTicking() {
        long j10 = this.f69422e;
        return j10 != 0 && this.f69423f < j10;
    }

    public void setTime(float f10) {
        if (this.f69421d == f10) {
            return;
        }
        this.f69421d = f10;
        this.f69422e = (long) (f10 * 1000.0f);
        start();
    }

    public void start() {
        if (!this.f69418a.isShown() || this.f69422e == 0) {
            return;
        }
        this.f69418a.postDelayed(this.f69425h, 16L);
    }

    public void stop() {
        this.f69418a.removeCallbacks(this.f69425h);
    }
}
