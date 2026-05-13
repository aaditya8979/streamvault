package yads;

import androidx.core.net.MailTo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ab3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final za3 f87637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ab3 f87638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ab3 f87639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ab3 f87640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ab3 f87641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ab3[] f87642h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87643b;

    static {
        ab3 ab3Var = new ab3(0, "SMS_SCHEME", "sms:");
        ab3 ab3Var2 = new ab3(1, "MAIL_SCHEME", MailTo.MAILTO_SCHEME);
        ab3 ab3Var3 = new ab3(2, "VOICE_MAIL_SCHEME", "voicemail:");
        ab3 ab3Var4 = new ab3(3, "TEL_SCHEME", "tel:");
        ab3 ab3Var5 = new ab3(4, "CALLTO", "callto:");
        ab3 ab3Var6 = new ab3(5, "FAX", "fax:");
        ab3 ab3Var7 = new ab3(6, "GEO_SCHEME", "geo:");
        ab3 ab3Var8 = new ab3(7, "MAP_SCHEME", "map:");
        ab3 ab3Var9 = new ab3(8, "MAPS_SCHEME", "maps:");
        ab3 ab3Var10 = new ab3(9, "GOOGLE_MARKET_SCHEME", "market:");
        f87638d = ab3Var10;
        ab3 ab3Var11 = new ab3(10, "GOOGLE_PLAY_SCHEME", "play:");
        f87639e = ab3Var11;
        ab3 ab3Var12 = new ab3(11, "GOOGLE_STREET_VIEW_SCHEME", "google.streetview:");
        ab3 ab3Var13 = new ab3(12, "GOOGLE_MARKET_HOST", "market.android");
        f87640f = ab3Var13;
        ab3 ab3Var14 = new ab3(13, "GOOGLE_PLAY_HOST", "play.google");
        f87641g = ab3Var14;
        ab3[] ab3VarArr = {ab3Var, ab3Var2, ab3Var3, ab3Var4, ab3Var5, ab3Var6, ab3Var7, ab3Var8, ab3Var9, ab3Var10, ab3Var11, ab3Var12, ab3Var13, ab3Var14, new ab3(14, "MAP_HOST", "map"), new ab3(15, "MAPS_HOST", "maps"), new ab3(16, "MOBMAPS", "mobile.maps"), new ab3(17, "SHORTMOBMAPS", "m.maps"), new ab3(18, "MESSAGE", "message:"), new ab3(19, "SIP", "sip:"), new ab3(20, "SKYPE", "skype:"), new ab3(21, "SMS", "sms:"), new ab3(22, "GTALK", "gtalk:"), new ab3(23, "SPOTIFY", "spotify:"), new ab3(24, "LASTFM", "lastfm:")};
        f87642h = ab3VarArr;
        kotlin.enums.a.a(ab3VarArr);
        f87637c = new za3();
    }

    public ab3(int i10, String str, String str2) {
        this.f87643b = str2;
    }

    public static ab3 valueOf(String str) {
        return (ab3) Enum.valueOf(ab3.class, str);
    }

    public static ab3[] values() {
        return (ab3[]) f87642h.clone();
    }
}
