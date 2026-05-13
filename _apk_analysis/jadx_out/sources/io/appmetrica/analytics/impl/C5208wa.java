package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5208wa extends D2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5133ta f67893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5133ta f67894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5183va f67895d;

    public C5208wa(int i10, int i11, int i12) {
        this(i10, new C5133ta(i11), new C5133ta(i12));
    }

    public C5208wa(int i10, @NonNull C5133ta c5133ta, @NonNull C5133ta c5133ta2) {
        super(i10);
        this.f67895d = new C5183va();
        this.f67893b = c5133ta;
        this.f67894c = c5133ta2;
    }

    @Override // io.appmetrica.analytics.impl.D2, io.appmetrica.analytics.impl.InterfaceC5158ua
    @NonNull
    public final Nn a(@Nullable Map<String, String> map) {
        HashMap map2;
        int bytesTruncated;
        int i10 = 0;
        if (map != null) {
            map2 = new HashMap();
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) setEntrySet.toArray(new Map.Entry[setEntrySet.size()]);
            Arrays.sort(entryArr, this.f67895d);
            int length = entryArr.length;
            bytesTruncated = 0;
            int i11 = 0;
            boolean z10 = false;
            int i12 = 0;
            while (i10 < length) {
                Map.Entry entry = entryArr[i10];
                Nn nnA = this.f67893b.a((String) entry.getKey());
                Nn nnA2 = this.f67894c.a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) nnA2.f65673a) + StringUtils.getUtf8BytesLength((String) nnA.f65673a);
                if (z10 || utf8BytesLength2 + i12 > this.f65144a) {
                    i11++;
                    bytesTruncated += utf8BytesLength;
                    z10 = true;
                } else {
                    bytesTruncated = nnA2.f65674b.getBytesTruncated() + nnA.f65674b.getBytesTruncated() + bytesTruncated;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) nnA2.f65673a) + StringUtils.getUtf8BytesLength((String) nnA.f65673a) + i12;
                    map2.put((String) nnA.f65673a, (String) nnA2.f65673a);
                    i12 = utf8BytesLength3;
                }
                i10++;
            }
            i10 = i11;
        } else {
            map2 = null;
            bytesTruncated = 0;
        }
        return new Nn(map2, new C5003o4(i10, bytesTruncated));
    }
}
