package a1;

import android.text.TextUtils;
import z0.m;

/* JADX INFO: compiled from: Md5FileNameGenerator.java */
/* JADX INFO: loaded from: classes11.dex */
public class f implements c {
    @Override // a1.c
    public String a(String str) {
        String strB = b(str);
        String strD = m.d(str);
        if (TextUtils.isEmpty(strB)) {
            return strD;
        }
        return strD + "." + strB;
    }

    public final String b(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return (iLastIndexOf == -1 || iLastIndexOf <= str.lastIndexOf(47) || (iLastIndexOf + 2) + 4 <= str.length()) ? "" : str.substring(iLastIndexOf + 1, str.length());
    }
}
