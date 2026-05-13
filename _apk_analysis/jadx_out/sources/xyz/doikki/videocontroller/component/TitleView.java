package xyz.doikki.videocontroller.component;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import at.c;
import com.applovin.sdk.AppLovinEventTypes;
import xyz.doikki.videocontroller.R$id;
import xyz.doikki.videocontroller.R$layout;

/* JADX INFO: loaded from: classes2.dex */
public class TitleView extends FrameLayout implements xs.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xs.a f87163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f87164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f87165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f87166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f87167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f87168g;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activityL = c.l(TitleView.this.getContext());
            if (activityL == null || !TitleView.this.f87163b.isFullScreen()) {
                return;
            }
            activityL.setRequestedOrientation(1);
            TitleView.this.f87163b.stopFullScreen();
        }
    }

    public static class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f87170a;

        public b(ImageView imageView) {
            this.f87170a = imageView;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return;
            }
            this.f87170a.getDrawable().setLevel((extras.getInt(AppLovinEventTypes.USER_COMPLETED_LEVEL) * 100) / extras.getInt("scale"));
        }
    }

    public TitleView(@NonNull Context context) {
        super(context);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_title_view, (ViewGroup) this, true);
        this.f87164c = (LinearLayout) findViewById(R$id.title_container);
        ((ImageView) findViewById(R$id.back)).setOnClickListener(new a());
        this.f87165d = (TextView) findViewById(R$id.title);
        this.f87166e = (TextView) findViewById(R$id.sys_time);
        this.f87167f = new b((ImageView) findViewById(R$id.iv_battery));
    }

    public TitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_title_view, (ViewGroup) this, true);
        this.f87164c = (LinearLayout) findViewById(R$id.title_container);
        ((ImageView) findViewById(R$id.back)).setOnClickListener(new a());
        this.f87165d = (TextView) findViewById(R$id.title);
        this.f87166e = (TextView) findViewById(R$id.sys_time);
        this.f87167f = new b((ImageView) findViewById(R$id.iv_battery));
    }

    public TitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setVisibility(8);
        LayoutInflater.from(getContext()).inflate(R$layout.dkplayer_layout_title_view, (ViewGroup) this, true);
        this.f87164c = (LinearLayout) findViewById(R$id.title_container);
        ((ImageView) findViewById(R$id.back)).setOnClickListener(new a());
        this.f87165d = (TextView) findViewById(R$id.title);
        this.f87166e = (TextView) findViewById(R$id.sys_time);
        this.f87167f = new b((ImageView) findViewById(R$id.iv_battery));
    }

    @Override // xs.b
    public void a(boolean z10) {
        if (z10) {
            setVisibility(8);
        } else {
            setVisibility(0);
            this.f87166e.setText(c.b());
        }
    }

    @Override // xs.b
    public void b(@NonNull xs.a aVar) {
        this.f87163b = aVar;
    }

    @Override // xs.b
    public void e(boolean z10, Animation animation) {
        if (this.f87163b.isFullScreen()) {
            if (!z10) {
                if (getVisibility() == 0) {
                    setVisibility(8);
                    if (animation != null) {
                        startAnimation(animation);
                        return;
                    }
                    return;
                }
                return;
            }
            if (getVisibility() == 8) {
                this.f87166e.setText(c.b());
                setVisibility(0);
                if (animation != null) {
                    startAnimation(animation);
                }
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

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f87168g) {
            return;
        }
        getContext().registerReceiver(this.f87167f, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f87168g = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f87168g) {
            getContext().unregisterReceiver(this.f87167f);
            this.f87168g = false;
        }
    }

    @Override // xs.b
    public void onPlayStateChanged(int i10) {
        if (i10 == -1 || i10 == 0 || i10 == 1 || i10 == 2 || i10 == 5 || i10 == 8) {
            setVisibility(8);
        }
    }

    @Override // xs.b
    public void onPlayerStateChanged(int i10) {
        if (i10 == 11) {
            if (this.f87163b.isShowing() && !this.f87163b.isLocked()) {
                setVisibility(0);
                this.f87166e.setText(c.b());
            }
            this.f87165d.setSelected(true);
        } else {
            setVisibility(8);
            this.f87165d.setSelected(false);
        }
        Activity activityL = c.l(getContext());
        if (activityL == null || !this.f87163b.hasCutout()) {
            return;
        }
        int requestedOrientation = activityL.getRequestedOrientation();
        int cutoutHeight = this.f87163b.getCutoutHeight();
        if (requestedOrientation == 1) {
            this.f87164c.setPadding(0, 0, 0, 0);
        } else if (requestedOrientation == 0) {
            this.f87164c.setPadding(cutoutHeight, 0, 0, 0);
        } else if (requestedOrientation == 8) {
            this.f87164c.setPadding(0, 0, cutoutHeight, 0);
        }
    }

    public void setTitle(String str) {
        this.f87165d.setText(str);
    }
}
