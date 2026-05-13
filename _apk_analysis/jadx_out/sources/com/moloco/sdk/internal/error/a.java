package com.moloco.sdk.internal.error;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f46015a;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public a(@Nullable String str) {
        this.f46015a = str;
    }

    public /* synthetic */ a(String str, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    @Nullable
    public final String a() {
        return this.f46015a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && p.f(this.f46015a, ((a) obj).f46015a);
    }

    public int hashCode() {
        String str = this.f46015a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "ErrorMetadata(mtid=" + this.f46015a + ')';
    }
}
