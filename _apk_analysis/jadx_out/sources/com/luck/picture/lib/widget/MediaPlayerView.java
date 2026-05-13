package com.luck.picture.lib.widget;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import ma.d;

/* JADX INFO: loaded from: classes7.dex */
public class MediaPlayerView extends FrameLayout implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaPlayer f35243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VideoSurfaceView f35244c;

    public static class VideoSurfaceView extends SurfaceView {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f35246c;

        public VideoSurfaceView(Context context) {
            this(context, null);
        }

        public VideoSurfaceView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public VideoSurfaceView(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
        }

        public void a(int i10, int i11) {
            if (i10 == 0 || i11 == 0) {
                return;
            }
            this.f35245b = i10;
            this.f35246c = i11;
            getHolder().setFixedSize(i10, i11);
            requestLayout();
        }

        @Override // android.view.SurfaceView, android.view.View
        public void onMeasure(int i10, int i11) {
            int i12;
            int defaultSize = View.getDefaultSize(this.f35245b, i10);
            int defaultSize2 = View.getDefaultSize(this.f35246c, i11);
            if (this.f35245b > 0 && this.f35246c > 0) {
                int mode = View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i10);
                int mode2 = View.MeasureSpec.getMode(i11);
                int size2 = View.MeasureSpec.getSize(i11);
                if (mode == 1073741824 && mode2 == 1073741824) {
                    int i13 = this.f35245b;
                    int i14 = i13 * size2;
                    int i15 = this.f35246c;
                    if (i14 < size * i15) {
                        defaultSize = (i13 * size2) / i15;
                        defaultSize2 = size2;
                    } else {
                        if (i13 * size2 > size * i15) {
                            defaultSize2 = (i15 * size) / i13;
                            defaultSize = size;
                        }
                        defaultSize = size;
                        defaultSize2 = size2;
                    }
                } else if (mode == 1073741824) {
                    int i16 = (this.f35246c * size) / this.f35245b;
                    if (mode2 != Integer.MIN_VALUE || i16 <= size2) {
                        defaultSize2 = i16;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i12 = (this.f35245b * size2) / this.f35246c;
                        if (mode == Integer.MIN_VALUE && i12 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        int i17 = this.f35245b;
                        int i18 = this.f35246c;
                        if (mode2 != Integer.MIN_VALUE || i18 <= size2) {
                            i12 = i17;
                            size2 = i18;
                        } else {
                            i12 = (size2 * i17) / i18;
                        }
                        if (mode == Integer.MIN_VALUE && i12 > size) {
                            defaultSize2 = (i18 * size) / i17;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i12;
                    defaultSize2 = size2;
                }
            }
            setMeasuredDimension(defaultSize, defaultSize2);
        }
    }

    public class a implements MediaPlayer.OnVideoSizeChangedListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            MediaPlayerView.this.f35244c.a(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
        }
    }

    public MediaPlayerView(@NonNull Context context) {
        super(context);
        c();
    }

    public MediaPlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public MediaPlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c();
    }

    public void b() {
        this.f35244c.getHolder().setFormat(-1);
        this.f35244c.getHolder().setFormat(-2);
    }

    public final void c() {
        this.f35244c = new VideoSurfaceView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        this.f35244c.setLayoutParams(layoutParams);
        addView(this.f35244c);
        SurfaceHolder holder = this.f35244c.getHolder();
        holder.setFormat(-2);
        holder.addCallback(this);
    }

    public MediaPlayer d() {
        if (this.f35243b == null) {
            this.f35243b = new MediaPlayer();
        }
        this.f35243b.setOnVideoSizeChangedListener(new a());
        return this.f35243b;
    }

    public void e() {
        MediaPlayer mediaPlayer = this.f35243b;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f35243b.setOnPreparedListener(null);
            this.f35243b.setOnCompletionListener(null);
            this.f35243b.setOnErrorListener(null);
            this.f35243b = null;
        }
    }

    public void f(String str) {
        try {
            if (d.c(str)) {
                this.f35243b.setDataSource(getContext(), Uri.parse(str));
            } else {
                this.f35243b.setDataSource(str);
            }
            this.f35243b.prepareAsync();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public MediaPlayer getMediaPlayer() {
        return this.f35243b;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        this.f35243b.setAudioStreamType(3);
        this.f35243b.setDisplay(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
    }
}
