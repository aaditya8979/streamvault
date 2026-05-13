package io.ktor.http.cio;

import ao.i;
import ao.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpHeadersMap.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HeadersData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public List<int[]> f71182a = new ArrayList();

    public final int b() {
        return this.f71182a.size();
    }

    public final int c(int i10) {
        return this.f71182a.get(i10 / 768)[i10 % 768];
    }

    @NotNull
    public final i<Integer> d() {
        return l.b(new HeadersData$headersStarts$1(this, null));
    }

    public final void e(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f71182a.add((int[]) hl.b.f63518a.E());
        }
    }

    public final void f() {
        Iterator<int[]> it = this.f71182a.iterator();
        while (it.hasNext()) {
            hl.b.f63518a.r(it.next());
        }
        this.f71182a.clear();
    }

    public final void g(int i10, int i11) {
        this.f71182a.get(i10 / 768)[i10 % 768] = i11;
    }
}
