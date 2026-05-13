package com.inmobi.media;

import com.ironsource.C4157n2;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Pm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Pm[] f26144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kn.a f26145c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26146a;

    static {
        Pm[] pmArr = {new Pm("SHOW_VIDEO", 0, C4157n2.f33013v), new Pm("HIDE_VIDEO", 1, "hide"), new Pm("PLAY_VIDEO", 2, CampaignEx.JSON_NATIVE_VIDEO_RESUME), new Pm("PAUSE_VIDEO", 3, CampaignEx.JSON_NATIVE_VIDEO_PAUSE), new Pm("MUTE_VIDEO", 4, CampaignEx.JSON_NATIVE_VIDEO_MUTE), new Pm("UNMUTE_VIDEO", 5, CampaignEx.JSON_NATIVE_VIDEO_UNMUTE), new Pm("SKIP_VIDEO", 6, "skip")};
        f26144b = pmArr;
        f26145c = kotlin.enums.a.a(pmArr);
    }

    public Pm(String str, int i10, String str2) {
        this.f26146a = str2;
    }

    public static Pm valueOf(String str) {
        return (Pm) Enum.valueOf(Pm.class, str);
    }

    public static Pm[] values() {
        return (Pm[]) f26144b.clone();
    }
}
