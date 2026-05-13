package com.moloco.sdk.acm.eventprocessing;

import com.moloco.sdk.b1;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e f45790a;

    /* JADX INFO: renamed from: com.moloco.sdk.acm.eventprocessing.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0553a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45791a;

        static {
            int[] iArr = new int[com.moloco.sdk.acm.db.c.values().length];
            try {
                iArr[com.moloco.sdk.acm.db.c.f45755b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.acm.db.c.f45754a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f45791a = iArr;
        }
    }

    public a(@NotNull e eVar) {
        p.k(eVar, "dataAgeChecker");
        this.f45790a = eVar;
    }

    @NotNull
    public com.moloco.sdk.acm.http.i a(@NotNull List<com.moloco.sdk.acm.db.b> list) {
        p.k(list, "events");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.moloco.sdk.acm.db.b bVar : list) {
            if (!this.f45790a.a(bVar)) {
                int i10 = C0553a.f45791a[bVar.b().ordinal()];
                if (i10 == 1) {
                    b1.b.a aVarA = b1.b.g().c(bVar.d()).a(bVar.e());
                    Long lA = bVar.a();
                    if (lA != null) {
                        aVarA.b((int) lA.longValue());
                    }
                    b1.b bVarBuild = aVarA.build();
                    p.j(bVarBuild, "build(...)");
                    arrayList2.add(bVarBuild);
                } else {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b1.c.a aVarA2 = b1.c.g().c(bVar.d()).a(bVar.e());
                    Long lA2 = bVar.a();
                    if (lA2 != null) {
                        aVarA2.b(lA2.longValue());
                    }
                    b1.c cVarBuild = aVarA2.build();
                    p.j(cVarBuild, "build(...)");
                    arrayList.add(cVarBuild);
                }
            }
        }
        return new com.moloco.sdk.acm.http.i(arrayList2, arrayList);
    }
}
