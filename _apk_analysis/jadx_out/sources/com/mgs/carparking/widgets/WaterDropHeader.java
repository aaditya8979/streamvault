package com.mgs.carparking.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import id.c;
import oe.d;
import oe.f;

/* JADX INFO: loaded from: classes12.dex */
public class WaterDropHeader extends re.b implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RefreshState f45080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f45081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public xd.b f45082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f45083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public id.a f45084i;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f45085b;

        public a(View view) {
            this.f45085b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f45085b.setVisibility(8);
            this.f45085b.setAlpha(1.0f);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45087a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f45087a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45087a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45087a[RefreshState.PullDownCanceled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45087a[RefreshState.ReleaseToRefresh.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45087a[RefreshState.Refreshing.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45087a[RefreshState.RefreshFinish.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public WaterDropHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        pe.b[] bVarArr = pe.b.f77290i;
        int length = bVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            pe.b bVar = bVarArr[i10];
            if (bVar.f77293c) {
                this.f78899c = bVar;
                break;
            }
            i10++;
        }
        xd.b bVar2 = new xd.b(context);
        this.f45082g = bVar2;
        bVar2.d(0);
        addView(this.f45082g, -1, -1);
        c cVar = new c();
        this.f45083h = cVar;
        cVar.setCallback(this);
        cVar.setBounds(0, 0, se.b.c(20.0f), se.b.c(20.0f));
        this.f45081f = new ImageView(context);
        id.a aVar = new id.a(this.f45081f);
        this.f45084i = aVar;
        aVar.e(-1, -16737844, -48060, -10053376, -5609780, -30720);
        this.f45081f.setImageDrawable(this.f45084i);
        addView(this.f45081f, se.b.c(30.0f), se.b.c(30.0f));
    }

    @Override // re.b, qe.h
    public void b(@NonNull f fVar, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        xd.b bVar = this.f45082g;
        ImageView imageView = this.f45081f;
        this.f45080e = refreshState2;
        int i10 = b.f45087a[refreshState2.ordinal()];
        if (i10 == 1) {
            bVar.setVisibility(0);
            imageView.setVisibility(0);
            return;
        }
        if (i10 == 2) {
            bVar.setVisibility(0);
            imageView.setVisibility(0);
        } else if (i10 == 4) {
            bVar.setVisibility(0);
            imageView.setVisibility(0);
        } else {
            if (i10 != 6) {
                return;
            }
            bVar.setVisibility(8);
            imageView.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        xd.b bVar = this.f45082g;
        c cVar = this.f45083h;
        if (this.f45080e == RefreshState.Refreshing) {
            canvas.save();
            canvas.translate((getWidth() / 2.0f) - (cVar.getBounds().width() / 2.0f), (this.f45082g.getMaxCircleRadius() + bVar.getPaddingTop()) - (cVar.getBounds().height() / 2.0f));
            cVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override // re.b, oe.a
    public void e(@NonNull f fVar, int i10, int i11) {
        ImageView imageView = this.f45081f;
        xd.b bVar = this.f45082g;
        this.f45083h.start();
        imageView.setVisibility(8);
        this.f45082g.a().start();
        bVar.animate().setDuration(150L).alpha(0.0f).setListener(new a(bVar));
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        invalidate();
    }

    @Override // re.b, oe.a
    public int j(@NonNull f fVar, boolean z10) {
        this.f45083h.stop();
        return 0;
    }

    @Override // re.b, oe.a
    public void n(boolean z10, float f10, int i10, int i11, int i12) {
        RefreshState refreshState;
        if (z10 || ((refreshState = this.f45080e) != RefreshState.Refreshing && refreshState != RefreshState.RefreshReleased)) {
            xd.b bVar = this.f45082g;
            bVar.e(Math.max(i10, 0), i12 + i11);
            bVar.postInvalidate();
        }
        if (z10) {
            float f11 = i11;
            float fMax = (((float) Math.max(((double) Math.min(1.0f, Math.abs((i10 * 1.0f) / f11))) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
            double dMax = Math.max(0.0f, Math.min(Math.abs(i10) - i11, f11 * 2.0f) / f11) / 4.0f;
            float fPow = (((0.4f * fMax) - 0.25f) + (((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f * 2.0f)) * 0.5f;
            this.f45084i.k(true);
            this.f45084i.i(0.0f, Math.min(0.8f, fMax * 0.8f));
            this.f45084i.d(Math.min(1.0f, fMax));
            this.f45084i.f(fPow);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ImageView imageView = this.f45081f;
        xd.b bVar = this.f45082g;
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = bVar.getMeasuredWidth();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = i14 - i15;
        bVar.layout(i16, 0, i16 + measuredWidth2, bVar.getMeasuredHeight() + 0);
        int measuredWidth3 = imageView.getMeasuredWidth();
        int measuredHeight = imageView.getMeasuredHeight();
        int i17 = measuredWidth3 / 2;
        int i18 = i14 - i17;
        int bottom = i15 - i17;
        int i19 = (measuredWidth2 - measuredWidth3) / 2;
        if (bottom + measuredHeight > bVar.getBottom() - i19) {
            bottom = (bVar.getBottom() - i19) - measuredHeight;
        }
        imageView.layout(i18, bottom, measuredWidth3 + i18, measuredHeight + bottom);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ImageView imageView = this.f45081f;
        xd.b bVar = this.f45082g;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        imageView.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
        bVar.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE), i11);
        super.setMeasuredDimension(View.resolveSize(Math.max(imageView.getMeasuredWidth(), bVar.getMeasuredWidth()), i10), View.resolveSize(Math.max(imageView.getMeasuredHeight(), bVar.getMeasuredHeight()), i11));
    }

    @Override // re.b, oe.a
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (iArr.length > 0) {
            this.f45082g.setIndicatorColor(iArr[0]);
        }
    }
}
