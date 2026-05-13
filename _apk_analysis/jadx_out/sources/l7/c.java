package l7;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.common.primitives.Ints;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s7.m0;
import s7.q;

/* JADX INFO: compiled from: SsaStyle.java */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    @ColorInt
    public final Integer f73720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    @ColorInt
    public final Integer f73721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f73722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f73723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f73724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f73725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f73726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f73727j;

    /* JADX INFO: compiled from: SsaStyle.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f73730c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f73731d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f73732e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f73733f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f73734g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f73735h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f73736i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f73737j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f73738k;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f73728a = i10;
            this.f73729b = i11;
            this.f73730c = i12;
            this.f73731d = i13;
            this.f73732e = i14;
            this.f73733f = i15;
            this.f73734g = i16;
            this.f73735h = i17;
            this.f73736i = i18;
            this.f73737j = i19;
            this.f73738k = i20;
        }

        @Nullable
        public static a a(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), StringUtils.COMMA);
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            for (int i20 = 0; i20 < strArrSplit.length; i20++) {
                String strE = y7.a.e(strArrSplit[i20].trim());
                strE.hashCode();
                switch (strE) {
                    case "italic":
                        i16 = i20;
                        break;
                    case "underline":
                        i17 = i20;
                        break;
                    case "strikeout":
                        i18 = i20;
                        break;
                    case "primarycolour":
                        i12 = i20;
                        break;
                    case "bold":
                        i15 = i20;
                        break;
                    case "name":
                        i10 = i20;
                        break;
                    case "fontsize":
                        i14 = i20;
                        break;
                    case "borderstyle":
                        i19 = i20;
                        break;
                    case "alignment":
                        i11 = i20;
                        break;
                    case "outlinecolour":
                        i13 = i20;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, strArrSplit.length);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: SsaStyle.java */
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Pattern f73739c = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Pattern f73740d = Pattern.compile(m0.z("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Pattern f73741e = Pattern.compile(m0.z("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Pattern f73742f = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final PointF f73744b;

        public b(int i10, @Nullable PointF pointF) {
            this.f73743a = i10;
            this.f73744b = pointF;
        }

        public static int a(String str) {
            Matcher matcher = f73742f.matcher(str);
            if (matcher.find()) {
                return c.e((String) s7.a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f73739c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) s7.a.e(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i10 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        @Nullable
        public static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f73740d.matcher(str);
            Matcher matcher2 = f73741e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    q.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) s7.a.e(strGroup)).trim()), Float.parseFloat(((String) s7.a.e(strGroup2)).trim()));
        }

        public static String d(String str) {
            return f73739c.matcher(str).replaceAll("");
        }
    }

    public c(String str, int i10, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f73718a = str;
        this.f73719b = i10;
        this.f73720c = num;
        this.f73721d = num2;
        this.f73722e = f10;
        this.f73723f = z10;
        this.f73724g = z11;
        this.f73725h = z12;
        this.f73726i = z13;
        this.f73727j = i11;
    }

    @Nullable
    public static c b(String str, a aVar) {
        s7.a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), StringUtils.COMMA);
        int length = strArrSplit.length;
        int i10 = aVar.f73738k;
        if (length != i10) {
            q.i("SsaStyle", m0.z("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f73728a].trim();
            int i11 = aVar.f73729b;
            int iE = i11 != -1 ? e(strArrSplit[i11].trim()) : -1;
            int i12 = aVar.f73730c;
            Integer numH = i12 != -1 ? h(strArrSplit[i12].trim()) : null;
            int i13 = aVar.f73731d;
            Integer numH2 = i13 != -1 ? h(strArrSplit[i13].trim()) : null;
            int i14 = aVar.f73732e;
            float fI = i14 != -1 ? i(strArrSplit[i14].trim()) : -3.4028235E38f;
            int i15 = aVar.f73733f;
            boolean z10 = i15 != -1 && f(strArrSplit[i15].trim());
            int i16 = aVar.f73734g;
            boolean z11 = i16 != -1 && f(strArrSplit[i16].trim());
            int i17 = aVar.f73735h;
            boolean z12 = i17 != -1 && f(strArrSplit[i17].trim());
            int i18 = aVar.f73736i;
            boolean z13 = i18 != -1 && f(strArrSplit[i18].trim());
            int i19 = aVar.f73737j;
            return new c(strTrim, iE, numH, numH2, fI, z10, z11, z12, z13, i19 != -1 ? g(strArrSplit[i19].trim()) : -1);
        } catch (RuntimeException e10) {
            q.j("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    public static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static boolean d(int i10) {
        return i10 == 1 || i10 == 3;
    }

    public static int e(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (c(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        q.i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    public static boolean f(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            q.j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static int g(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (d(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        q.i("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    @Nullable
    @ColorInt
    public static Integer h(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            s7.a.a(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.d(((j10 >> 24) & 255) ^ 255), Ints.d(j10 & 255), Ints.d((j10 >> 8) & 255), Ints.d((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            q.j("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    public static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            q.j("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}
