package vq;

/* JADX INFO: compiled from: AbstractLogger.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements c {
    public static boolean j(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isWhitespace(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // vq.c
    public final c a(String str) {
        if (j(str)) {
            return this;
        }
        String name = getName();
        if (!j(name) && b.e() != this) {
            str = name + "." + str;
        }
        c cVar = b.c().get(str);
        if (cVar != null) {
            return cVar;
        }
        c cVarK = k(str);
        c cVarPutIfAbsent = b.d().putIfAbsent(str, cVarK);
        return cVarPutIfAbsent == null ? cVarK : cVarPutIfAbsent;
    }

    public abstract c k(String str);
}
