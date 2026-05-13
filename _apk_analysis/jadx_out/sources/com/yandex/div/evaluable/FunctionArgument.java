package com.yandex.div.evaluable;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: FunctionArgument.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class FunctionArgument {
    private final boolean isVariadic;

    @NotNull
    private final EvaluableType type;

    public FunctionArgument(@NotNull EvaluableType evaluableType, boolean z10) {
        p.k(evaluableType, "type");
        this.type = evaluableType;
        this.isVariadic = z10;
    }

    public /* synthetic */ FunctionArgument(EvaluableType evaluableType, boolean z10, int i10, i iVar) {
        this(evaluableType, (i10 & 2) != 0 ? false : z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunctionArgument)) {
            return false;
        }
        FunctionArgument functionArgument = (FunctionArgument) obj;
        return this.type == functionArgument.type && this.isVariadic == functionArgument.isVariadic;
    }

    @NotNull
    public final EvaluableType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        boolean z10 = this.isVariadic;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final boolean isVariadic() {
        return this.isVariadic;
    }

    @NotNull
    public String toString() {
        return "FunctionArgument(type=" + this.type + ", isVariadic=" + this.isVariadic + ')';
    }
}
