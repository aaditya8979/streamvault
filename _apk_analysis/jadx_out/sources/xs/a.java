package xs;

import android.app.Activity;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: ControlWrapper.java */
/* JADX INFO: loaded from: classes12.dex */
public class a implements e, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f87136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f87137c;

    public a(@NonNull e eVar, @NonNull d dVar) {
        this.f87136b = eVar;
        this.f87137c = dVar;
    }

    public void a(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (isFullScreen()) {
            activity.setRequestedOrientation(1);
            stopFullScreen();
        } else {
            activity.setRequestedOrientation(0);
            startFullScreen();
        }
    }

    public void b() {
        setLocked(!isLocked());
    }

    public void c() {
        if (isPlaying()) {
            pause();
        } else {
            start();
        }
    }

    public void d() {
        if (isShowing()) {
            hide();
        } else {
            show();
        }
    }

    @Override // xs.e
    public int getBufferedPercentage() {
        return this.f87136b.getBufferedPercentage();
    }

    @Override // xs.e
    public long getCurrentPosition() {
        return this.f87136b.getCurrentPosition();
    }

    @Override // xs.d
    public int getCutoutHeight() {
        return this.f87137c.getCutoutHeight();
    }

    @Override // xs.e
    public long getDuration() {
        return this.f87136b.getDuration();
    }

    @Override // xs.e
    public float getSpeed() {
        return this.f87136b.getSpeed();
    }

    @Override // xs.d
    public boolean hasCutout() {
        return this.f87137c.hasCutout();
    }

    @Override // xs.d
    public void hide() {
        this.f87137c.hide();
    }

    @Override // xs.e
    public boolean isFullScreen() {
        return this.f87136b.isFullScreen();
    }

    @Override // xs.d
    public boolean isLocked() {
        return this.f87137c.isLocked();
    }

    @Override // xs.e
    public boolean isPlaying() {
        return this.f87136b.isPlaying();
    }

    @Override // xs.d
    public boolean isShowing() {
        return this.f87137c.isShowing();
    }

    @Override // xs.e
    public void pause() {
        this.f87136b.pause();
    }

    @Override // xs.e
    public void replay(boolean z10) {
        this.f87136b.replay(z10);
    }

    @Override // xs.e
    public void seekTo(long j10) {
        this.f87136b.seekTo(j10);
    }

    @Override // xs.d
    public void setLocked(boolean z10) {
        this.f87137c.setLocked(z10);
    }

    @Override // xs.d
    public void show() {
        this.f87137c.show();
    }

    @Override // xs.e
    public void start() {
        this.f87136b.start();
    }

    @Override // xs.d
    public void startFadeOut() {
        this.f87137c.startFadeOut();
    }

    @Override // xs.e
    public void startFullScreen() {
        this.f87136b.startFullScreen();
    }

    @Override // xs.d
    public void startProgress() {
        this.f87137c.startProgress();
    }

    @Override // xs.d
    public void stopFadeOut() {
        this.f87137c.stopFadeOut();
    }

    @Override // xs.e
    public void stopFullScreen() {
        this.f87136b.stopFullScreen();
    }

    @Override // xs.d
    public void stopProgress() {
        this.f87137c.stopProgress();
    }
}
