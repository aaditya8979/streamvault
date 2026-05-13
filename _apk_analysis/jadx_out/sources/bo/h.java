package bo;

/* JADX INFO: compiled from: HexFormat.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final boolean b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (tn.p.m(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
