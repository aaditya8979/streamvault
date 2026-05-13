package com.opensource.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import okio.ByteString;
import ue.c;
import ue.e;

/* JADX INFO: loaded from: classes8.dex */
public final class ShapeEntity extends Message<ShapeEntity, a> {
    public static final ProtoAdapter<ShapeEntity> ADAPTER = new b();
    public static final ShapeType DEFAULT_TYPE = ShapeType.SHAPE;
    private static final long serialVersionUID = 0;
    public final EllipseArgs ellipse;
    public final RectArgs rect;
    public final ShapeArgs shape;
    public final ShapeStyle styles;
    public final Transform transform;
    public final ShapeType type;

    public static final class EllipseArgs extends Message<EllipseArgs, a> {
        public static final ProtoAdapter<EllipseArgs> ADAPTER = new b();
        public static final Float DEFAULT_RADIUSX;
        public static final Float DEFAULT_RADIUSY;
        public static final Float DEFAULT_X;
        public static final Float DEFAULT_Y;
        private static final long serialVersionUID = 0;
        public final Float radiusX;
        public final Float radiusY;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final Float f51226x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final Float f51227y;

        public static final class a extends Message.a<EllipseArgs, a> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Float f51228d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Float f51229e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Float f51230f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public Float f51231g;

            @Override // com.squareup.wire.Message.a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public EllipseArgs c() {
                return new EllipseArgs(this.f51228d, this.f51229e, this.f51230f, this.f51231g, super.d());
            }

            public a h(Float f10) {
                this.f51230f = f10;
                return this;
            }

            public a i(Float f10) {
                this.f51231g = f10;
                return this;
            }

            public a j(Float f10) {
                this.f51228d = f10;
                return this;
            }

