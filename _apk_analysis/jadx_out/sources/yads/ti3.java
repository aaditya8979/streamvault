package yads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ti3 {
    public static int a() {
        Integer num;
        Object obj = dw2.f89000j;
        dw2 dw2VarA = cw2.a();
        synchronized (dw2.f89000j) {
            num = dw2VarA.f89009h;
        }
        if (num != null) {
            return zn.n.n(num.intValue(), 1, 4);
        }
        return 4;
    }
}
