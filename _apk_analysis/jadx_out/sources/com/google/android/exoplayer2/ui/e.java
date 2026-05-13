package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: compiled from: DefaultTrackNameProvider.java */
/* JADX INFO: loaded from: classes5.dex */
public class e implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f22741a;

    public e(Resources resources) {
        this.f22741a = (Resources) s7.a.e(resources);
    }

    public static int i(com.google.android.exoplayer2.m mVar) {
        int i10 = s7.u.i(mVar.f21751m);
        if (i10 != -1) {
            return i10;
        }
        if (s7.u.k(mVar.f21748j) != null) {
            return 2;
        }
        if (s7.u.b(mVar.f21748j) != null) {
            return 1;
        }
        if (mVar.f21756r == -1 && mVar.f21757s == -1) {
            return (mVar.f21764z == -1 && mVar.A == -1) ? -1 : 1;
        }
        return 2;
    }

    @Override // com.google.android.exoplayer2.ui.m0
    public String a(com.google.android.exoplayer2.m mVar) {
        int i10 = i(mVar);
        String strJ = i10 == 2 ? j(h(mVar), g(mVar), c(mVar)) : i10 == 1 ? j(e(mVar), b(mVar), c(mVar)) : e(mVar);
        return strJ.length() == 0 ? this.f22741a.getString(R$string.exo_track_unknown) : strJ;
    }

    public final String b(com.google.android.exoplayer2.m mVar) {
        int i10 = mVar.f21764z;
        return (i10 == -1 || i10 < 1) ? "" : i10 != 1 ? i10 != 2 ? (i10 == 6 || i10 == 7) ? this.f22741a.getString(R$string.exo_track_surround_5_point_1) : i10 != 8 ? this.f22741a.getString(R$string.exo_track_surround) : this.f22741a.getString(R$string.exo_track_surround_7_point_1) : this.f22741a.getString(R$string.exo_track_stereo) : this.f22741a.getString(R$string.exo_track_mono);
    }

    public final String c(com.google.android.exoplayer2.m mVar) {
        int i10 = mVar.f21747i;
        return i10 == -1 ? "" : this.f22741a.getString(R$string.exo_track_bitrate, Float.valueOf(i10 / 1000000.0f));
    }

    public final String d(com.google.android.exoplayer2.m mVar) {
        return TextUtils.isEmpty(mVar.f21741c) ? "" : mVar.f21741c;
    }

    public final String e(com.google.android.exoplayer2.m mVar) {
        String strJ = j(f(mVar), h(mVar));
        return TextUtils.isEmpty(strJ) ? d(mVar) : strJ;
    }

    public final String f(com.google.android.exoplayer2.m mVar) {
        String str = mVar.f21742d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = s7.m0.f79487a >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale localeL = s7.m0.L();
        String displayName = localeForLanguageTag.getDisplayName(localeL);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeL) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    public final String g(com.google.android.exoplayer2.m mVar) {
        int i10 = mVar.f21756r;
        int i11 = mVar.f21757s;
        return (i10 == -1 || i11 == -1) ? "" : this.f22741a.getString(R$string.exo_track_resolution, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public final String h(com.google.android.exoplayer2.m mVar) {
        String string = (mVar.f21744f & 2) != 0 ? this.f22741a.getString(R$string.exo_track_role_alternate) : "";
        if ((mVar.f21744f & 4) != 0) {
            string = j(string, this.f22741a.getString(R$string.exo_track_role_supplementary));
        }
        if ((mVar.f21744f & 8) != 0) {
            string = j(string, this.f22741a.getString(R$string.exo_track_role_commentary));
        }
        return (mVar.f21744f & 1088) != 0 ? j(string, this.f22741a.getString(R$string.exo_track_role_closed_captions)) : string;
    }

    public final String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f22741a.getString(R$string.exo_item_list, string, str);
            }
        }
        return string;
    }
}
