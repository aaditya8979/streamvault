package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import tn.m;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: Lambda.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Lambda<R> implements m<R>, Serializable {
    private final int arity;

    public Lambda(int i10) {
        this.arity = i10;
    }

    @Override // tn.m
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String strJ = t.j(this);
        p.j(strJ, "renderLambdaToString(...)");
        return strJ;
    }
}
