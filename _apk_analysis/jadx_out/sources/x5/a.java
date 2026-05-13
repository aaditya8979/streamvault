package x5;

import a6.k0;
import a6.p;
import android.content.res.Resources;
import android.text.TextUtils;
import chuangyuan.ycj.videolibrary.R$string;
import com.google.android.exoplayer.Format;
import java.util.Locale;

/* JADX INFO: compiled from: DefaultTrackNameProvider.java */
/* JADX INFO: loaded from: classes11.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f86789a;

    public a(Resources resources) {
        this.f86789a = (Resources) a6.a.e(resources);
    }

    public static int i(Format format) {
        int iH = p.h(format.f19927j);
        if (iH != -1) {
            return iH;
        }
        if (p.k(format.f19924g) != null) {
            return 2;
        }
        if (p.b(format.f19924g) != null) {
            return 1;
        }
        if (format.f19932o == -1 && format.f19933p == -1) {
            return (format.f19940w == -1 && format.f19941x == -1) ? -1 : 1;
        }
        return 2;
    }

    @Override // x5.d
    public String a(Format format) {
        int i10 = i(format);
        String strJ = i10 == 2 ? j(h(format), g(format), c(format)) : i10 == 1 ? j(e(format), b(format), c(format)) : e(format);
        return strJ.length() == 0 ? this.f86789a.getString(R$string.exo_track_unknown) : strJ;
    }

    public final String b(Format format) {
        int i10 = format.f19940w;
        return (i10 == -1 || i10 < 1) ? "" : i10 != 1 ? i10 != 2 ? (i10 == 6 || i10 == 7) ? this.f86789a.getString(R$string.exo_track_surround_5_point_1) : i10 != 8 ? this.f86789a.getString(R$string.exo_track_surround) : this.f86789a.getString(R$string.exo_track_surround_7_point_1) : this.f86789a.getString(R$string.exo_track_stereo) : this.f86789a.getString(R$string.exo_track_mono);
    }

    public final String c(Format format) {
        int i10 = format.f19923f;
        return i10 == -1 ? "" : this.f86789a.getString(R$string.exo_track_bitrate, Float.valueOf(i10 / 1000000.0f));
    }

    public final String d(Format format) {
        return TextUtils.isEmpty(format.f19920c) ? "" : format.f19920c;
    }

    public final String e(Format format) {
        String strJ = j(f(format), h(format));
        return TextUtils.isEmpty(strJ) ? d(format) : strJ;
    }

    public final String f(Format format) {
        String str = format.B;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        return (k0.f3574a >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayName();
    }

    public final String g(Format format) {
        int i10 = format.f19932o;
        int i11 = format.f19933p;
        return (i10 == -1 || i11 == -1) ? "" : this.f86789a.getString(R$string.exo_track_resolution, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public final String h(Format format) {
        String string = (format.f19922e & 2) != 0 ? this.f86789a.getString(R$string.exo_track_role_alternate) : "";
        if ((format.f19922e & 4) != 0) {
            string = j(string, this.f86789a.getString(R$string.exo_track_role_supplementary));
        }
        if ((format.f19922e & 8) != 0) {
            string = j(string, this.f86789a.getString(R$string.exo_track_role_commentary));
        }
        return (format.f19922e & 1088) != 0 ? j(string, this.f86789a.getString(R$string.exo_track_role_closed_captions)) : string;
    }

    public final String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f86789a.getString(R$string.exo_item_list, string, str);
            }
        }
        return string;
    }
}
