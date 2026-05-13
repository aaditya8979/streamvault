package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f82697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f82698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractRunnableC1029a f82699c;

    /* JADX INFO: renamed from: sg.bigo.ads.common.view.a$a, reason: collision with other inner class name */
    public static abstract class AbstractRunnableC1029a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f82701b;

        private AbstractRunnableC1029a() {
        }

        public /* synthetic */ AbstractRunnableC1029a(byte b10) {
            this();
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public void run() {
            if (this.f82701b) {
                return;
            }
            a();
        }
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f82697a = 3000;
        this.f82698b = false;
    }

    private synchronized void a(boolean z10) {
        AbstractRunnableC1029a abstractRunnableC1029a = this.f82699c;
        if (abstractRunnableC1029a != null) {
            abstractRunnableC1029a.f82701b = true;
            this.f82699c = null;
        }
        if (z10) {
            AbstractRunnableC1029a abstractRunnableC1029a2 = new AbstractRunnableC1029a() { // from class: sg.bigo.ads.common.view.a.1
                @Override // sg.bigo.ads.common.view.a.AbstractRunnableC1029a
                public final void a() {
                    if (a.this.f82698b && a.this.b() && u.c(a.this) && sg.bigo.ads.common.ab.a.a(a.this, new Rect())) {
                        a.this.a();
                    }
                    a.this.postDelayed(this, r0.f82697a);
                }
            };
            this.f82699c = abstractRunnableC1029a2;
            postDelayed(abstractRunnableC1029a2, this.f82697a);
        }
    }

    public abstract void a();

    public abstract boolean b();

    public final void c() {
        if (this.f82698b) {
            return;
        }
        this.f82698b = true;
        a(true);
    }

    public final void d() {
        this.f82698b = false;
        a(false);
    }

    public int getFlipInterval() {
        return this.f82697a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    public void setFlipInterval(@IntRange(from = 0) int i10) {
        this.f82697a = i10;
    }
}
