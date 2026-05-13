package s5;

import a6.m;
import a6.n;
import a6.t;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n5.c;
import n5.e;

/* JADX INFO: compiled from: SubripDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f79070q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f79071r = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final StringBuilder f79072o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList<String> f79073p;

    public a() {
        super("SubripDecoder");
        this.f79072o = new StringBuilder();
        this.f79073p = new ArrayList<>();
    }

    public static float y(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    public static long z(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (strGroup != null ? Long.parseLong(strGroup) * 60 * 60 * 1000 : 0L) + (Long.parseLong(matcher.group(i10 + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i10 + 3)) * 1000);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    public final String A(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f79071r.matcher(strTrim);
        int i10 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i10;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    @Override // n5.c
    public e v(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        n nVar = new n();
        t tVar = new t(bArr, i10);
        while (true) {
            String strL = tVar.l();
            if (strL == null) {
                break;
            }
            if (strL.length() != 0) {
                try {
                    Integer.parseInt(strL);
                    String strL2 = tVar.l();
                    if (strL2 == null) {
                        m.h("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f79070q.matcher(strL2);
                    if (matcher.matches()) {
                        nVar.a(z(matcher, 1));
                        nVar.a(z(matcher, 6));
                        int i11 = 0;
                        this.f79072o.setLength(0);
                        this.f79073p.clear();
                        for (String strL3 = tVar.l(); !TextUtils.isEmpty(strL3); strL3 = tVar.l()) {
                            if (this.f79072o.length() > 0) {
                                this.f79072o.append("<br>");
                            }
                            this.f79072o.append(A(strL3, this.f79073p));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f79072o.toString());
                        String str = null;
                        while (true) {
                            if (i11 >= this.f79073p.size()) {
                                break;
                            }
                            String str2 = this.f79073p.get(i11);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                str = str2;
                                break;
                            }
                            i11++;
                        }
                        arrayList.add(x(spannedFromHtml, str));
                        arrayList.add(n5.b.f75125p);
                    } else {
                        m.h("SubripDecoder", "Skipping invalid timing: " + strL2);
                    }
                } catch (NumberFormatException unused) {
                    m.h("SubripDecoder", "Skipping invalid index: " + strL);
                }
            }
        }
        n5.b[] bVarArr = new n5.b[arrayList.size()];
        arrayList.toArray(bVarArr);
        return new b(bVarArr, nVar.d());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n5.b x(android.text.Spanned r19, @androidx.annotation.Nullable java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.a.x(android.text.Spanned, java.lang.String):n5.b");
    }
}
