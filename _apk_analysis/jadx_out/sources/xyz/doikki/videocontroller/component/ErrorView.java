package xyz.doikki.videocontroller.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xs.b;
import xyz.doikki.videocontroller.R$id;
import xyz.doikki.videocontroller.R$layout;

/* JADX INFO: loaded from: classes10.dex */
public class ErrorView extends LinearLayout implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f87142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f87143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xs.a f87144d;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ErrorView.this.setVisibility(8);
            ErrorView.this.f87144d.replay(false);
        }
    }

    public ErrorView(Context context) {
        this(context, null);
    }

    public ErrorView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_error_view, (ViewGroup) this, true);
        findViewById(R$id.status_btn).setOnClickListener(new a());
        setClickable(true);
    }

    public ErrorView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_error_view, (ViewGroup) this, true);
        findViewById(R$id.status_btn).setOnClickListener(new a());
        setClickable(true);
    }

    @Override // xs.b
    public void a(boolean z10) {
    }

    @Override // xs.b
    public void b(@NonNull xs.a aVar) {
        this.f87144d = aVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f87142b = motionEvent.getX();
            this.f87143c = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.f87142b);
            float fAbs2 = Math.abs(motionEvent.getY() - this.f87143c);
            if (fAbs > ViewConfiguration.get(getContext()).getScaledTouchSlop() || fAbs2 > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // xs.b
    public void e(boolean z10, Animation animation) {
    }

    @Override // xs.b
    public void f(int i10, int i11) {
    }

    @Override // xs.b
    public View getView() {
        return this;
    }

    @Override // xs.b
    public void onPlayStateChanged(int i10) {
        if (i10 == -1) {
            bringToFront();
            setVisibility(0);
        } else if (i10 == 0) {
            setVisibility(8);
        }
    }

    @Override // xs.b
    public void onPlayerStateChanged(int i10) {
    }
}
