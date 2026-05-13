package n7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import g7.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: TtmlNode.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f75208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f75209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f75210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f75211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f75212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final g f75213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String[] f75214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f75215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f75216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final d f75217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap<String, Integer> f75218k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap<String, Integer> f75219l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<d> f75220m;

    public d(@Nullable String str, @Nullable String str2, long j10, long j11, @Nullable g gVar, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable d dVar) {
        this.f75208a = str;
        this.f75209b = str2;
        this.f75216i = str4;
        this.f75213f = gVar;
        this.f75214g = strArr;
        this.f75210c = str2 != null;
        this.f75211d = j10;
        this.f75212e = j11;
        this.f75215h = (String) s7.a.e(str3);
        this.f75217j = dVar;
        this.f75218k = new HashMap<>();
        this.f75219l = new HashMap<>();
    }

    public static d c(@Nullable String str, long j10, long j11, @Nullable g gVar, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable d dVar) {
        return new d(str, null, j10, j11, gVar, strArr, str2, str3, dVar);
    }

    public static d d(String str) {
        return new d(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public static SpannableStringBuilder k(String str, Map<String, b.C0768b> map) {
        if (!map.containsKey(str)) {
            b.C0768b c0768b = new b.C0768b();
            c0768b.o(new SpannableStringBuilder());
            map.put(str, c0768b);
        }
        return (SpannableStringBuilder) s7.a.e(map.get(str).e());
    }

    public void a(d dVar) {
        if (this.f75220m == null) {
            this.f75220m = new ArrayList();
        }
        this.f75220m.add(dVar);
    }

    public final void b(Map<String, g> map, b.C0768b c0768b, int i10, int i11, int i12) {
        g gVarF = f.f(this.f75213f, this.f75214g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0768b.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c0768b.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i10, i11, gVarF, this.f75217j, map, i12);
            if ("p".equals(this.f75208a)) {
                if (gVarF.k() != Float.MAX_VALUE) {
                    c0768b.m((gVarF.k() * (-90.0f)) / 100.0f);
                }
                if (gVarF.m() != null) {
                    c0768b.p(gVarF.m());
                }
                if (gVarF.h() != null) {
                    c0768b.j(gVarF.h());
                }
            }
        }
    }

    public d f(int i10) {
        List<d> list = this.f75220m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<d> list = this.f75220m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<g7.b> h(long j10, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j10, this.f75215h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f75215h, treeMap);
        o(j10, map, map2, this.f75215h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) s7.a.e(map2.get(pair.first));
                arrayList2.add(new b.C0768b().f(bitmapDecodeByteArray).k(eVar.f75222b).l(0).h(eVar.f75223c, 0).i(eVar.f75225e).n(eVar.f75226f).g(eVar.f75227g).r(eVar.f75230j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) s7.a.e(map2.get(entry.getKey()));
            b.C0768b c0768b = (b.C0768b) entry.getValue();
            e((SpannableStringBuilder) s7.a.e(c0768b.e()));
            c0768b.h(eVar2.f75223c, eVar2.f75224d);
            c0768b.i(eVar2.f75225e);
            c0768b.k(eVar2.f75222b);
            c0768b.n(eVar2.f75226f);
            c0768b.q(eVar2.f75229i, eVar2.f75228h);
            c0768b.r(eVar2.f75230j);
            arrayList2.add(c0768b.a());
        }
        return arrayList2;
    }

    public final void i(TreeSet<Long> treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f75208a);
        boolean zEquals2 = "div".equals(this.f75208a);
        if (z10 || zEquals || (zEquals2 && this.f75216i != null)) {
            long j10 = this.f75211d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f75212e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f75220m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f75220m.size(); i10++) {
            this.f75220m.get(i10).i(treeSet, z10 || zEquals);
        }
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    @Nullable
    public String[] l() {
        return this.f75214g;
    }

    public boolean m(long j10) {
        long j11 = this.f75211d;
        return (j11 == -9223372036854775807L && this.f75212e == -9223372036854775807L) || (j11 <= j10 && this.f75212e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f75212e) || (j11 <= j10 && j10 < this.f75212e));
    }

    public final void n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f75215h)) {
            str = this.f75215h;
        }
        if (m(j10) && "div".equals(this.f75208a) && this.f75216i != null) {
            list.add(new Pair<>(str, this.f75216i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    public final void o(long j10, Map<String, g> map, Map<String, e> map2, String str, Map<String, b.C0768b> map3) {
        int i10;
        if (m(j10)) {
            String str2 = "".equals(this.f75215h) ? str : this.f75215h;
            Iterator<Map.Entry<String, Integer>> it = this.f75219l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f75218k.containsKey(key) ? this.f75218k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (b.C0768b) s7.a.e(map3.get(key)), iIntValue, iIntValue2, ((e) s7.a.e(map2.get(str2))).f75230j);
                }
            }
            while (i10 < g()) {
                f(i10).o(j10, map, map2, str2, map3);
                i10++;
            }
        }
    }

    public final void p(long j10, boolean z10, String str, Map<String, b.C0768b> map) {
        this.f75218k.clear();
        this.f75219l.clear();
        if ("metadata".equals(this.f75208a)) {
            return;
        }
        if (!"".equals(this.f75215h)) {
            str = this.f75215h;
        }
        if (this.f75210c && z10) {
            k(str, map).append((CharSequence) s7.a.e(this.f75209b));
            return;
        }
        if ("br".equals(this.f75208a) && z10) {
            k(str, map).append('\n');
            return;
        }
        if (m(j10)) {
            for (Map.Entry<String, b.C0768b> entry : map.entrySet()) {
                this.f75218k.put(entry.getKey(), Integer.valueOf(((CharSequence) s7.a.e(entry.getValue().e())).length()));
            }
            boolean zEquals = "p".equals(this.f75208a);
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).p(j10, z10 || zEquals, str, map);
            }
            if (zEquals) {
                f.c(k(str, map));
            }
            for (Map.Entry<String, b.C0768b> entry2 : map.entrySet()) {
                this.f75219l.put(entry2.getKey(), Integer.valueOf(((CharSequence) s7.a.e(entry2.getValue().e())).length()));
            }
        }
    }
}
