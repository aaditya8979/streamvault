package com.scwang.smart.refresh.classics;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.scwang.smart.refresh.classics.ClassicsAbstract;
import com.scwang.smart.refresh.footer.classics.R$id;
import me.a;
import oe.e;
import oe.f;
import re.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ClassicsAbstract<T extends ClassicsAbstract<?>> extends b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f53206r = R$id.srl_classics_title;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f53207s = R$id.srl_classics_arrow;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f53208t = R$id.srl_classics_progress;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f53209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f53210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f53211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f53212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f53213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f53214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f53215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f53216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f53217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f53218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f53219o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f53220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f53221q;

    public ClassicsAbstract(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f53218n = 500;
        this.f53219o = 20;
        this.f53220p = 20;
        this.f53221q = 0;
        this.f78899c = pe.b.f77285d;
    }

    @Override // re.b, oe.a
    public void d(@NonNull f fVar, int i10, int i11) {
        ImageView imageView = this.f53211g;
        if (imageView.getVisibility() != 0) {
            imageView.setVisibility(0);
            Object drawable = this.f53211g.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            } else {
                imageView.animate().rotation(36000.0f).setDuration(100000L);
            }
        }
    }

    @Override // re.b, oe.a
    public void e(@NonNull f fVar, int i10, int i11) {
        d(fVar, i10, i11);
    }

    @Override // re.b, oe.a
    public int j(@NonNull f fVar, boolean z10) {
        ImageView imageView = this.f53211g;
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        } else {
            imageView.animate().rotation(0.0f).setDuration(0L);
        }
        imageView.setVisibility(8);
        return this.f53218n;
    }

    @Override // re.b, oe.a
    public void k(@NonNull e eVar, int i10, int i11) {
        this.f53212h = eVar;
        eVar.b(this, this.f53217m);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageView imageView = this.f53210f;
        ImageView imageView2 = this.f53211g;
        imageView.animate().cancel();
        imageView2.animate().cancel();
        Object drawable = this.f53211g.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f53221q == 0) {
            this.f53219o = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            this.f53220p = paddingBottom;
            if (this.f53219o == 0 || paddingBottom == 0) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int iC = this.f53219o;
                if (iC == 0) {
                    iC = se.b.c(20.0f);
                }
                this.f53219o = iC;
                int iC2 = this.f53220p;
                if (iC2 == 0) {
                    iC2 = se.b.c(20.0f);
                }
                this.f53220p = iC2;
                setPadding(paddingLeft, this.f53219o, paddingRight, iC2);
            }
            setClipToPadding(false);
        }
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            int size = View.MeasureSpec.getSize(i11);
            int i12 = this.f53221q;
            if (size < i12) {
                int i13 = (size - i12) / 2;
                setPadding(getPaddingLeft(), i13, getPaddingRight(), i13);
            } else {
                setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
            }
        } else {
            setPadding(getPaddingLeft(), this.f53219o, getPaddingRight(), this.f53220p);
        }
        super.onMeasure(i10, i11);
        if (this.f53221q == 0) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                int measuredHeight = getChildAt(i14).getMeasuredHeight();
                if (this.f53221q < measuredHeight) {
                    this.f53221q = measuredHeight;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T r() {
        return this;
    }

    public T s(@ColorInt int i10) {
        this.f53215k = true;
        this.f53209e.setTextColor(i10);
        a aVar = this.f53213i;
        if (aVar != null) {
            aVar.a(i10);
            this.f53210f.invalidateDrawable(this.f53213i);
        }
        a aVar2 = this.f53214j;
        if (aVar2 != null) {
            aVar2.a(i10);
            this.f53211g.invalidateDrawable(this.f53214j);
        }
        return (T) r();
    }

    @Override // re.b, oe.a
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (iArr.length > 0) {
            if (!(getBackground() instanceof BitmapDrawable) && !this.f53216l) {
                t(iArr[0]);
                this.f53216l = false;
            }
            if (this.f53215k) {
                return;
            }
            if (iArr.length > 1) {
                s(iArr[1]);
            }
            this.f53215k = false;
        }
    }

    public T t(@ColorInt int i10) {
        this.f53216l = true;
        this.f53217m = i10;
        e eVar = this.f53212h;
        if (eVar != null) {
            eVar.b(this, i10);
        }
        return (T) r();
    }

    public T u(float f10) {
        this.f53209e.setTextSize(f10);
        e eVar = this.f53212h;
        if (eVar != null) {
            eVar.f(this);
        }
        return (T) r();
    }
}
