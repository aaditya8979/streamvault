package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class yt extends xt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f97290b;

    public yt(char c10) {
        this.f97290b = c10;
    }

    @Override // yads.xt
    public final boolean a(char c10) {
        return c10 == this.f97290b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CharMatcher.is('");
        char c10 = this.f97290b;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }
}
