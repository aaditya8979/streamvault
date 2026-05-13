package xyz.doikki.videocontroller.component;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import at.c;
import xs.a;
import xs.b;
import xyz.doikki.videocontroller.R$id;
import xyz.doikki.videocontroller.R$layout;

/* JADX INFO: loaded from: classes4.dex */
public class LiveControlView extends FrameLayout implements b, View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f87152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f87153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f87154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f87155e;

    public LiveControlView(@NonNull Context context) {
        super(context);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_live_control_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R$id.fullscreen);
        this.f87153c = imageView;
        imageView.setOnClickListener(this);
        this.f87154d = (LinearLayout) findViewById(R$id.bottom_container);
        ImageView imageView2 = (ImageView) findViewById(R$id.iv_play);
        this.f87155e = imageView2;
        imageView2.setOnClickListener(this);
        ((ImageView) findViewById(R$id.iv_refresh)).setOnClickListener(this);
    }

    public LiveControlView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_live_control_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R$id.fullscreen);
        this.f87153c = imageView;
        imageView.setOnClickListener(this);
        this.f87154d = (LinearLayout) findViewById(R$id.bottom_container);
        ImageView imageView2 = (ImageView) findViewById(R$id.iv_play);
        this.f87155e = imageView2;
        imageView2.setOnClickListener(this);
        ((ImageView) findViewById(R$id.iv_refresh)).setOnClickListener(this);
    }

    public LiveControlView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_live_control_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R$id.fullscreen);
        this.f87153c = imageView;
        imageView.setOnClickListener(this);
        this.f87154d = (LinearLayout) findViewById(R$id.bottom_container);
        ImageView imageView2 = (ImageView) findViewById(R$id.iv_play);
        this.f87155e = imageView2;
        imageView2.setOnClickListener(this);
        ((ImageView) findViewById(R$id.iv_refresh)).setOnClickListener(this);
    }

    @Override // xs.b
    public void a(boolean z10) {
        e(!z10, null);
    }

    @Override // xs.b
    public void b(@NonNull a aVar) {
        this.f87152b = aVar;
    }

    @Override // xs.b
    public void e(boolean z10, Animation animation) {
        if (z10) {
            if (getVisibility() == 8) {
                setVisibility(0);
                if (animation != null) {
                    startAnimation(animation);
                    return;
                }
                return;
            }
            return;
        }
        if (getVisibility() == 0) {
            setVisibility(8);
            if (animation != null) {
                startAnimation(animation);
            }
        }
    }

    @Override // xs.b
    public void f(int i10, int i11) {
    }

    @Override // xs.b
    public View getView() {
        return this;
    }

    public final void j() {
        this.f87152b.a(c.l(getContext()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R$id.fullscreen) {
            j();
        } else if (id2 == R$id.iv_play) {
            this.f87152b.c();
        } else if (id2 == R$id.iv_refresh) {
            this.f87152b.replay(true);
        }
    }

    @Override // xs.b
    public void onPlayStateChanged(int i10) {
        switch (i10) {
            case -1:
            case 0:
            case 1:
            case 2:
            case 5:
            case 8:
                setVisibility(8);
                break;
            case 3:
                this.f87155e.setSelected(true);
                break;
            case 4:
                this.f87155e.setSelected(false);
                break;
            case 6:
            case 7:
                this.f87155e.setSelected(this.f87152b.isPlaying());
                break;
        }
    }

    @Override // xs.b
    public void onPlayerStateChanged(int i10) {
        if (i10 == 10) {
            this.f87153c.setSelected(false);
        } else if (i10 == 11) {
            this.f87153c.setSelected(true);
        }
        Activity activityL = c.l(getContext());
        if (activityL == null || !this.f87152b.hasCutout()) {
            return;
        }
        int requestedOrientation = activityL.getRequestedOrientation();
        int cutoutHeight = this.f87152b.getCutoutHeight();
        if (requestedOrientation == 1) {
            this.f87154d.setPadding(0, 0, 0, 0);
        } else if (requestedOrientation == 0) {
            this.f87154d.setPadding(cutoutHeight, 0, 0, 0);
        } else if (requestedOrientation == 8) {
            this.f87154d.setPadding(0, 0, cutoutHeight, 0);
        }
    }
}
