package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5038pe implements InterfaceC4700c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5137te f67520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4901k3 f67521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5133ta f67522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Kf f67523d;

    public C5038pe() {
        this(new C5137te(), new C4901k3(), new C5133ta(100), new Kf());
    }

    public C5038pe(C5137te c5137te, C4901k3 c4901k3, C5133ta c5133ta, Kf kf2) {
        this.f67520a = c5137te;
        this.f67521b = c4901k3;
        this.f67522c = c5133ta;
        this.f67523d = kf2;
    }

    @NonNull
    public final C5013oe a(@NonNull List<Ei> list) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ei> fromModel(@NonNull C5013oe c5013oe) {
        Ei eiFromModel;
        C5181v8 c5181v8 = new C5181v8();
        c5181v8.f67822a = c5013oe.f67450a;
        c5181v8.f67827f = new C4906k8();
        C5063qe c5063qe = c5013oe.f67451b;
        C4855i8 c4855i8 = new C4855i8();
        c4855i8.f66969a = StringUtils.getUTF8Bytes(c5063qe.f67580a);
        Nn nnA = this.f67522c.a(c5063qe.f67581b);
        c4855i8.f66970b = StringUtils.getUTF8Bytes((String) nnA.f65673a);
        c4855i8.f66973e = c5063qe.f67582c.size();
        Map<String, String> map = c5063qe.f67583d;
        if (map != null) {
            eiFromModel = this.f67520a.fromModel(map);
            c4855i8.f66971c = (C4957m8) eiFromModel.f65200a;
        } else {
            eiFromModel = null;
        }
        c5181v8.f67827f.f67098a = c4855i8;
        C4669b3 c4669b3 = new C4669b3(C4669b3.b(nnA, eiFromModel));
        List list = c5063qe.f67582c;
        ArrayList arrayList = new ArrayList();
        this.f67523d.getClass();
        int iComputeInt32Size = c5181v8.f67822a != new C5181v8().f67822a ? CodedOutputByteBufferNano.computeInt32Size(1, c5181v8.f67822a) : 0;
        C5156u8 c5156u8 = c5181v8.f67823b;
        if (c5156u8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, c5156u8);
        }
        C5106s8 c5106s8 = c5181v8.f67824c;
        if (c5106s8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c5106s8);
        }
        C5131t8 c5131t8 = c5181v8.f67825d;
        int i10 = 4;
        if (c5131t8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, c5131t8);
        }
        C4751e8 c4751e8 = c5181v8.f67826e;
        if (c4751e8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c4751e8);
        }
        C4906k8 c4906k8 = c5181v8.f67827f;
        if (c4906k8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c4906k8);
        }
        ArrayList arrayList2 = new ArrayList();
        C5181v8 c5181v82 = new C5181v8();
        c5181v82.f67822a = c5181v8.f67822a;
        C4906k8 c4906k82 = new C4906k8();
        c5181v82.f67827f = c4906k82;
        c4906k82.f67098a = new C4855i8();
        C4855i8 c4855i82 = c5181v82.f67827f.f67098a;
        C4855i8 c4855i83 = c5181v8.f67827f.f67098a;
        c4855i82.f66970b = c4855i83.f66970b;
        c4855i82.f66969a = c4855i83.f66969a;
        c4855i82.f66973e = c4855i83.f66973e;
        c4855i82.f66971c = c4855i83.f66971c;
        C4669b3 c4669b32 = c4669b3;
        int i11 = 0;
        int i12 = iComputeInt32Size;
        while (i11 < list.size()) {
            C4927l3 c4927l3 = (C4927l3) list.get(i11);
            C4880j8 c4880j8 = new C4880j8();
            c4880j8.f67021a = i11;
            Ei eiFromModel2 = this.f67521b.fromModel(c4927l3);
            c4880j8.f67022b = (C4777f8) eiFromModel2.f65200a;
            eiFromModel2.f65201b.getBytesTruncated();
            Ei ei2 = new Ei(c4880j8, eiFromModel2);
            Kf kf2 = this.f67523d;
            C4880j8 c4880j82 = (C4880j8) ei2.f65200a;
            kf2.getClass();
            int iComputeTagSize = CodedOutputByteBufferNano.computeTagSize(i10);
            int iComputeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c4880j82);
            int iComputeRawVarint32Size = iComputeTagSize + iComputeMessageSizeNoTag + ((iComputeMessageSizeNoTag & (-128)) == 0 ? 0 : CodedOutputByteBufferNano.computeRawVarint32Size(iComputeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i12 + iComputeRawVarint32Size > 204800) {
                c5181v82.f67827f.f67098a.f66972d = (C4880j8[]) arrayList2.toArray(new C4880j8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Ei(c5181v82, c4669b32));
                C5181v8 c5181v83 = new C5181v8();
                c5181v83.f67822a = c5181v8.f67822a;
                C4906k8 c4906k83 = new C4906k8();
                c5181v83.f67827f = c4906k83;
                c4906k83.f67098a = new C4855i8();
                C4855i8 c4855i84 = c5181v83.f67827f.f67098a;
                C4855i8 c4855i85 = c5181v8.f67827f.f67098a;
                c4855i84.f66970b = c4855i85.f66970b;
                c4855i84.f66969a = c4855i85.f66969a;
                c4855i84.f66973e = c4855i85.f66973e;
                c4855i84.f66971c = c4855i85.f66971c;
                c4669b32 = c4669b3;
                i12 = iComputeInt32Size;
                c5181v82 = c5181v83;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C4880j8) ei2.f65200a);
            c4669b32 = new C4669b3(C4669b3.b(c4669b32, ei2.f65201b));
            i12 += iComputeRawVarint32Size;
            i11++;
            i10 = 4;
        }
        c5181v82.f67827f.f67098a.f66972d = (C4880j8[]) arrayList2.toArray(new C4880j8[arrayList2.size()]);
        arrayList.add(new Ei(c5181v82, c4669b32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
