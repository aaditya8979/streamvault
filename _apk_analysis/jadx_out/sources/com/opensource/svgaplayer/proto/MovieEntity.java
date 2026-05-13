package com.opensource.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;
import ue.c;

/* JADX INFO: loaded from: classes2.dex */
public final class MovieEntity extends Message<MovieEntity, a> {
    public static final ProtoAdapter<MovieEntity> ADAPTER = new b();
    public static final String DEFAULT_VERSION = "";
    private static final long serialVersionUID = 0;
    public final List<AudioEntity> audios;
    public final Map<String, ByteString> images;
    public final MovieParams params;
    public final List<SpriteEntity> sprites;
    public final String version;

    public static final class a extends Message.a<MovieEntity, a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f51216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public MovieParams f51217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Map<String, ByteString> f51218f = com.squareup.wire.internal.a.h();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<SpriteEntity> f51219g = com.squareup.wire.internal.a.g();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<AudioEntity> f51220h = com.squareup.wire.internal.a.g();

        @Override // com.squareup.wire.Message.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public MovieEntity c() {
            return new MovieEntity(this.f51216d, this.f51217e, this.f51218f, this.f51219g, this.f51220h, super.d());
        }

        public a h(MovieParams movieParams) {
            this.f51217e = movieParams;
            return this;
        }

        public a i(String str) {
            this.f51216d = str;
            return this;
        }
    }

    public static final class b extends ProtoAdapter<MovieEntity> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final ProtoAdapter<Map<String, ByteString>> f51221s;

        public b() {
            super(FieldEncoding.LENGTH_DELIMITED, MovieEntity.class);
            this.f51221s = ProtoAdapter.p(ProtoAdapter.f53365q, ProtoAdapter.f53366r);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public MovieEntity e(ue.b bVar) throws IOException {
            a aVar = new a();
            long jC = bVar.c();
            while (true) {
                int iF = bVar.f();
                if (iF == -1) {
                    bVar.d(jC);
                    return aVar.c();
                }
                if (iF == 1) {
                    aVar.i(ProtoAdapter.f53365q.e(bVar));
                } else if (iF == 2) {
                    aVar.h(MovieParams.ADAPTER.e(bVar));
                } else if (iF == 3) {
                    aVar.f51218f.putAll(this.f51221s.e(bVar));
                } else if (iF == 4) {
                    aVar.f51219g.add(SpriteEntity.ADAPTER.e(bVar));
                } else if (iF != 5) {
                    FieldEncoding fieldEncodingG = bVar.g();
                    aVar.a(iF, fieldEncodingG, fieldEncodingG.rawProtoAdapter().e(bVar));
                } else {
                    aVar.f51220h.add(AudioEntity.ADAPTER.e(bVar));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(c cVar, MovieEntity movieEntity) throws IOException {
            String str = movieEntity.version;
            if (str != null) {
                ProtoAdapter.f53365q.k(cVar, 1, str);
            }
            MovieParams movieParams = movieEntity.params;
            if (movieParams != null) {
                MovieParams.ADAPTER.k(cVar, 2, movieParams);
            }
            this.f51221s.k(cVar, 3, movieEntity.images);
            SpriteEntity.ADAPTER.a().k(cVar, 4, movieEntity.sprites);
            AudioEntity.ADAPTER.a().k(cVar, 5, movieEntity.audios);
            cVar.k(movieEntity.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(MovieEntity movieEntity) {
            String str = movieEntity.version;
            int iM = str != null ? ProtoAdapter.f53365q.m(1, str) : 0;
            MovieParams movieParams = movieEntity.params;
            return iM + (movieParams != null ? MovieParams.ADAPTER.m(2, movieParams) : 0) + this.f51221s.m(3, movieEntity.images) + SpriteEntity.ADAPTER.a().m(4, movieEntity.sprites) + AudioEntity.ADAPTER.a().m(5, movieEntity.audios) + movieEntity.unknownFields().size();
        }
    }

    public MovieEntity(String str, MovieParams movieParams, Map<String, ByteString> map, List<SpriteEntity> list, List<AudioEntity> list2) {
        this(str, movieParams, map, list, list2, ByteString.EMPTY);
    }

    public MovieEntity(String str, MovieParams movieParams, Map<String, ByteString> map, List<SpriteEntity> list, List<AudioEntity> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = str;
        this.params = movieParams;
        this.images = com.squareup.wire.internal.a.f("images", map);
        this.sprites = com.squareup.wire.internal.a.e("sprites", list);
        this.audios = com.squareup.wire.internal.a.e("audios", list2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MovieEntity)) {
            return false;
        }
        MovieEntity movieEntity = (MovieEntity) obj;
        return unknownFields().equals(movieEntity.unknownFields()) && com.squareup.wire.internal.a.d(this.version, movieEntity.version) && com.squareup.wire.internal.a.d(this.params, movieEntity.params) && this.images.equals(movieEntity.images) && this.sprites.equals(movieEntity.sprites) && this.audios.equals(movieEntity.audios);
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.version;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        MovieParams movieParams = this.params;
        int iHashCode3 = ((((((iHashCode2 + (movieParams != null ? movieParams.hashCode() : 0)) * 37) + this.images.hashCode()) * 37) + this.sprites.hashCode()) * 37) + this.audios.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public a newBuilder() {
        a aVar = new a();
        aVar.f51216d = this.version;
        aVar.f51217e = this.params;
        aVar.f51218f = com.squareup.wire.internal.a.b("images", this.images);
        aVar.f51219g = com.squareup.wire.internal.a.a("sprites", this.sprites);
        aVar.f51220h = com.squareup.wire.internal.a.a("audios", this.audios);
        aVar.b(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.version != null) {
            sb2.append(", version=");
            sb2.append(this.version);
        }
        if (this.params != null) {
            sb2.append(", params=");
            sb2.append(this.params);
        }
        if (!this.images.isEmpty()) {
            sb2.append(", images=");
            sb2.append(this.images);
        }
        if (!this.sprites.isEmpty()) {
            sb2.append(", sprites=");
            sb2.append(this.sprites);
        }
        if (!this.audios.isEmpty()) {
            sb2.append(", audios=");
            sb2.append(this.audios);
        }
        StringBuilder sbReplace = sb2.replace(0, 2, "MovieEntity{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
