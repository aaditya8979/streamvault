package xyz.doikki.videocontroller.component;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import at.c;
import xs.a;
import xs.b;
import xyz.doikki.videocontroller.R$id;
import xyz.doikki.videocontroller.R$layout;

/* JADX INFO: loaded from: classes9.dex */
public class VodControlView extends FrameLayout implements b, View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f87171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f87172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f87173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f87174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f87175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SeekBar f87176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProgressBar f87177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f87178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f87179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f87180k;

    public VodControlView(@NonNull Context context) {
        super(context);
        this.f87180k = true;
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(getLayoutId(), (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R$id.fullscreen);
        this.f87174e = imageView;
        imageView.setOnClickListener(this);
        this.f87175f = (LinearLayout) findViewById(R$id.bottom_container);
        SeekBar seekBar = (SeekBar) findViewById(R$id.seekBar);
        this.f87176g = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        this.f87172c = (TextView) findViewById(R$id.total_time);
        this.f87173d = (TextView) findViewById(R$id.curr_time);
        ImageView imageView2 = (ImageView) findViewById(R$id.iv_play);
        this.f87178i = imageView2;
        imageView2.setOnClickListener(this);
        this.f87177h = (ProgressBar) findViewById(R$id.bottom_progress);
    }

    public VodControlView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f87180k = true;
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(getLayoutId(), (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R$id.fullscreen);
        this.f87174e = imageView;
        imageView.setOnClickListener(this);
        this.f87175f = (LinearLayout) findViewById(R$id.bottom_container);
        SeekBar seekBar = (SeekBar) findViewById(R$id.seekBar);
        this.f87176g = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        this.f87172c = (TextView) findViewById(R$id.total_time);
        this.f87173d = (TextView) findViewById(R$id.curr_time);
        ImageView imageView2 = (ImageView) findViewById(R$id.iv_play);
        this.f87178i = imageView2;
        imageView2.setOnClickListener(this);
        this.f87177h = (ProgressBar) findViewById(R$id.bottom_progress);
    }

    public VodControlView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f87180k = true;
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(getLayoutId(), (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R$id.fullscreen);
        this.f87174e = imageView;
        imageView.setOnClickListener(this);
        this.f87175f = (LinearLayout) findViewById(R$id.bottom_container);
        SeekBar seekBar = (SeekBar) findViewById(R$id.seekBar);
        this.f87176g = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        this.f87172c = (TextView) findViewById(R$id.total_time);
        this.f87173d = (TextView) findViewById(R$id.curr_time);
        ImageView imageView2 = (ImageView) findViewById(R$id.iv_play);
        this.f87178i = imageView2;
        imageView2.setOnClickListener(this);
        this.f87177h = (ProgressBar) findViewById(R$id.bottom_progress);
    }

    @Override // xs.b
    public void a(boolean z10) {
        e(!z10, null);
    }

    @Override // xs.b
    public void b(@NonNull a aVar) {
        this.f87171b = aVar;
    }

    @Override // xs.b
    public void e(boolean z10, Animation animation) {
        if (z10) {
            this.f87175f.setVisibility(0);
            if (animation != null) {
                this.f87175f.startAnimation(animation);
            }
            if (this.f87180k) {
                this.f87177h.setVisibility(8);
                return;
            }
            return;
        }
        this.f87175f.setVisibility(8);
        if (animation != null) {
            this.f87175f.startAnimation(animation);
        }
        if (this.f87180k) {
            this.f87177h.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            this.f87177h.startAnimation(alphaAnimation);
        }
    }

    @Override // xs.b
    public void f(int i10, int i11) {
        if (this.f87179j) {
            return;
        }
        SeekBar seekBar = this.f87176g;
        if (seekBar != null) {
            if (i10 > 0) {
                seekBar.setEnabled(true);
                int max = (int) (((((double) i11) * 1.0d) / ((double) i10)) * ((double) this.f87176g.getMax()));
                this.f87176g.setProgress(max);
                this.f87177h.setProgress(max);
            } else {
                seekBar.setEnabled(false);
            }
            int bufferedPercentage = this.f87171b.getBufferedPercentage();
            if (bufferedPercentage >= 95) {
                SeekBar seekBar2 = this.f87176g;
                seekBar2.setSecondaryProgress(seekBar2.getMax());
                ProgressBar progressBar = this.f87177h;
                progressBar.setSecondaryProgress(progressBar.getMax());
            } else {
                int i12 = bufferedPercentage * 10;
                this.f87176g.setSecondaryProgress(i12);
                this.f87177h.setSecondaryProgress(i12);
            }
        }
        TextView textView = this.f87172c;
        if (textView != null) {
            textView.setText(c.m(i10));
        }
        TextView textView2 = this.f87173d;
        if (textView2 != null) {
            textView2.setText(c.m(i11));
        }
    }

    public int getLayoutId() {
        return R$layout.dkplayer_layout_vod_control_view;
    }

    @Override // xs.b
    public View getView() {
        return this;
    }

    public final void j() {
        this.f87171b.a(c.l(getContext()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R$id.fullscreen) {
            j();
        } else if (id2 == R$id.iv_play) {
            this.f87171b.c();
        }
    }

    @Override // xs.b
    public void onPlayStateChanged(int i10) {
        switch (i10) {
            case -1:
            case 1:
            case 2:
            case 8:
                setVisibility(8);
                break;
            case 0:
            case 5:
                setVisibility(8);
                this.f87177h.setProgress(0);
                this.f87177h.setSecondaryProgress(0);
                this.f87176g.setProgress(0);
                this.f87176g.setSecondaryProgress(0);
                break;
            case 3:
                this.f87178i.setSelected(true);
                if (!this.f87180k) {
                    this.f87175f.setVisibility(8);
                } else if (this.f87171b.isShowing()) {
                    this.f87177h.setVisibility(8);
                    this.f87175f.setVisibility(0);
                } else {
                    this.f87175f.setVisibility(8);
                    this.f87177h.setVisibility(0);
                }
                setVisibility(0);
                this.f87171b.startProgress();
                break;
            case 4:
                this.f87178i.setSelected(false);
                break;
            case 6:
                this.f87178i.setSelected(this.f87171b.isPlaying());
                this.f87171b.stopProgress();
                break;
            case 7:
                this.f87178i.setSelected(this.f87171b.isPlaying());
                this.f87171b.startProgress();
                break;
        }
    }

    @Override // xs.b
    public void onPlayerStateChanged(int i10) {
        if (i10 == 10) {
            this.f87174e.setSelected(false);
        } else if (i10 == 11) {
            this.f87174e.setSelected(true);
        }
        Activity activityL = c.l(getContext());
        if (activityL == null || !this.f87171b.hasCutout()) {
            return;
        }
        int requestedOrientation = activityL.getRequestedOrientation();
        int cutoutHeight = this.f87171b.getCutoutHeight();
        if (requestedOrientation == 1) {
            this.f87175f.setPadding(0, 0, 0, 0);
            this.f87177h.setPadding(0, 0, 0, 0);
        } else if (requestedOrientation == 0) {
            this.f87175f.setPadding(cutoutHeight, 0, 0, 0);
            this.f87177h.setPadding(cutoutHeight, 0, 0, 0);
        } else if (requestedOrientation == 8) {
            this.f87175f.setPadding(0, 0, cutoutHeight, 0);
            this.f87177h.setPadding(0, 0, cutoutHeight, 0);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        if (z10) {
            long duration = (this.f87171b.getDuration() * ((long) i10)) / ((long) this.f87176g.getMax());
            TextView textView = this.f87173d;
            if (textView != null) {
                textView.setText(c.m((int) duration));
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f87179j = true;
        this.f87171b.stopProgress();
        this.f87171b.stopFadeOut();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        this.f87171b.seekTo((int) ((this.f87171b.getDuration() * ((long) seekBar.getProgress())) / ((long) this.f87176g.getMax())));
        this.f87179j = false;
        this.f87171b.startProgress();
        this.f87171b.startFadeOut();
    }
}
