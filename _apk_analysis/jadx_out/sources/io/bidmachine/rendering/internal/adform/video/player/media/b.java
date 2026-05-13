package io.bidmachine.rendering.internal.adform.video.player.media;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.rendering.internal.adform.video.player.e;

/* JADX INFO: loaded from: classes7.dex */
public class b extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.view.a f70092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.bidmachine.rendering.internal.adform.video.player.media.c f70093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaPlayer f70094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Surface f70095d;

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.adform.video.player.media.b$b, reason: collision with other inner class name */
    public class C0823b implements MediaPlayer.OnVideoSizeChangedListener {
        private C0823b() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            b.this.setVideoAspectRatio(i10 / i11);
        }
    }

    public class c implements e {
        private c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            b.this.f70095d = new Surface(surfaceTexture);
            b bVar = b.this;
            bVar.setMediaPlayerSurface(bVar.f70095d);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (b.this.f70093b == null) {
                return false;
            }
            b.this.f70093b.a();
            return false;
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.e, android.view.TextureView.SurfaceTextureListener
        public /* bridge */ /* synthetic */ void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            super.onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.e, android.view.TextureView.SurfaceTextureListener
        public /* bridge */ /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            super.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public b(Context context) {
        super(context);
        io.bidmachine.rendering.internal.view.a aVar = new io.bidmachine.rendering.internal.view.a(context);
        this.f70092a = aVar;
        aVar.setSurfaceTextureListener(new c());
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    private void b() {
        Surface surface = this.f70095d;
        if (surface != null) {
            surface.release();
        }
        this.f70095d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaPlayerSurface(@Nullable Surface surface) {
        try {
            MediaPlayer mediaPlayer = this.f70094c;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface);
            }
        } catch (Throwable unused) {
        }
    }

    public void a() {
        setMediaPlayerSurface(null);
        b();
        this.f70094c = null;
        this.f70092a.setSurfaceTextureListener(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setListener(@Nullable io.bidmachine.rendering.internal.adform.video.player.media.c cVar) {
        this.f70093b = cVar;
    }

    public void setMediaPlayer(@Nullable MediaPlayer mediaPlayer) {
        this.f70094c = mediaPlayer;
        if (mediaPlayer != null) {
            setVideoAspectRatio(mediaPlayer.getVideoWidth() / mediaPlayer.getVideoHeight());
            mediaPlayer.setOnVideoSizeChangedListener(new C0823b());
        }
    }

    public void setVideoAspectRatio(float f10) {
        this.f70092a.setVideoAspectRatio(f10);
    }
}
