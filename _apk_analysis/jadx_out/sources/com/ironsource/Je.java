package com.ironsource;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f29691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final List<String> f29692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29693c;

    public Je(@Nullable String str, @Nullable List<String> list, boolean z10) {
        this.f29691a = str;
        this.f29692b = list;
        this.f29693c = z10;
    }

    public /* synthetic */ Je(String str, List list, boolean z10, int i10, tn.i iVar) {
        this(str, list, (i10 & 4) != 0 ? false : z10);
    }

    public final boolean a() {
        if (this.f29693c) {
            List<String> list = this.f29692b;
            if (list != null && !list.isEmpty()) {
                for (String str : list) {
                    String str2 = this.f29691a;
                    if (str2 != null && bo.a0.W(str2, str, false, 2, null)) {
                        return true;
                    }
                }
            }
        } else {
            List<String> list2 = this.f29692b;
            if (list2 != null && !list2.isEmpty()) {
                for (String str3 : list2) {
                    String str4 = this.f29691a;
                    if (str4 != null && bo.d0.c0(str4, str3, false, 2, null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    public final String b() {
        return this.f29691a;
    }
}
