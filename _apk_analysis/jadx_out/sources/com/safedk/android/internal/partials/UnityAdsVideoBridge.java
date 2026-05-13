package com.safedk.android.internal.partials;

import android.widget.VideoView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;

/* JADX INFO: compiled from: UnityAdsSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class UnityAdsVideoBridge {
    public static void VideoViewPlay(VideoView videoView) {
        Logger.d("UnityAdsVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/UnityAdsVideoBridge;->VideoViewPlay(Landroid/widget/VideoView;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "VideoViewPlay: player " + videoView + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a("com.unity3d.ads", (Object) videoView);
                CreativeInfoManager.a("com.unity3d.ads", BrandSafetyUtils.a(videoView), false);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in VideoViewPlay: " + e10.getMessage());
            }
        }
        videoView.start();
    }

    public static void VideoViewSetVideoPath(VideoView videoView, String str) {
        Logger.d("UnityAdsVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/UnityAdsVideoBridge;->VideoViewSetVideoPath(Landroid/widget/VideoView;Ljava/lang/String;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "VideoViewSetVideoPath: player " + videoView + ", path: " + str + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a("com.unity3d.ads", videoView, str);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in VideoViewSetVideoPath: " + e10.getMessage());
            }
        }
        videoView.setVideoPath(str);
    }

    public static void VideoViewStop(VideoView videoView) {
        Logger.d("UnityAdsVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/UnityAdsVideoBridge;->VideoViewStop(Landroid/widget/VideoView;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "VideoViewStop: player " + videoView + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a("com.unity3d.ads", BrandSafetyUtils.a(videoView), true);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in VideoViewStop : " + e10.getMessage());
            }
        }
        videoView.stopPlayback();
    }
}
