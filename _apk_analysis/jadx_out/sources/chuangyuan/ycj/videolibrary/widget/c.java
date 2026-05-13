package chuangyuan.ycj.videolibrary.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import chuangyuan.ycj.videolibrary.R$id;
import chuangyuan.ycj.videolibrary.R$layout;
import v.a;

/* JADX INFO: compiled from: LockControlView.java */
/* JADX INFO: loaded from: classes9.dex */
public class c extends FrameLayout implements View.OnClickListener, a.InterfaceC1074a, a.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExoDefaultTimeBar f6669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatCheckBox f6670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f6671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BaseView f6672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f6674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f6675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Runnable f6676i;

    /* JADX INFO: compiled from: LockControlView.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f6672e.i()) {
                if (c.this.f6670c.getVisibility() == 0) {
                    v.a.f(c.this.f6670c, false).start();
                } else {
                    v.a.c(c.this.f6670c).start();
                }
            }
        }
    }

    public c(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, @NonNull BaseView baseView) {
        super(context, attributeSet, i10);
        this.f6673f = false;
        this.f6676i = new a();
        this.f6672e = baseView;
        View viewInflate = View.inflate(context, R$layout.simple_exo_play_lock, null);
        this.f6671d = viewInflate;
        viewInflate.setBackgroundColor(0);
        this.f6669b = (ExoDefaultTimeBar) this.f6671d.findViewById(R$id.exo_player_lock_progress);
        this.f6670c = (AppCompatCheckBox) this.f6671d.findViewById(R$id.exo_player_lock_btn_id);
        this.f6674g = baseView.getPlaybackControlView().findViewById(R$id.exo_controller_right);
        this.f6675h = baseView.getPlaybackControlView().findViewById(R$id.exo_controller_left);
        this.f6670c.setVisibility(8);
        this.f6670c.setOnClickListener(this);
        baseView.getPlaybackControlView().setAnimatorListener(this);
        baseView.getPlaybackControlView().y(this);
        addView(this.f6671d, getChildCount());
    }

    @Override // v.a.InterfaceC1074a
    public void a(boolean z10) {
        if (this.f6672e.i()) {
            if (!z10) {
                h(false);
                View view = this.f6675h;
                if (view != null) {
                    v.a.f(view, true).start();
                }
                View view2 = this.f6674g;
                if (view2 != null) {
                    v.a.d(view2, false);
                    return;
                }
                return;
            }
            g(0);
            h(true);
            View view3 = this.f6674g;
            if (view3 != null) {
                v.a.c(view3).start();
            }
            View view4 = this.f6675h;
            if (view4 != null) {
                v.a.c(view4).start();
            }
        }
    }

    @Override // v.a.b
    public void b(long j10, long j11, long j12) {
        if (this.f6669b != null) {
            if ((this.f6672e.i() && this.f6670c.isChecked()) || this.f6673f) {
                this.f6669b.setPosition(j10);
                this.f6669b.setBufferedPosition(j11);
                this.f6669b.setDuration(j12);
            }
        }
    }

    public boolean d() {
        AppCompatCheckBox appCompatCheckBox = this.f6670c;
        return appCompatCheckBox != null && appCompatCheckBox.isChecked();
    }

    public void e() {
        f();
        AppCompatCheckBox appCompatCheckBox = this.f6670c;
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setOnCheckedChangeListener(null);
        }
        AppCompatCheckBox appCompatCheckBox2 = this.f6670c;
        if (appCompatCheckBox2 == null || appCompatCheckBox2.animate() == null) {
            return;
        }
        this.f6670c.animate().cancel();
    }

    public void f() {
        removeCallbacks(this.f6676i);
        this.f6672e.getPlaybackControlView().L(this);
    }

    public void g(int i10) {
        if (this.f6671d != null) {
            if (this.f6672e.i()) {
                if (this.f6670c.isChecked() && i10 == 0) {
                    this.f6672e.getPlaybackControlView().G();
                    this.f6672e.t(8, true);
                }
                this.f6670c.setVisibility(i10);
                if (this.f6672e.getAdRewardVisibilty()) {
                    this.f6670c.setVisibility(8);
                }
            } else {
                this.f6670c.setVisibility(8);
            }
            if (this.f6673f) {
                this.f6669b.setVisibility(i10 == 8 ? 0 : 8);
            } else {
                this.f6669b.setVisibility(8);
            }
        }
    }

    public void h(boolean z10) {
        if (this.f6672e.i()) {
            if (this.f6670c.isChecked()) {
                if (this.f6670c.getTranslationX() == 0.0f) {
                    v.a.f(this.f6670c, false).start();
                    return;
                } else {
                    v.a.c(this.f6670c).start();
                    return;
                }
            }
            if (z10) {
                v.a.c(this.f6670c).start();
            } else if (this.f6670c.getTag() == null) {
                v.a.f(this.f6670c, false).start();
            } else {
                this.f6670c.setTag(null);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        removeCallbacks(this.f6676i);
        this.f6670c.setTag(Boolean.TRUE);
        if (!this.f6670c.isChecked()) {
            this.f6672e.G();
            this.f6670c.setTag(null);
            this.f6672e.f6600c.q();
            this.f6672e.getPlaybackControlView().S();
            return;
        }
        this.f6672e.K();
        this.f6672e.f6599b.setRequestedOrientation(14);
        this.f6672e.getPlaybackControlView().T();
        if (this.f6672e.f6600c.p()) {
            return;
        }
        postDelayed(this.f6676i, this.f6672e.f6600c.getControllerShowTimeoutMs());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    public void setLockCheck(boolean z10) {
        this.f6670c.setChecked(z10);
    }

    public void setOpenLock(boolean z10) {
        this.f6670c.setVisibility(z10 ? 0 : 8);
    }

    public void setProgress(boolean z10) {
        this.f6673f = z10;
    }
}
