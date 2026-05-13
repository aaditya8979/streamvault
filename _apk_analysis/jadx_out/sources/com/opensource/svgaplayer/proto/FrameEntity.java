package com.opensource.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.util.List;
import okio.ByteString;
import ue.c;

/* JADX INFO: loaded from: classes11.dex */
public final class FrameEntity extends Message<FrameEntity, a> {
    public static final ProtoAdapter<FrameEntity> ADAPTER = new b();
    public static final Float DEFAULT_ALPHA = Float.valueOf(0.0f);
    public static final String DEFAULT_CLIPPATH = "";
    private static final long serialVersionUID = 0;
    public final Float alpha;
    public final String clipPath;
    public final Layout layout;
    public final List<ShapeEntity> shapes;
    public final Transform transform;

    public static final class a extends Message.a<FrameEntity, a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Float f51205d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Layout f51206e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Transform f51207f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f51208g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<ShapeEntity> f51209h = com.squareup.wire.internal.a.g();

        public a g(Float f10) {
            this.f51205d = f10;
            return this;
        }

        @Override // com.squareup.wire.Message.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public FrameEntity c() {
            return new FrameEntity(this.f51205d, this.f51206e, this.f51207f, this.f51208g, this.f51209h, super.d());
        }

        public a i(String str) {
            this.f51208g = str;
            return this;
        }

        public a j(Layout layout) {
            this.f51206e = layout;
            return this;
        }

        public a k(Transform transform) {
            this.f51207f = transform;
            return this;
        }
    }

    public static final class b extends ProtoAdapter<FrameEntity> {
        public b() {
            super(FieldEncoding.LENGTH_DELIMITED, FrameEntity.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public FrameEntity e(ue.b bVar) throws IOException {
            a aVar = new a();
            long jC = bVar.c();
            while (true) {
                int iF = bVar.f();
                if (iF == -1) {
                    bVar.d(jC);
                    return aVar.c();
                }
                if (iF == 1) {
                    aVar.g(ProtoAdapter.f53363o.e(bVar));
                } else if (iF == 2) {
                    aVar.j(Layout.ADAPTER.e(bVar));
                } else if (iF == 3) {
                    aVar.k(Transform.ADAPTER.e(bVar));
                } else if (iF == 4) {
                    aVar.i(ProtoAdapter.f53365q.e(bVar));
                } else if (iF != 5) {
                    FieldEncoding fieldEncodingG = bVar.g();
                    aVar.a(iF, fieldEncodingG, fieldEncodingG.rawProtoAdapter().e(bVar));
                } else {
                    aVar.f51209h.add(ShapeEntity.ADAPTER.e(bVar));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(c cVar, FrameEntity frameEntity) throws IOException {
            Float f10 = frameEntity.alpha;
            if (f10 != null) {
                ProtoAdapter.f53363o.k(cVar, 1, f10);
            }
            Layout layout = frameEntity.layout;
            if (layout != null) {
                Layout.ADAPTER.k(cVar, 2, layout);
            }
            Transform transform = frameEntity.transform;
            if (transform != null) {
                Transform.ADAPTER.k(cVar, 3, transform);
            }
            String str = frameEntity.clipPath;
            if (str != null) {
                ProtoAdapter.f53365q.k(cVar, 4, str);
            }
            ShapeEntity.ADAPTER.a().k(cVar, 5, frameEntity.shapes);
            cVar.k(frameEntity.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(FrameEntity frameEntity) {
            Float f10 = frameEntity.alpha;
            int iM = f10 != null ? ProtoAdapter.f53363o.m(1, f10) : 0;
            Layout layout = frameEntity.layout;
            int iM2 = iM + (layout != null ? Layout.ADAPTER.m(2, layout) : 0);
            Transform transform = frameEntity.transform;
            int iM3 = iM2 + (transform != null ? Transform.ADAPTER.m(3, transform) : 0);
            String str = frameEntity.clipPath;
            return iM3 + (str != null ? ProtoAdapter.f53365q.m(4, str) : 0) + ShapeEntity.ADAPTER.a().m(5, frameEntity.shapes) + frameEntity.unknownFields().size();
        }
    }

    public FrameEntity(Float f10, Layout layout, Transform transform, String str, List<ShapeEntity> list) {
        this(f10, layout, transform, str, list, ByteString.EMPTY);
    }

    public FrameEntity(Float f10, Layout layout, Transform transform, String str, List<ShapeEntity> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.alpha = f10;
        this.layout = layout;
        this.transform = transform;
        this.clipPath = str;
        this.shapes = com.squareup.wire.internal.a.e("shapes", list);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrameEntity)) {
            return false;
        }
        FrameEntity frameEntity = (FrameEntity) obj;
        return unknownFields().equals(frameEntity.unknownFields()) && com.squareup.wire.internal.a.d(this.alpha, frameEntity.alpha) && com.squareup.wire.internal.a.d(this.layout, frameEntity.layout) && com.squareup.wire.internal.a.d(this.transform, frameEntity.transform) && com.squareup.wire.internal.a.d(this.clipPath, frameEntity.clipPath) && this.shapes.equals(frameEntity.shapes);
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Float f10 = this.alpha;
        int iHashCode2 = (iHashCode + (f10 != null ? f10.hashCode() : 0)) * 37;
        Layout layout = this.layout;
        int iHashCode3 = (iHashCode2 + (layout != null ? layout.hashCode() : 0)) * 37;
        Transform transform = this.transform;
        int iHashCode4 = (iHashCode3 + (transform != null ? transform.hashCode() : 0)) * 37;
        String str = this.clipPath;
        int iHashCode5 = ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 37) + this.shapes.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public a newBuilder() {
        a aVar = new a();
        aVar.f51205d = this.alpha;
        aVar.f51206e = this.layout;
        aVar.f51207f = this.transform;
        aVar.f51208g = this.clipPath;
        aVar.f51209h = com.squareup.wire.internal.a.a("shapes", this.shapes);
        aVar.b(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.alpha != null) {
            sb2.append(", alpha=");
            sb2.append(this.alpha);
        }
        if (this.layout != null) {
            sb2.append(", layout=");
            sb2.append(this.layout);
        }
        if (this.transform != null) {
            sb2.append(", transform=");
            sb2.append(this.transform);
        }
        if (this.clipPath != null) {
            sb2.append(", clipPath=");
            sb2.append(this.clipPath);
        }
        if (!this.shapes.isEmpty()) {
            sb2.append(", shapes=");
            sb2.append(this.shapes);
        }
        StringBuilder sbReplace = sb2.replace(0, 2, "FrameEntity{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
