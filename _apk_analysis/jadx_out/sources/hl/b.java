package hl;

import com.ironsource.C4157n2;
import io.ktor.http.cio.HeadersData;
import java.io.IOException;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import tn.p;
import wl.d;

/* JADX INFO: compiled from: HttpHeadersMap.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d<int[]> f63518a = new C0780b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final d<HeadersData> f63519b = new a();

    /* JADX INFO: compiled from: HttpHeadersMap.kt */
    public static final class a extends d<HeadersData> {
        public a() {
            super(1000);
        }

        @Override // wl.d
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public HeadersData a(HeadersData headersData) {
            p.k(headersData, C4157n2.f33007p);
            headersData.f();
            return (HeadersData) super.a(headersData);
        }

        @Override // wl.d
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public HeadersData h() {
            return new HeadersData();
        }
    }

    /* JADX INFO: renamed from: hl.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpHeadersMap.kt */
    public static final class C0780b extends d<int[]> {
        public C0780b() {
            super(1000);
        }

        @Override // wl.d
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public int[] a(int[] iArr) {
            p.k(iArr, C4157n2.f33007p);
            cn.p.x(iArr, -1, 0, 0, 6, null);
            return (int[]) super.a(iArr);
        }

        @Override // wl.d
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int[] h() {
            int[] iArr = new int[768];
            for (int i10 = 0; i10 < 768; i10++) {
                iArr[i10] = -1;
            }
            return iArr;
        }
    }

    public static final void c(@NotNull hl.a aVar, @NotNull String str, @NotNull Appendable appendable) throws IOException {
        p.k(aVar, "<this>");
        p.k(str, "indent");
        p.k(appendable, "out");
        Iterator<Integer> it = aVar.d().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            appendable.append(str);
            appendable.append(aVar.c(iIntValue));
            appendable.append(" => ");
            appendable.append(aVar.i(iIntValue));
            appendable.append("\n");
        }
    }
}
