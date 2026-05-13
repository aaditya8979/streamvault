package t5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: TtmlNode.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f84995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f84996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f84997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f84998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f84999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final e f85000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String[] f85001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f85002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f85003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap<String, Integer> f85004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap<String, Integer> f85005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<b> f85006l;

    public b(@Nullable String str, @Nullable String str2, long j10, long j11, @Nullable e eVar, @Nullable String[] strArr, String str3, @Nullable String str4) {
        this.f84995a = str;
        this.f84996b = str2;
        this.f85003i = str4;
        this.f85000f = eVar;
        this.f85001g = strArr;
        this.f84997c = str2 != null;
        this.f84998d = j10;
        this.f84999e = j11;
        this.f85002h = (String) a6.a.e(str3);
        this.f85004j = new HashMap<>();
        this.f85005k = new HashMap<>();
    }

    public static b c(@Nullable String str, long j10, long j11, @Nullable e eVar, @Nullable String[] strArr, String str2, @Nullable String str3) {
        return new b(str, null, j10, j11, eVar, strArr, str2, str3);
    }

    public static b d(String str) {
        return new b(null, d.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null);
    }

    public static SpannableStringBuilder k(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    public void a(b bVar) {
        if (this.f85006l == null) {
            this.f85006l = new ArrayList();
        }
        this.f85006l.add(bVar);
    }

    public final void b(Map<String, e> map, SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        e eVarD = d.d(this.f85000f, this.f85001g, map);
        if (eVarD != null) {
            d.a(spannableStringBuilder, i10, i11, eVarD);
        }
    }

    public final SpannableStringBuilder e(SpannableStringBuilder spannableStringBuilder) {
        int i10;
        int i11;
        int length = spannableStringBuilder.length();
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (spannableStringBuilder.charAt(i13) == ' ') {
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i15) == ' ') {
                    i15++;
                }
                int i16 = i15 - i14;
                if (i16 > 0) {
                    spannableStringBuilder.delete(i13, i13 + i16);
                    length -= i16;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        int i17 = 0;
        while (true) {
            i10 = length - 1;
            if (i17 >= i10) {
                break;
            }
            if (spannableStringBuilder.charAt(i17) == '\n') {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i18) == ' ') {
                    spannableStringBuilder.delete(i18, i17 + 2);
                    length--;
                }
            }
            i17++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i10) == ' ') {
            spannableStringBuilder.delete(i10, length);
            length--;
        }
        while (true) {
            i11 = length - 1;
            if (i12 >= i11) {
                break;
            }
            if (spannableStringBuilder.charAt(i12) == ' ') {
                int i19 = i12 + 1;
                if (spannableStringBuilder.charAt(i19) == '\n') {
                    spannableStringBuilder.delete(i12, i19);
                    length--;
                }
            }
            i12++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i11) == '\n') {
            spannableStringBuilder.delete(i11, length);
        }
        return spannableStringBuilder;
    }

    public b f(int i10) {
        List<b> list = this.f85006l;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<b> list = this.f85006l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<n5.b> h(long j10, Map<String, e> map, Map<String, c> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        m(j10, this.f85002h, arrayList);
        TreeMap treeMap = new TreeMap();
        o(j10, false, this.f85002h, treeMap);
        n(j10, map, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                c cVar = map2.get(pair.first);
                arrayList2.add(new n5.b(bitmapDecodeByteArray, cVar.f85008b, 0, cVar.f85009c, cVar.f85011e, cVar.f85012f, cVar.f85013g));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            c cVar2 = map2.get(entry.getKey());
            arrayList2.add(new n5.b(e((SpannableStringBuilder) entry.getValue()), (Layout.Alignment) null, cVar2.f85009c, cVar2.f85010d, cVar2.f85011e, cVar2.f85008b, Integer.MIN_VALUE, cVar2.f85012f, cVar2.f85014h, cVar2.f85015i));
        }
        return arrayList2;
    }

    public final void i(TreeSet<Long> treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f84995a);
        boolean zEquals2 = "div".equals(this.f84995a);
        if (z10 || zEquals || (zEquals2 && this.f85003i != null)) {
            long j10 = this.f84998d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f84999e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f85006l == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f85006l.size(); i10++) {
            this.f85006l.get(i10).i(treeSet, z10 || zEquals);
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

    public boolean l(long j10) {
        long j11 = this.f84998d;
        return (j11 == -9223372036854775807L && this.f84999e == -9223372036854775807L) || (j11 <= j10 && this.f84999e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f84999e) || (j11 <= j10 && j10 < this.f84999e));
    }

    public final void m(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f85002h)) {
            str = this.f85002h;
        }
        if (l(j10) && "div".equals(this.f84995a) && this.f85003i != null) {
            list.add(new Pair<>(str, this.f85003i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).m(j10, str, list);
        }
    }

    public final void n(long j10, Map<String, e> map, Map<String, SpannableStringBuilder> map2) {
        int iIntValue;
        if (l(j10)) {
            Iterator<Map.Entry<String, Integer>> it = this.f85005k.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                iIntValue = this.f85004j.containsKey(key) ? this.f85004j.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    b(map, map2.get(key), iIntValue, iIntValue2);
                }
            }
            while (iIntValue < g()) {
                f(iIntValue).n(j10, map, map2);
                iIntValue++;
            }
        }
    }

    public final void o(long j10, boolean z10, String str, Map<String, SpannableStringBuilder> map) {
        this.f85004j.clear();
        this.f85005k.clear();
        if ("metadata".equals(this.f84995a)) {
            return;
        }
        if (!"".equals(this.f85002h)) {
            str = this.f85002h;
        }
        if (this.f84997c && z10) {
            k(str, map).append((CharSequence) this.f84996b);
            return;
        }
        if ("br".equals(this.f84995a) && z10) {
            k(str, map).append('\n');
            return;
        }
        if (l(j10)) {
            for (Map.Entry<String, SpannableStringBuilder> entry : map.entrySet()) {
                this.f85004j.put(entry.getKey(), Integer.valueOf(entry.getValue().length()));
            }
            boolean zEquals = "p".equals(this.f84995a);
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).o(j10, z10 || zEquals, str, map);
            }
            if (zEquals) {
                d.c(k(str, map));
            }
            for (Map.Entry<String, SpannableStringBuilder> entry2 : map.entrySet()) {
                this.f85005k.put(entry2.getKey(), Integer.valueOf(entry2.getValue().length()));
            }
        }
    }
}
