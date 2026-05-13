package y7;

/* JADX INFO: compiled from: CharMatcher.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements m<Character> {

    /* JADX INFO: compiled from: CharMatcher.java */
    public static abstract class a extends b {
        @Override // y7.m
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.b(ch2);
        }
    }

    /* JADX INFO: renamed from: y7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class C1106b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final char f87332b;

        public C1106b(char c10) {
            this.f87332b = c10;
        }

        @Override // y7.b
        public boolean e(char c10) {
            return c10 == this.f87332b;
        }

        public String toString() {
            return "CharMatcher.is('" + b.g(this.f87332b) + "')";
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static abstract class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87333b;

        public c(String str) {
            this.f87333b = (String) l.m(str);
        }

        public final String toString() {
            return this.f87333b;
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class d extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f87334c = new d();

        public d() {
            super("CharMatcher.none()");
        }

        @Override // y7.b
        public int c(CharSequence charSequence, int i10) {
            l.o(i10, charSequence.length());
            return -1;
        }

        @Override // y7.b
        public boolean e(char c10) {
            return false;
        }
    }

    public static b d(char c10) {
        return new C1106b(c10);
    }

    public static b f() {
        return d.f87334c;
    }

    public static String g(char c10) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public boolean b(Character ch2) {
        return e(ch2.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        l.o(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}
