package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ryl extends View {
    private int[] bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private Paint f12383cf;
    private int fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private LinearGradient f12384jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final List<ouw> f12385ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f12386le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f12387lh;
    private PorterDuff.Mode mwh;
    public Rect ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f12388ra;
    private Xfermode ryl;
    private Bitmap tlj;
    public Rect vt;
    private int yu;

    public static class ouw {
        public final int ouw = 4;
        public int vt = 0;
    }

    public ryl(Context context) {
        super(context);
        this.mwh = PorterDuff.Mode.DST_IN;
        this.f12385ko = new ArrayList();
        this.f12387lh = com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_splash_unlock_image_arrow");
        this.yu = Color.parseColor("#00ffffff");
        this.fkw = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.f12386le = color;
        this.f12388ra = 10;
        this.pno = 40;
        this.bly = new int[]{this.yu, this.fkw, color};
        setLayerType(1, null);
        this.f12383cf = new Paint(1);
        this.tlj = BitmapFactory.decodeResource(getResources(), this.f12387lh);
        this.ryl = new PorterDuffXfermode(this.mwh);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.tlj, this.ouw, this.vt, this.f12383cf);
        canvas.save();
        Iterator<ouw> it = this.f12385ko.iterator();
        while (it.hasNext()) {
            ouw next = it.next();
            this.f12384jg = new LinearGradient(next.vt, 0.0f, r3 + this.pno, this.f12388ra, this.bly, (float[]) null, Shader.TileMode.CLAMP);
            this.f12383cf.setColor(-1);
            this.f12383cf.setShader(this.f12384jg);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f12383cf);
            this.f12383cf.setShader(null);
            int i10 = next.vt + next.ouw;
            next.vt = i10;
            if (i10 > getWidth()) {
                it.remove();
            }
        }
        this.f12383cf.setXfermode(this.ryl);
        canvas.drawBitmap(this.tlj, this.ouw, this.vt, this.f12383cf);
        this.f12383cf.setXfermode(null);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.tlj == null) {
            return;
        }
        this.ouw = new Rect(0, 0, this.tlj.getWidth(), this.tlj.getHeight());
        this.vt = new Rect(0, 0, getWidth(), getHeight());
    }

    public final void ouw() {
        this.f12385ko.add(new ouw());
        postInvalidate();
    }
}
