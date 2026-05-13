package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ImpressionType;

/* JADX INFO: renamed from: com.inmobi.media.uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3785uf {
    public static C3511jf a(String str, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, boolean z10, String str2, byte b10, String str3) {
        tn.p.k(str, "creativeType");
        Cf cf2 = Bf.f25219a;
        cf2.getClass();
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "webView");
        AdSessionContext adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(cf2.f25267b, gestureDetectorOnGestureListenerC3337ci, str2, str3);
        tn.p.j(adSessionContextCreateHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
        ImpressionType impressionType = b10 == 1 ? ImpressionType.DEFINED_BY_JAVASCRIPT : b10 == 2 ? ImpressionType.UNSPECIFIED : b10 == 3 ? ImpressionType.LOADED : b10 == 4 ? ImpressionType.BEGIN_TO_RENDER : b10 == 5 ? ImpressionType.ONE_PIXEL : b10 == 6 ? ImpressionType.VIEWABLE : b10 == 7 ? ImpressionType.AUDIBLE : b10 == 0 ? ImpressionType.OTHER : ImpressionType.OTHER;
        int iHashCode = str.hashCode();
        if (iHashCode != -284840886) {
            if (iHashCode != 93166550) {
                if (iHashCode != 112202875) {
                    if (iHashCode == 1425678798 && str.equals("nonvideo")) {
                        return new C3511jf("html_display_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, false);
                    }
                } else if (str.equals("video")) {
                    return new C3511jf("html_video_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, z10);
                }
            } else if (str.equals("audio")) {
                return new C3511jf("html_audio_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, z10);
            }
        } else if (str.equals("unknown")) {
            tn.p.j("vf", "access$getTAG$cp(...)");
            return null;
        }
        tn.p.j("vf", "access$getTAG$cp(...)");
        return null;
    }
}
