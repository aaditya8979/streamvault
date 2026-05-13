package com.safedk.android.internal.partials;

import android.net.Uri;
import android.widget.VideoView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: AppLovinSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinVideoBridge {
    public static void VideoViewPlay(VideoView videoView) {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->VideoViewPlay(Landroid/widget/VideoView;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "VideoViewPlay: player " + videoView + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a(g.f53127a, (Object) videoView);
                CreativeInfoManager.a(g.f53127a, BrandSafetyUtils.a(videoView), false);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in VideoViewPlay: " + e10.getMessage());
            }
        }
        videoView.start();
    }

    public static void VideoViewSetVideoUri(VideoView videoView, Uri uri) {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->VideoViewSetVideoUri(Landroid/widget/VideoView;Landroid/net/Uri;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "VideoViewSetVideoUri: player " + videoView + ", uri: " + uri + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a(g.f53127a, videoView, uri);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in VideoViewSetVideoPath: " + e10.getMessage());
            }
        }
        videoView.setVideoURI(uri);
    }

    public static void VideoViewStop(VideoView videoView) {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->VideoViewStop(Landroid/widget/VideoView;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "VideoViewStop: player " + videoView + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a(g.f53127a, BrandSafetyUtils.a(videoView), true);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in VideoViewStop : " + e10.getMessage());
            }
        }
        videoView.stopPlayback();
    }

    public static String stringInit(byte[] bArr, String str) throws UnsupportedEncodingException {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->stringInit([BLjava/lang/String;)Ljava/lang/String;");
        String str2 = new String(bArr, str);
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "stringInit started , isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.f53127a);
                if (str2.contains("\"ads\"")) {
                    CreativeInfoManager.a(g.f53127a, "@!1:ad_fetch@!", str2, (Map<String, List<String>>) null);
                }
            } catch (Throwable th2) {
            }
        }
        return str2;
    }
}
