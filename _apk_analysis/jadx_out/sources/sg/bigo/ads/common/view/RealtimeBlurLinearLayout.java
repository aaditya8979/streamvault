package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.a.d;

/* JADX INFO: loaded from: classes10.dex */
public class RealtimeBlurLinearLayout extends LinearLayout implements sg.bigo.ads.common.view.a.c<RealtimeBlurLinearLayout> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<RealtimeBlurLinearLayout> f82616a;

    public RealtimeBlurLinearLayout(Context context) {
        this(context, null);
    }

    public RealtimeBlurLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RealtimeBlurLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d<RealtimeBlurLinearLayout> dVar = new d<>(this);
        this.f82616a = dVar;
        setBackground(dVar.f82717d);
    }

    @Override // android.view.View
    public Drawable getBackground() {
        Drawable background = super.getBackground();
        return background instanceof sg.bigo.ads.common.view.a.a ? ((sg.bigo.ads.common.view.a.a) background).f82225a : background;
    }

    @Nullable
    public sg.bigo.ads.common.view.a.b getBlurStyle() {
        return this.f82616a.f82717d.f82702b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d<RealtimeBlurLinearLayout> dVar = this.f82616a;
        View viewA = u.a(dVar.f82716c, dVar.f82715b);
        dVar.f82719f = viewA;
        if (viewA == null) {
            dVar.f82720g = false;
            return;
        }
        viewA.getViewTreeObserver().addOnPreDrawListener(dVar.f82721h);
        dVar.a();
        boolean z10 = dVar.f82719f.getRootView() != dVar.f82715b.getRootView();
        dVar.f82720g = z10;
        if (z10) {
            dVar.f82719f.postInvalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d<RealtimeBlurLinearLayout> dVar = this.f82616a;
        View view = dVar.f82719f;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(dVar.f82721h);
        }
        dVar.b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        d<RealtimeBlurLinearLayout> dVar = this.f82616a;
        sg.bigo.ads.common.view.a.a aVar = dVar.f82717d;
        if (drawable != aVar) {
            aVar.a(drawable);
            dVar.b();
        }
        super.setBackground(dVar.f82717d);
    }

    @Override // sg.bigo.ads.common.view.a.c
    public void setBlurStyle(@Nullable sg.bigo.ads.common.view.a.b bVar) {
        this.f82616a.setBlurStyle(bVar);
    }
}
