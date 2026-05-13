package com.safedk.android.internal.partials;

import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.VideoView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.io.IOException;

/* JADX INFO: compiled from: InMobiSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class InMobiVideoBridge {
    public static void MediaPlayerSetDataSource(MediaPlayer mediaPlayer, String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->MediaPlayerSetDataSource(Landroid/media/MediaPlayer;Ljava/lang/String;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerSetDataSource: player " + mediaPlayer + ", path " + str + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a(g.f53135i, mediaPlayer, str);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetDataSource: " + e10.getMessage());
            }
        }
        mediaPlayer.setDataSource(str);
    }

    public static void MediaPlayerSetSurface(MediaPlayer mediaPlayer, Surface surface) {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->MediaPlayerSetSurface(Landroid/media/MediaPlayer;Landroid/view/Surface;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerSetSurface: player " + mediaPlayer + ", surface " + surface + ", isOnUiThread = " + k.c());
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetSurface: " + e10.getMessage());
            }
        }
        mediaPlayer.setSurface(surface);
    }

    public static void MediaPlayerStart(MediaPlayer mediaPlayer) throws IllegalStateException {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->MediaPlayerStart(Landroid/media/MediaPlayer;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStart: " + mediaPlayer + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a(g.f53135i, mediaPlayer);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: " + e10.getMessage());
            }
        }
        mediaPlayer.start();
    }

    public static void VideoViewPlay(VideoView videoView) {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->VideoViewPlay(Landroid/widget/VideoView;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "VideoViewPlay: player " + videoView + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a(g.f53135i, (Object) videoView);
                CreativeInfoManager.a(g.f53135i, BrandSafetyUtils.a(videoView), false);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in VideoViewPlay: " + e10.getMessage());
            }
        }
        videoView.start();
    }

    public static void VideoViewSetVideoPath(VideoView videoView, String str) {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->VideoViewSetVideoPath(Landroid/widget/VideoView;Ljava/lang/String;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "VideoViewSetVideoPath: player " + videoView + ", path: " + str + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a(g.f53135i, videoView, str);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in VideoViewSetVideoPath: " + e10.getMessage());
            }
        }
        videoView.setVideoPath(str);
    }

    public static void VideoViewStop(VideoView videoView) {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->VideoViewStop(Landroid/widget/VideoView;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "VideoViewStop: player " + videoView + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a(g.f53135i, BrandSafetyUtils.a(videoView), true);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in VideoViewStop : " + e10.getMessage());
            }
        }
        videoView.stopPlayback();
    }
}
