package l7;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import g7.b;
import g7.h;
import g7.i;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l7.c;
import s7.a0;
import s7.m0;
import s7.q;

/* JADX INFO: compiled from: SsaDecoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f73707t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f73708o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final b f73709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Map<String, c> f73710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f73711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f73712s;

    public a(@Nullable List<byte[]> list) {
        super("SsaDecoder");
        this.f73711r = -3.4028235E38f;
        this.f73712s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f73708o = false;
            this.f73709p = null;
            return;
        }
        this.f73708o = true;
        String strA = m0.A(list.get(0));
        s7.a.a(strA.startsWith("Format:"));
        this.f73709p = (b) s7.a.e(b.a(strA));
        C(new a0(list.get(1)));
    }

    public static Map<String, c> E(a0 a0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strP = a0Var.p();
            if (strP == null || (a0Var.a() != 0 && a0Var.h() == 91)) {
                break;
            }
            if (strP.startsWith("Format:")) {
                aVarA = c.a.a(strP);
            } else if (strP.startsWith("Style:")) {
                if (aVarA == null) {
                    q.i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + strP);
                } else {
                    c cVarB = c.b(strP, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f73718a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static long F(String str) {
        Matcher matcher = f73707t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) m0.j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) m0.j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) m0.j(matcher.group(3))) * 1000000) + (Long.parseLong((String) m0.j(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    public static int G(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                q.i("SsaDecoder", "Unknown alignment: " + i10);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public static int H(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                q.i("SsaDecoder", "Unknown alignment: " + i10);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    @Nullable
    public static Layout.Alignment I(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                q.i("SsaDecoder", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    public static int x(long j10, List<Long> list, List<List<g7.b>> list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (list.get(size).longValue() == j10) {
                return size;
            }
            if (list.get(size).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList(list2.get(i10 - 1)));
        return i10;
    }

    public static float y(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public static g7.b z(String str, @Nullable c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        b.C0768b c0768bO = new b.C0768b().o(spannableString);
        if (cVar != null) {
            if (cVar.f73720c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f73720c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f73727j == 3 && cVar.f73721d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f73721d.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f73722e;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                c0768bO.q(f12 / f11, 1);
            }
            boolean z10 = cVar.f73723f;
            if (z10 && cVar.f73724g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f73724g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f73725h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f73726i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f73743a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f73719b : -1;
        }
        c0768bO.p(I(i10)).l(H(i10)).i(G(i10));
        PointF pointF = bVar.f73744b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            c0768bO.k(y(c0768bO.d()));
            c0768bO.h(y(c0768bO.c()), 0);
        } else {
            c0768bO.k(pointF.x / f10);
            c0768bO.h(bVar.f73744b.y / f11, 0);
        }
        return c0768bO.a();
    }

    public final void A(String str, b bVar, List<List<g7.b>> list, List<Long> list2) {
        int i10;
        s7.a.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(StringUtils.COMMA, bVar.f73717e);
        if (strArrSplit.length != bVar.f73717e) {
            q.i("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jF = F(strArrSplit[bVar.f73713a]);
        if (jF == -9223372036854775807L) {
            q.i("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        long jF2 = F(strArrSplit[bVar.f73714b]);
        if (jF2 == -9223372036854775807L) {
            q.i("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        Map<String, c> map = this.f73710q;
        c cVar = (map == null || (i10 = bVar.f73715c) == -1) ? null : map.get(strArrSplit[i10].trim());
        String str2 = strArrSplit[bVar.f73716d];
        g7.b bVarZ = z(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f73711r, this.f73712s);
        int iX = x(jF2, list2, list);
        for (int iX2 = x(jF, list2, list); iX2 < iX; iX2++) {
            list.get(iX2).add(bVarZ);
        }
    }

    public final void B(a0 a0Var, List<List<g7.b>> list, List<Long> list2) {
        b bVarA = this.f73708o ? this.f73709p : null;
        while (true) {
            String strP = a0Var.p();
            if (strP == null) {
                return;
            }
            if (strP.startsWith("Format:")) {
                bVarA = b.a(strP);
            } else if (strP.startsWith("Dialogue:")) {
                if (bVarA == null) {
                    q.i("SsaDecoder", "Skipping dialogue line before complete format: " + strP);
                } else {
                    A(strP, bVarA, list, list2);
                }
            }
        }
    }

    public final void C(a0 a0Var) {
        while (true) {
            String strP = a0Var.p();
            if (strP == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strP)) {
                D(a0Var);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strP)) {
                this.f73710q = E(a0Var);
            } else if ("[V4 Styles]".equalsIgnoreCase(strP)) {
                q.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strP)) {
                return;
            }
        }
    }

    public final void D(a0 a0Var) {
        while (true) {
            String strP = a0Var.p();
            if (strP == null) {
                return;
            }
            if (a0Var.a() != 0 && a0Var.h() == 91) {
                return;
            }
            String[] strArrSplit = strP.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            if (strArrSplit.length == 2) {
                String strE = y7.a.e(strArrSplit[0].trim());
                strE.hashCode();
                if (strE.equals("playresx")) {
                    this.f73711r = Float.parseFloat(strArrSplit[1].trim());
                } else if (strE.equals("playresy")) {
                    try {
                        this.f73712s = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    @Override // g7.h
    public i w(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a0 a0Var = new a0(bArr, i10);
        if (!this.f73708o) {
            C(a0Var);
        }
        B(a0Var, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }
}
