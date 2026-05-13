package okhttp3;

import bn.h;
import bo.a0;
import bo.d0;
import cn.b0;
import cn.w;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Pair;
import ln.c;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.b;
import tn.i;
import tn.p;
import tn.x;
import un.a;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, a {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String[] namesAndValues;

    /* JADX INFO: compiled from: Headers.kt */
    public static final class Builder {

        @NotNull
        private final List<String> namesAndValues = new ArrayList(20);

        @NotNull
        public final Builder add(@NotNull String str) {
            p.k(str, "line");
            int iQ0 = d0.q0(str, ':', 0, false, 6, null);
            if (!(iQ0 != -1)) {
                throw new IllegalArgumentException(("Unexpected header: " + str).toString());
            }
            String strSubstring = str.substring(0, iQ0);
            p.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = d0.s1(strSubstring).toString();
            String strSubstring2 = str.substring(iQ0 + 1);
            p.j(strSubstring2, "this as java.lang.String).substring(startIndex)");
            add(string, strSubstring2);
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String str, @NotNull String str2) {
            p.k(str, "name");
            p.k(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder add(@NotNull String str, @NotNull Instant instant) {
            p.k(str, "name");
            p.k(instant, "value");
            add(str, new Date(instant.toEpochMilli()));
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String str, @NotNull Date date) {
            p.k(str, "name");
            p.k(date, "value");
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @NotNull
        public final Builder addAll(@NotNull Headers headers) {
            p.k(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                addLenient$okhttp(headers.name(i10), headers.value(i10));
            }
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String str) {
            p.k(str, "line");
            int iQ0 = d0.q0(str, ':', 1, false, 4, null);
            if (iQ0 != -1) {
                String strSubstring = str.substring(0, iQ0);
                p.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = str.substring(iQ0 + 1);
                p.j(strSubstring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(strSubstring, strSubstring2);
            } else if (str.charAt(0) == ':') {
                String strSubstring3 = str.substring(1);
                p.j(strSubstring3, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", strSubstring3);
            } else {
                addLenient$okhttp("", str);
            }
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String str, @NotNull String str2) {
            p.k(str, "name");
            p.k(str2, "value");
            this.namesAndValues.add(str);
            this.namesAndValues.add(d0.s1(str2).toString());
            return this;
        }

        @NotNull
        public final Builder addUnsafeNonAscii(@NotNull String str, @NotNull String str2) {
            p.k(str, "name");
            p.k(str2, "value");
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @NotNull
        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        @Nullable
        public final String get(@NotNull String str) {
            p.k(str, "name");
            int size = this.namesAndValues.size() - 2;
            int iC = c.c(size, 0, -2);
            if (iC > size) {
                return null;
            }
            while (!a0.J(str, this.namesAndValues.get(size), true)) {
                if (size == iC) {
                    return null;
                }
                size -= 2;
            }
            return this.namesAndValues.get(size + 1);
        }

        @NotNull
        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        @NotNull
        public final Builder removeAll(@NotNull String str) {
            p.k(str, "name");
            int i10 = 0;
            while (i10 < this.namesAndValues.size()) {
                if (a0.J(str, this.namesAndValues.get(i10), true)) {
                    this.namesAndValues.remove(i10);
                    this.namesAndValues.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        @NotNull
        public final Builder set(@NotNull String str, @NotNull String str2) {
            p.k(str, "name");
            p.k(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder set(@NotNull String str, @NotNull Instant instant) {
            p.k(str, "name");
            p.k(instant, "value");
            return set(str, new Date(instant.toEpochMilli()));
        }

        @NotNull
        public final Builder set(@NotNull String str, @NotNull Date date) {
            p.k(str, "name");
            p.k(date, "value");
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }
    }

    /* JADX INFO: compiled from: Headers.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (!('!' <= cCharAt && cCharAt < 127)) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void checkValue(java.lang.String r7, java.lang.String r8) {
            /*
                r6 = this;
                int r0 = r7.length()
                r1 = 0
                r2 = r1
            L6:
                if (r2 >= r0) goto L72
                char r3 = r7.charAt(r2)
                r4 = 9
                r5 = 1
                if (r3 == r4) goto L21
                r4 = 32
                if (r4 > r3) goto L1b
                r4 = 127(0x7f, float:1.78E-43)
                if (r3 >= r4) goto L1b
                r4 = r5
                goto L1c
            L1b:
                r4 = r1
            L1c:
                if (r4 == 0) goto L1f
                goto L21
            L1f:
                r4 = r1
                goto L22
            L21:
                r4 = r5
            L22:
                if (r4 != 0) goto L6f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r4[r5] = r1
                r1 = 2
                r4[r1] = r8
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r1 = okhttp3.internal.Util.format(r1, r4)
                r0.append(r1)
                boolean r8 = okhttp3.internal.Util.isSensitiveHeader(r8)
                if (r8 == 0) goto L4d
                java.lang.String r7 = ""
                goto L5e
            L4d:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r1 = ": "
                r8.append(r1)
                r8.append(r7)
                java.lang.String r7 = r8.toString()
            L5e:
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r7 = r7.toString()
                r8.<init>(r7)
                throw r8
            L6f:
                int r2 = r2 + 1
                goto L6
            L72:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Headers.Companion.checkValue(java.lang.String, java.lang.String):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iC = c.c(length, 0, -2);
            if (iC > length) {
                return null;
            }
            while (!a0.J(str, strArr[length], true)) {
                if (length == iC) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        @NotNull
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m7595deprecated_of(@NotNull Map<String, String> map) {
            p.k(map, "headers");
            return of(map);
        }

        @NotNull
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m7596deprecated_of(@NotNull String... strArr) {
            p.k(strArr, "namesAndValues");
            return of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @NotNull
        public final Headers of(@NotNull Map<String, String> map) {
            p.k(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = d0.s1(key).toString();
                String string2 = d0.s1(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new Headers(strArr, null);
        }

        @NotNull
        public final Headers of(@NotNull String... strArr) {
            p.k(strArr, "namesAndValues");
            int i10 = 0;
            if (!(strArr.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr2[i11];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr2[i11] = d0.s1(str).toString();
            }
            int iC = c.c(0, strArr2.length - 1, 2);
            if (iC >= 0) {
                while (true) {
                    String str2 = strArr2[i10];
                    String str3 = strArr2[i10 + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i10 == iC) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new Headers(strArr2, null);
        }
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public /* synthetic */ Headers(String[] strArr, i iVar) {
        this(strArr);
    }

    @NotNull
    public static final Headers of(@NotNull Map<String, String> map) {
        return Companion.of(map);
    }

    @NotNull
    public static final Headers of(@NotNull String... strArr) {
        return Companion.of(strArr);
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m7594deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i10 = 0; i10 < length2; i10++) {
            length += (long) this.namesAndValues[i10].length();
        }
        return length;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    @Nullable
    public final String get(@NotNull String str) {
        p.k(str, "name");
        return Companion.get(this.namesAndValues, str);
    }

    @Nullable
    public final Date getDate(@NotNull String str) {
        p.k(str, "name");
        String str2 = get(str);
        if (str2 != null) {
            return DatesKt.toHttpDateOrNull(str2);
        }
        return null;
    }

    @IgnoreJRERequirement
    @Nullable
    public final Instant getInstant(@NotNull String str) {
        p.k(str, "name");
        Date date = getDate(str);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = h.a(name(i10), value(i10));
        }
        return b.a(pairArr);
    }

    @NotNull
    public final String name(int i10) {
        return this.namesAndValues[i10 * 2];
    }

    @NotNull
    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(a0.L(x.f85368a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(name(i10));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        p.j(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        b0.G(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @NotNull
    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(a0.L(x.f85368a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = name(i10);
            Locale locale = Locale.US;
            p.j(locale, "US");
            String lowerCase = strName.toLowerCase(locale);
            p.j(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i10));
        }
        return treeMap;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = name(i10);
            String strValue = value(i10);
            sb2.append(strName);
            sb2.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb2.append(strValue);
            sb2.append("\n");
        }
        String string = sb2.toString();
        p.j(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public final String value(int i10) {
        return this.namesAndValues[(i10 * 2) + 1];
    }

    @NotNull
    public final List<String> values(@NotNull String str) {
        p.k(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (a0.J(str, name(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i10));
            }
        }
        if (arrayList == null) {
            return w.m();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        p.j(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }
}
