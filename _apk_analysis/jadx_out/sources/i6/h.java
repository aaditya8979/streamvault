package i6;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import s6.h0;

/* JADX INFO: compiled from: DefaultExtractorsFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f63897n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f63898o = new a(new a.InterfaceC0784a() { // from class: i6.f
        @Override // i6.h.a.InterfaceC0784a
        public final Constructor getConstructor() {
            return h.e();
        }
    });

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f63899p = new a(new a.InterfaceC0784a() { // from class: i6.g
        @Override // i6.h.a.InterfaceC0784a
        public final Constructor getConstructor() {
            return h.f();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f63900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f63901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f63905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f63906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f63907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f63908j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f63910l;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f63909k = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f63911m = 112800;

    /* JADX INFO: compiled from: DefaultExtractorsFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0784a f63912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f63913b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        @GuardedBy("extensionLoaded")
        public Constructor<? extends k> f63914c;

        /* JADX INFO: renamed from: i6.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DefaultExtractorsFactory.java */
        public interface InterfaceC0784a {
            @Nullable
            Constructor<? extends k> getConstructor() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public a(InterfaceC0784a interfaceC0784a) {
            this.f63912a = interfaceC0784a;
        }

        @Nullable
        public k a(Object... objArr) {
            Constructor<? extends k> constructorB = b();
            if (constructorB == null) {
                return null;
            }
            try {
                return constructorB.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }

        @Nullable
        public final Constructor<? extends k> b() {
            synchronized (this.f63913b) {
                if (this.f63913b.get()) {
                    return this.f63914c;
                }
                try {
                    return this.f63912a.getConstructor();
                } catch (ClassNotFoundException unused) {
                    this.f63913b.set(true);
                    return this.f63914c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }
    }

    @Nullable
    public static Constructor<? extends k> e() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(k.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    public static Constructor<? extends k> f() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(k.class).getConstructor(new Class[0]);
    }

    @Override // i6.p
    public synchronized k[] createExtractors() {
        return createExtractors(Uri.EMPTY, new HashMap());
    }

    @Override // i6.p
    public synchronized k[] createExtractors(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = f63897n;
        arrayList = new ArrayList(iArr.length);
        int iB = s7.k.b(map);
        if (iB != -1) {
            d(iB, arrayList);
        }
        int iC = s7.k.c(uri);
        if (iC != -1 && iC != iB) {
            d(iC, arrayList);
        }
        for (int i10 : iArr) {
            if (i10 != iB && i10 != iC) {
                d(i10, arrayList);
            }
        }
        return (k[]) arrayList.toArray(new k[arrayList.size()]);
    }

    public final void d(int i10, List<k> list) {
        switch (i10) {
            case 0:
                list.add(new s6.b());
                break;
            case 1:
                list.add(new s6.e());
                break;
            case 2:
                list.add(new s6.h((this.f63901c ? 2 : 0) | this.f63902d | (this.f63900b ? 1 : 0)));
                break;
            case 3:
                list.add(new j6.b((this.f63901c ? 2 : 0) | this.f63903e | (this.f63900b ? 1 : 0)));
                break;
            case 4:
                k kVarA = f63898o.a(Integer.valueOf(this.f63904f));
                if (kVarA == null) {
                    list.add(new l6.d(this.f63904f));
                } else {
                    list.add(kVarA);
                }
                break;
            case 5:
                list.add(new m6.b());
                break;
            case 6:
                list.add(new o6.e(this.f63905g));
                break;
            case 7:
                list.add(new p6.f((this.f63901c ? 2 : 0) | this.f63908j | (this.f63900b ? 1 : 0)));
                break;
            case 8:
                list.add(new q6.g(this.f63907i));
                list.add(new q6.k(this.f63906h));
                break;
            case 9:
                list.add(new r6.d());
                break;
            case 10:
                list.add(new s6.a0());
                break;
            case 11:
                list.add(new h0(this.f63909k, this.f63910l, this.f63911m));
                break;
            case 12:
                list.add(new t6.b());
                break;
            case 14:
                list.add(new n6.a());
                break;
            case 15:
                k kVarA2 = f63899p.a(new Object[0]);
                if (kVarA2 != null) {
                    list.add(kVarA2);
                }
                break;
            case 16:
                list.add(new k6.b());
                break;
        }
    }
}
