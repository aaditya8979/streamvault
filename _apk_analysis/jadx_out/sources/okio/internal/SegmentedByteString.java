package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.r;
import okio.Buffer;
import okio.ByteString;
import okio.C5352SegmentedByteString;
import okio.Segment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.q;
import tn.p;

/* JADX INFO: renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class SegmentedByteString {
    public static final int binarySearch(@NotNull int[] iArr, int i10, int i11, int i12) {
        p.k(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final void commonCopyInto(@NotNull C5352SegmentedByteString c5352SegmentedByteString, int i10, @NotNull byte[] bArr, int i11, int i12) {
        p.k(c5352SegmentedByteString, "<this>");
        p.k(bArr, TypedValues.AttributesType.S_TARGET);
        long j10 = i12;
        okio.SegmentedByteString.checkOffsetAndCount(c5352SegmentedByteString.size(), i10, j10);
        okio.SegmentedByteString.checkOffsetAndCount(bArr.length, i11, j10);
        int i13 = i12 + i10;
        int iSegment = segment(c5352SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c5352SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i15 = c5352SegmentedByteString.getDirectory$okio()[iSegment] - i14;
            int i16 = c5352SegmentedByteString.getDirectory$okio()[c5352SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = i16 + (i10 - i14);
            cn.p.g(c5352SegmentedByteString.getSegments$okio()[iSegment], bArr, i11, i17, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(@NotNull C5352SegmentedByteString c5352SegmentedByteString, @Nullable Object obj) {
        p.k(c5352SegmentedByteString, "<this>");
        if (obj == c5352SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c5352SegmentedByteString.size() && c5352SegmentedByteString.rangeEquals(0, byteString, 0, c5352SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(@NotNull C5352SegmentedByteString c5352SegmentedByteString) {
        p.k(c5352SegmentedByteString, "<this>");
        return c5352SegmentedByteString.getDirectory$okio()[c5352SegmentedByteString.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(@NotNull C5352SegmentedByteString c5352SegmentedByteString) {
        p.k(c5352SegmentedByteString, "<this>");
        int hashCode$okio = c5352SegmentedByteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = c5352SegmentedByteString.getSegments$okio().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c5352SegmentedByteString.getDirectory$okio()[length + i10];
            int i14 = c5352SegmentedByteString.getDirectory$okio()[i10];
            byte[] bArr = c5352SegmentedByteString.getSegments$okio()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        c5352SegmentedByteString.setHashCode$okio(i11);
        return i11;
    }

    public static final byte commonInternalGet(@NotNull C5352SegmentedByteString c5352SegmentedByteString, int i10) {
        p.k(c5352SegmentedByteString, "<this>");
        okio.SegmentedByteString.checkOffsetAndCount(c5352SegmentedByteString.getDirectory$okio()[c5352SegmentedByteString.getSegments$okio().length - 1], i10, 1L);
        int iSegment = segment(c5352SegmentedByteString, i10);
        return c5352SegmentedByteString.getSegments$okio()[iSegment][(i10 - (iSegment == 0 ? 0 : c5352SegmentedByteString.getDirectory$okio()[iSegment - 1])) + c5352SegmentedByteString.getDirectory$okio()[c5352SegmentedByteString.getSegments$okio().length + iSegment]];
    }

    public static final boolean commonRangeEquals(@NotNull C5352SegmentedByteString c5352SegmentedByteString, int i10, @NotNull ByteString byteString, int i11, int i12) {
        p.k(c5352SegmentedByteString, "<this>");
        p.k(byteString, "other");
        if (i10 < 0 || i10 > c5352SegmentedByteString.size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c5352SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c5352SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i15 = c5352SegmentedByteString.getDirectory$okio()[iSegment] - i14;
            int i16 = c5352SegmentedByteString.getDirectory$okio()[c5352SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!byteString.rangeEquals(i11, c5352SegmentedByteString.getSegments$okio()[iSegment], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final boolean commonRangeEquals(@NotNull C5352SegmentedByteString c5352SegmentedByteString, int i10, @NotNull byte[] bArr, int i11, int i12) {
        p.k(c5352SegmentedByteString, "<this>");
        p.k(bArr, "other");
        if (i10 < 0 || i10 > c5352SegmentedByteString.size() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c5352SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c5352SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i15 = c5352SegmentedByteString.getDirectory$okio()[iSegment] - i14;
            int i16 = c5352SegmentedByteString.getDirectory$okio()[c5352SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!okio.SegmentedByteString.arrayRangeEquals(c5352SegmentedByteString.getSegments$okio()[iSegment], i16 + (i10 - i14), bArr, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull C5352SegmentedByteString c5352SegmentedByteString, int i10, int i11) {
        p.k(c5352SegmentedByteString, "<this>");
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c5352SegmentedByteString, i11);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (!(iResolveDefaultParameter <= c5352SegmentedByteString.size())) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " > length(" + c5352SegmentedByteString.size() + ')').toString());
        }
        int i12 = iResolveDefaultParameter - i10;
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && iResolveDefaultParameter == c5352SegmentedByteString.size()) {
            return c5352SegmentedByteString;
        }
        if (i10 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c5352SegmentedByteString, i10);
        int iSegment2 = segment(c5352SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) cn.p.s(c5352SegmentedByteString.getSegments$okio(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i13 = 0;
            int i14 = iSegment;
            while (true) {
                iArr[i13] = Math.min(c5352SegmentedByteString.getDirectory$okio()[i14] - i10, i12);
                int i15 = i13 + 1;
                iArr[i13 + bArr.length] = c5352SegmentedByteString.getDirectory$okio()[c5352SegmentedByteString.getSegments$okio().length + i14];
                if (i14 == iSegment2) {
                    break;
                }
                i14++;
                i13 = i15;
            }
        }
        int i16 = iSegment != 0 ? c5352SegmentedByteString.getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new C5352SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull C5352SegmentedByteString c5352SegmentedByteString) {
        p.k(c5352SegmentedByteString, "<this>");
        byte[] bArr = new byte[c5352SegmentedByteString.size()];
        int length = c5352SegmentedByteString.getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c5352SegmentedByteString.getDirectory$okio()[length + i10];
            int i14 = c5352SegmentedByteString.getDirectory$okio()[i10];
            int i15 = i14 - i11;
            cn.p.g(c5352SegmentedByteString.getSegments$okio()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public static final void commonWrite(@NotNull C5352SegmentedByteString c5352SegmentedByteString, @NotNull Buffer buffer, int i10, int i11) {
        p.k(c5352SegmentedByteString, "<this>");
        p.k(buffer, "buffer");
        int i12 = i10 + i11;
        int iSegment = segment(c5352SegmentedByteString, i10);
        while (i10 < i12) {
            int i13 = iSegment == 0 ? 0 : c5352SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i14 = c5352SegmentedByteString.getDirectory$okio()[iSegment] - i13;
            int i15 = c5352SegmentedByteString.getDirectory$okio()[c5352SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            Segment segment = new Segment(c5352SegmentedByteString.getSegments$okio()[iSegment], i16, i16 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                p.h(segment2);
                Segment segment3 = segment2.prev;
                p.h(segment3);
                segment3.push(segment);
            }
            i10 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) i11));
    }

    private static final void forEachSegment(C5352SegmentedByteString c5352SegmentedByteString, int i10, int i11, q<? super byte[], ? super Integer, ? super Integer, r> qVar) {
        int iSegment = segment(c5352SegmentedByteString, i10);
        while (i10 < i11) {
            int i12 = iSegment == 0 ? 0 : c5352SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i13 = c5352SegmentedByteString.getDirectory$okio()[iSegment] - i12;
            int i14 = c5352SegmentedByteString.getDirectory$okio()[c5352SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i10;
            qVar.invoke(c5352SegmentedByteString.getSegments$okio()[iSegment], Integer.valueOf(i14 + (i10 - i12)), Integer.valueOf(iMin));
            i10 += iMin;
            iSegment++;
        }
    }

    public static final void forEachSegment(@NotNull C5352SegmentedByteString c5352SegmentedByteString, @NotNull q<? super byte[], ? super Integer, ? super Integer, r> qVar) {
        p.k(c5352SegmentedByteString, "<this>");
        p.k(qVar, "action");
        int length = c5352SegmentedByteString.getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = c5352SegmentedByteString.getDirectory$okio()[length + i10];
            int i13 = c5352SegmentedByteString.getDirectory$okio()[i10];
            qVar.invoke(c5352SegmentedByteString.getSegments$okio()[i10], Integer.valueOf(i12), Integer.valueOf(i13 - i11));
            i10++;
            i11 = i13;
        }
    }

    public static final int segment(@NotNull C5352SegmentedByteString c5352SegmentedByteString, int i10) {
        p.k(c5352SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c5352SegmentedByteString.getDirectory$okio(), i10 + 1, 0, c5352SegmentedByteString.getSegments$okio().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }
}
