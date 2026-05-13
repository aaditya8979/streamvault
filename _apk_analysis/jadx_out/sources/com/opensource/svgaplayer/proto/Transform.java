package com.opensource.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import okio.ByteString;
import ue.c;

/* JADX INFO: loaded from: classes8.dex */
public final class Transform extends Message<Transform, a> {
    public static final ProtoAdapter<Transform> ADAPTER = new b();
    public static final Float DEFAULT_A;
    public static final Float DEFAULT_B;
    public static final Float DEFAULT_C;
    public static final Float DEFAULT_D;
    public static final Float DEFAULT_TX;
    public static final Float DEFAULT_TY;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f51270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f51271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f51272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Float f51273d;
    public final Float tx;
    public final Float ty;

    public static final class a extends Message.a<Transform, a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Float f51274d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Float f51275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Float f51276f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Float f51277g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Float f51278h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Float f51279i;

        public a g(Float f10) {
            this.f51274d = f10;
            return this;
        }

        public a h(Float f10) {
            this.f51275e = f10;
            return this;
        }

        @Override // com.squareup.wire.Message.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Transform c() {
            return new Transform(this.f51274d, this.f51275e, this.f51276f, this.f51277g, this.f51278h, this.f51279i, super.d());
        }

        public a j(Float f10) {
            this.f51276f = f10;
            return this;
        }

        public a k(Float f10) {
            this.f51277g = f10;
            return this;
        }

        public a l(Float f10) {
            this.f51278h = f10;
            return this;
        }

        public a m(Float f10) {
            this.f51279i = f10;
            return this;
        }
    }

    public static final class b extends ProtoAdapter<Transform> {
        public b() {
            super(FieldEncoding.LENGTH_DELIMITED, Transform.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Transform e(ue.b bVar) throws IOException {
            a aVar = new a();
            long jC = bVar.c();
            while (true) {
                int iF = bVar.f();
                if (iF == -1) {
                    bVar.d(jC);
                    return aVar.c();
                }
                switch (iF) {
                    case 1:
                        aVar.g(ProtoAdapter.f53363o.e(bVar));
                        break;
                    case 2:
                        aVar.h(ProtoAdapter.f53363o.e(bVar));
                        break;
                    case 3:
                        aVar.j(ProtoAdapter.f53363o.e(bVar));
                        break;
                    case 4:
                        aVar.k(ProtoAdapter.f53363o.e(bVar));
                        break;
                    case 5:
                        aVar.l(ProtoAdapter.f53363o.e(bVar));
                        break;
                    case 6:
                        aVar.m(ProtoAdapter.f53363o.e(bVar));
                        break;
                    default:
                        FieldEncoding fieldEncodingG = bVar.g();
                        aVar.a(iF, fieldEncodingG, fieldEncodingG.rawProtoAdapter().e(bVar));
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(c cVar, Transform transform) throws IOException {
            Float f10 = transform.f51270a;
            if (f10 != null) {
                ProtoAdapter.f53363o.k(cVar, 1, f10);
            }
            Float f11 = transform.f51271b;
            if (f11 != null) {
                ProtoAdapter.f53363o.k(cVar, 2, f11);
            }
            Float f12 = transform.f51272c;
            if (f12 != null) {
                ProtoAdapter.f53363o.k(cVar, 3, f12);
            }
            Float f13 = transform.f51273d;
            if (f13 != null) {
                ProtoAdapter.f53363o.k(cVar, 4, f13);
            }
            Float f14 = transform.tx;
            if (f14 != null) {
                ProtoAdapter.f53363o.k(cVar, 5, f14);
            }
            Float f15 = transform.ty;
            if (f15 != null) {
                ProtoAdapter.f53363o.k(cVar, 6, f15);
            }
            cVar.k(transform.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Transform transform) {
            Float f10 = transform.f51270a;
            int iM = f10 != null ? ProtoAdapter.f53363o.m(1, f10) : 0;
            Float f11 = transform.f51271b;
            int iM2 = iM + (f11 != null ? ProtoAdapter.f53363o.m(2, f11) : 0);
            Float f12 = transform.f51272c;
            int iM3 = iM2 + (f12 != null ? ProtoAdapter.f53363o.m(3, f12) : 0);
            Float f13 = transform.f51273d;
            int iM4 = iM3 + (f13 != null ? ProtoAdapter.f53363o.m(4, f13) : 0);
            Float f14 = transform.tx;
            int iM5 = iM4 + (f14 != null ? ProtoAdapter.f53363o.m(5, f14) : 0);
            Float f15 = transform.ty;
            return iM5 + (f15 != null ? ProtoAdapter.f53363o.m(6, f15) : 0) + transform.unknownFields().size();
        }
    }

    static {
        Float fValueOf = Float.valueOf(0.0f);
        DEFAULT_A = fValueOf;
        DEFAULT_B = fValueOf;
        DEFAULT_C = fValueOf;
        DEFAULT_D = fValueOf;
        DEFAULT_TX = fValueOf;
        DEFAULT_TY = fValueOf;
    }

    public Transform(Float f10, Float f11, Float f12, Float f13, Float f14, Float f15) {
        this(f10, f11, f12, f13, f14, f15, ByteString.EMPTY);
    }

    public Transform(Float f10, Float f11, Float f12, Float f13, Float f14, Float f15, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f51270a = f10;
        this.f51271b = f11;
        this.f51272c = f12;
        this.f51273d = f13;
        this.tx = f14;
        this.ty = f15;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Transform)) {
            return false;
        }
        Transform transform = (Transform) obj;
        return unknownFields().equals(transform.unknownFields()) && com.squareup.wire.internal.a.d(this.f51270a, transform.f51270a) && com.squareup.wire.internal.a.d(this.f51271b, transform.f51271b) && com.squareup.wire.internal.a.d(this.f51272c, transform.f51272c) && com.squareup.wire.internal.a.d(this.f51273d, transform.f51273d) && com.squareup.wire.internal.a.d(this.tx, transform.tx) && com.squareup.wire.internal.a.d(this.ty, transform.ty);
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Float f10 = this.f51270a;
        int iHashCode2 = (iHashCode + (f10 != null ? f10.hashCode() : 0)) * 37;
        Float f11 = this.f51271b;
        int iHashCode3 = (iHashCode2 + (f11 != null ? f11.hashCode() : 0)) * 37;
        Float f12 = this.f51272c;
        int iHashCode4 = (iHashCode3 + (f12 != null ? f12.hashCode() : 0)) * 37;
        Float f13 = this.f51273d;
        int iHashCode5 = (iHashCode4 + (f13 != null ? f13.hashCode() : 0)) * 37;
        Float f14 = this.tx;
        int iHashCode6 = (iHashCode5 + (f14 != null ? f14.hashCode() : 0)) * 37;
        Float f15 = this.ty;
        int iHashCode7 = iHashCode6 + (f15 != null ? f15.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public a newBuilder() {
        a aVar = new a();
        aVar.f51274d = this.f51270a;
        aVar.f51275e = this.f51271b;
        aVar.f51276f = this.f51272c;
        aVar.f51277g = this.f51273d;
        aVar.f51278h = this.tx;
        aVar.f51279i = this.ty;
        aVar.b(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f51270a != null) {
            sb2.append(", a=");
            sb2.append(this.f51270a);
        }
        if (this.f51271b != null) {
            sb2.append(", b=");
            sb2.append(this.f51271b);
        }
        if (this.f51272c != null) {
            sb2.append(", c=");
            sb2.append(this.f51272c);
        }
        if (this.f51273d != null) {
            sb2.append(", d=");
            sb2.append(this.f51273d);
        }
        if (this.tx != null) {
            sb2.append(", tx=");
            sb2.append(this.tx);
        }
        if (this.ty != null) {
            sb2.append(", ty=");
            sb2.append(this.ty);
        }
        StringBuilder sbReplace = sb2.replace(0, 2, "Transform{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
