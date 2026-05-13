package sg.bigo.ads.common.u.c;

import androidx.annotation.Nullable;
import com.ironsource.Z7;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f82447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f82448b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f82449c;

    private b() {
    }

    @Nullable
    public static b a(String str) {
        b bVar = null;
        if (q.a((CharSequence) str)) {
            return null;
        }
        int iIndexOf = str.indexOf(Z7.f30794r);
        int iIndexOf2 = str.indexOf("-");
        int iIndexOf3 = str.indexOf("/");
        if (iIndexOf >= 0 && iIndexOf3 >= 0 && iIndexOf < iIndexOf3) {
            bVar = new b();
            if (iIndexOf2 > iIndexOf && iIndexOf2 < iIndexOf3) {
                try {
                    bVar.f82447a = Long.parseLong(str.substring(iIndexOf + 1, iIndexOf2));
                    bVar.f82449c = Long.parseLong(str.substring(iIndexOf2 + 1, iIndexOf3));
                } catch (Exception unused) {
                }
            }
            String strSubstring = str.substring(iIndexOf3 + 1);
            if (!"*".equals(strSubstring)) {
                bVar.f82448b = Long.parseLong(strSubstring);
            }
        }
        return bVar;
    }
}
