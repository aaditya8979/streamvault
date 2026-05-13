package com.squareup.wire;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ProtoAdapter<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<Boolean> f53352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<Integer> f53353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<Integer> f53354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProtoAdapter<Integer> f53355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ProtoAdapter<Integer> f53356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ProtoAdapter<Integer> f53357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ProtoAdapter<Long> f53358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ProtoAdapter<Long> f53359k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ProtoAdapter<Long> f53360l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ProtoAdapter<Long> f53361m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ProtoAdapter<Long> f53362n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ProtoAdapter<Float> f53363o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ProtoAdapter<Double> f53364p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ProtoAdapter<String> f53365q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ProtoAdapter<ByteString> f53366r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FieldEncoding f53367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f53368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProtoAdapter<List<E>> f53369c;

    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        public EnumConstantNotFoundException(int i10, Class<?> cls) {
            super("Unknown enum tag " + i10 + " for " + cls.getCanonicalName());
            this.value = i10;
        }
    }

    public class a extends ProtoAdapter<Float> {
        public a(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Float e(ue.b bVar) throws IOException {
            return Float.valueOf(Float.intBitsToFloat(bVar.i()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(ue.c cVar, Float f10) throws IOException {
            cVar.l(Float.floatToIntBits(f10.floatValue()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Float f10) {
            return 4;
        }
    }

    public class b extends ProtoAdapter<Double> {
        public b(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Double e(ue.b bVar) throws IOException {
            return Double.valueOf(Double.longBitsToDouble(bVar.j()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(ue.c cVar, Double d10) throws IOException {
            cVar.m(Double.doubleToLongBits(d10.doubleValue()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Double d10) {
            return 8;
        }
    }

    public class c extends ProtoAdapter<String> {
        public c(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public String e(ue.b bVar) throws IOException {
            return bVar.k();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(ue.c cVar, String str) throws IOException {
            cVar.o(str);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(String str) {
            return ue.c.h(str);
        }
    }

    public class d extends ProtoAdapter<ByteString> {
        public d(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public ByteString e(ue.b bVar) throws IOException {
            return bVar.h();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(ue.c cVar, ByteString byteString) throws IOException {
            cVar.k(byteString);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(ByteString byteString) {
            return byteString.size();
        }
    }

    public class e extends ProtoAdapter<List<E>> {
        public e(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<E> e(ue.b bVar) throws IOException {
            return Collections.singletonList(ProtoAdapter.this.e(bVar));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(ue.c cVar, List<E> list) {
            throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(ue.c cVar, int i10, List<E> list) throws IOException {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                ProtoAdapter.this.k(cVar, i10, list.get(i11));
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public int l(List<E> list) {
            throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public int m(int i10, List<E> list) {
            int size = list.size();
            int iM = 0;
            for (int i11 = 0; i11 < size; i11++) {
                iM += ProtoAdapter.this.m(i10, list.get(i11));
            }
            return iM;
        }
    }

    public class f extends ProtoAdapter<Boolean> {
        public f(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Boolean e(ue.b bVar) throws IOException {
            int iL = bVar.l();
            if (iL == 0) {
                return Boolean.FALSE;
            }
            if (iL == 1) {
                return Boolean.TRUE;
            }
            throw new IOException(String.format("Invalid boolean value 0x%02x", Integer.valueOf(iL)));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(ue.c cVar, Boolean bool) throws IOException {
            cVar.q(bool.booleanValue() ? 1 : 0);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Boolean bool) {
            return 1;
        }
    }

    public class g extends ProtoAdapter<Integer> {
        public g(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Integer e(ue.b bVar) throws IOException {
            return Integer.valueOf(bVar.l());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(ue.c cVar, Integer num) throws IOException {
            cVar.n(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Integer num) {
            return ue.c.e(num.intValue());
        }
    }

    public class h extends ProtoAdapter<Integer> {
        public h(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Integer e(ue.b bVar) throws IOException {
            return Integer.valueOf(bVar.l());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(ue.c cVar, Integer num) throws IOException {
            cVar.q(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Integer num) {
            return ue.c.i(num.intValue());
        }
    }

    public class i extends ProtoAdapter<Integer> {
        public i(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Integer e(ue.b bVar) throws IOException {
            return Integer.valueOf(ue.c.a(bVar.l()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(ue.c cVar, Integer num) throws IOException {
            cVar.q(ue.c.c(num.intValue()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Integer num) {
            return ue.c.i(ue.c.c(num.intValue()));
        }
    }

    public class j extends ProtoAdapter<Integer> {
        public j(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Integer e(ue.b bVar) throws IOException {
            return Integer.valueOf(bVar.i());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(ue.c cVar, Integer num) throws IOException {
            cVar.l(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Integer num) {
            return 4;
        }
    }

    public class k extends ProtoAdapter<Long> {
        public k(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Long e(ue.b bVar) throws IOException {
            return Long.valueOf(bVar.m());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(ue.c cVar, Long l10) throws IOException {
            cVar.r(l10.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Long l10) {
            return ue.c.j(l10.longValue());
        }
    }

    public class l extends ProtoAdapter<Long> {
        public l(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Long e(ue.b bVar) throws IOException {
            return Long.valueOf(bVar.m());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(ue.c cVar, Long l10) throws IOException {
            cVar.r(l10.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Long l10) {
            return ue.c.j(l10.longValue());
        }
    }

    public class m extends ProtoAdapter<Long> {
        public m(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Long e(ue.b bVar) throws IOException {
            return Long.valueOf(ue.c.b(bVar.m()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(ue.c cVar, Long l10) throws IOException {
            cVar.r(ue.c.d(l10.longValue()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Long l10) {
            return ue.c.j(ue.c.d(l10.longValue()));
        }
    }

    public class n extends ProtoAdapter<Long> {
        public n(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Long e(ue.b bVar) throws IOException {
            return Long.valueOf(bVar.j());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(ue.c cVar, Long l10) throws IOException {
            cVar.m(l10.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Long l10) {
            return 8;
        }
    }

    public static final class o<K, V> extends ProtoAdapter<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final ProtoAdapter<K> f53371s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final ProtoAdapter<V> f53372t;

        public o(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.f53371s = protoAdapter;
            this.f53372t = protoAdapter2;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> e(ue.b bVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(ue.c cVar, Map.Entry<K, V> entry) throws IOException {
            this.f53371s.k(cVar, 1, entry.getKey());
            this.f53372t.k(cVar, 2, entry.getValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Map.Entry<K, V> entry) {
            return this.f53371s.m(1, entry.getKey()) + this.f53372t.m(2, entry.getValue());
        }
    }

    public static final class p<K, V> extends ProtoAdapter<Map<K, V>> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final o<K, V> f53373s;

        public p(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.f53373s = new o<>(protoAdapter, protoAdapter2);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Map<K, V> e(ue.b bVar) throws IOException {
            long jC = bVar.c();
            K kE = null;
            V vE = null;
            while (true) {
                int iF = bVar.f();
                if (iF == -1) {
                    break;
                }
                if (iF == 1) {
                    kE = this.f53373s.f53371s.e(bVar);
                } else if (iF == 2) {
                    vE = this.f53373s.f53372t.e(bVar);
                }
            }
            bVar.d(jC);
            if (kE == null) {
                throw new IllegalStateException("Map entry with null key");
            }
            if (vE != null) {
                return Collections.singletonMap(kE, vE);
            }
            throw new IllegalStateException("Map entry with null value");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(ue.c cVar, Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(ue.c cVar, int i10, Map<K, V> map) throws IOException {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                this.f53373s.k(cVar, i10, it.next());
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public int l(Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public int m(int i10, Map<K, V> map) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            int iM = 0;
            while (it.hasNext()) {
                iM += this.f53373s.m(i10, it.next());
            }
            return iM;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        f53352d = new f(fieldEncoding, Boolean.class);
        f53353e = new g(fieldEncoding, Integer.class);
        f53354f = new h(fieldEncoding, Integer.class);
        f53355g = new i(fieldEncoding, Integer.class);
        FieldEncoding fieldEncoding2 = FieldEncoding.FIXED32;
        j jVar = new j(fieldEncoding2, Integer.class);
        f53356h = jVar;
        f53357i = jVar;
        f53358j = new k(fieldEncoding, Long.class);
        f53359k = new l(fieldEncoding, Long.class);
        f53360l = new m(fieldEncoding, Long.class);
        FieldEncoding fieldEncoding3 = FieldEncoding.FIXED64;
        n nVar = new n(fieldEncoding3, Long.class);
        f53361m = nVar;
        f53362n = nVar;
        f53363o = new a(fieldEncoding2, Float.class);
        f53364p = new b(fieldEncoding3, Double.class);
        FieldEncoding fieldEncoding4 = FieldEncoding.LENGTH_DELIMITED;
        f53365q = new c(fieldEncoding4, String.class);
        f53366r = new d(fieldEncoding4, ByteString.class);
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls) {
        this.f53367a = fieldEncoding;
        this.f53368b = cls;
    }

    public static <M> ProtoAdapter<M> n(Class<M> cls) {
        try {
            return (ProtoAdapter) cls.getField("ADAPTER").get(null);
        } catch (IllegalAccessException | NoSuchFieldException e10) {
            throw new IllegalArgumentException("failed to access " + cls.getName() + "#ADAPTER", e10);
        }
    }

    public static <E extends ue.e> ue.d<E> o(Class<E> cls) {
        return new ue.d<>(cls);
    }

    public static <K, V> ProtoAdapter<Map<K, V>> p(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return new p(protoAdapter, protoAdapter2);
    }

    public final ProtoAdapter<List<E>> a() {
        ProtoAdapter<List<E>> protoAdapter = this.f53369c;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> protoAdapterB = b();
        this.f53369c = protoAdapterB;
        return protoAdapterB;
    }

    public final ProtoAdapter<List<E>> b() {
        return new e(this.f53367a, List.class);
    }

    public final E c(InputStream inputStream) throws IOException {
        ue.a.a(inputStream, "stream == null");
        return d(Okio.buffer(Okio.source(inputStream)));
    }

    public final E d(BufferedSource bufferedSource) throws IOException {
        ue.a.a(bufferedSource, "source == null");
        return e(new ue.b(bufferedSource));
    }

    public abstract E e(ue.b bVar) throws IOException;

    public final E f(byte[] bArr) throws IOException {
        ue.a.a(bArr, "bytes == null");
        return d(new Buffer().write(bArr));
    }

    public final void g(OutputStream outputStream, E e10) throws IOException {
        ue.a.a(e10, "value == null");
        ue.a.a(outputStream, "stream == null");
        BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(outputStream));
        h(bufferedSinkBuffer, e10);
        bufferedSinkBuffer.emit();
    }

    public final void h(BufferedSink bufferedSink, E e10) throws IOException {
        ue.a.a(e10, "value == null");
        ue.a.a(bufferedSink, "sink == null");
        i(new ue.c(bufferedSink), e10);
    }

    public abstract void i(ue.c cVar, E e10) throws IOException;

    public final byte[] j(E e10) {
        ue.a.a(e10, "value == null");
        Buffer buffer = new Buffer();
        try {
            h(buffer, e10);
            return buffer.readByteArray();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    public void k(ue.c cVar, int i10, E e10) throws IOException {
        if (e10 == null) {
            return;
        }
        cVar.p(i10, this.f53367a);
        if (this.f53367a == FieldEncoding.LENGTH_DELIMITED) {
            cVar.q(l(e10));
        }
        i(cVar, e10);
    }

    public abstract int l(E e10);

    public int m(int i10, E e10) {
        if (e10 == null) {
            return 0;
        }
        int iL = l(e10);
        if (this.f53367a == FieldEncoding.LENGTH_DELIMITED) {
            iL += ue.c.i(iL);
        }
        return iL + ue.c.g(i10);
    }

    public String q(E e10) {
        return e10.toString();
    }
}
