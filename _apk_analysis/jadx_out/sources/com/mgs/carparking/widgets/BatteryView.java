package com.mgs.carparking.widgets;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import com.applovin.sdk.AppLovinEventTypes;
import ed.j0;
import me.goldze.mvvmhabit.base.BaseApplication;

/* JADX INFO: loaded from: classes3.dex */
public class BatteryView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RectF f45032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RectF f45033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f45034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f45035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public BroadcastReceiver f45037m;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("status", -1);
            BatteryView.this.f45036l = intExtra == 2 || intExtra == 5;
            BatteryView.this.setPower(intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / intent.getIntExtra("scale", -1));
        }
    }

    public BatteryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45026b = 4;
        this.f45027c = 3;
        this.f45028d = j0.c(BaseApplication.getInstance()).f(65);
        this.f45029e = j0.c(BaseApplication.getInstance()).b(30);
        this.f45030f = 8;
        this.f45031g = 10;
        this.f45034j = 3.0f;
        this.f45037m = new a();
        c();
    }

    public BatteryView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45026b = 4;
        this.f45027c = 3;
        this.f45028d = j0.c(BaseApplication.getInstance()).f(65);
        this.f45029e = j0.c(BaseApplication.getInstance()).b(30);
        this.f45030f = 8;
        this.f45031g = 10;
        this.f45034j = 3.0f;
        this.f45037m = new a();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPower(float f10) {
        this.f45035k = f10;
        invalidate();
    }

    public final void c() {
        int i10 = this.f45027c;
        this.f45032h = new RectF(i10, i10, this.f45028d, this.f45029e - i10);
        Log.i("lum", "mMainRect: " + this.f45032h);
        this.f45033i = new RectF(this.f45032h.width() + ((float) (this.f45027c * 2)), (float) ((this.f45029e - this.f45031g) / 2), this.f45032h.width() + ((float) this.f45027c) + ((float) this.f45030f), (float) ((this.f45029e + this.f45031g) / 2));
        Log.i("lum", "mHeadRect: " + this.f45033i);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        getContext().registerReceiver(this.f45037m, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        getContext().unregisterReceiver(this.f45037m);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setTextSize(28.0f);
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(this.f45027c);
        paint2.setColor(-1);
        RectF rectF = this.f45032h;
        float f10 = this.f45034j;
        canvas.drawRoundRect(rectF, f10, f10, paint2);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-1);
        canvas.drawRect(this.f45033i, paint2);
        Paint paint3 = new Paint();
        if (this.f45036l) {
            paint3.setColor(-16711936);
        } else if (this.f45035k < 0.2d) {
            paint3.setColor(SupportMenu.CATEGORY_MASK);
        } else {
            paint3.setColor(-1);
        }
        float f11 = this.f45035k;
        float fWidth = this.f45032h.width();
        int i10 = this.f45026b;
        int i11 = (int) (f11 * (fWidth - (i10 * 2)));
        RectF rectF2 = this.f45032h;
        float f12 = rectF2.left;
        canvas.drawRect(new Rect((int) (i10 + f12), (int) (rectF2.top + i10), (int) (f12 + i10 + i11), (int) (rectF2.bottom - i10)), paint3);
    }
}
