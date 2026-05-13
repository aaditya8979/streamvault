package r5;

import a6.k0;
import a6.m;
import a6.t;
import android.graphics.PointF;
import android.text.Layout;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n5.e;
import r5.c;

/* JADX INFO: compiled from: SsaDecoder.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends n5.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f78640t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f78641o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final b f78642p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Map<String, c> f78643q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f78644r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f78645s;

    public a(@Nullable List<byte[]> list) {
        super("SsaDecoder");
        this.f78644r = -3.4028235E38f;
        this.f78645s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f78641o = false;
            this.f78642p = null;
            return;
        }
        this.f78641o = true;
        String strZ = k0.z(list.get(0));
        a6.a.a(strZ.startsWith("Format:"));
        this.f78642p = (b) a6.a.e(b.a(strZ));
        C(new t(list.get(1)));
    }

    public static Map<String, c> E(t tVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strL = tVar.l();
            if (strL == null || (tVar.a() != 0 && tVar.f() == 91)) {
                break;
            }
            if (strL.startsWith("Format:")) {
                aVarA = c.a.a(strL);
            } else if (strL.startsWith("Style:")) {
                if (aVarA == null) {
                    m.h("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + strL);
                } else {
                    c cVarB = c.b(strL, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f78651a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static long F(String str) {
        Matcher matcher = f78640t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) k0.i(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) k0.i(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) k0.i(matcher.group(3))) * 1000000) + (Long.parseLong((String) k0.i(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    public static int G(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                m.h("SsaDecoder", "Unknown alignment: " + i10);
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
                m.h("SsaDecoder", "Unknown alignment: " + i10);
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
                m.h("SsaDecoder", "Unknown alignment: " + i10);
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

    public static int x(long j10, List<Long> list, List<List<n5.b>> list2) {
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

    public static n5.b z(String str, @Nullable c cVar, c.b bVar, float f10, float f11) {
        float fY;
        float fY2;
        int i10 = bVar.f78660a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f78652b : -1;
        }
        int iH = H(i10);
        int iG = G(i10);
        PointF pointF = bVar.f78661b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            fY = y(iH);
            fY2 = y(iG);
        } else {
            float f12 = pointF.x / f10;
            fY2 = pointF.y / f11;
            fY = f12;
        }
        return new n5.b(str, I(i10), fY2, 0, iG, fY, iH, -3.4028235E38f);
    }

    public final void A(String str, b bVar, List<List<n5.b>> list, List<Long> list2) {
        int i10;
        a6.a.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(StringUtils.COMMA, bVar.f78650e);
        if (strArrSplit.length != bVar.f78650e) {
            m.h("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jF = F(strArrSplit[bVar.f78646a]);
        if (jF == -9223372036854775807L) {
            m.h("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        long jF2 = F(strArrSplit[bVar.f78647b]);
        if (jF2 == -9223372036854775807L) {
            m.h("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        Map<String, c> map = this.f78643q;
        c cVar = (map == null || (i10 = bVar.f78648c) == -1) ? null : map.get(strArrSplit[i10].trim());
        String str2 = strArrSplit[bVar.f78649d];
        n5.b bVarZ = z(c.b.d(str2).replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n"), cVar, c.b.b(str2), this.f78644r, this.f78645s);
        int iX = x(jF2, list2, list);
        for (int iX2 = x(jF, list2, list); iX2 < iX; iX2++) {
            list.get(iX2).add(bVarZ);
        }
    }

    public final void B(t tVar, List<List<n5.b>> list, List<Long> list2) {
        b bVarA = this.f78641o ? this.f78642p : null;
        while (true) {
            String strL = tVar.l();
            if (strL == null) {
                return;
            }
            if (strL.startsWith("Format:")) {
                bVarA = b.a(strL);
            } else if (strL.startsWith("Dialogue:")) {
                if (bVarA == null) {
                    m.h("SsaDecoder", "Skipping dialogue line before complete format: " + strL);
                } else {
                    A(strL, bVarA, list, list2);
                }
            }
        }
    }

    public final void C(t tVar) {
        while (true) {
            String strL = tVar.l();
            if (strL == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strL)) {
                D(tVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strL)) {
                this.f78643q = E(tVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(strL)) {
                m.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strL)) {
                return;
            }
        }
    }

    public final void D(t tVar) {
        while (true) {
            String strL = tVar.l();
            if (strL == null) {
                return;
            }
            if (tVar.a() != 0 && tVar.f() == 91) {
                return;
            }
            String[] strArrSplit = strL.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            if (strArrSplit.length == 2) {
                String strK0 = k0.K0(strArrSplit[0].trim());
                strK0.hashCode();
                if (strK0.equals("playresx")) {
                    this.f78644r = Float.parseFloat(strArrSplit[1].trim());
                } else if (strK0.equals("playresy")) {
                    try {
                        this.f78645s = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    @Override // n5.c
    public e v(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        t tVar = new t(bArr, i10);
        if (!this.f78641o) {
            C(tVar);
        }
        B(tVar, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }
}
