package xyz.doikki.videocontroller.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xs.c;
import xyz.doikki.videocontroller.R$drawable;
import xyz.doikki.videocontroller.R$id;
import xyz.doikki.videocontroller.R$layout;

/* JADX INFO: loaded from: classes9.dex */
public class GestureView extends FrameLayout implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xs.a f87146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f87147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProgressBar f87148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f87149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f87150f;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            GestureView.this.f87150f.setVisibility(8);
        }
    }

    public GestureView(@NonNull Context context) {
        super(context);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_gesture_control_view, (ViewGroup) this, true);
        this.f87147c = (ImageView) findViewById(R$id.iv_icon);
        this.f87148d = (ProgressBar) findViewById(R$id.pro_percent);
        this.f87149e = (TextView) findViewById(R$id.tv_percent);
        this.f87150f = (LinearLayout) findViewById(R$id.center_container);
    }

    public GestureView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_gesture_control_view, (ViewGroup) this, true);
        this.f87147c = (ImageView) findViewById(R$id.iv_icon);
        this.f87148d = (ProgressBar) findViewById(R$id.pro_percent);
        this.f87149e = (TextView) findViewById(R$id.tv_percent);
        this.f87150f = (LinearLayout) findViewById(R$id.center_container);
    }

    public GestureView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_gesture_control_view, (ViewGroup) this, true);
        this.f87147c = (ImageView) findViewById(R$id.iv_icon);
        this.f87148d = (ProgressBar) findViewById(R$id.pro_percent);
        this.f87149e = (TextView) findViewById(R$id.tv_percent);
        this.f87150f = (LinearLayout) findViewById(R$id.center_container);
    }

    @Override // xs.b
    public void a(boolean z10) {
    }

    @Override // xs.b
    public void b(@NonNull xs.a aVar) {
        this.f87146b = aVar;
    }

    @Override // xs.c
    public void c(int i10) {
        this.f87148d.setVisibility(0);
        if (i10 <= 0) {
            this.f87147c.setImageResource(R$drawable.dkplayer_ic_action_volume_off);
        } else {
            this.f87147c.setImageResource(R$drawable.dkplayer_ic_action_volume_up);
        }
        this.f87149e.setText(i10 + "%");
        this.f87148d.setProgress(i10);
    }

    @Override // xs.c
    public void d(int i10, int i11, int i12) {
        this.f87148d.setVisibility(8);
        if (i10 > i11) {
            this.f87147c.setImageResource(R$drawable.dkplayer_ic_action_fast_forward);
        } else {
            this.f87147c.setImageResource(R$drawable.dkplayer_ic_action_fast_rewind);
        }
        this.f87149e.setText(String.format("%s/%s", at.c.m(i10), at.c.m(i12)));
    }

    @Override // xs.b
    public void e(boolean z10, Animation animation) {
    }

    @Override // xs.b
    public void f(int i10, int i11) {
    }

    @Override // xs.c
    public void g() {
        this.f87146b.hide();
        this.f87150f.setVisibility(0);
        this.f87150f.setAlpha(1.0f);
    }

    @Override // xs.b
    public View getView() {
        return this;
    }

    @Override // xs.c
    public void h() {
        this.f87150f.animate().alpha(0.0f).setDuration(300L).setListener(new a()).start();
    }

    @Override // xs.c
    public void i(int i10) {
        this.f87148d.setVisibility(0);
        this.f87147c.setImageResource(R$drawable.dkplayer_ic_action_brightness);
        this.f87149e.setText(i10 + "%");
        this.f87148d.setProgress(i10);
    }

    @Override // xs.b
    public void onPlayStateChanged(int i10) {
        if (i10 == 0 || i10 == 8 || i10 == 1 || i10 == 2 || i10 == -1 || i10 == 5) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    @Override // xs.b
    public void onPlayerStateChanged(int i10) {
    }
}
