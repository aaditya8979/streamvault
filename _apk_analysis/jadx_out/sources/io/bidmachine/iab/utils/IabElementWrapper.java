package io.bidmachine.iab.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public abstract class IabElementWrapper<T extends View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.OnClickListener f69409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f69410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IabElementStyle f69411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f69412d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f69413e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Animator.AnimatorListener f69414f = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IabElementWrapper.this.f69412d = false;
            IabElementWrapper iabElementWrapper = IabElementWrapper.this;
            View view = iabElementWrapper.f69410b;
            if (view == null || iabElementWrapper.f69411c == null) {
                return;
            }
            view.animate().alpha(0.0f).setDuration(400L).setListener(IabElementWrapper.this.f69414f).withLayer();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            animator.removeAllListeners();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = IabElementWrapper.this.f69410b;
            if (view != null) {
                view.setClickable(view.getAlpha() != 0.0f);
            }
        }
    }

    public IabElementWrapper(@Nullable View.OnClickListener onClickListener) {
        this.f69409a = onClickListener;
    }

    public ViewGroup.MarginLayoutParams a(Context context, IabElementStyle iabElementStyle) {
        return new ViewGroup.MarginLayoutParams(iabElementStyle.getWidth(context).intValue(), iabElementStyle.getHeight(context).intValue());
    }

    public void a(Context context, View view, IabElementStyle iabElementStyle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(View view, IabElementStyle iabElementStyle) {
        if (view instanceof IabElement) {
            ((IabElement) view).setStyle(iabElementStyle);
        }
    }

    public boolean a(View view, IabElementStyle iabElementStyle, IabElementStyle iabElementStyle2) {
        return !TextUtils.equals(iabElementStyle.getStyle(), iabElementStyle2.getStyle());
    }

    public void attach(@NonNull Context context, @NonNull ViewGroup viewGroup, @Nullable IabElementStyle iabElementStyle) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        IabElementStyle iabElementStyle2;
        IabElementStyle iabElementStyleCopyWith = c(context, iabElementStyle).copyWith(iabElementStyle);
        if (!iabElementStyleCopyWith.isVisible().booleanValue()) {
            detach();
            return;
        }
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a(context, iabElementStyleCopyWith));
            iabElementStyleCopyWith.applyAlignment(layoutParams);
            marginLayoutParams = layoutParams;
        } else {
            if (!(viewGroup instanceof RelativeLayout)) {
                throw new IllegalArgumentException("Parent should be instance of FrameLayout or RelativeLayout");
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a(context, iabElementStyleCopyWith));
            iabElementStyleCopyWith.applyRelativeAlignment(layoutParams2);
            marginLayoutParams = layoutParams2;
        }
        iabElementStyleCopyWith.applyMargin(context, marginLayoutParams);
        View view = this.f69410b;
        if (view == null || (iabElementStyle2 = this.f69411c) == null || a(view, iabElementStyle2, iabElementStyleCopyWith)) {
            Utils.removeFromParent(this.f69410b);
            View viewB = b(context, iabElementStyleCopyWith);
            this.f69410b = viewB;
            viewGroup.addView(viewB, marginLayoutParams);
        } else {
            this.f69410b.setLayoutParams(marginLayoutParams);
            this.f69410b.setVisibility(0);
        }
        this.f69410b.setAlpha(iabElementStyleCopyWith.getOpacity().floatValue());
        iabElementStyleCopyWith.applyPadding(context, this.f69410b);
        this.f69410b.setOnClickListener(this.f69409a);
        this.f69411c = iabElementStyleCopyWith;
        a(this.f69410b, iabElementStyleCopyWith);
        a(context, this.f69410b, iabElementStyleCopyWith);
    }

    public abstract View b(Context context, IabElementStyle iabElementStyle);

    public void bringToFront() {
        View view = this.f69410b;
        if (view != null) {
            view.bringToFront();
        }
    }

    public abstract IabElementStyle c(Context context, IabElementStyle iabElementStyle);

    public void cancelHide() {
        this.f69412d = false;
        View view = this.f69410b;
        if (view == null || this.f69411c == null) {
            return;
        }
        view.animate().cancel();
        this.f69410b.removeCallbacks(this.f69413e);
        this.f69410b.setClickable(true);
        this.f69410b.setAlpha(this.f69411c.getOpacity().floatValue());
    }

    public void detach() {
        if (this.f69410b != null) {
            cancelHide();
            Utils.removeFromParent(this.f69410b);
            this.f69410b = null;
            this.f69411c = null;
        }
    }

    @Nullable
    @VisibleForTesting
    public T getCachedView() {
        return (T) this.f69410b;
    }

    public void invalidate() {
        View view;
        if (!isAttached() || (view = this.f69410b) == null || this.f69411c == null) {
            return;
        }
        a(view.getContext(), this.f69410b, this.f69411c);
    }

    public boolean isAttached() {
        return this.f69410b != null;
    }

    public void setVisibility(int i10) {
        View view = this.f69410b;
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public void toggleHide() {
        IabElementStyle iabElementStyle;
        Float hideAfter;
        if (this.f69412d || this.f69410b == null || (iabElementStyle = this.f69411c) == null || (hideAfter = iabElementStyle.getHideAfter()) == null || hideAfter.floatValue() == 0.0f) {
            return;
        }
        this.f69412d = true;
        this.f69410b.postDelayed(this.f69413e, (long) (hideAfter.floatValue() * 1000.0f));
    }

    public void toggleShow() {
        if (this.f69410b == null || this.f69411c == null) {
            return;
        }
        cancelHide();
        toggleHide();
    }
}
