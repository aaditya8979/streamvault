package yads;

import yads.u30;
import yads.yr;

/* JADX INFO: loaded from: classes2.dex */
public interface yr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yr f97274a = new yr() { // from class: bt.uc
        @Override // yads.yr
        public final String a(u30 u30Var) {
            return yr.b(u30Var);
        }
    };

    static /* synthetic */ String b(u30 u30Var) {
        String str = u30Var.f95529h;
        return str != null ? str : u30Var.f95522a.toString();
    }

    String a(u30 u30Var);
}
