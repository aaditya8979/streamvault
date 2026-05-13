package ys;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import xyz.doikki.videoplayer.player.BaseVideoView;

/* JADX INFO: compiled from: AudioFocusHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference<BaseVideoView> f98095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioManager f98096d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f98094b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f98097e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f98098f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f98099g = 0;

    /* JADX INFO: compiled from: AudioFocusHelper.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f98100b;

        public a(int i10) {
            this.f98100b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.c(this.f98100b);
        }
    }

    public b(@NonNull BaseVideoView baseVideoView) {
        this.f98095c = new WeakReference<>(baseVideoView);
        this.f98096d = (AudioManager) baseVideoView.getContext().getApplicationContext().getSystemService("audio");
    }

    public void a() {
        AudioManager audioManager = this.f98096d;
        if (audioManager == null) {
            return;
        }
        this.f98097e = false;
        audioManager.abandonAudioFocus(this);
    }

    public final void c(int i10) {
        BaseVideoView baseVideoView = this.f98095c.get();
        if (baseVideoView == null) {
            return;
        }
        if (i10 == -3) {
            if (!baseVideoView.isPlaying() || baseVideoView.isMute()) {
                return;
            }
            baseVideoView.setVolume(0.1f, 0.1f);
            return;
        }
        if (i10 == -2 || i10 == -1) {
            if (baseVideoView.isPlaying()) {
                this.f98098f = true;
                baseVideoView.pause();
                return;
            }
            return;
        }
        if (i10 == 1 || i10 == 2) {
            if (this.f98097e || this.f98098f) {
                baseVideoView.start();
                this.f98097e = false;
                this.f98098f = false;
            }
            if (baseVideoView.isMute()) {
                return;
            }
            baseVideoView.setVolume(1.0f, 1.0f);
        }
    }

    public void d() {
        AudioManager audioManager;
        if (this.f98099g == 1 || (audioManager = this.f98096d) == null) {
            return;
        }
        if (1 == audioManager.requestAudioFocus(this, 3, 1)) {
            this.f98099g = 1;
        } else {
            this.f98097e = true;
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i10) {
        if (this.f98099g == i10) {
            return;
        }
        this.f98094b.post(new a(i10));
        this.f98099g = i10;
    }
}
