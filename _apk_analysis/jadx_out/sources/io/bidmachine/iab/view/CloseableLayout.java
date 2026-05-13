package io.bidmachine.iab.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.utils.IabCloseWrapper;
import io.bidmachine.iab.utils.IabCountDownWrapper;
import io.bidmachine.iab.utils.IabElementStyle;

/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"ViewConstructor"})
public class CloseableLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f69758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IabCloseWrapper f69759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IabCountDownWrapper f69760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f69761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OnCloseClickListener f69762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IabElementStyle f69763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private IabElementStyle f69764g;

    public interface OnCloseClickListener {
        void onCloseClick();

        void onCountDownFinish();
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CloseableLayout.this.f69762e != null) {
                CloseableLayout.this.f69762e.onCloseClick();
            }
        }
    }

    public class b implements Runnable {
        private b() {
        }

        public /* synthetic */ b(CloseableLayout closeableLayout, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CloseableLayout.this.f69760c == null) {
                return;
            }
            long j10 = CloseableLayout.this.f69758a.f69770d;
            if (CloseableLayout.this.isShown()) {
                j10 += 50;
                CloseableLayout.this.f69758a.a(j10);
                CloseableLayout.this.f69760c.changePercentage((int) ((100 * j10) / CloseableLayout.this.f69758a.f69769c), (int) Math.ceil((CloseableLayout.this.f69758a.f69769c - j10) / 1000.0d));
            }
            if (j10 < CloseableLayout.this.f69758a.f69769c) {
                CloseableLayout.this.postDelayed(this, 50L);
                return;
            }
            CloseableLayout.this.c();
            if (CloseableLayout.this.f69758a.f69768b <= 0.0f || CloseableLayout.this.f69762e == null) {
                return;
            }
            CloseableLayout.this.f69762e.onCountDownFinish();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f69767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f69768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f69769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f69770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f69771e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f69772f;

        private c() {
            this.f69767a = false;
            this.f69768b = 0.0f;
            this.f69769c = 0L;
            this.f69770d = 0L;
            this.f69771e = 0L;
            this.f69772f = 0L;
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z10) {
            if (this.f69771e > 0) {
                this.f69772f += System.currentTimeMillis() - this.f69771e;
            }
            if (z10) {
                this.f69771e = System.currentTimeMillis();
            } else {
                this.f69771e = 0L;
            }
        }

        public void a(long j10) {
            this.f69770d = j10;
        }

        public void a(boolean z10, float f10) {
            this.f69767a = z10;
            this.f69768b = f10;
            this.f69769c = (long) (f10 * 1000.0f);
            this.f69770d = 0L;
        }

        public boolean a() {
            long j10 = this.f69769c;
            return j10 == 0 || this.f69770d >= j10;
        }

        public long b() {
            return this.f69771e > 0 ? System.currentTimeMillis() - this.f69771e : this.f69772f;
        }

        public boolean c() {
            long j10 = this.f69769c;
            return j10 != 0 && this.f69770d < j10;
        }

        public boolean d() {
            return this.f69767a;
        }
    }

    public CloseableLayout(@NonNull Context context) {
        super(context);
        this.f69758a = new c(null);
    }

    private void a() {
        if (isShown()) {
            b();
            b bVar = new b(this, null);
            this.f69761d = bVar;
            postDelayed(bVar, 50L);
        }
    }

    private void b() {
        b bVar = this.f69761d;
        if (bVar != null) {
            removeCallbacks(bVar);
            this.f69761d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f69758a.c()) {
            IabCloseWrapper iabCloseWrapper = this.f69759b;
            if (iabCloseWrapper != null) {
                iabCloseWrapper.detach();
            }
            if (this.f69760c == null) {
                this.f69760c = new IabCountDownWrapper(null);
            }
            this.f69760c.attach(getContext(), this, this.f69764g);
            a();
            return;
        }
        b();
        if (this.f69759b == null) {
            this.f69759b = new IabCloseWrapper(new a());
        }
        this.f69759b.attach(getContext(), this, this.f69763f);
        IabCountDownWrapper iabCountDownWrapper = this.f69760c;
        if (iabCountDownWrapper != null) {
            iabCountDownWrapper.detach();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        IabCloseWrapper iabCloseWrapper = this.f69759b;
        if (iabCloseWrapper != null) {
            iabCloseWrapper.bringToFront();
        }
        IabCountDownWrapper iabCountDownWrapper = this.f69760c;
        if (iabCountDownWrapper != null) {
            iabCountDownWrapper.bringToFront();
        }
    }

    public boolean canBeClosed() {
        return this.f69758a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public long getOnScreenTimeMs() {
        return this.f69758a.b();
    }

    public boolean isVisible() {
        return this.f69758a.d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            b();
        } else if (this.f69758a.c() && this.f69758a.d()) {
            a();
        }
        this.f69758a.a(i10 == 0);
    }

    public void setCloseClickListener(@Nullable OnCloseClickListener onCloseClickListener) {
        this.f69762e = onCloseClickListener;
    }

    public void setCloseStyle(@Nullable IabElementStyle iabElementStyle) {
        this.f69763f = iabElementStyle;
        IabCloseWrapper iabCloseWrapper = this.f69759b;
        if (iabCloseWrapper == null || !iabCloseWrapper.isAttached()) {
            return;
        }
        this.f69759b.attach(getContext(), this, iabElementStyle);
    }

    public void setCloseVisibility(boolean z10, float f10) {
        if (this.f69758a.f69767a == z10 && this.f69758a.f69768b == f10) {
            return;
        }
        this.f69758a.a(z10, f10);
        if (z10) {
            c();
            return;
        }
        IabCloseWrapper iabCloseWrapper = this.f69759b;
        if (iabCloseWrapper != null) {
            iabCloseWrapper.detach();
        }
        IabCountDownWrapper iabCountDownWrapper = this.f69760c;
        if (iabCountDownWrapper != null) {
            iabCountDownWrapper.detach();
        }
        b();
    }

    public void setCountDownStyle(@Nullable IabElementStyle iabElementStyle) {
        this.f69764g = iabElementStyle;
        IabCountDownWrapper iabCountDownWrapper = this.f69760c;
        if (iabCountDownWrapper == null || !iabCountDownWrapper.isAttached()) {
            return;
        }
        this.f69760c.attach(getContext(), this, iabElementStyle);
    }
}
