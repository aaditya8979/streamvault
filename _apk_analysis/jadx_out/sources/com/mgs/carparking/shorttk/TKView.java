package com.mgs.carparking.shorttk;

import a6.m;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import at.c;
import com.bumptech.glide.Glide;
import com.dramarush.shortin.R;

/* JADX INFO: loaded from: classes9.dex */
public class TKView extends FrameLayout implements xs.b, View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f44462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f44463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xs.a f44464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f44468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FixedSeekBar f44469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f44470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f44471k;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TKView.this.f44464d != null) {
                TKView.this.f44464d.c();
            }
        }
    }

    public class b implements SeekBar.OnSeekBarChangeListener {
        public b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                long duration = (TKView.this.f44464d.getDuration() * ((long) i10)) / ((long) seekBar.getMax());
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            TKView.this.f44470j = true;
            TKView.this.f44464d.stopProgress();
            TKView.this.f44464d.stopFadeOut();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            TKView.this.f44464d.seekTo((int) ((TKView.this.f44464d.getDuration() * ((long) seekBar.getProgress())) / ((long) seekBar.getMax())));
            TKView.this.f44470j = false;
            TKView.this.f44464d.startProgress();
            TKView.this.f44464d.startFadeOut();
        }
    }

    public TKView(@NonNull Context context) {
        super(context);
        this.f44471k = true;
        LayoutInflater.from(getContext()).inflate(R.layout.layout_tiktok_controller, (ViewGroup) this, true);
        this.f44462b = (ImageView) findViewById(R.id.iv_thumb);
        ImageView imageView = (ImageView) findViewById(R.id.iv_loading);
        this.f44468h = imageView;
        Glide.with(this).load(Integer.valueOf(R.drawable.ic_small_video_loading)).into(imageView);
        this.f44463c = (ImageView) findViewById(R.id.play_btn);
        setOnClickListener(new a());
        this.f44465e = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        FixedSeekBar fixedSeekBar = (FixedSeekBar) findViewById(R.id.bottom_progress);
        this.f44469i = fixedSeekBar;
        fixedSeekBar.setOnSeekBarChangeListener(new b());
    }

    public TKView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44471k = true;
        LayoutInflater.from(getContext()).inflate(R.layout.layout_tiktok_controller, (ViewGroup) this, true);
        this.f44462b = (ImageView) findViewById(R.id.iv_thumb);
        ImageView imageView = (ImageView) findViewById(R.id.iv_loading);
        this.f44468h = imageView;
        Glide.with(this).load(Integer.valueOf(R.drawable.ic_small_video_loading)).into(imageView);
        this.f44463c = (ImageView) findViewById(R.id.play_btn);
        setOnClickListener(new a());
        this.f44465e = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        FixedSeekBar fixedSeekBar = (FixedSeekBar) findViewById(R.id.bottom_progress);
        this.f44469i = fixedSeekBar;
        fixedSeekBar.setOnSeekBarChangeListener(new b());
    }

    public TKView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f44471k = true;
        LayoutInflater.from(getContext()).inflate(R.layout.layout_tiktok_controller, (ViewGroup) this, true);
        this.f44462b = (ImageView) findViewById(R.id.iv_thumb);
        ImageView imageView = (ImageView) findViewById(R.id.iv_loading);
        this.f44468h = imageView;
        Glide.with(this).load(Integer.valueOf(R.drawable.ic_small_video_loading)).into(imageView);
        this.f44463c = (ImageView) findViewById(R.id.play_btn);
        setOnClickListener(new a());
        this.f44465e = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        FixedSeekBar fixedSeekBar = (FixedSeekBar) findViewById(R.id.bottom_progress);
        this.f44469i = fixedSeekBar;
        fixedSeekBar.setOnSeekBarChangeListener(new b());
    }

    @Override // xs.b
    public void a(boolean z10) {
        e(!z10, null);
    }

    @Override // xs.b
    public void b(@NonNull xs.a aVar) {
        this.f44464d = aVar;
    }

    @Override // xs.b
    public void e(boolean z10, Animation animation) {
        if (z10) {
            if (this.f44471k) {
                this.f44469i.setVisibility(8);
            }
        } else if (this.f44471k) {
            this.f44469i.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            this.f44469i.startAnimation(alphaAnimation);
        }
    }

    @Override // xs.b
    public void f(int i10, int i11) {
        FixedSeekBar fixedSeekBar;
        if (this.f44470j || (fixedSeekBar = this.f44469i) == null) {
            return;
        }
        if (i10 > 0) {
            this.f44469i.setProgress((int) (((((double) i11) * 1.0d) / ((double) i10)) * ((double) fixedSeekBar.getMax())));
        }
        int bufferedPercentage = this.f44464d.getBufferedPercentage();
        if (bufferedPercentage < 95) {
            this.f44469i.setSecondaryProgress(bufferedPercentage * 10);
        } else {
            FixedSeekBar fixedSeekBar2 = this.f44469i;
            fixedSeekBar2.setSecondaryProgress(fixedSeekBar2.getMax());
        }
    }

    @Override // xs.b
    public View getView() {
        return this;
    }

    public final void l() {
        this.f44464d.a(c.l(getContext()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.fullscreen) {
            l();
        } else if (id2 == R.id.iv_play) {
            this.f44464d.c();
        }
    }

    @Override // xs.b
    public void onPlayStateChanged(int i10) {
        switch (i10) {
            case -1:
            case 1:
            case 2:
            case 8:
                this.f44462b.setVisibility(0);
                this.f44468h.setVisibility(0);
                break;
            case 0:
                m.c("wangyi", "STATE_IDLE " + hashCode());
                this.f44462b.setVisibility(0);
                this.f44468h.setVisibility(0);
                break;
            case 3:
                m.c("wangyi", "STATE_PLAYING " + hashCode());
                if (this.f44471k) {
                    if (this.f44464d.isShowing()) {
                        this.f44469i.setVisibility(8);
                    } else {
                        this.f44469i.setVisibility(0);
                    }
                }
                setVisibility(0);
                this.f44464d.startProgress();
                this.f44462b.setVisibility(8);
                this.f44463c.setVisibility(8);
                this.f44468h.setVisibility(8);
                break;
            case 4:
                this.f44463c.setVisibility(0);
                break;
            case 5:
                m.c("wangyi", "STATE_PLAYBACK_COMPLETED " + hashCode());
                setVisibility(8);
                this.f44469i.setProgress(0);
                this.f44469i.setSecondaryProgress(0);
                break;
            case 6:
                this.f44464d.stopProgress();
                break;
            case 7:
                this.f44464d.startProgress();
                break;
        }
    }

    @Override // xs.b
    public void onPlayerStateChanged(int i10) {
        Activity activityL = c.l(getContext());
        if (activityL == null || !this.f44464d.hasCutout()) {
            return;
        }
        int requestedOrientation = activityL.getRequestedOrientation();
        int cutoutHeight = this.f44464d.getCutoutHeight();
        if (requestedOrientation == 1) {
            this.f44469i.setPadding(0, 0, 0, 0);
        } else if (requestedOrientation == 0) {
            this.f44469i.setPadding(cutoutHeight, 0, 0, 0);
        } else if (requestedOrientation == 8) {
            this.f44469i.setPadding(0, 0, cutoutHeight, 0);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        if (z10) {
            long duration = (this.f44464d.getDuration() * ((long) i10)) / ((long) seekBar.getMax());
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f44470j = true;
        this.f44464d.stopProgress();
        this.f44464d.stopFadeOut();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        this.f44464d.seekTo((int) ((this.f44464d.getDuration() * ((long) seekBar.getProgress())) / ((long) seekBar.getMax())));
        this.f44470j = false;
        this.f44464d.startProgress();
        this.f44464d.startFadeOut();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f44466f = (int) motionEvent.getX();
            this.f44467g = (int) motionEvent.getY();
            return true;
        }
        if (action != 1) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (Math.abs(x10 - this.f44466f) >= this.f44465e || Math.abs(y10 - this.f44467g) >= this.f44465e) {
            return false;
        }
        performClick();
        return false;
    }
}
