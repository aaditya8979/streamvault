package com.luck.picture.lib.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import ya.d;
import ya.e;
import ya.f;
import ya.g;
import ya.h;
import ya.i;
import ya.j;
import ya.k;

/* JADX INFO: loaded from: classes4.dex */
public class PhotoView extends AppCompatImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f35127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView.ScaleType f35128c;

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }

    public final void a() {
        this.f35127b = new k(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f35128c;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f35128c = null;
        }
    }

    public k getAttacher() {
        return this.f35127b;
    }

    public RectF getDisplayRect() {
        return this.f35127b.B();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f35127b.E();
    }

    public float getMaximumScale() {
        return this.f35127b.H();
    }

    public float getMediumScale() {
        return this.f35127b.I();
    }

    public float getMinimumScale() {
        return this.f35127b.J();
    }

    public float getScale() {
        return this.f35127b.K();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f35127b.L();
    }

    public void setAllowParentInterceptOnEdge(boolean z10) {
        this.f35127b.O(z10);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        if (frame) {
            this.f35127b.update();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        k kVar = this.f35127b;
        if (kVar != null) {
            kVar.update();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        k kVar = this.f35127b;
        if (kVar != null) {
            kVar.update();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        k kVar = this.f35127b;
        if (kVar != null) {
            kVar.update();
        }
    }

    public void setMaximumScale(float f10) {
        this.f35127b.Q(f10);
    }

    public void setMediumScale(float f10) {
        this.f35127b.R(f10);
    }

    public void setMinimumScale(float f10) {
        this.f35127b.S(f10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f35127b.T(onClickListener);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f35127b.U(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f35127b.V(onLongClickListener);
    }

    public void setOnMatrixChangeListener(d dVar) {
        this.f35127b.W(dVar);
    }

    public void setOnOutsidePhotoTapListener(e eVar) {
        this.f35127b.X(eVar);
    }

    public void setOnPhotoTapListener(f fVar) {
        this.f35127b.Y(fVar);
    }

    public void setOnScaleChangeListener(g gVar) {
        this.f35127b.Z(gVar);
    }

    public void setOnSingleFlingListener(h hVar) {
        this.f35127b.a0(hVar);
    }

    public void setOnViewDragListener(i iVar) {
        this.f35127b.b0(iVar);
    }

    public void setOnViewTapListener(j jVar) {
        this.f35127b.c0(jVar);
    }

    public void setRotationBy(float f10) {
        this.f35127b.d0(f10);
    }

    public void setRotationTo(float f10) {
        this.f35127b.e0(f10);
    }

    public void setScale(float f10) {
        this.f35127b.f0(f10);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        k kVar = this.f35127b;
        if (kVar == null) {
            this.f35128c = scaleType;
        } else {
            kVar.i0(scaleType);
        }
    }

    public void setZoomTransitionDuration(int i10) {
        this.f35127b.j0(i10);
    }

    public void setZoomable(boolean z10) {
        this.f35127b.k0(z10);
    }
}
