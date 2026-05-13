package v5;

import a6.k0;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v5.e;

/* JADX INFO: compiled from: WebvttSubtitle.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements n5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<e> f85921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f85923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f85924e;

    public i(List<e> list) {
        this.f85921b = list;
        int size = list.size();
        this.f85922c = size;
        this.f85923d = new long[size * 2];
        for (int i10 = 0; i10 < this.f85922c; i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f85923d;
            jArr[i11] = eVar.f85893q;
            jArr[i11 + 1] = eVar.f85894r;
        }
        long[] jArr2 = this.f85923d;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f85924e = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // n5.e
    public List<n5.b> getCues(long j10) {
        ArrayList arrayList = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = null;
        e eVar = null;
        for (int i10 = 0; i10 < this.f85922c; i10++) {
            long[] jArr = this.f85923d;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar2 = this.f85921b.get(i10);
                if (!eVar2.a()) {
                    arrayList.add(eVar2);
                } else if (eVar == null) {
                    eVar = eVar2;
                } else if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) a6.a.e(eVar.f75126b)).append((CharSequence) "\n").append((CharSequence) a6.a.e(eVar2.f75126b));
                } else {
                    spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) a6.a.e(eVar2.f75126b));
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new e.b().o(spannableStringBuilder).a());
        } else if (eVar != null) {
            arrayList.add(eVar);
        }
        return arrayList;
    }

    @Override // n5.e
    public long getEventTime(int i10) {
        a6.a.a(i10 >= 0);
        a6.a.a(i10 < this.f85924e.length);
        return this.f85924e[i10];
    }

    @Override // n5.e
    public int getEventTimeCount() {
        return this.f85924e.length;
    }

    @Override // n5.e
    public int getNextEventTimeIndex(long j10) {
        int iE = k0.e(this.f85924e, j10, false, false);
        if (iE < this.f85924e.length) {
            return iE;
        }
        return -1;
    }
}
