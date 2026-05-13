package m7;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import g7.h;
import g7.i;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s7.a0;
import s7.q;
import s7.r;

/* JADX INFO: compiled from: SubripDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f74003q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f74004r = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final StringBuilder f74005o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList<String> f74006p;

    public a() {
        super("SubripDecoder");
        this.f74005o = new StringBuilder();
        this.f74006p = new ArrayList<>();
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
        long j10 = (strGroup != null ? Long.parseLong(strGroup) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) s7.a.e(matcher.group(i10 + 2))) * 60 * 1000) + (Long.parseLong((String) s7.a.e(matcher.group(i10 + 3))) * 1000);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    public final String A(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f74004r.matcher(strTrim);
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

    @Override // g7.h
    public i w(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        r rVar = new r();
        a0 a0Var = new a0(bArr, i10);
        while (true) {
            String strP = a0Var.p();
            int i11 = 0;
            if (strP == null) {
                break;
            }
            if (strP.length() != 0) {
                try {
                    Integer.parseInt(strP);
                    String strP2 = a0Var.p();
                    if (strP2 == null) {
                        q.i("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f74003q.matcher(strP2);
                    if (matcher.matches()) {
                        rVar.a(z(matcher, 1));
                        rVar.a(z(matcher, 6));
                        this.f74005o.setLength(0);
                        this.f74006p.clear();
                        for (String strP3 = a0Var.p(); !TextUtils.isEmpty(strP3); strP3 = a0Var.p()) {
                            if (this.f74005o.length() > 0) {
                                this.f74005o.append("<br>");
                            }
                            this.f74005o.append(A(strP3, this.f74006p));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f74005o.toString());
                        String str = null;
                        while (true) {
                            if (i11 >= this.f74006p.size()) {
                                break;
                            }
                            String str2 = this.f74006p.get(i11);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                str = str2;
                                break;
                            }
                            i11++;
                        }
                        arrayList.add(x(spannedFromHtml, str));
                        arrayList.add(g7.b.f62135s);
                    } else {
                        q.i("SubripDecoder", "Skipping invalid timing: " + strP2);
                    }
                } catch (NumberFormatException unused) {
                    q.i("SubripDecoder", "Skipping invalid index: " + strP);
                }
            }
        }
        return new b((g7.b[]) arrayList.toArray(new g7.b[0]), rVar.d());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g7.b x(android.text.Spanned r17, @androidx.annotation.Nullable java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.a.x(android.text.Spanned, java.lang.String):g7.b");
    }
}
