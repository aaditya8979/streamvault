package zs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: TextureRenderView.java */
/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ViewConstructor"})
public class d extends TextureView implements a, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f98419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SurfaceTexture f98420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public xyz.doikki.videoplayer.player.a f98421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f98422e;

    public d(Context context) {
        super(context);
        this.f98419b = new b();
        setSurfaceTextureListener(this);
    }

    @Override // zs.a
    public void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f98419b.d(i10, i11);
        requestLayout();
    }

    @Override // zs.a
    public Bitmap b() {
        return getBitmap();
    }

    @Override // zs.a
    public void c(@NonNull xyz.doikki.videoplayer.player.a aVar) {
        this.f98421d = aVar;
    }

    @Override // zs.a
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int[] iArrA = this.f98419b.a(i10, i11);
        setMeasuredDimension(iArrA[0], iArrA[1]);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        SurfaceTexture surfaceTexture2 = this.f98420c;
        if (surfaceTexture2 != null) {
            setSurfaceTexture(surfaceTexture2);
            return;
        }
        this.f98420c = surfaceTexture;
        Surface surface = new Surface(surfaceTexture);
        this.f98422e = surface;
        xyz.doikki.videoplayer.player.a aVar = this.f98421d;
        if (aVar != null) {
            aVar.setSurface(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // zs.a
    public void release() {
        Surface surface = this.f98422e;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f98420c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    @Override // zs.a
    public void setScaleType(int i10) {
        this.f98419b.b(i10);
        requestLayout();
    }

    @Override // zs.a
    public void setVideoRotation(int i10) {
        this.f98419b.c(i10);
        setRotation(i10);
    }
}