            public a k(Float f10) {
                this.f51229e = f10;
                return this;
            }
        }

        public static final class b extends ProtoAdapter<EllipseArgs> {
            public b() {
                super(FieldEncoding.LENGTH_DELIMITED, EllipseArgs.class);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public EllipseArgs e(ue.b bVar) throws IOException {
                a aVar = new a();
                long jC = bVar.c();
                while (true) {
                    int iF = bVar.f();
                    if (iF == -1) {
                        bVar.d(jC);
                        return aVar.c();
                    }
                    if (iF == 1) {
                        aVar.j(ProtoAdapter.f53363o.e(bVar));
                    } else if (iF == 2) {
                        aVar.k(ProtoAdapter.f53363o.e(bVar));
                    } else if (iF == 3) {
                        aVar.h(ProtoAdapter.f53363o.e(bVar));
                    } else if (iF != 4) {
                        FieldEncoding fieldEncodingG = bVar.g();
                        aVar.a(iF, fieldEncodingG, fieldEncodingG.rawProtoAdapter().e(bVar));
                    } else {
                        aVar.i(ProtoAdapter.f53363o.e(bVar));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public void i(c cVar, EllipseArgs ellipseArgs) throws IOException {
                Float f10 = ellipseArgs.f51226x;
                if (f10 != null) {
                    ProtoAdapter.f53363o.k(cVar, 1, f10);
                }
                Float f11 = ellipseArgs.f51227y;
                if (f11 != null) {
                    ProtoAdapter.f53363o.k(cVar, 2, f11);
                }
                Float f12 = ellipseArgs.radiusX;
                if (f12 != null) {
                    ProtoAdapter.f53363o.k(cVar, 3, f12);
                }
                Float f13 = ellipseArgs.radiusY;
                if (f13 != null) {
                    ProtoAdapter.f53363o.k(cVar, 4, f13);
                }
                cVar.k(ellipseArgs.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public int l(EllipseArgs ellipseArgs) {
                Float f10 = ellipseArgs.f51226x;
                int iM = f10 != null ? ProtoAdapter.f53363o.m(1, f10) : 0;
                Float f11 = ellipseArgs.f51227y;
                int iM2 = iM + (f11 != null ? ProtoAdapter.f53363o.m(2, f11) : 0);
                Float f12 = ellipseArgs.radiusX;
                int iM3 = iM2 + (f12 != null ? ProtoAdapter.f53363o.m(3, f12) : 0);
                Float f13 = ellipseArgs.radiusY;
                return iM3 + (f13 != null ? ProtoAdapter.f53363o.m(4, f13) : 0) + ellipseArgs.unknownFields().size();
            }
        }

        static {
            Float fValueOf = Float.valueOf(0.0f);
            DEFAULT_X = fValueOf;
            DEFAULT_Y = fValueOf;
            DEFAULT_RADIUSX = fValueOf;
            DEFAULT_RADIUSY = fValueOf;
        }

        public EllipseArgs(Float f10, Float f11, Float f12, Float f13) {
            this(f10, f11, f12, f13, ByteString.EMPTY);
        }

        public EllipseArgs(Float f10, Float f11, Float f12, Float f13, ByteString byteString) {
            super(ADAPTER, byteString);
            this.f51226x = f10;
            this.f51227y = f11;
            this.radiusX = f12;
            this.radiusY = f13;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EllipseArgs)) {
                return false;
            }
            EllipseArgs ellipseArgs = (EllipseArgs) obj;
            return unknownFields().equals(ellipseArgs.unknownFields()) && com.squareup.wire.internal.a.d(this.f51226x, ellipseArgs.f51226x) && com.squareup.wire.internal.a.d(this.f51227y, ellipseArgs.f51227y) && com.squareup.wire.internal.a.d(this.radiusX, ellipseArgs.radiusX) && com.squareup.wire.internal.a.d(this.radiusY, ellipseArgs.radiusY);
        }

        public int hashCode() {
            int i10 = this.hashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Float f10 = this.f51226x;
            int iHashCode2 = (iHashCode + (f10 != null ? f10.hashCode() : 0)) * 37;
            Float f11 = this.f51227y;
            int iHashCode3 = (iHashCode2 + (f11 != null ? f11.hashCode() : 0)) * 37;
            Float f12 = this.radiusX;
            int iHashCode4 = (iHashCode3 + (f12 != null ? f12.hashCode() : 0)) * 37;
            Float f13 = this.radiusY;
            int iHashCode5 = iHashCode4 + (f13 != null ? f13.hashCode() : 0);
            this.hashCode = iHashCode5;
            return iHashCode5;
        }

        @Override // com.squareup.wire.Message
        public a newBuilder() {
            a aVar = new a();
            aVar.f51228d = this.f51226x;
            aVar.f51229e = this.f51227y;
            aVar.f51230f = this.radiusX;
            aVar.f51231g = this.radiusY;
            aVar.b(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.f51226x != null) {
                sb2.append(", x=");
                sb2.append(this.f51226x);
            }
            if (this.f51227y != null) {
                sb2.append(", y=");
                sb2.append(this.f51227y);
            }
            if (this.radiusX != null) {
                sb2.append(", radiusX=");
                sb2.append(this.radiusX);
            }
            if (this.radiusY != null) {
                sb2.append(", radiusY=");
                sb2.append(this.radiusY);
            }
            StringBuilder sbReplace = sb2.replace(0, 2, "EllipseArgs{");
            sbReplace.append('}');
            return sbReplace.toString();
        }
    }

    public static final class RectArgs extends Message<RectArgs, a> {
        public static final ProtoAdapter<RectArgs> ADAPTER = new b();
        public static final Float DEFAULT_CORNERRADIUS;
        public static final Float DEFAULT_HEIGHT;
        public static final Float DEFAULT_WIDTH;
        public static final Float DEFAULT_X;
        public static final Float DEFAULT_Y;
        private static final long serialVersionUID = 0;
        public final Float cornerRadius;
        public final Float height;
        public final Float width;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final Float f51232x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final Float f51233y;

        public static final class a extends Message.a<RectArgs, a> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Float f51234d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Float f51235e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Float f51236f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public Float f51237g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public Float f51238h;

            @Override // com.squareup.wire.Message.a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public RectArgs c() {
                return new RectArgs(this.f51234d, this.f51235e, this.f51236f, this.f51237g, this.f51238h, super.d());
            }

            public a h(Float f10) {
                this.f51238h = f10;
                return this;
            }

            public a i(Float f10) {
                this.f51237g = f10;
                return this;
            }

            public a j(Float f10) {
                this.f51236f = f10;
                return this;
            }

            public a k(Float f10) {
                this.f51234d = f10;
                return this;
            }

            public a l(Float f10) {
                this.f51235e = f10;
                return this;
            }
        }

        public static final class b extends ProtoAdapter<RectArgs> {
            public b() {
                super(FieldEncoding.LENGTH_DELIMITED, RectArgs.class);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public RectArgs e(ue.b bVar) throws IOException {
                a aVar = new a();
                long jC = bVar.c();
                while (true) {
                    int iF = bVar.f();
                    if (iF == -1) {
                        bVar.d(jC);
                        return aVar.c();
                    }
                    if (iF == 1) {
                        aVar.k(ProtoAdapter.f53363o.e(bVar));
                    } else if (iF == 2) {
                        aVar.l(ProtoAdapter.f53363o.e(bVar));
                    } else if (iF == 3) {
                        aVar.j(ProtoAdapter.f53363o.e(bVar));
                    } else if (iF == 4) {
                        aVar.i(ProtoAdapter.f53363o.e(bVar));
                    } else if (iF != 5) {
                        FieldEncoding fieldEncodingG = bVar.g();
                        aVar.a(iF, fieldEncodingG, fieldEncodingG.rawProtoAdapter().e(bVar));
                    } else {
                        aVar.h(ProtoAdapter.f53363o.e(bVar));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public void i(c cVar, RectArgs rectArgs) throws IOException {
                Float f10 = rectArgs.f51232x;
                if (f10 != null) {
                    ProtoAdapter.f53363o.k(cVar, 1, f10);
                }
                Float f11 = rectArgs.f51233y;
                if (f11 != null) {
                    ProtoAdapter.f53363o.k(cVar, 2, f11);
                }
                Float f12 = rectArgs.width;
                if (f12 != null) {
                    ProtoAdapter.f53363o.k(cVar, 3, f12);
                }
                Float f13 = rectArgs.height;
                if (f13 != null) {
                    ProtoAdapter.f53363o.k(cVar, 4, f13);
                }
                Float f14 = rectArgs.cornerRadius;
                if (f14 != null) {
                    ProtoAdapter.f53363o.k(cVar, 5, f14);
                }
                cVar.k(rectArgs.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public int l(RectArgs rectArgs) {
                Float f10 = rectArgs.f51232x;
                int iM = f10 != null ? ProtoAdapter.f53363o.m(1, f10) : 0;
                Float f11 = rectArgs.f51233y;
                int iM2 = iM + (f11 != null ? ProtoAdapter.f53363o.m(2, f11) : 0);
                Float f12 = rectArgs.width;
                int iM3 = iM2 + (f12 != null ? ProtoAdapter.f53363o.m(3, f12) : 0);
                Float f13 = rectArgs.height;
                int iM4 = iM3 + (f13 != null ? ProtoAdapter.f53363o.m(4, f13) : 0);
                Float f14 = rectArgs.cornerRadius;
                return iM4 + (f14 != null ? ProtoAdapter.f53363o.m(5, f14) : 0) + rectArgs.unknownFields().size();
            }
        }

        static {
            Float fValueOf = Float.valueOf(0.0f);
            DEFAULT_X = fValueOf;
            DEFAULT_Y = fValueOf;
            DEFAULT_WIDTH = fValueOf;
            DEFAULT_HEIGHT = fValueOf;
            DEFAULT_CORNERRADIUS = fValueOf;
        }

        public RectArgs(Float f10, Float f11, Float f12, Float f13, Float f14) {
            this(f10, f11, f12, f13, f14, ByteString.EMPTY);
        }

        public RectArgs(Float f10, Float f11, Float f12, Float f13, Float f14, ByteString byteString) {
            super(ADAPTER, byteString);
            this.f51232x = f10;
            this.f51233y = f11;
            this.width = f12;
            this.height = f13;
            this.cornerRadius = f14;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RectArgs)) {
                return false;
            }
            RectArgs rectArgs = (RectArgs) obj;
            return unknownFields().equals(rectArgs.unknownFields()) && com.squareup.wire.internal.a.d(this.f51232x, rectArgs.f51232x) && com.squareup.wire.internal.a.d(this.f51233y, rectArgs.f51233y) && com.squareup.wire.internal.a.d(this.width, rectArgs.width) && com.squareup.wire.internal.a.d(this.height, rectArgs.height) && com.squareup.wire.internal.a.d(this.cornerRadius, rectArgs.cornerRadius);
        }

        public int hashCode() {
            int i10 = this.hashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Float f10 = this.f51232x;
            int iHashCode2 = (iHashCode + (f10 != null ? f10.hashCode() : 0)) * 37;
            Float f11 = this.f51233y;
            int iHashCode3 = (iHashCode2 + (f11 != null ? f11.hashCode() : 0)) * 37;
            Float f12 = this.width;
            int iHashCode4 = (iHashCode3 + (f12 != null ? f12.hashCode() : 0)) * 37;
            Float f13 = this.height;
            int iHashCode5 = (iHashCode4 + (f13 != null ? f13.hashCode() : 0)) * 37;
            Float f14 = this.cornerRadius;
            int iHashCode6 = iHashCode5 + (f14 != null ? f14.hashCode() : 0);
            this.hashCode = iHashCode6;
            return iHashCode6;
        }

        @Override // com.squareup.wire.Message
        public a newBuilder() {
            a aVar = new a();
            aVar.f51234d = this.f51232x;
            aVar.f51235e = this.f51233y;
            aVar.f51236f = this.width;
            aVar.f51237g = this.height;
            aVar.f51238h = this.cornerRadius;
            aVar.b(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.f51232x != null) {
                sb2.append(", x=");
                sb2.append(this.f51232x);
            }
            if (this.f51233y != null) {
                sb2.append(", y=");
                sb2.append(this.f51233y);
            }
            if (this.width != null) {
                sb2.append(", width=");
                sb2.append(this.width);
            }
            if (this.height != null) {
                sb2.append(", height=");
                sb2.append(this.height);
            }
            if (this.cornerRadius != null) {
                sb2.append(", cornerRadius=");
                sb2.append(this.cornerRadius);
            }
            StringBuilder sbReplace = sb2.replace(0, 2, "RectArgs{");
            sbReplace.append('}');
            return sbReplace.toString();
        }
    }

    public static final class ShapeArgs extends Message<ShapeArgs, a> {
        public static final ProtoAdapter<ShapeArgs> ADAPTER = new b();
        public static final String DEFAULT_D = "";
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f51239d;

        public static final class a extends Message.a<ShapeArgs, a> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public String f51240d;

            @Override // com.squareup.wire.Message.a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public ShapeArgs c() {
                return new ShapeArgs(this.f51240d, super.d());
            }

            public a h(String str) {
                this.f51240d = str;
                return this;
            }
        }

        public static final class b extends ProtoAdapter<ShapeArgs> {
            public b() {
                super(FieldEncoding.LENGTH_DELIMITED, ShapeArgs.class);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public ShapeArgs e(ue.b bVar) throws IOException {
                a aVar = new a();
                long jC = bVar.c();
                while (true) {
                    int iF = bVar.f();
                    if (iF == -1) {
                        bVar.d(jC);
                        return aVar.c();
                    }
                    if (iF != 1) {
                        FieldEncoding fieldEncodingG = bVar.g();
                        aVar.a(iF, fieldEncodingG, fieldEncodingG.rawProtoAdapter().e(bVar));
                    } else {
                        aVar.h(ProtoAdapter.f53365q.e(bVar));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public void i(c cVar, ShapeArgs shapeArgs) throws IOException {
                String str = shapeArgs.f51239d;
                if (str != null) {
                    ProtoAdapter.f53365q.k(cVar, 1, str);
                }
                cVar.k(shapeArgs.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public int l(ShapeArgs shapeArgs) {
                String str = shapeArgs.f51239d;
                return (str != null ? ProtoAdapter.f53365q.m(1, str) : 0) + shapeArgs.unknownFields().size();
            }
        }

        public ShapeArgs(String str) {
            this(str, ByteString.EMPTY);
        }

        public ShapeArgs(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.f51239d = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShapeArgs)) {
                return false;
            }
            ShapeArgs shapeArgs = (ShapeArgs) obj;
            return unknownFields().equals(shapeArgs.unknownFields()) && com.squareup.wire.internal.a.d(this.f51239d, shapeArgs.f51239d);
        }

        public int hashCode() {
            int i10 = this.hashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            String str = this.f51239d;
            int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public a newBuilder() {
            a aVar = new a();
            aVar.f51240d = this.f51239d;
            aVar.b(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.f51239d != null) {
                sb2.append(", d=");
                sb2.append(this.f51239d);
            }
            StringBuilder sbReplace = sb2.replace(0, 2, "ShapeArgs{");
            sbReplace.append('}');
            return sbReplace.toString();
        }
    }

    public static final class ShapeStyle extends Message<ShapeStyle, a> {
        public static final ProtoAdapter<ShapeStyle> ADAPTER = new b();
        public static final LineCap DEFAULT_LINECAP;
        public static final Float DEFAULT_LINEDASHI;
        public static final Float DEFAULT_LINEDASHII;
        public static final Float DEFAULT_LINEDASHIII;
        public static final LineJoin DEFAULT_LINEJOIN;
        public static final Float DEFAULT_MITERLIMIT;
        public static final Float DEFAULT_STROKEWIDTH;
        private static final long serialVersionUID = 0;
        public final RGBAColor fill;
        public final LineCap lineCap;
        public final Float lineDashI;
        public final Float lineDashII;
        public final Float lineDashIII;
        public final LineJoin lineJoin;
        public final Float miterLimit;
        public final RGBAColor stroke;
        public final Float strokeWidth;

        public enum LineCap implements e {
            LineCap_BUTT(0),
            LineCap_ROUND(1),
            LineCap_SQUARE(2);

            public static final ProtoAdapter<LineCap> ADAPTER = ProtoAdapter.o(LineCap.class);
            private final int value;

            LineCap(int i10) {
                this.value = i10;
            }

            public static LineCap fromValue(int i10) {
                if (i10 == 0) {
                    return LineCap_BUTT;
                }
                if (i10 == 1) {
                    return LineCap_ROUND;
                }
                if (i10 != 2) {
                    return null;
                }
                return LineCap_SQUARE;
            }

            @Override // ue.e
            public int getValue() {
                return this.value;
            }
        }

        public enum LineJoin implements e {
            LineJoin_MITER(0),
            LineJoin_ROUND(1),
            LineJoin_BEVEL(2);

            public static final ProtoAdapter<LineJoin> ADAPTER = ProtoAdapter.o(LineJoin.class);
            private final int value;

            LineJoin(int i10) {
                this.value = i10;
            }

            public static LineJoin fromValue(int i10) {
                if (i10 == 0) {
                    return LineJoin_MITER;
                }
                if (i10 == 1) {
                    return LineJoin_ROUND;
                }
                if (i10 != 2) {
                    return null;
                }
                return LineJoin_BEVEL;
            }

            @Override // ue.e
            public int getValue() {
                return this.value;
            }
        }

        public static final class RGBAColor extends Message<RGBAColor, a> {
            public static final ProtoAdapter<RGBAColor> ADAPTER = new b();
            public static final Float DEFAULT_A;
            public static final Float DEFAULT_B;
            public static final Float DEFAULT_G;
            public static final Float DEFAULT_R;
            private static final long serialVersionUID = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Float f51243a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Float f51244b;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Float f51245g;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final Float f51246r;

            public static final class a extends Message.a<RGBAColor, a> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Float f51247d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Float f51248e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public Float f51249f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public Float f51250g;

                public a g(Float f10) {
                    this.f51250g = f10;
                    return this;
                }

                public a h(Float f10) {
                    this.f51249f = f10;
                    return this;
                }

                @Override // com.squareup.wire.Message.a
                /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
                public RGBAColor c() {
                    return new RGBAColor(this.f51247d, this.f51248e, this.f51249f, this.f51250g, super.d());
                }

                public a j(Float f10) {
                    this.f51248e = f10;
                    return this;
                }

                public a k(Float f10) {
                    this.f51247d = f10;
                    return this;
                }
            }

            public static final class b extends ProtoAdapter<RGBAColor> {
                public b() {
                    super(FieldEncoding.LENGTH_DELIMITED, RGBAColor.class);
                }

                @Override // com.squareup.wire.ProtoAdapter
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public RGBAColor e(ue.b bVar) throws IOException {
                    a aVar = new a();
                    long jC = bVar.c();
                    while (true) {
                        int iF = bVar.f();
                        if (iF == -1) {
                            bVar.d(jC);
                            return aVar.c();
                        }
                        if (iF == 1) {
                            aVar.k(ProtoAdapter.f53363o.e(bVar));
                        } else if (iF == 2) {
                            aVar.j(ProtoAdapter.f53363o.e(bVar));
                        } else if (iF == 3) {
                            aVar.h(ProtoAdapter.f53363o.e(bVar));
                        } else if (iF != 4) {
                            FieldEncoding fieldEncodingG = bVar.g();
                            aVar.a(iF, fieldEncodingG, fieldEncodingG.rawProtoAdapter().e(bVar));
                        } else {
                            aVar.g(ProtoAdapter.f53363o.e(bVar));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public void i(c cVar, RGBAColor rGBAColor) throws IOException {
                    Float f10 = rGBAColor.f51246r;
                    if (f10 != null) {
                        ProtoAdapter.f53363o.k(cVar, 1, f10);
                    }
                    Float f11 = rGBAColor.f51245g;
                    if (f11 != null) {
                        ProtoAdapter.f53363o.k(cVar, 2, f11);
                    }
                    Float f12 = rGBAColor.f51244b;
                    if (f12 != null) {
                        ProtoAdapter.f53363o.k(cVar, 3, f12);
                    }
                    Float f13 = rGBAColor.f51243a;
                    if (f13 != null) {
                        ProtoAdapter.f53363o.k(cVar, 4, f13);
                    }
                    cVar.k(rGBAColor.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public int l(RGBAColor rGBAColor) {
                    Float f10 = rGBAColor.f51246r;
                    int iM = f10 != null ? ProtoAdapter.f53363o.m(1, f10) : 0;
                    Float f11 = rGBAColor.f51245g;
                    int iM2 = iM + (f11 != null ? ProtoAdapter.f53363o.m(2, f11) : 0);
                    Float f12 = rGBAColor.f51244b;
                    int iM3 = iM2 + (f12 != null ? ProtoAdapter.f53363o.m(3, f12) : 0);
                    Float f13 = rGBAColor.f51243a;
                    return iM3 + (f13 != null ? ProtoAdapter.f53363o.m(4, f13) : 0) + rGBAColor.unknownFields().size();
                }
            }

            static {
                Float fValueOf = Float.valueOf(0.0f);
                DEFAULT_R = fValueOf;
                DEFAULT_G = fValueOf;
                DEFAULT_B = fValueOf;
                DEFAULT_A = fValueOf;
            }

            public RGBAColor(Float f10, Float f11, Float f12, Float f13) {
                this(f10, f11, f12, f13, ByteString.EMPTY);
            }

            public RGBAColor(Float f10, Float f11, Float f12, Float f13, ByteString byteString) {
                super(ADAPTER, byteString);
                this.f51246r = f10;
                this.f51245g = f11;
                this.f51244b = f12;
                this.f51243a = f13;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RGBAColor)) {
                    return false;
                }
                RGBAColor rGBAColor = (RGBAColor) obj;
                return unknownFields().equals(rGBAColor.unknownFields()) && com.squareup.wire.internal.a.d(this.f51246r, rGBAColor.f51246r) && com.squareup.wire.internal.a.d(this.f51245g, rGBAColor.f51245g) && com.squareup.wire.internal.a.d(this.f51244b, rGBAColor.f51244b) && com.squareup.wire.internal.a.d(this.f51243a, rGBAColor.f51243a);
            }

            public int hashCode() {
                int i10 = this.hashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                Float f10 = this.f51246r;
                int iHashCode2 = (iHashCode + (f10 != null ? f10.hashCode() : 0)) * 37;
                Float f11 = this.f51245g;
                int iHashCode3 = (iHashCode2 + (f11 != null ? f11.hashCode() : 0)) * 37;
                Float f12 = this.f51244b;
                int iHashCode4 = (iHashCode3 + (f12 != null ? f12.hashCode() : 0)) * 37;
                Float f13 = this.f51243a;
                int iHashCode5 = iHashCode4 + (f13 != null ? f13.hashCode() : 0);
                this.hashCode = iHashCode5;
                return iHashCode5;
            }

            @Override // com.squareup.wire.Message
            public a newBuilder() {
                a aVar = new a();
                aVar.f51247d = this.f51246r;
                aVar.f51248e = this.f51245g;
                aVar.f51249f = this.f51244b;
                aVar.f51250g = this.f51243a;
                aVar.b(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                StringBuilder sb2 = new StringBuilder();
                if (this.f51246r != null) {
                    sb2.append(", r=");
                    sb2.append(this.f51246r);
                }
                if (this.f51245g != null) {
                    sb2.append(", g=");
                    sb2.append(this.f51245g);
                }
                if (this.f51244b != null) {
                    sb2.append(", b=");
                    sb2.append(this.f51244b);
                }
                if (this.f51243a != null) {
                    sb2.append(", a=");
                    sb2.append(this.f51243a);
                }
                StringBuilder sbReplace = sb2.replace(0, 2, "RGBAColor{");
                sbReplace.append('}');
                return sbReplace.toString();
            }
        }

        public static final class a extends Message.a<ShapeStyle, a> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public RGBAColor f51251d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public RGBAColor f51252e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Float f51253f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public LineCap f51254g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public LineJoin f51255h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public Float f51256i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Float f51257j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Float f51258k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public Float f51259l;

            @Override // com.squareup.wire.Message.a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public ShapeStyle c() {
                return new ShapeStyle(this.f51251d, this.f51252e, this.f51253f, this.f51254g, this.f51255h, this.f51256i, this.f51257j, this.f51258k, this.f51259l, super.d());
            }

            public a h(RGBAColor rGBAColor) {
                this.f51251d = rGBAColor;
                return this;
            }

            public a i(LineCap lineCap) {
                this.f51254g = lineCap;
                return this;
            }

            public a j(Float f10) {
                this.f51257j = f10;
                return this;
            }

            public a k(Float f10) {
                this.f51258k = f10;
                return this;
            }

            public a l(Float f10) {
                this.f51259l = f10;
                return this;
            }

            public a m(LineJoin lineJoin) {
                this.f51255h = lineJoin;
                return this;
            }

            public a n(Float f10) {
                this.f51256i = f10;
                return this;
            }

            public a o(RGBAColor rGBAColor) {
                this.f51252e = rGBAColor;
                return this;
            }

            public a p(Float f10) {
                this.f51253f = f10;
                return this;
            }
        }

        public static final class b extends ProtoAdapter<ShapeStyle> {
            public b() {
                super(FieldEncoding.LENGTH_DELIMITED, ShapeStyle.class);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public ShapeStyle e(ue.b bVar) throws IOException {
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
                            aVar.h(RGBAColor.ADAPTER.e(bVar));
                            break;
                        case 2:
                            aVar.o(RGBAColor.ADAPTER.e(bVar));
                            break;
                        case 3:
                            aVar.p(ProtoAdapter.f53363o.e(bVar));
                            break;
                        case 4:
                            try {
                                aVar.i(LineCap.ADAPTER.e(bVar));
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                aVar.a(iF, FieldEncoding.VARINT, Long.valueOf(e10.value));
                            }
                            break;
                        case 5:
                            try {
                                aVar.m(LineJoin.ADAPTER.e(bVar));
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                aVar.a(iF, FieldEncoding.VARINT, Long.valueOf(e11.value));
                            }
                            break;
                        case 6:
                            aVar.n(ProtoAdapter.f53363o.e(bVar));
                            break;
                        case 7:
                            aVar.j(ProtoAdapter.f53363o.e(bVar));
                            break;
                        case 8:
                            aVar.k(ProtoAdapter.f53363o.e(bVar));
                            break;
                        case 9:
                            aVar.l(ProtoAdapter.f53363o.e(bVar));
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
            public void i(c cVar, ShapeStyle shapeStyle) throws IOException {
                RGBAColor rGBAColor = shapeStyle.fill;
                if (rGBAColor != null) {
                    RGBAColor.ADAPTER.k(cVar, 1, rGBAColor);
                }
                RGBAColor rGBAColor2 = shapeStyle.stroke;
                if (rGBAColor2 != null) {
                    RGBAColor.ADAPTER.k(cVar, 2, rGBAColor2);
                }
                Float f10 = shapeStyle.strokeWidth;
                if (f10 != null) {
                    ProtoAdapter.f53363o.k(cVar, 3, f10);
                }
                LineCap lineCap = shapeStyle.lineCap;
                if (lineCap != null) {
                    LineCap.ADAPTER.k(cVar, 4, lineCap);
                }
                LineJoin lineJoin = shapeStyle.lineJoin;
                if (lineJoin != null) {
                    LineJoin.ADAPTER.k(cVar, 5, lineJoin);
                }
                Float f11 = shapeStyle.miterLimit;
                if (f11 != null) {
                    ProtoAdapter.f53363o.k(cVar, 6, f11);
                }
                Float f12 = shapeStyle.lineDashI;
                if (f12 != null) {
                    ProtoAdapter.f53363o.k(cVar, 7, f12);
                }
                Float f13 = shapeStyle.lineDashII;
                if (f13 != null) {
                    ProtoAdapter.f53363o.k(cVar, 8, f13);
                }
                Float f14 = shapeStyle.lineDashIII;
                if (f14 != null) {
                    ProtoAdapter.f53363o.k(cVar, 9, f14);
                }
                cVar.k(shapeStyle.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public int l(ShapeStyle shapeStyle) {
                RGBAColor rGBAColor = shapeStyle.fill;
                int iM = rGBAColor != null ? RGBAColor.ADAPTER.m(1, rGBAColor) : 0;
                RGBAColor rGBAColor2 = shapeStyle.stroke;
                int iM2 = iM + (rGBAColor2 != null ? RGBAColor.ADAPTER.m(2, rGBAColor2) : 0);
                Float f10 = shapeStyle.strokeWidth;
                int iM3 = iM2 + (f10 != null ? ProtoAdapter.f53363o.m(3, f10) : 0);
                LineCap lineCap = shapeStyle.lineCap;
                int iM4 = iM3 + (lineCap != null ? LineCap.ADAPTER.m(4, lineCap) : 0);
                LineJoin lineJoin = shapeStyle.lineJoin;
                int iM5 = iM4 + (lineJoin != null ? LineJoin.ADAPTER.m(5, lineJoin) : 0);
                Float f11 = shapeStyle.miterLimit;
                int iM6 = iM5 + (f11 != null ? ProtoAdapter.f53363o.m(6, f11) : 0);
                Float f12 = shapeStyle.lineDashI;
                int iM7 = iM6 + (f12 != null ? ProtoAdapter.f53363o.m(7, f12) : 0);
                Float f13 = shapeStyle.lineDashII;
                int iM8 = iM7 + (f13 != null ? ProtoAdapter.f53363o.m(8, f13) : 0);
                Float f14 = shapeStyle.lineDashIII;
                return iM8 + (f14 != null ? ProtoAdapter.f53363o.m(9, f14) : 0) + shapeStyle.unknownFields().size();
            }
        }

        static {
            Float fValueOf = Float.valueOf(0.0f);
            DEFAULT_STROKEWIDTH = fValueOf;
            DEFAULT_LINECAP = LineCap.LineCap_BUTT;
            DEFAULT_LINEJOIN = LineJoin.LineJoin_MITER;
            DEFAULT_MITERLIMIT = fValueOf;
            DEFAULT_LINEDASHI = fValueOf;
            DEFAULT_LINEDASHII = fValueOf;
            DEFAULT_LINEDASHIII = fValueOf;
        }

        public ShapeStyle(RGBAColor rGBAColor, RGBAColor rGBAColor2, Float f10, LineCap lineCap, LineJoin lineJoin, Float f11, Float f12, Float f13, Float f14) {
            this(rGBAColor, rGBAColor2, f10, lineCap, lineJoin, f11, f12, f13, f14, ByteString.EMPTY);
        }

        public ShapeStyle(RGBAColor rGBAColor, RGBAColor rGBAColor2, Float f10, LineCap lineCap, LineJoin lineJoin, Float f11, Float f12, Float f13, Float f14, ByteString byteString) {
            super(ADAPTER, byteString);
            this.fill = rGBAColor;
            this.stroke = rGBAColor2;
            this.strokeWidth = f10;
            this.lineCap = lineCap;
            this.lineJoin = lineJoin;
            this.miterLimit = f11;
            this.lineDashI = f12;
            this.lineDashII = f13;
            this.lineDashIII = f14;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShapeStyle)) {
                return false;
            }
            ShapeStyle shapeStyle = (ShapeStyle) obj;
            return unknownFields().equals(shapeStyle.unknownFields()) && com.squareup.wire.internal.a.d(this.fill, shapeStyle.fill) && com.squareup.wire.internal.a.d(this.stroke, shapeStyle.stroke) && com.squareup.wire.internal.a.d(this.strokeWidth, shapeStyle.strokeWidth) && com.squareup.wire.internal.a.d(this.lineCap, shapeStyle.lineCap) && com.squareup.wire.internal.a.d(this.lineJoin, shapeStyle.lineJoin) && com.squareup.wire.internal.a.d(this.miterLimit, shapeStyle.miterLimit) && com.squareup.wire.internal.a.d(this.lineDashI, shapeStyle.lineDashI) && com.squareup.wire.internal.a.d(this.lineDashII, shapeStyle.lineDashII) && com.squareup.wire.internal.a.d(this.lineDashIII, shapeStyle.lineDashIII);
        }

        public int hashCode() {
            int i10 = this.hashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            RGBAColor rGBAColor = this.fill;
            int iHashCode2 = (iHashCode + (rGBAColor != null ? rGBAColor.hashCode() : 0)) * 37;
            RGBAColor rGBAColor2 = this.stroke;
            int iHashCode3 = (iHashCode2 + (rGBAColor2 != null ? rGBAColor2.hashCode() : 0)) * 37;
            Float f10 = this.strokeWidth;
            int iHashCode4 = (iHashCode3 + (f10 != null ? f10.hashCode() : 0)) * 37;
            LineCap lineCap = this.lineCap;
            int iHashCode5 = (iHashCode4 + (lineCap != null ? lineCap.hashCode() : 0)) * 37;
            LineJoin lineJoin = this.lineJoin;
            int iHashCode6 = (iHashCode5 + (lineJoin != null ? lineJoin.hashCode() : 0)) * 37;
            Float f11 = this.miterLimit;
            int iHashCode7 = (iHashCode6 + (f11 != null ? f11.hashCode() : 0)) * 37;
            Float f12 = this.lineDashI;
            int iHashCode8 = (iHashCode7 + (f12 != null ? f12.hashCode() : 0)) * 37;
            Float f13 = this.lineDashII;
            int iHashCode9 = (iHashCode8 + (f13 != null ? f13.hashCode() : 0)) * 37;
            Float f14 = this.lineDashIII;
            int iHashCode10 = iHashCode9 + (f14 != null ? f14.hashCode() : 0);
            this.hashCode = iHashCode10;
            return iHashCode10;
        }

        @Override // com.squareup.wire.Message
        public a newBuilder() {
            a aVar = new a();
            aVar.f51251d = this.fill;
            aVar.f51252e = this.stroke;
            aVar.f51253f = this.strokeWidth;
            aVar.f51254g = this.lineCap;
            aVar.f51255h = this.lineJoin;
            aVar.f51256i = this.miterLimit;
            aVar.f51257j = this.lineDashI;
            aVar.f51258k = this.lineDashII;
            aVar.f51259l = this.lineDashIII;
            aVar.b(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.fill != null) {
                sb2.append(", fill=");
                sb2.append(this.fill);
            }
            if (this.stroke != null) {
                sb2.append(", stroke=");
                sb2.append(this.stroke);
            }
            if (this.strokeWidth != null) {
                sb2.append(", strokeWidth=");
                sb2.append(this.strokeWidth);
            }
            if (this.lineCap != null) {
                sb2.append(", lineCap=");
                sb2.append(this.lineCap);
            }
            if (this.lineJoin != null) {
                sb2.append(", lineJoin=");
                sb2.append(this.lineJoin);
            }
            if (this.miterLimit != null) {
                sb2.append(", miterLimit=");
                sb2.append(this.miterLimit);
            }
            if (this.lineDashI != null) {
                sb2.append(", lineDashI=");
                sb2.append(this.lineDashI);
            }
            if (this.lineDashII != null) {
                sb2.append(", lineDashII=");
                sb2.append(this.lineDashII);
            }
            if (this.lineDashIII != null) {
                sb2.append(", lineDashIII=");
                sb2.append(this.lineDashIII);
            }
            StringBuilder sbReplace = sb2.replace(0, 2, "ShapeStyle{");
            sbReplace.append('}');
            return sbReplace.toString();
        }
    }

    public enum ShapeType implements e {
        SHAPE(0),
        RECT(1),
        ELLIPSE(2),
        KEEP(3);

        public static final ProtoAdapter<ShapeType> ADAPTER = ProtoAdapter.o(ShapeType.class);
        private final int value;

        ShapeType(int i10) {
            this.value = i10;
        }

        public static ShapeType fromValue(int i10) {
            if (i10 == 0) {
                return SHAPE;
            }
            if (i10 == 1) {
                return RECT;
            }
            if (i10 == 2) {
                return ELLIPSE;
            }
            if (i10 != 3) {
                return null;
            }
            return KEEP;
        }

        @Override // ue.e
        public int getValue() {
            return this.value;
        }
    }

    public static final class a extends Message.a<ShapeEntity, a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ShapeType f51261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ShapeStyle f51262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Transform f51263f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ShapeArgs f51264g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public RectArgs f51265h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public EllipseArgs f51266i;

        @Override // com.squareup.wire.Message.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public ShapeEntity c() {
            return new ShapeEntity(this.f51261d, this.f51262e, this.f51263f, this.f51264g, this.f51265h, this.f51266i, super.d());
        }

        public a h(EllipseArgs ellipseArgs) {
            this.f51266i = ellipseArgs;
            this.f51264g = null;
            this.f51265h = null;
            return this;
        }

        public a i(RectArgs rectArgs) {
            this.f51265h = rectArgs;
            this.f51264g = null;
            this.f51266i = null;
            return this;
        }

        public a j(ShapeArgs shapeArgs) {
            this.f51264g = shapeArgs;
            this.f51265h = null;
            this.f51266i = null;
            return this;
        }

        public a k(ShapeStyle shapeStyle) {
            this.f51262e = shapeStyle;
            return this;
        }

        public a l(Transform transform) {
            this.f51263f = transform;
            return this;
        }

        public a m(ShapeType shapeType) {
            this.f51261d = shapeType;
            return this;
        }
    }

    public static final class b extends ProtoAdapter<ShapeEntity> {
        public b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShapeEntity.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public ShapeEntity e(ue.b bVar) throws IOException {
            a aVar = new a();
            long jC = bVar.c();
            while (true) {
                int iF = bVar.f();
                if (iF == -1) {
                    bVar.d(jC);
                    return aVar.c();
                }
                if (iF == 1) {
                    try {
                        aVar.m(ShapeType.ADAPTER.e(bVar));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        aVar.a(iF, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                } else if (iF == 2) {
                    aVar.j(ShapeArgs.ADAPTER.e(bVar));
                } else if (iF == 3) {
                    aVar.i(RectArgs.ADAPTER.e(bVar));
                } else if (iF == 4) {
                    aVar.h(EllipseArgs.ADAPTER.e(bVar));
                } else if (iF == 10) {
                    aVar.k(ShapeStyle.ADAPTER.e(bVar));
                } else if (iF != 11) {
                    FieldEncoding fieldEncodingG = bVar.g();
                    aVar.a(iF, fieldEncodingG, fieldEncodingG.rawProtoAdapter().e(bVar));
                } else {
                    aVar.l(Transform.ADAPTER.e(bVar));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(c cVar, ShapeEntity shapeEntity) throws IOException {
            ShapeType shapeType = shapeEntity.type;
            if (shapeType != null) {
                ShapeType.ADAPTER.k(cVar, 1, shapeType);
            }
            ShapeStyle shapeStyle = shapeEntity.styles;
            if (shapeStyle != null) {
                ShapeStyle.ADAPTER.k(cVar, 10, shapeStyle);
            }
            Transform transform = shapeEntity.transform;
            if (transform != null) {
                Transform.ADAPTER.k(cVar, 11, transform);
            }
            ShapeArgs shapeArgs = shapeEntity.shape;
            if (shapeArgs != null) {
                ShapeArgs.ADAPTER.k(cVar, 2, shapeArgs);
            }
            RectArgs rectArgs = shapeEntity.rect;
            if (rectArgs != null) {
                RectArgs.ADAPTER.k(cVar, 3, rectArgs);
            }
            EllipseArgs ellipseArgs = shapeEntity.ellipse;
            if (ellipseArgs != null) {
                EllipseArgs.ADAPTER.k(cVar, 4, ellipseArgs);
            }
            cVar.k(shapeEntity.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(ShapeEntity shapeEntity) {
            ShapeType shapeType = shapeEntity.type;
            int iM = shapeType != null ? ShapeType.ADAPTER.m(1, shapeType) : 0;
            ShapeStyle shapeStyle = shapeEntity.styles;
            int iM2 = iM + (shapeStyle != null ? ShapeStyle.ADAPTER.m(10, shapeStyle) : 0);
            Transform transform = shapeEntity.transform;
            int iM3 = iM2 + (transform != null ? Transform.ADAPTER.m(11, transform) : 0);
            ShapeArgs shapeArgs = shapeEntity.shape;
            int iM4 = iM3 + (shapeArgs != null ? ShapeArgs.ADAPTER.m(2, shapeArgs) : 0);
            RectArgs rectArgs = shapeEntity.rect;
            int iM5 = iM4 + (rectArgs != null ? RectArgs.ADAPTER.m(3, rectArgs) : 0);
            EllipseArgs ellipseArgs = shapeEntity.ellipse;
            return iM5 + (ellipseArgs != null ? EllipseArgs.ADAPTER.m(4, ellipseArgs) : 0) + shapeEntity.unknownFields().size();
        }
    }

    public ShapeEntity(ShapeType shapeType, ShapeStyle shapeStyle, Transform transform, ShapeArgs shapeArgs, RectArgs rectArgs, EllipseArgs ellipseArgs) {
        this(shapeType, shapeStyle, transform, shapeArgs, rectArgs, ellipseArgs, ByteString.EMPTY);
    }

    public ShapeEntity(ShapeType shapeType, ShapeStyle shapeStyle, Transform transform, ShapeArgs shapeArgs, RectArgs rectArgs, EllipseArgs ellipseArgs, ByteString byteString) {
        super(ADAPTER, byteString);
        if (com.squareup.wire.internal.a.c(shapeArgs, rectArgs, ellipseArgs) > 1) {
            throw new IllegalArgumentException("at most one of shape, rect, ellipse may be non-null");
        }
        this.type = shapeType;
        this.styles = shapeStyle;
        this.transform = transform;
        this.shape = shapeArgs;
        this.rect = rectArgs;
        this.ellipse = ellipseArgs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShapeEntity)) {
            return false;
        }
        ShapeEntity shapeEntity = (ShapeEntity) obj;
        return unknownFields().equals(shapeEntity.unknownFields()) && com.squareup.wire.internal.a.d(this.type, shapeEntity.type) && com.squareup.wire.internal.a.d(this.styles, shapeEntity.styles) && com.squareup.wire.internal.a.d(this.transform, shapeEntity.transform) && com.squareup.wire.internal.a.d(this.shape, shapeEntity.shape) && com.squareup.wire.internal.a.d(this.rect, shapeEntity.rect) && com.squareup.wire.internal.a.d(this.ellipse, shapeEntity.ellipse);
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ShapeType shapeType = this.type;
        int iHashCode2 = (iHashCode + (shapeType != null ? shapeType.hashCode() : 0)) * 37;
        ShapeStyle shapeStyle = this.styles;
        int iHashCode3 = (iHashCode2 + (shapeStyle != null ? shapeStyle.hashCode() : 0)) * 37;
        Transform transform = this.transform;
        int iHashCode4 = (iHashCode3 + (transform != null ? transform.hashCode() : 0)) * 37;
        ShapeArgs shapeArgs = this.shape;
        int iHashCode5 = (iHashCode4 + (shapeArgs != null ? shapeArgs.hashCode() : 0)) * 37;
        RectArgs rectArgs = this.rect;
        int iHashCode6 = (iHashCode5 + (rectArgs != null ? rectArgs.hashCode() : 0)) * 37;
        EllipseArgs ellipseArgs = this.ellipse;
        int iHashCode7 = iHashCode6 + (ellipseArgs != null ? ellipseArgs.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public a newBuilder() {
        a aVar = new a();
        aVar.f51261d = this.type;
        aVar.f51262e = this.styles;
        aVar.f51263f = this.transform;
        aVar.f51264g = this.shape;
        aVar.f51265h = this.rect;
        aVar.f51266i = this.ellipse;
        aVar.b(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.type != null) {
            sb2.append(", type=");
            sb2.append(this.type);
        }
        if (this.styles != null) {
            sb2.append(", styles=");
            sb2.append(this.styles);
        }
        if (this.transform != null) {
            sb2.append(", transform=");
            sb2.append(this.transform);
        }
        if (this.shape != null) {
            sb2.append(", shape=");
            sb2.append(this.shape);
        }
        if (this.rect != null) {
            sb2.append(", rect=");
            sb2.append(this.rect);
        }
        if (this.ellipse != null) {
            sb2.append(", ellipse=");
            sb2.append(this.ellipse);
        }
        StringBuilder sbReplace = sb2.replace(0, 2, "ShapeEntity{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
