package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3122nS implements C7H {
    public static byte[] A05;
    public InterfaceC1749Dn A00;
    public final int A01;
    public final long A02;
    public final Context A03;
    public final C9U A04;

    static {
        A01();
    }

    public C3122nS(Context context) {
        this(context, 0);
    }

    public C3122nS(Context context, int i10) {
        this(context, null, i10, 5000L);
    }

    @Deprecated
    public C3122nS(Context context, C9U c9u, int i10, long j10) {
        this.A00 = new C3123nT(this);
        this.A03 = context;
        this.A01 = i10;
        this.A02 = j10;
        this.A04 = c9u;
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-77, -44, -43, -48, -28, -37, -29, -63, -44, -35, -45, -44, ExifInterface.MARKER_APP1, -44, ExifInterface.MARKER_APP1, -30, -75, -48, -46, -29, -34, ExifInterface.MARKER_APP1, -24, -95, -50, -50, -53, -50, 124, -59, -54, -49, -48, -67, -54, -48, -59, -67, -48, -59, -54, -61, 124, -94, -94, -55, -52, -63, -61, 124, -63, -44, -48, -63, -54, -49, -59, -53, -54, -70, -25, -25, -28, -25, -107, -34, -29, -24, -23, -42, -29, -23, -34, -42, -23, -34, -29, -36, -107, -69, -63, -74, -72, -107, -38, -19, -23, -38, -29, -24, -34, -28, -29, -12, 33, 33, 30, 33, -49, 24, 29, 34, 35, 16, 29, 35, 24, 16, 35, 24, 29, 22, -49, -2, 31, 36, 34, -49, 20, 39, 35, 20, 29, 34, 24, 30, 29, 6, 51, 51, 48, 51, ExifInterface.MARKER_APP1, ExifInterface.START_CODE, 47, 52, 53, 34, 47, 53, ExifInterface.START_CODE, 34, 53, ExifInterface.START_CODE, 47, 40, ExifInterface.MARKER_APP1, 23, 17, -6, ExifInterface.MARKER_APP1, 38, 57, 53, 38, 47, 52, ExifInterface.START_CODE, 48, 47, 16, 51, 37, 40, 41, 40, -28, 10, ExifInterface.START_CODE, 49, 52, 41, 43, 5, 57, 40, 45, 51, 22, 41, 50, 40, 41, 54, 41, 54, -14, 14, 49, 35, 38, 39, 38, -30, 14, 43, 36, 40, 46, 35, 37, 3, 55, 38, 43, 49, 20, 39, 48, 38, 39, 52, 39, 52, -16, 6, 41, 27, 30, 31, 30, -38, 6, 35, 28, 41, ExifInterface.START_CODE, 47, 45, -5, 47, 30, 35, 41, 12, 31, 40, 30, 31, 44, 31, 44, -24, 4, 39, 25, 28, 29, 28, -40, 4, 33, 26, 46, 40, 48, 14, 33, 28, 29, 39, 10, 29, 38, 28, 29, ExifInterface.START_CODE, 29, ExifInterface.START_CODE, -26, -7, 5, 3, -60, -4, -9, -7, -5, -8, 5, 5, 1, -60, -9, -6, 9, -60, -9, 4, -6, 8, 5, -1, -6, 14, -60, 3, -5, -6, -1, -9, -55, -60, -5, 14, 5, 6, 2, -9, 15, -5, 8, -60, -5, 14, 10, -60, -4, -4, 3, 6, -5, -3, -60, -36, -4, 3, 6, -5, -3, -41, 11, -6, -1, 5, -24, -5, 4, -6, -5, 8, -5, 8, 27, 39, 37, -26, 30, 25, 27, 29, 26, 39, 39, 35, -26, 25, 28, 43, -26, 25, 38, 28, ExifInterface.START_CODE, 39, 33, 28, 48, -26, 37, 29, 28, 33, 25, -21, -26, 29, 48, 39, 40, 36, 25, 49, 29, ExifInterface.START_CODE, -26, 29, 48, 44, -26, 30, 36, 25, 27, -26, 4, 33, 26, 30, 36, 25, 27, -7, 45, 28, 33, 39, 10, 29, 38, 28, 29, ExifInterface.START_CODE, 29, ExifInterface.START_CODE, -56, -44, -46, -109, -53, -58, -56, -54, -57, -44, -44, -48, -109, -58, -55, -40, -109, -58, -45, -55, -41, -44, -50, -55, -35, -109, -46, -54, -55, -50, -58, -104, -109, -54, -35, -44, -43, -47, -58, -34, -54, -41, -109, -54, -35, ExifInterface.MARKER_EOI, -109, -44, -43, -38, -40, -109, -79, -50, -57, -44, -43, -38, -40, -90, -38, -55, -50, -44, -73, -54, -45, -55, -54, -41, -54, -41, 35, 47, 45, -18, 38, 33, 35, 37, 34, 47, 47, 43, -18, 33, 36, 51, -18, 33, 46, 36, 50, 47, 41, 36, 56, -18, 45, 37, 36, 41, 33, -13, -18, 37, 56, 47, 48, 44, 33, 57, 37, 50, -18, 37, 56, 52, -18, 54, 48, -7, -18, 12, 41, 34, 54, 48, 56, 22, 41, 36, 37, 47, 18, 37, 46, 36, 37, 50, 37, 50};
    }

    private final void A02(Context context, C9U c9u, long j10, Handler handler, InterfaceC1802Fo interfaceC1802Fo, int i10, ArrayList<InterfaceC3116nM> arrayList) {
        Class<?> cls;
        Class<?> cls2;
        arrayList.add(new C0O(context, C2801hv.A0S, new MediaCodecRendererMetaParameters(null, false), InterfaceC1678Ar.A00, j10, c9u, false, false, handler, interfaceC1802Fo, 50, 5, 0, 0, 0));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                cls = Class.forName(A00(487, 70, 110));
                cls2 = Integer.TYPE;
            } catch (Exception e10) {
                e = e10;
            }
            try {
                arrayList.add(size, (InterfaceC3116nM) cls.getConstructor(Boolean.TYPE, Long.TYPE, Handler.class, InterfaceC1802Fo.class, cls2, cls2).newInstance(true, Long.valueOf(j10), handler, interfaceC1802Fo, 50, 5));
                Log.i(A00(0, 23, 29), A00(243, 27, 102));
            } catch (Exception e11) {
                e = e11;
                throw new RuntimeException(A00(127, 33, 111), e);
            }
        } catch (ClassNotFoundException unused) {
        }
    }

    private final void A03(Context context, C9U c9u, AnonymousClass38[] anonymousClass38Arr, Handler handler, C8D c8d, int i10, ArrayList<InterfaceC3116nM> arrayList) {
        int i11;
        int i12;
        String strA00 = A00(0, 23, 29);
        arrayList.add(new C0Q(context, C2801hv.A0S, new MediaCodecRendererMetaParameters(null, false), InterfaceC1678Ar.A00, c9u, false, false, false, handler, c8d, C16117p.A02(context), anonymousClass38Arr));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            i11 = size + 1;
            try {
                arrayList.add(size, (InterfaceC3116nM) Class.forName(A00(TTAdConstant.VIDEO_COVER_URL_CODE, 72, 19)).getConstructor(Handler.class, C8D.class, AnonymousClass38[].class).newInstance(handler, c8d, anonymousClass38Arr));
                Log.i(strA00, A00(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 28, 104));
            } catch (ClassNotFoundException unused) {
                size = i11;
                i11 = size;
            } catch (Exception e10) {
                e = e10;
                throw new RuntimeException(A00(93, 34, 93), e);
            }
        } catch (ClassNotFoundException unused2) {
        } catch (Exception e11) {
            e = e11;
        }
        try {
            i12 = i11 + 1;
        } catch (ClassNotFoundException unused3) {
        } catch (Exception e12) {
            e = e12;
        }
        try {
            arrayList.add(i11, (InterfaceC3116nM) Class.forName(A00(343, 72, 102)).getConstructor(Handler.class, C8D.class, AnonymousClass38[].class).newInstance(handler, c8d, anonymousClass38Arr));
            Log.i(strA00, A00(187, 28, 112));
        } catch (ClassNotFoundException unused4) {
            i11 = i12;
            i12 = i11;
        } catch (Exception e13) {
            e = e13;
            throw new RuntimeException(A00(59, 34, 35), e);
        }
        try {
            try {
            } catch (Exception e14) {
                e = e14;
            }
            try {
                arrayList.add(i12, (InterfaceC3116nM) Class.forName(A00(270, 73, 68)).getConstructor(Handler.class, C8D.class, AnonymousClass38[].class).newInstance(handler, c8d, anonymousClass38Arr));
                Log.i(strA00, A00(160, 27, 114));
            } catch (Exception e15) {
                e = e15;
                throw new RuntimeException(A00(23, 36, 10), e);
            }
        } catch (ClassNotFoundException unused5) {
        }
    }

    private final void A04(Context context, B3 b32, Looper looper, int i10, ArrayList<InterfaceC3116nM> arrayList) {
        arrayList.add(new AnonymousClass13(b32, looper));
    }

    private final void A05(Context context, InterfaceC1752Dq interfaceC1752Dq, Looper looper, int i10, ArrayList<InterfaceC3116nM> arrayList) {
        arrayList.add(new C14410z(interfaceC1752Dq, looper, this.A00));
    }

    private final AnonymousClass38[] A06() {
        return new AnonymousClass38[0];
    }

    @Override // com.facebook.ads.redexgen.core.C7H
    public final InterfaceC3116nM[] A5Q(Handler handler, InterfaceC1802Fo interfaceC1802Fo, C8D c8d, InterfaceC1752Dq interfaceC1752Dq, B3 b32, C9U c9u) {
        C9U c9u2 = c9u;
        if (c9u2 == null) {
            c9u2 = this.A04;
        }
        ArrayList<InterfaceC3116nM> arrayList = new ArrayList<>();
        A02(this.A03, c9u2, this.A02, handler, interfaceC1802Fo, this.A01, arrayList);
        A03(this.A03, c9u2, A06(), handler, c8d, this.A01, arrayList);
        A05(this.A03, interfaceC1752Dq, handler.getLooper(), this.A01, arrayList);
        A04(this.A03, b32, handler.getLooper(), this.A01, arrayList);
        return (InterfaceC3116nM[]) arrayList.toArray(new InterfaceC3116nM[arrayList.size()]);
    }
}
